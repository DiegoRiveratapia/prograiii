package com.prograiii2020.swing.Repository;

import com.prograiii2020.swing.Model.AlphabetModel;
import com.prograiii2020.swing.Model.ButtonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlphabetRepository extends JpaRepository<AlphabetModel,Integer> {
    @Query( value = "SELECT * FROM Alphabet WHERE tipeR='First';",nativeQuery = true)
    public List<AlphabetModel> getFirstRow();

    @Query( value = "SELECT * FROM Alphabet WHERE tipeR='Second';",nativeQuery = true)
    public List<AlphabetModel> getSecondRow();

    @Query( value = "SELECT * FROM Alphabet WHERE tipeR='Three';",nativeQuery = true)
    public List<AlphabetModel> getThreeRow();
}
