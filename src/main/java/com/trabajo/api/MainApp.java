package com.trabajo.api;

import com.trabajo.api.model.Usuario;
import com.trabajo.api.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }

    @Bean
    CommandLineRunner iniciarBaseDeDatos(UsuarioRepository repo) {
        return args -> {
            if (repo.findByUsername("liseth") == null) {
                repo.save(new Usuario("liseth", "$Liseth12"));
                System.out.println("Usuario administrador 'liseth' creado con éxito.");
            }
        };
    }
}