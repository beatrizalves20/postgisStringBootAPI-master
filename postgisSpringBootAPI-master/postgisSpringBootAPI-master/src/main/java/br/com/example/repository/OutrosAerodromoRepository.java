/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.OutrosAerodromo;
import br.com.example.model.OutrosAerodromoVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author caian
 */
public interface OutrosAerodromoRepository extends JpaRepository<OutrosAerodromo, Integer>{
    
    @Query(value = "select new br.com.example.model.OutrosAerodromoVO(b.codigo,b.municipio) from OutrosAerodromo a, OutrosAerodromo b where within(a.geometria, b.geometria) = true and a.estado = :estado")
    List<OutrosAerodromoVO> listarAerodromosDentroDeUmEstado(String estado);
     
    
   
}
