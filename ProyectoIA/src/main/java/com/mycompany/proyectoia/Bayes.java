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
       public Recomendable recomendaciones=new Recomendable();
        public NoRecomendable noRecomendaciones=new NoRecomendable();
        public ArrayList<Voto> votos=new ArrayList<Voto>();
        Double probabilidadR;
        Double probabilidadD;
        Double probabilidadDR;
        Double probabilidadAP;
        Double probabilidadAPR;
        Double probabilidadP;
        Double probabilidadPR;
        Double probabilidadL;
        Double probabilidadLR;
        Double probabilidadC;
        Double probabilidadCR;
        Double probabilidadG=1.0;
        Double probabilidadGR=1.0;
        Double probabilidadA;
        Double probabilidadAR;
        Double probabilidadCL;
        Double probabilidadCLR;
    void ProbabilidadRecomendado(){
        Double cantidadRecomendados=0.0;
        for (int i = 0; i < votos.size(); i++) {
            if(votos.get(i).isRecomendable()){
                cantidadRecomendados+=1;
            }
        }
        probabilidadR=cantidadRecomendados/votos.size();
    }
    void ProbabilidadDirector(Pelicula peli){
        Double contProbabilidadR=0.0;
        Double contProbabilidadN=0.0;
            for (String pDirector : recomendaciones.pDirector) {
                if(recomendaciones.pDirector.equals(peli.getDirector())){
                    contProbabilidadR+=1;
                }
            }
             for (String pDirector : noRecomendaciones.pDirector) {
                if(noRecomendaciones.pDirector.equals(peli.getDirector())){
                    contProbabilidadN+=1;
                }
            }
        probabilidadD=(contProbabilidadR + contProbabilidadN)/votos.size();    
        probabilidadDR=contProbabilidadR/recomendaciones.pDirector.size();
        if(probabilidadD==0.0){
            probabilidadD=1.0;
        }
        if(probabilidadDR==0.0){
            probabilidadDR=1.0;
        }
    }
    void ProbabilidadActor(Pelicula peli){
        Double contProbabilidadR=0.0;
        Double contProbabilidadN=0.0;
            for (String pActor : recomendaciones.pActor) {
                if(recomendaciones.pActor.equals(peli.getActorPrincipal())){
                    contProbabilidadR+=1;
                }
            }
             for (String pActor : noRecomendaciones.pActor) {
                if(noRecomendaciones.pActor.equals(peli.getActorPrincipal())){
                    contProbabilidadN+=1;
                }
            }
        probabilidadAP=(contProbabilidadR + contProbabilidadN)/votos.size();    
        probabilidadAPR=contProbabilidadR/recomendaciones.pActor.size();
        if(probabilidadAP==0.0){
            probabilidadAP=1.0;
        }
        if(probabilidadAPR==0.0){
            probabilidadAPR=1.0;
        }
    }
     void ProbabilidadLenguaje(Pelicula peli){
        Double contProbabilidadR=0.0;
        Double contProbabilidadN=0.0;
            for (String pLenguaje : recomendaciones.pLenguaje) {
                if(recomendaciones.pLenguaje.equals(peli.getLenguaje())){
                    contProbabilidadR+=1;
                }
            }
             for (String pLenguaje : noRecomendaciones.pLenguaje) {
                if(noRecomendaciones.pLenguaje.equals(peli.getLenguaje())){
                    contProbabilidadN+=1;
                }
            }
        probabilidadL=(contProbabilidadR + contProbabilidadN)/votos.size();    
        probabilidadLR=contProbabilidadR/recomendaciones.pLenguaje.size();
       if(probabilidadL==0.0){
            probabilidadL=1.0;
        }
        if(probabilidadLR==0.0){
            probabilidadLR=1.0;
        }
    }
        void ProbabilidadPais(Pelicula peli){
        Double contProbabilidadR=0.0;
        Double contProbabilidadN=0.0;
            for (String pPais : recomendaciones.pPais) {
                if(recomendaciones.pPais.equals(peli.getPais())){
                    contProbabilidadR+=1;
                }
            }
             for (String pPais : noRecomendaciones.pPais) {
                if(noRecomendaciones.pPais.equals(peli.getPais())){
                    contProbabilidadN+=1;
                }
            }
        probabilidadP=(contProbabilidadR + contProbabilidadN)/votos.size();    
        probabilidadPR=contProbabilidadR/recomendaciones.pPais.size();
        if(probabilidadP==0.0){
            probabilidadP=1.0;
        }
        if(probabilidadPR==0.0){
            probabilidadPR=1.0;
        }
    }
    void ProbabilidadGenero(Pelicula peli){
       Double contR=0.0;
       Double contN=0.0;
        for (int i = 0; i < peli.genero.size(); i++) {
            for (int j = 0; j < recomendaciones.pGenero.size(); j++) {
                if(peli.genero.get(i).equals(recomendaciones.pGenero.get(j))){
                    contR++;
                }
            }
            if(contR==0.0){contR=1.0;}
            probabilidadGR=probabilidadGR*(contR/recomendaciones.pGenero.size());
            for (int j = 0; j < noRecomendaciones.pGenero.size(); j++) {
                if(peli.genero.get(i).equals(noRecomendaciones.pGenero.get(j))){
                    contN++;
                }
            }
            if(contN==0.0){contN=1.0;}
            Double totalCont=contR+contN;
            int totalTamaño=recomendaciones.pGenero.size()+noRecomendaciones.pGenero.size();
            probabilidadG=probabilidadG*(totalCont/totalTamaño);
            contR=0.0;
            contN=0.0;
        }
        
    }
    void ProbabilidadColor(Pelicula peli){
        Double contProbabilidadR=0.0;
        Double contProbabilidadN=0.0;
            for (String pColor : recomendaciones.pColor) {
                if(recomendaciones.pColor.equals(peli.getColor())){
                    contProbabilidadR+=1;
                }
            }
             for (String pColor : noRecomendaciones.pColor) {
                if(noRecomendaciones.pColor.equals(peli.getColor())){
                    contProbabilidadN+=1;
                }
            }
        probabilidadCL=(contProbabilidadR + contProbabilidadN)/votos.size();    
        probabilidadCLR=contProbabilidadR/recomendaciones.pColor.size();
        if(probabilidadCL==0.0){
            probabilidadCL=1.0;
        }
        if(probabilidadCLR==0.0){
            probabilidadCLR=1.0;
        }
    }
        void ProbabilidadContenido(Pelicula peli){
        Double contProbabilidadR=0.0;
        Double contProbabilidadN=0.0;
            for (String pContenido : recomendaciones.pContenido) {
                if(recomendaciones.pContenido.equals(peli.getContenido())){
                    contProbabilidadR+=1;
                }
            }
             for (String pContenido : noRecomendaciones.pContenido) {
                if(noRecomendaciones.pContenido.equals(peli.getContenido())){
                    contProbabilidadN+=1;
                }
            }
        probabilidadC=(contProbabilidadR + contProbabilidadN)/votos.size();    
        probabilidadCR=contProbabilidadR/recomendaciones.pContenido.size();
        if(probabilidadC==0.0){
            probabilidadC=1.0;
        }
        if(probabilidadCR==0.0){
            probabilidadCR=1.0;
        }
    }
           void ProbabilidadAño(Pelicula peli){
        Double contProbabilidadR=0.0;
        Double contProbabilidadN=0.0;
            for (String pAño : recomendaciones.pAño) {
                if(recomendaciones.pAño.equals(peli.getAño())){
                    contProbabilidadR+=1;
                }
            }
             for (String pAño : noRecomendaciones.pAño) {
                if(noRecomendaciones.pAño.equals(peli.getAño())){
                    contProbabilidadN+=1;
                }
            }
        probabilidadA=(contProbabilidadR + contProbabilidadN)/votos.size();    
        probabilidadAR=contProbabilidadR/recomendaciones.pAño.size();
        if(probabilidadA==0.0){
            probabilidadA=1.0;
        }
        if(probabilidadAR==0.0){
            probabilidadAR=1.0;
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
         PbayesRes=(Pbayesnum)/(probabilidadD*probabilidadAP*probabilidadL*probabilidadP*probabilidadG*probabilidadCL*probabilidadC*probabilidadA);
         return PbayesRes;
     }
}
