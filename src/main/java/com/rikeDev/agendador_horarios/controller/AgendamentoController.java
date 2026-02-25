package com.rikeDev.agendador_horarios.controller;

import com.rikeDev.agendador_horarios.infrastructure.entity.AgendamentoEntity;
import com.rikeDev.agendador_horarios.services.AgendamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/agendamentos")
@RequiredArgsConstructor

public class AgendamentoController {
    private final AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<AgendamentoEntity> salvarAgendamento(@RequestBody AgendamentoEntity agendamentoEntity){
        return ResponseEntity.accepted().body(agendamentoService.salvarAgendamento(agendamentoEntity));

    }

    @DeleteMapping
    public ResponseEntity<Void> deletarAgendamento(@RequestParam String cliente, @RequestParam LocalDateTime dataHoraAgendamento){
        agendamentoService.deletarAgendamento(dataHoraAgendamento, cliente);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<AgendamentoEntity>> buscarAgendamentosDoDia(@RequestParam LocalDate data){
        return ResponseEntity.ok().body(agendamentoService.buscarAgendamentosDoDia(data));
    }

    @PutMapping
    public ResponseEntity<AgendamentoEntity> alterarAgendamentos(@RequestBody AgendamentoEntity agendamentoEntity, @RequestParam String cliente, @RequestParam LocalDateTime dataHoraAgendamento){
        return ResponseEntity.accepted().body(agendamentoService.alterarAgendamento(agendamentoEntity, dataHoraAgendamento, cliente));
    }
}
