package com.example.estudosjava.service;

import com.example.estudosjava.entity.PessoaEntity;
import com.example.estudosjava.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public PessoaEntity createPessoa(PessoaEntity pessoaEntity){
        return pessoaRepository.save(pessoaEntity);
    }

    public List<PessoaEntity> listarPessoas(){
        return pessoaRepository.findAll();

    }

    public Optional<PessoaEntity> listarPessoaPorId(Long id){
        return pessoaRepository.findById(id);
    }

    public void deletarPessoa(PessoaEntity pessoaEntity){
        pessoaRepository.delete(pessoaEntity);
    }

    public void deletarPessoaPorId(Long id){
        pessoaRepository.deleteById(id);
    }
}
