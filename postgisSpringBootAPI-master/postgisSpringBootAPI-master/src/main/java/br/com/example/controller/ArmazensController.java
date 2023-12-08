package br.com.example.controller;

import br.com.example.model.Armazens;
import br.com.example.model.ArmazensVO;
import java.util.List;
import br.com.example.repository.ArmazensRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Armazens API", version = "1.0", description = "Dados de todos Armazens!"))
public class ArmazensController {
    
    @Autowired
    private ArmazensRepository repository;
     
    @GetMapping("/armazensDentroDeUmEstado(Sigla)/{nome}")
    public List<Armazens> armazensDentroDeUmEstado(@PathVariable String nome){
        List<Armazens> result = repository.listarArmazensDentroDeUmEstado(nome);
        return (List<Armazens>) result;
    }
  
}