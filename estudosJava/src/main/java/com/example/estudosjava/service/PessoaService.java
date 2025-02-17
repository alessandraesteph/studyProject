package com.example.estudosjava.service;

import com.example.estudosjava.entity.PessoaEntity;
import com.example.estudosjava.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    public Optional<PessoaEntity> BuscarPessoaPorId(Long id){
        return pessoaRepository.findById(id);
    }

    public ResponseEntity<Void> deletarTodasPessoa(){
            pessoaRepository.deleteAll();
            return ResponseEntity.noContent().build();
    }

    public void deletarPessoaPorId(Long id){
        pessoaRepository.deleteById(id);
    }
    public PessoaEntity atualizarPessoa(Long id, PessoaEntity pessoaEntity){
        Optional<PessoaEntity> pessoa = pessoaRepository.findById(id);
        if(pessoa.isPresent()){
            pessoa.get().setNome(pessoaEntity.getNome());
            pessoa.get().setEmail(pessoaEntity.getEmail());
            pessoa.get().setCpf(pessoaEntity.getCpf());
            pessoa.get().setDataNascimento(pessoaEntity.getDataNascimento());
            pessoa.get().setTelefone(pessoaEntity.getTelefone());
            pessoa.get().setEndereco(pessoaEntity.getEndereco());
        }
        return pessoaRepository.save(pessoa.get());
    }
}
