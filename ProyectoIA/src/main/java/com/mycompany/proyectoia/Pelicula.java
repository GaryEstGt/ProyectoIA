/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoia;

/**
 *
 * @author garya
 */
public class Pelicula {
     private String titulo;
    private String director;
    private String color;
    private String actorPrincipal;
    private String lenguaje;
    private String pais;
    private String contenido;
    private String año;
    private String genero;
    private double score;

    public Pelicula(String titulo, String director, String color, String actorPrincipal, String lenguaje, String pais, String contenido, String año, String genero, double score) {
        this.titulo = titulo;
        this.director = director;
        this.color = color;
        this.actorPrincipal = actorPrincipal;
        this.lenguaje = lenguaje;
        this.pais = pais;
        this.contenido = contenido;
        this.año = año;
        this.genero = genero;
        this.score = score;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
