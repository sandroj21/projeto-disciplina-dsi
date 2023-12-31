package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.Turma;

import com.example.demo.services.TurmaService;

@RestController
@RequestMapping("/turma")
public class TurmaController {
    
    @Autowired
    private TurmaService turmaService;

    @GetMapping("/{idTurma}")
    public Turma getTurma(@PathVariable Integer idTurma) {
        Turma turma = turmaService.getTurma(idTurma);
        return turma;
    }

    @PostMapping
    public void cadastrarTurma(@RequestBody Turma turma){
        turmaService.salvar(turma);
    }

    @PutMapping
    public void atualizarTurma(@RequestBody Turma turma) {
        turmaService.atualizar(turma);
    }

    @DeleteMapping("/{idTurma}")
    public void deletarTurma(@PathVariable Integer idTurma) {
        turmaService.remover(idTurma);
    }

    @GetMapping("/curso/{idCurso}")
    public List<Turma> getTurmasPorCurso(@PathVariable Integer idCurso) {
        List<Turma> turmas = turmaService.getTurmasPorCurso(idCurso);
        return turmas;
    }
}
