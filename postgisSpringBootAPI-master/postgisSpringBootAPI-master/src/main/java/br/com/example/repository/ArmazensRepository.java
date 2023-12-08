/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.Armazens;
import br.com.example.model.ArmazensVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author caian
 */
public interface ArmazensRepository extends JpaRepository<Armazens, Integer>{
    
    @Query(value = "select new br.com.example.model.Armazens (b.codigo,b.municipio,b.capacidade) from Armazens a, Armazens b where within(a.geometria, b.geometria) = true and a.nome = :nome")
    List<Armazens> listarArmazensDentroDeUmEstado(String nome);
     
  
    
   
}
