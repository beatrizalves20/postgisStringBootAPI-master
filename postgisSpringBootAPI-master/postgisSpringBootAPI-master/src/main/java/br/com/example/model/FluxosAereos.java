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
@Table(name = "mov_carga_aero_2010")
public class FluxosAereos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid")
    private String codigo;
    @Column(name = "geocodigo")
    private String geoCodigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "carga__kg_")
    private String carga;   
    @Column(name = "geom")
    private Geometry geometria;
}