package br.com.example.controller;

import java.util.List;
import br.com.example.repository.PontosFronteiraRepository;
import br.com.example.model.PontosFronteiraVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Pontos Fronteira API", version = "1.0", description = "Dados dos Pontos das Fronteiras!"))
public class PontosFronteiraController {
    
    @Autowired
    private PontosFronteiraRepository repository;
     
    @GetMapping("/fronteirasMunicipais(Brasil)/{estado}")
    public List<PontosFronteiraVO> pontosfronteirasMunicipais(@PathVariable String estado){
        List<PontosFronteiraVO> result = repository.listarPontosFronteiraMunicipais(estado);
        return result;
    }
    
     @GetMapping("/fronteirasEstaduais(Brasil)/{regiao}")
    public List<PontosFronteiraVO> pontosfronteirasEstaduais(@PathVariable String regiao){
        List<PontosFronteiraVO> result = repository.listarPontosFronteiraEstaduais(regiao);
        return result;
    }
     
     
   
    
}