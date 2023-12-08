/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.Portos2014;
import br.com.example.model.Portos2014VO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author caian
 */
public interface Portos2014Repository extends JpaRepository<Portos2014, Integer>{
    
    @Query(value = "select new br.com.example.model.Portos2014VO(b.codigo,b.municipio,b.estado) from Portos2014 a, Portos2014 b where within(a.geometria, b.geometria) = true and a.estado = :estado")
    List<Portos2014VO> listarPortos2014Municipais(String estado);
     
    @Query(value = "select new br.com.example.model.Portos2014VO(b.codigo,b.municipio,b.estado) from Portos2014 a, Portos2014 b where within(a.geometria, b.geometria) = true and a.regiao = :regiao")
    List<Portos2014VO> listarPortos2014Estaduais(String regiao);
    
   
}
