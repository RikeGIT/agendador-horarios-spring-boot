package com.rikeDev.agendador_horarios.services;

import com.rikeDev.agendador_horarios.infrastructure.entity.AgendamentoEntity;
import com.rikeDev.agendador_horarios.infrastructure.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AgendamentoService {
    private final AgendamentoRepository agendamentoRepository;

    public AgendamentoEntity salvarAgendamento(AgendamentoEntity agendamentoEntity){

        LocalDateTime horaAgendamennto = agendamentoEntity.getDataHoraAgendamento();
        LocalDateTime horaFim = agendamentoEntity.getDataHoraAgendamento().plusHours(1);

        AgendamentoEntity agendados = agendamentoRepository.findByServicoAndDataHoraAgendamentoBetween(agendamentoEntity.getServico(), horaAgendamennto, horaFim);

        if(Objects.nonNull(agendados)){
            throw  new RuntimeException("Este Horário já está ocupado");
        }
        return agendamentoRepository.save(agendamentoEntity);

    }

    public void deletarAgendamento(LocalDateTime dataHoraAgendamento, String cliente){
        agendamentoRepository.deleteByDataHoraAgendamentoAndCliente(dataHoraAgendamento, cliente);
    }

    public List<AgendamentoEntity> buscarAgendamentosDoDia(LocalDate data){
        LocalDateTime HoraInicial = data.atStartOfDay();
        LocalDateTime HoraFinal = data.atTime(23, 59, 59);

        return agendamentoRepository.findByDataHoraAgendamentoBetween(HoraInicial, HoraFinal);
    }

    public AgendamentoEntity alterarAgendamento(AgendamentoEntity agendamento, LocalDateTime dataHoraAgendada, String cliente){
        AgendamentoEntity agenda = agendamentoRepository.findByDataHoraAgendamentoAndCliente(dataHoraAgendada, cliente);

        if(Objects.isNull(agenda)){
            throw  new RuntimeException("Este Horário já não está preenchido");
        }
        agendamento.setId(agenda.getId());
        return agendamentoRepository.save(agendamento);
    }
}
