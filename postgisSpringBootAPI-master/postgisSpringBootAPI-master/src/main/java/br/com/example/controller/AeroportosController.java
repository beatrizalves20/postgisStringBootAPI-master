package br.com.example.controller;

import java.util.List;
import br.com.example.repository.AeroportosRepository;
import br.com.example.model.AeroportosVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Aeroportos API", version = "1.0", description = "Dados dos Aeroportos!"))
public class AeroportosController {
    
    @Autowired
    private AeroportosRepository repository;
     
    @GetMapping("/aeroportosDentroDeUmEstado/{nome}")
    public List<AeroportosVO> aeroportosDentroDeUmEstado(@PathVariable String nome){
        List<AeroportosVO> result = repository.listarAeroportoDentroDeUmEstado(nome);
        return result;
    }
    
     @GetMapping("/aeroportosDentroDeUmaRegiao/{regiao}")
    public List<AeroportosVO> aeroportosDentroDeUmaRegiao(@PathVariable String regiao){
        List<AeroportosVO> result = repository.listarAeroportoDentroDeUmaRegiao(regiao);
        return result;
    }
     
     
   
    
}