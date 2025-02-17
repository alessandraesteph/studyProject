package com.example.estudosjava.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Entity // a classe será uma entidade no banco de dados
@Table (name = "pessoa") // o nome que essa classe será no banco de dados
@Data // possui os getts,settes, e tostring
@AllArgsConstructor
@NoArgsConstructor
public class PessoaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String dataNascimento;
    private String cpf;
    private String endereco;
}
