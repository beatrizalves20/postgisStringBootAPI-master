/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import br.com.example.model.PontosFronteira;
import br.com.example.model.PontosFronteiraVO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author caian
 */
public interface PontosFronteiraRepository extends JpaRepository<PontosFronteira, Integer>{
    
    @Query(value = "select new br.com.example.model.PontosFronteiraVO(b.codigo,b.municipio,b.estado) from PontosFronteira a, PontosFronteira b where within(a.geometria, b.geometria) = true and a.estado = :estado")
    List<PontosFronteiraVO> listarPontosFronteiraMunicipais(String estado);
     
    @Query(value = "select new br.com.example.model.PontosFronteiraVO(b.codigo,b.municipio,b.estado) from PontosFronteira a, PontosFronteira b where within(a.geometria, b.geometria) = true and a.regiao = :regiao")
    List<PontosFronteiraVO> listarPontosFronteiraEstaduais(String regiao);
    
   
}
