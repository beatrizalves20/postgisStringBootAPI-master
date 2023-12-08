/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author caian
 */
@Data
@AllArgsConstructor
public class PontosFronteiraVO {
    private String codigo;
    private String municipio;
    private String estado;
}
