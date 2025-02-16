package com.example.estudosjava.repository;

import com.example.estudosjava.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// uma interface que herda JpaRepository(possui metodos do sql)
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
}
