package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Book {
    @JsonProperty("ISBN")
    String ISBN;
    @JsonProperty("Nazev")
    String nazev;
    @JsonProperty("Vydano")
    int vydano;
    @JsonProperty("Autor")
    Autor autor;


    public String getIsbn() {
        return ISBN;
    }

    public void setIsbn(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getVydano() {
        return vydano;
    }

    public void setVydano(int vydano) {
        this.vydano = vydano;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
