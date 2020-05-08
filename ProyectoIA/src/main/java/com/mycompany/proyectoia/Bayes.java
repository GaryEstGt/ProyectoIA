/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoia;

import java.util.ArrayList;

/**
 *
 * @author garya
 */
public class Bayes {
        Double probabilidadR=1.0;
        Double probabilidadD=1.0;
        Double probabilidadDR=1.0;
        Double probabilidadAP=1.0;
        Double probabilidadAPR=1.0;
        Double probabilidadP=1.0;
        Double probabilidadPR=1.0;
        Double probabilidadL=1.0;
        Double probabilidadLR=1.0;
        Double probabilidadC=1.0;
        Double probabilidadCR=1.0;
        Double probabilidadG=1.0;
        Double probabilidadGR=1.0;
        Double probabilidadA=1.0;
        Double probabilidadAR=1.0;
        Double probabilidadCL=1.0;
        Double probabilidadCLR=1.0;
    void ProbabilidadRecomendado(){
        Double cantidadRecomendados=0.0;
        for (int i = 0; i < MostrarPelicula.votos.size(); i++) {
            if(MostrarPelicula.votos.get(i).isRecomendable()){
                cantidadRecomendados+=1;
            }
        }
        probabilidadR=cantidadRecomendados/MostrarPelicula.votos.size();
    }
    void ProbabilidadDirector(Pelicula peli){
        Double contProbabilidadR=0.0;
        Double contProbabilidadN=0.0;
            for (String pDirector : MostrarPelicula.recomendaciones.pDirector) {
                if(pDirector.equals(peli.getDirector())){
                    contProbabilidadR+=1;
                }
            }
             for (String pDirector : MostrarPelicula.noRecomendaciones.pDirector) {
                if(pDirector.equals(peli.getDirector())){
                    contProbabilidadN+=1;
                }
            }
        if(contProbabilidadR!=0 && contProbabilidadN !=0){
            probabilidadD=(contProbabilidadR + contProbabilidadN)/MostrarPelicula.votos.size();    
            probabilidadDR=contProbabilidadR/MostrarPelicula.recomendaciones.pDirector.size();
        }            
    }
    void ProbabilidadActor(Pelicula peli){
        Double contProbabilidadR=0.0;
        Double contProbabilidadN=0.0;
            for (String pActor : MostrarPelicula.recomendaciones.pActor) {
                if(pActor.equals(peli.getActorPrincipal())){
                    contProbabilidadR+=1;
                }
            }
             for (String pActor : MostrarPelicula.noRecomendaciones.pActor) {
                if(pActor.equals(peli.getActorPrincipal())){
                    contProbabilidadN+=1;
                }
            }
        if(contProbabilidadR!=0 && contProbabilidadN !=0){
            probabilidadAP=(contProbabilidadR + contProbabilidadN)/MostrarPelicula.votos.size();    
            probabilidadAPR=contProbabilidadR/MostrarPelicula.recomendaciones.pActor.size();
        } 
    }
     void ProbabilidadLenguaje(Pelicula peli){
        Double contProbabilidadR=0.0;
        Double contProbabilidadN=0.0;
            for (String pLenguaje : MostrarPelicula.recomendaciones.pLenguaje) {
                if(pLenguaje.equals(peli.getLenguaje())){
                    contProbabilidadR+=1;
                }
            }
             for (String pLenguaje : MostrarPelicula.noRecomendaciones.pLenguaje) {
                if(pLenguaje.equals(peli.getLenguaje())){
                    contProbabilidadN+=1;
                }
            }
        if(contProbabilidadR!=0 && contProbabilidadN !=0){
            probabilidadL=(contProbabilidadR + contProbabilidadN)/MostrarPelicula.votos.size();    
            probabilidadLR=contProbabilidadR/MostrarPelicula.recomendaciones.pLenguaje.size();
        } 
    }
        void ProbabilidadPais(Pelicula peli){
        Double contProbabilidadR=0.0;
        Double contProbabilidadN=0.0;
            for (String pPais : MostrarPelicula.recomendaciones.pPais) {
                if(pPais.equals(peli.getPais())){
                    contProbabilidadR+=1;
                }
            }
             for (String pPais : MostrarPelicula.noRecomendaciones.pPais) {
                if(pPais.equals(peli.getPais())){
                    contProbabilidadN+=1;
                }
            }
           if(contProbabilidadR!=0 && contProbabilidadN !=0){
            probabilidadP=(contProbabilidadR + contProbabilidadN)/MostrarPelicula.votos.size();    
            probabilidadPR=contProbabilidadR/MostrarPelicula.recomendaciones.pPais.size();
        } 
    }
    void ProbabilidadGenero(Pelicula peli){
       Double contR=0.0;
       Double contN=0.0;
        for (int i = 0; i < peli.genero.size(); i++) {
            for (int j = 0; j < MostrarPelicula.recomendaciones.pGenero.size(); j++) {
                if(peli.genero.get(i).equals(MostrarPelicula.recomendaciones.pGenero.get(j))){
                    contR++;
                }
            }           
            for (int j = 0; j < MostrarPelicula.noRecomendaciones.pGenero.size(); j++) {
                if(peli.genero.get(i).equals(MostrarPelicula.noRecomendaciones.pGenero.get(j))){
                    contN++;
                }
            }
            if(contN!=0.0 && contR!=0.0){
              probabilidadGR=probabilidadGR*(contR/MostrarPelicula.recomendaciones.pGenero.size()); 
              probabilidadG=probabilidadG*((contR+contN)/(MostrarPelicula.recomendaciones.pGenero.size()+MostrarPelicula.noRecomendaciones.pGenero.size()));
            } 
            contR=0.0;
            contN=0.0;
        }
    }
    void ProbabilidadColor(Pelicula peli){
        Double contProbabilidadR=0.0;
        Double contProbabilidadN=0.0;
            for (String pColor : MostrarPelicula.recomendaciones.pColor) {
                if(pColor.equals(peli.getColor())){
                    contProbabilidadR+=1;
                }
            }
             for (String pColor : MostrarPelicula.noRecomendaciones.pColor) {
                if(pColor.equals(peli.getColor())){
                    contProbabilidadN+=1;
                }
            }
        if(contProbabilidadR!=0 && contProbabilidadN !=0){
            probabilidadCL=(contProbabilidadR + contProbabilidadN)/MostrarPelicula.votos.size();    
            probabilidadCLR=contProbabilidadR/MostrarPelicula.recomendaciones.pColor.size();
        } 
    }
        void ProbabilidadContenido(Pelicula peli){
        Double contProbabilidadR=0.0;
        Double contProbabilidadN=0.0;
            for (String pContenido : MostrarPelicula.recomendaciones.pContenido) {
                if(pContenido.equals(peli.getContenido())){
                    contProbabilidadR+=1;
                }
            }
             for (String pContenido : MostrarPelicula.noRecomendaciones.pContenido) {
                if(pContenido.equals(peli.getContenido())){
                    contProbabilidadN+=1;
                }
            }
        if(contProbabilidadR!=0 && contProbabilidadN !=0){
            probabilidadC=(contProbabilidadR + contProbabilidadN)/MostrarPelicula.votos.size();    
            probabilidadCR=contProbabilidadR/MostrarPelicula.recomendaciones.pContenido.size();
        } 
    }
           void ProbabilidadAño(Pelicula peli){
        Double contProbabilidadR=0.0;
        Double contProbabilidadN=0.0;
            for (String pAño : MostrarPelicula.recomendaciones.pAño) {
                if(pAño.equals(peli.getAño())){
                    contProbabilidadR+=1;
                }
            }
             for (String pAño : MostrarPelicula.noRecomendaciones.pAño) {
                if(pAño.equals(peli.getAño())){
                    contProbabilidadN+=1;
                }
            }
        if(contProbabilidadR!=0 && contProbabilidadN !=0){
            probabilidadA=(contProbabilidadR + contProbabilidadN)/MostrarPelicula.votos.size();    
            probabilidadAR=contProbabilidadR/MostrarPelicula.recomendaciones.pAño.size();
        } 
    }
     public Double NaiveBayes(Pelicula Peli){
         Double Pbayesnum=0.0;
         Double PbayesRes=0.0;
         ProbabilidadRecomendado();
         ProbabilidadDirector(Peli);
         ProbabilidadActor(Peli);
         ProbabilidadLenguaje(Peli);
         ProbabilidadPais(Peli);
         ProbabilidadGenero(Peli);
         ProbabilidadColor(Peli);
         ProbabilidadContenido(Peli);
         ProbabilidadAño(Peli);
          Pbayesnum=(probabilidadR*probabilidadDR*probabilidadAPR*probabilidadLR*probabilidadPR*probabilidadGR*probabilidadCLR*probabilidadCR*probabilidadAR);
          Double deno=probabilidadD*probabilidadAP*probabilidadL*probabilidadP*probabilidadG*probabilidadCL*probabilidadC*probabilidadA;
          if(Pbayesnum>deno){
              String s="";
          }
         PbayesRes=(Pbayesnum)/(probabilidadD*probabilidadAP*probabilidadL*probabilidadP*probabilidadG*probabilidadCL*probabilidadC*probabilidadA);
         return PbayesRes;
     }
}
