package br.com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "outros_term_portuarios_2014")
public class TermPortuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid")
    private String codigo;
    @Column(name = "uf")
    private String estado;
    @Column(name = "nome")
    private String nome;
    @Column(name = "geocodig_m")
    private String geoCodigo;
    @Column(name = "nome_munic")
    private String municipio; 
    @Column(name = "geom")
    private Geometry geometria;
    
}
