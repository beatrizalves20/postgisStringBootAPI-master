package br.com.example.controller;

import java.util.List;
import br.com.example.repository.TermPortuariosRepository;
import br.com.example.model.TermPortuariosVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Term Portuarios API", version = "1.0", description = "Dados de Outros Term Portuarios!"))
public class TermPortuariosController {
    
    @Autowired
    private TermPortuariosRepository repository;
     
    @GetMapping("/portuariosDentroDeUmEstado(Sigla)/{estado}")
    public List<TermPortuariosVO> termportuariosDentroDeUmEstado(@PathVariable String estado){
        List<TermPortuariosVO> result = repository.listarTermPortuariosDentroDeUmEstado(estado);
        return result;
    }
    
     
     
   
    
}