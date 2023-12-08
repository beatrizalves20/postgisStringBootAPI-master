package br.com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.vividsolutions.jts.geom.Geometry;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "armazens_2014")
public class Armazens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid")
    private String codigo;
    @Column(name = "uf")
    private String nome;
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "cap_ton")
    private String capacidade;
    @Column(name = "geocodigo")
    private String geocodigo;    
    @Column(name = "geom")
    private Geometry geometria;
}