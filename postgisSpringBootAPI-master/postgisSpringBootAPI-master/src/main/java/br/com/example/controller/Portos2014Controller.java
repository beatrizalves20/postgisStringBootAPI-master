package br.com.example.controller;

import java.util.List;
import br.com.example.repository.Portos2014Repository;
import br.com.example.model.Portos2014VO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Portos 2014 API", version = "1.0", description = "Dados dos Portos 2014!"))
public class Portos2014Controller {
    
    @Autowired
    private Portos2014Repository repository;
     
    @GetMapping("/portos2014Municipais/{estado}")
    public List<Portos2014VO> portos2014Municipais(@PathVariable String estado){
        List<Portos2014VO> result = repository.listarPortos2014Municipais(estado);
        return result;
    }
    
     @GetMapping("/portos2014Estaduais/{regiao}")
    public List<Portos2014VO> portos2014Estaduais(@PathVariable String regiao){
        List<Portos2014VO> result = repository.listarPortos2014Estaduais(regiao);
        return result;
    }
     
     
   
    
}
