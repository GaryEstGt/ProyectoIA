/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoia;

import static com.mycompany.proyectoia.Principal.modelo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author garya
 */
public class MostrarPelicula extends javax.swing.JFrame {
    Pelicula peliActual;
    public Bayes bot;
      public static Recomendable recomendaciones=new Recomendable();
      public static NoRecomendable noRecomendaciones=new NoRecomendable();
      public static ArrayList<Voto> votos=new ArrayList<Voto>();
    /**
     * Creates new form MostrarPelicula
     */
    public MostrarPelicula() {
        initComponents();
        LlenarTabla(Principal.resultado);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txt_Titulo6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_res = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Titulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Director = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Actor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Genero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Año = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_Pais = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_Recomendacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_like = new javax.swing.JButton();
        btn_dislike = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel8.setText("Pais");

        txt_Titulo6.setEnabled(false);
        txt_Titulo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Titulo6ActionPerformed(evt);
            }
        });

        tb_res.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_res);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Pelicula Seleccionada");

        jLabel2.setText("Titulo");

        txt_Titulo.setEnabled(false);

        jLabel3.setText("Director");

        txt_Director.setEnabled(false);
        txt_Director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DirectorActionPerformed(evt);
            }
        });

        jLabel4.setText("Actor");

        txt_Actor.setEnabled(false);
        txt_Actor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ActorActionPerformed(evt);
            }
        });

        jLabel5.setText("Genero");

        txt_Genero.setEnabled(false);
        txt_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GeneroActionPerformed(evt);
            }
        });

        jLabel6.setText("Año");

        txt_Año.setEnabled(false);
        txt_Año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AñoActionPerformed(evt);
            }
        });

        jLabel7.setText("Pais");

        txt_Pais.setEnabled(false);
        txt_Pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PaisActionPerformed(evt);
            }
        });

        jLabel9.setText("Recomendación");

        txt_Recomendacion.setEnabled(false);
        txt_Recomendacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RecomendacionActionPerformed(evt);
            }
        });

        jLabel10.setText("Votar Pelicula");

        btn_like.setText("Me gusta");
        btn_like.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_likeActionPerformed(evt);
            }
        });

        btn_dislike.setText("No me gusta");
        btn_dislike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dislikeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_Actor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_Director, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(33, 33, 33)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_Año, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(129, 129, 129))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(txt_Recomendacion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(113, 113, 113)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(btn_like)
                        .addGap(42, 42, 42)
                        .addComponent(btn_dislike)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Director, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Actor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Recomendacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btn_like)
                    .addComponent(btn_dislike))
                .addGap(19, 19, 19))
        );

        jButton1.setText("Ver Pelicula");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButton1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_DirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DirectorActionPerformed

    private void txt_ActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ActorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ActorActionPerformed

    private void txt_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GeneroActionPerformed

    private void txt_AñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AñoActionPerformed

    private void txt_PaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PaisActionPerformed

    private void txt_Titulo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Titulo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Titulo6ActionPerformed

    private void txt_RecomendacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RecomendacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RecomendacionActionPerformed

    private void btn_likeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_likeActionPerformed
        // TODO add your handling code here:
        recomendaciones.pActor.add(peliActual.getActorPrincipal());
        recomendaciones.pDirector.add(peliActual.getDirector());
        recomendaciones.pColor.add(peliActual.getColor());
        recomendaciones.pContenido.add(peliActual.getContenido());
        recomendaciones.pAño.add(peliActual.getAño());
        recomendaciones.pPais.add(peliActual.getPais());
        recomendaciones.pLenguaje.add(peliActual.getLenguaje());
        recomendaciones.pGenero.addAll(peliActual.genero);
        Voto nuevoVoto=new Voto(peliActual,true);      
        votos.add(nuevoVoto);
    }//GEN-LAST:event_btn_likeActionPerformed

    private void btn_dislikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dislikeActionPerformed
        // TODO add your handling code here:
         noRecomendaciones.pActor.add(peliActual.getActorPrincipal());
        noRecomendaciones.pDirector.add(peliActual.getDirector());
        noRecomendaciones.pColor.add(peliActual.getColor());
        noRecomendaciones.pContenido.add(peliActual.getContenido());
        noRecomendaciones.pAño.add(peliActual.getAño());
        noRecomendaciones.pPais.add(peliActual.getPais());
        noRecomendaciones.pLenguaje.add(peliActual.getLenguaje());
        noRecomendaciones.pGenero.addAll(peliActual.genero);
        Voto nuevoVoto=new Voto(peliActual,false);      
        votos.add(nuevoVoto);
    }//GEN-LAST:event_btn_dislikeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        peliActual=new Pelicula();
        int filaseleccionada = tb_res.getSelectedRow();
        peliActual.setTitulo((String)tb_res.getValueAt(filaseleccionada, 0));
        peliActual.setDirector((String)tb_res.getValueAt(filaseleccionada, 1));
        peliActual.setColor((String)tb_res.getValueAt(filaseleccionada, 2));
        peliActual.setActorPrincipal((String)tb_res.getValueAt(filaseleccionada, 3));
        peliActual.setLenguaje((String)tb_res.getValueAt(filaseleccionada, 4));
        peliActual.setPais((String)tb_res.getValueAt(filaseleccionada, 5));
        peliActual.setContenido((String)tb_res.getValueAt(filaseleccionada, 6));
        peliActual.setAño((String)tb_res.getValueAt(filaseleccionada, 7));
        String genero=(String)tb_res.getValueAt(filaseleccionada, 8);
        String[] generos=genero.split("\\|");
        for (int i = 0; i < generos.length; i++) {
            peliActual.genero.add(generos[i]);
        }
        peliActual.setScore((Double)tb_res.getValueAt(filaseleccionada, 9));
        txt_Titulo.setText(peliActual.getTitulo());
        txt_Director.setText(peliActual.getDirector());
        txt_Actor.setText(peliActual.getActorPrincipal());
        txt_Genero.setText(peliActual.getGenero());
        txt_Año.setText(peliActual.getAño());
        txt_Pais.setText(peliActual.getPais());
        if(votos.size()>2){
            bot=new Bayes();
            Double var1=(bot.NaiveBayes(peliActual)*100);
            int valor=rangos(var1);
            txt_Recomendacion.setText(String.valueOf(valor));
        }else {
            int valor=rangos(peliActual.getScore()*10);
             txt_Recomendacion.setText(String.valueOf(valor));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

public void LlenarTabla(List<Pelicula>lista){
        modelo = new DefaultTableModel();
        tb_res.setModel(modelo);
        modelo.addColumn("Titulo");
        modelo.addColumn("Director");
        modelo.addColumn("Color");
        modelo.addColumn("Actor");
        modelo.addColumn("Lenguaje");
        modelo.addColumn("Pais");
        modelo.addColumn("Contenido");
        modelo.addColumn("Año");
        modelo.addColumn("Genero");
        modelo.addColumn("Punteo");
        for (int i = 0; i < lista.size(); i++) {
            Object []object = new Object[10];
            object[0] = lista.get(i).getTitulo();
            object[1] = lista.get(i).getDirector(); 
            object[2] = lista.get(i).getColor(); 
            object[3] = lista.get(i).getActorPrincipal(); 
            object[4] = lista.get(i).getLenguaje(); 
            object[5] = lista.get(i).getPais(); 
            object[6] = lista.get(i).getContenido(); 
            object[7] = lista.get(i).getAño();
            object[8] = lista.get(i).getGenero();
            object[9] = lista.get(i).getScore();            
            modelo.addRow(object);
        }
    }
public int rangos(Double valor){
    int porcentaje=0;
    if(valor>0 && valor<31){porcentaje=30;}
    if(valor>30 && valor<51){porcentaje=50;}
    if(valor>50 && valor<81){porcentaje=80;}
    if(valor>81){porcentaje=95;}
    return porcentaje;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MostrarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarPelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dislike;
    private javax.swing.JButton btn_like;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_res;
    private javax.swing.JTextField txt_Actor;
    private javax.swing.JTextField txt_Año;
    private javax.swing.JTextField txt_Director;
    private javax.swing.JTextField txt_Genero;
    private javax.swing.JTextField txt_Pais;
    private javax.swing.JTextField txt_Recomendacion;
    private javax.swing.JTextField txt_Titulo;
    private javax.swing.JTextField txt_Titulo6;
    // End of variables declaration//GEN-END:variables
}
