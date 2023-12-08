/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.TermPortuarios;
import br.com.example.model.TermPortuariosVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author caian
 */
public interface TermPortuariosRepository extends JpaRepository<TermPortuarios, Integer>{
    
    @Query(value = "select new br.com.example.model.TermPortuariosVO(b.codigo,b.municipio) from TermPortuarios a, TermPortuarios b where within(a.geometria, b.geometria) = true and a.estado = :estado")
    List<TermPortuariosVO> listarTermPortuariosDentroDeUmEstado(String estado);
     
    
   
}
