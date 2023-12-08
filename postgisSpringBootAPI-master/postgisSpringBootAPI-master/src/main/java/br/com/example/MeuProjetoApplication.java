package br.com.example;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MeuProjetoApplication {

   public static void main(String[] args) {
		SpringApplication.run(MeuProjetoApplication.class, args);
	}


    @Bean
    public JtsModule jtsModule() {
        return new JtsModule();
    }
}

