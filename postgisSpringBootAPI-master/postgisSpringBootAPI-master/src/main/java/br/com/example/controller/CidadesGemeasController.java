package br.com.example.controller;

import java.util.List;
import br.com.example.repository.CidadesGemeasRepository;
import br.com.example.model.CidadesGemeasVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "CidadesGemeas API", version = "1.0", description = "Dados ds CidadesGemeas!"))
public class CidadesGemeasController {
    
    @Autowired
    private CidadesGemeasRepository repository;
     
    @GetMapping("/cidadesGemeasDentroDeUmEstado/{nome}")
    public List<CidadesGemeasVO> cidadesGemeasDentroDeUmEstado(@PathVariable String nome){
        List<CidadesGemeasVO> result = repository.listarCidadesGemeasDentroDeUmEstado(nome);
        return result;
    }
  
}