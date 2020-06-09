package com.defensa.Hito4.Repository;

import com.defensa.Hito4.Model.diccionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface diccionarioRepository extends JpaRepository<diccionarioModel,Integer> {
    @Query(value = "SELECT * FROM dictionary WHERE word = :wordSelected", nativeQuery = true)
    public diccionarioModel getWordTranslate(@Param("wordSelected") String wordSelected);
}
