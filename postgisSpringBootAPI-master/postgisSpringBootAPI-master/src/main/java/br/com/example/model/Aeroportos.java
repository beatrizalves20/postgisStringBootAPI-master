package br.com.example.model;


import java.io.Serializable;
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
@Table(name = "aeroportos_2014")
public class Aeroportos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "nome_uf")
    private String nome_uf;
    @Column(name = "nome_regia")
    private String regiao;
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "pax2010")
    private double pax2010;    
    @Column(name = "internacio")
    private Geometry internacional;
    @Column(name = "municdv")
    private String municdv;
    @Column(name = "geom")
    private Geometry geometria;

}