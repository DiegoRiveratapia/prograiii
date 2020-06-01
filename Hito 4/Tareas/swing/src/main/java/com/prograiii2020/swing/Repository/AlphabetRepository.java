package com.prograiii2020.swing.Repository;

import com.prograiii2020.swing.Model.AlphabetModel;
import com.prograiii2020.swing.Model.ButtonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AlphabetRepository extends JpaRepository<AlphabetModel,Integer> {
    @Query( value = "SELECT * FROM Alphabet WHERE letter = 'Q,W,E,R,T,Y,U,I,O,P';",nativeQuery = true)
    public AlphabetModel getLetter();
}
