package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Autor {
    @JsonProperty("Jmeno")
    String jmeno;
    @JsonProperty("Prijmeni")
    String prijmeni;
public Autor(){}
    public Autor(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String toString(){
    return getJmeno() +" " + getPrijmeni();
    }
}
