package edu.fje.projectem07uf2spring.model;


import org.springframework.data.annotation.Id;

/**
 * Classe entitat que representa una dada.
 * Es tracta d'una classe del model que es farà persistent
 * @author Marc Purgimon
 * @version
 */
public class Dada {
    @Id
    public int id;

    public int valor;
    public Double lat;
    public Double longitud;


    public Dada(int id, int valor, Double lat, Double longitud) {
        this.id = id;
        this.valor = valor;
        this.lat = lat;
        this.longitud = longitud;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }


    public int getId() {
        return id;
    }

    public int getValor() {
        return valor;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return "Dada{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", lat=" + lat +
                ", longitud = "+ longitud +
                '}';
    }
}