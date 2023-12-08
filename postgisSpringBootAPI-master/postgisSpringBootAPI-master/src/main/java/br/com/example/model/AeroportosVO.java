package br.com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AeroportosVO {
    private int gid;
    private String municipio;
    private String nome_uf;
}