package br.com.example.controller;

import java.util.List;
import br.com.example.repository.FluxosAereosRepository;
import br.com.example.model.FluxosAereosVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "FluxosAereos API", version = "1.0", description = "Dados do FluxosAereos!"))
public class FluxosAereosController {
    
    @Autowired
    private FluxosAereosRepository repository;
     
    @GetMapping("/fluxosAereosPorCidade/{nome}")
    public List<FluxosAereosVO>fluxosAereosVOPorCidade(@PathVariable String nome){
        List<FluxosAereosVO> result = repository.listarfluxosAereosPorCidade(nome);
        return result;
    }
    
  
     
     
   
    
}