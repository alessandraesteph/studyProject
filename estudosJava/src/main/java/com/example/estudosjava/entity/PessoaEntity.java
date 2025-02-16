package com.example.estudosjava.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String nome_Completo;
    private Date data_Nascimento;
    private String cpf;
    private String rg;
    private String endereco;
}
