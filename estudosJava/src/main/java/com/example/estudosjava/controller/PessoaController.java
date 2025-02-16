package com.example.estudosjava.controller;

import com.example.estudosjava.entity.PessoaEntity;
import com.example.estudosjava.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public PessoaEntity createPessoa(@RequestBody PessoaEntity pessoaEntity){
        System.out.println("Dados recebidos" + pessoaEntity);
        return pessoaService.createPessoa(pessoaEntity);
    }

    @DeleteMapping
    public void deletePessoa(PessoaEntity pessoaEntity){
        pessoaService.deletarPessoa(pessoaEntity);
    }

    @GetMapping
    public List<PessoaEntity> listarPessoas(){
        return pessoaService.listarPessoas();
    }
    @GetMapping("/{id}")
    public Optional<PessoaEntity> listarPessoaPorId(@PathVariable Long id){
        return pessoaService.listarPessoaPorId(id)  ;
    }
    @DeleteMapping("/{id}")
    public void deletePessoaPorId(@PathVariable Long id){
        pessoaService.deletarPessoaPorId(id);
    }




}
