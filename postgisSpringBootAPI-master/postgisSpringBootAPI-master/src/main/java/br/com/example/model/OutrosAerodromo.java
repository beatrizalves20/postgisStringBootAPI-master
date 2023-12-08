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
@Table(name = "outros_aerodromos_2014")
public class OutrosAerodromo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid")
    private String codigo;
    @Column(name = "nm_municip")
    private String municipio;
    @Column(name = "tipoaero")
    private String tipo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "uf")
    private String estado;
    @Column(name = "cod_uso")
    private String codigoUso;
    @Column(name = "cod_icao")
    private String codidoIcao;
    @Column(name = "geocodigo")
    private String geoCodigo;    
    @Column(name = "geom")
    private Geometry geometria;
}