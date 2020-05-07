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
public class Voto {
 private Pelicula peliculaVotada;
 private boolean recomendable;
    public Pelicula getPeliculaVotada() {
        return peliculaVotada;
    }

    public void setPeliculaVotada(Pelicula peliculaVotada) {
        this.peliculaVotada = peliculaVotada;
    }

    public boolean isRecomendable() {
        return recomendable;
    }

    public void setRecomendable(boolean recomendable) {
        this.recomendable = recomendable;
    }

 
    public Voto(Pelicula peliculaVotada, boolean recomendable) {
        this.peliculaVotada = peliculaVotada;
        this.recomendable = recomendable;
    }
  
}
