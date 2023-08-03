package me.dio.academia.digital.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;

@RestController
@Api(tags = "Aluno")
@RequestMapping(value = "/api/v1/alunos", produces = "application/json")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno create(@Valid @RequestBody AlunoForm form) {
        return service.create(form);
    }

    @GetMapping(value = "/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisicaId(id);
    }

    @GetMapping
    public List<Aluno> getAll() {
        return service.getAll();
    }

    @GetMapping(value = "/nascimento")
    public List<Aluno> getByDataDeNascimento(
            @RequestParam(value = "dataDeNascimento", required = true) String dataDeNascimento) {
        return service.getAll(dataDeNascimento);
    }
}
