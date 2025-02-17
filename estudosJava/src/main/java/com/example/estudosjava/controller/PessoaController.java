package com.example.estudosjava.controller;

import com.example.estudosjava.entity.PessoaEntity;
import com.example.estudosjava.service.PessoaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping // OK
    public PessoaEntity createPessoa(@RequestBody PessoaEntity pessoaEntity) {
        return pessoaService.createPessoa(pessoaEntity);
    }
    @PutMapping("/{id}") //OK
    public PessoaEntity atualizarPessoa(@PathVariable Long id, @RequestBody PessoaEntity pessoaEntity){
        return pessoaService.atualizarPessoa(id, pessoaEntity);
    }

    @DeleteMapping //OK
    public ResponseEntity<Void> deletePessoa() {
        return pessoaService.deletarTodasPessoa();
    }

    @GetMapping//OK
    public List<PessoaEntity> listarPessoas() {
        return pessoaService.listarPessoas();
    }

    @GetMapping("/{id}")//OK
    public Optional<PessoaEntity> BucarPessoaPorId(@PathVariable Long id) {
        return pessoaService.BuscarPessoaPorId(id);
    }

    @DeleteMapping("/{id}")//OK
    public void deletePessoaPorId(@PathVariable Long id) {
        pessoaService.deletarPessoaPorId(id);
    }

}
