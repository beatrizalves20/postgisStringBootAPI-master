package br.com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.locationtech.jts.geom.Geometry;

@Data
@AllArgsConstructor
@Entity
@Table(name = "cidades_gemeas_2014")
public class CidadesGemeas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid_1")
    private String codigo;
    @Column(name = "municdv")
    private String municdv;
    @Column(name = "uf")
    private String uf;
    @Column(name = "nome_uf")
    private String nome;
    @Column(name = "municipio")
    private String municipio;  
    @Column(name = "geom")
    private Geometry geometria;
    
}
