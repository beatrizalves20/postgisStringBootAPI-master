/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.FluxosAereos;
import br.com.example.model.FluxosAereosVO;
import br.com.example.model.FluxosAereos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author caian
 */
public interface FluxosAereosRepository extends JpaRepository<FluxosAereos, Integer>{
    
    @Query(value = "select new br.com.example.model.FluxosAereosVO(b.codigo,b.nome,b.carga) from FluxosAereos a, FluxosAereos b where within(a.geometria, b.geometria) = true and a.nome = :nome")
    List<FluxosAereosVO> listarfluxosAereosPorCidade(String nome);
     
    
   
}
