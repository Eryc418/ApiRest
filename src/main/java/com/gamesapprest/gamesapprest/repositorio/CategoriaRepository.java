package com.gamesapprest.gamesapprest.repositorio;

import com.gamesapprest.gamesapprest.dominio.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository <Categoria, Integer> {
}