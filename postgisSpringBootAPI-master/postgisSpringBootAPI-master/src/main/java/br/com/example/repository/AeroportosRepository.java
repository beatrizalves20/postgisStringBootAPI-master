/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.Aeroportos;
import br.com.example.model.AeroportosVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author caian
 */
public interface AeroportosRepository extends JpaRepository<Aeroportos, Integer>{
    
    @Query(value = "select new br.com.example.model.AeroportosVO(ab.gid,ab.municipio,ab.nome_uf) from Aeroportos aa, Aeroportos ab where within(aa.geometria, ab.geometria) = true and aa.nome_uf = :nome")
    List<AeroportosVO> listarAeroportoDentroDeUmEstado(String nome);
     
    @Query(value = "select new br.com.example.model.AeroportosVO(ab.gid,ab.municipio,ab.nome_uf) from Aeroportos aa, Aeroportos ab where within(aa.geometria, ab.geometria) = true and aa.regiao = :regiao")
    List<AeroportosVO> listarAeroportoDentroDeUmaRegiao(String regiao);
    
   
}
