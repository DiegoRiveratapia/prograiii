package com.prograiii2020.swing.Model;


import javax.persistence.*;

@Entity
@Table (name = "Alphabet")
public class AlphabetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "letter", length = 100, nullable = false)
    private String letter;

    @Column(name = "tipeR", length = 100, nullable = false)
    private String tipeR;

    public AlphabetModel(){

    }
    public AlphabetModel(String letter, String tipeR){
        this.letter = letter;
        this.tipeR = tipeR;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}