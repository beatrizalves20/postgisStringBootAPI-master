/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.CidadesGemeas;
import br.com.example.model.CidadesGemeasVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author caian
 */
public interface CidadesGemeasRepository extends JpaRepository<CidadesGemeas, Integer>{
    
    @Query(value = "select new br.com.example.model.CidadesGemeasVO(b.codigo,b.municipio,b.municdv) from CidadesGemeas a, CidadesGemeas b where within(a.geometria, b.geometria) = true and a.nome = :nome")
    List<CidadesGemeasVO> listarCidadesGemeasDentroDeUmEstado(String nome);
     
  
    
   
}
