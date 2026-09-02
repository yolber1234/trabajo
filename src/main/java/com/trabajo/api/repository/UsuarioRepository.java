package com.trabajo.api.repository;

import com.trabajo.api.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    Usuario findByUsername(String username);
}