package com.cine.peliculas.domain.models;

public class Pelicula {
    private int id;
    private String codinterno;
    private String nombre;
    private String duracion;
    private String sinopsis;
    
    public Pelicula() {
    }

    public Pelicula(int id, String codinterno, String nombre, String duracion, String sinopsis) {
        this.id = id;
        this.codinterno = codinterno;
        this.nombre = nombre;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodinterno() {
        return codinterno;
    }

    public void setCodinterno(String codinterno) {
        this.codinterno = codinterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void add(Pelicula pelicula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    
}
