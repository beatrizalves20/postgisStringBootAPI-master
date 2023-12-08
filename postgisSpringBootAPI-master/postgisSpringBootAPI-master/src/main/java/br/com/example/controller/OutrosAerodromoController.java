package br.com.example.controller;

import java.util.List;
import br.com.example.repository.OutrosAerodromoRepository;
import br.com.example.model.OutrosAerodromoVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "API  Outros Aerodromo", version = "1.0", description = "Dados de Outros Aerodromo!"))
public class OutrosAerodromoController {
    
    @Autowired
    private OutrosAerodromoRepository repository;
     
    @GetMapping("/aerodromosDentroDeUmEstado(Sigla)/{estado}")
    public List<OutrosAerodromoVO> aerodromosDentroDeUmEstado(@PathVariable String estado){
        List<OutrosAerodromoVO> result = repository.listarAerodromosDentroDeUmEstado(estado);
        return result;
    }
    
     
     
    
}