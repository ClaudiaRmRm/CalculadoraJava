/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author SOCIALINKS
 */
public class Calculadora extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager ();
    ScriptEngine se = sem.getEngineByName ("JavaScript");
    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BC = new javax.swing.JButton();
        BPorciento = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        BPotencia = new javax.swing.JButton();
        BDivision = new javax.swing.JButton();
        BMultiplicacion = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        BMenos = new javax.swing.JButton();
        BSuma = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        BPunto = new javax.swing.JButton();
        BIgual = new javax.swing.JButton();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(255, 186, 174));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BC.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BC.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        BC.setText("C");
        BC.setBorderPainted(false);
        BC.setFocusPainted(false);
        BC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BC.setOpaque(false);
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });

        BPorciento.setBackground(new java.awt.Color(255, 255, 255));
        BPorciento.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BPorciento.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        BPorciento.setText("%");
        BPorciento.setBorderPainted(false);
        BPorciento.setFocusPainted(false);
        BPorciento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BPorciento.setOpaque(false);
        BPorciento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPorcientoActionPerformed(evt);
            }
        });

        B7.setBackground(new java.awt.Color(255, 255, 255));
        B7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        B7.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        B7.setText("7");
        B7.setBorderPainted(false);
        B7.setFocusPainted(false);
        B7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B7.setOpaque(false);
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        BPotencia.setBackground(new java.awt.Color(255, 255, 255));
        BPotencia.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BPotencia.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        BPotencia.setText("^");
        BPotencia.setBorderPainted(false);
        BPotencia.setFocusPainted(false);
        BPotencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BPotencia.setOpaque(false);
        BPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPotenciaActionPerformed(evt);
            }
        });

        BDivision.setBackground(new java.awt.Color(255, 255, 255));
        BDivision.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BDivision.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        BDivision.setText("/");
        BDivision.setBorderPainted(false);
        BDivision.setFocusPainted(false);
        BDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BDivision.setOpaque(false);
        BDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDivisionActionPerformed(evt);
            }
        });

        BMultiplicacion.setBackground(new java.awt.Color(255, 255, 255));
        BMultiplicacion.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BMultiplicacion.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        BMultiplicacion.setText("x");
        BMultiplicacion.setBorderPainted(false);
        BMultiplicacion.setFocusPainted(false);
        BMultiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BMultiplicacion.setOpaque(false);
        BMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMultiplicacionActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(255, 255, 255));
        B9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        B9.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        B9.setText("9");
        B9.setBorderPainted(false);
        B9.setFocusPainted(false);
        B9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B9.setOpaque(false);
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(255, 255, 255));
        B8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        B8.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        B8.setText("8");
        B8.setBorderPainted(false);
        B8.setFocusPainted(false);
        B8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B8.setOpaque(false);
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(255, 255, 255));
        B4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        B4.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        B4.setText("4");
        B4.setBorderPainted(false);
        B4.setFocusPainted(false);
        B4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B4.setOpaque(false);
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(255, 255, 255));
        B5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        B5.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        B5.setText("5");
        B5.setBorderPainted(false);
        B5.setFocusPainted(false);
        B5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B5.setOpaque(false);
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(255, 255, 255));
        B6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        B6.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        B6.setText("6");
        B6.setBorderPainted(false);
        B6.setFocusPainted(false);
        B6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B6.setOpaque(false);
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        BMenos.setBackground(new java.awt.Color(255, 255, 255));
        BMenos.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BMenos.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        BMenos.setText("-");
        BMenos.setBorderPainted(false);
        BMenos.setFocusPainted(false);
        BMenos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BMenos.setOpaque(false);
        BMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMenosActionPerformed(evt);
            }
        });

        BSuma.setBackground(new java.awt.Color(255, 255, 255));
        BSuma.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BSuma.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        BSuma.setText("+");
        BSuma.setBorderPainted(false);
        BSuma.setFocusPainted(false);
        BSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BSuma.setOpaque(false);
        BSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSumaActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(255, 255, 255));
        B1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        B1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        B1.setText("1");
        B1.setBorderPainted(false);
        B1.setFocusPainted(false);
        B1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B1.setOpaque(false);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(255, 255, 255));
        B2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        B2.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        B2.setText("2");
        B2.setBorderPainted(false);
        B2.setFocusPainted(false);
        B2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B2.setOpaque(false);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(255, 255, 255));
        B3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        B3.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        B3.setText("3");
        B3.setBorderPainted(false);
        B3.setFocusPainted(false);
        B3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B3.setOpaque(false);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B0.setBackground(new java.awt.Color(255, 255, 255));
        B0.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        B0.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        B0.setText("0");
        B0.setBorderPainted(false);
        B0.setFocusPainted(false);
        B0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B0.setOpaque(false);
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        BPunto.setBackground(new java.awt.Color(255, 255, 255));
        BPunto.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BPunto.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        BPunto.setText(".");
        BPunto.setBorderPainted(false);
        BPunto.setFocusPainted(false);
        BPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BPunto.setOpaque(false);
        BPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPuntoActionPerformed(evt);
            }
        });

        BIgual.setBackground(new java.awt.Color(255, 255, 255));
        BIgual.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BIgual.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOCIALINKS\\Pictures\\Calculadora\\Boton.png")); // NOI18N
        BIgual.setText("=");
        BIgual.setBorderPainted(false);
        BIgual.setFocusPainted(false);
        BIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BIgual.setOpaque(false);
        BIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BPorciento, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BPorciento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtOperacion.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtResultado.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtResultado.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtOperacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOperacion)
                .addGap(5, 5, 5)
                .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_BCActionPerformed

    private void BPorcientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPorcientoActionPerformed
        addNumber("%");    
    }//GEN-LAST:event_BPorcientoActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        addNumber ("7");
    }//GEN-LAST:event_B7ActionPerformed

    private void BPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPotenciaActionPerformed
        addNumber("^");  
    }//GEN-LAST:event_BPotenciaActionPerformed

    private void BDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDivisionActionPerformed
        addNumber("/");   
    }//GEN-LAST:event_BDivisionActionPerformed

    private void BMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMultiplicacionActionPerformed
     addNumber("*"); 
    }//GEN-LAST:event_BMultiplicacionActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        addNumber("9");  
    }//GEN-LAST:event_B9ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        addNumber("8");
    }//GEN-LAST:event_B8ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        addNumber("4");  
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        addNumber("5");        
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
      addNumber ("6");
    }//GEN-LAST:event_B6ActionPerformed

    private void BMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMenosActionPerformed
     addNumber("-");  
    }//GEN-LAST:event_BMenosActionPerformed

    private void BSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSumaActionPerformed
     addNumber("+");   
    }//GEN-LAST:event_BSumaActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
      addNumber ("1");  
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
       addNumber ("2");
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
      addNumber ("3"); 
    }//GEN-LAST:event_B3ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
      addNumber ("0");   
    }//GEN-LAST:event_B0ActionPerformed

    private void BPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPuntoActionPerformed
     addNumber("."); 
    }//GEN-LAST:event_BPuntoActionPerformed

    private void BIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIgualActionPerformed
         try {
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
         } catch (ScriptException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_BIgualActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void addNumber(String digito){
        txtOperacion.setText(txtOperacion.getText()+digito);
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BC;
    private javax.swing.JButton BDivision;
    private javax.swing.JButton BIgual;
    private javax.swing.JButton BMenos;
    private javax.swing.JButton BMultiplicacion;
    private javax.swing.JButton BPorciento;
    private javax.swing.JButton BPotencia;
    private javax.swing.JButton BPunto;
    private javax.swing.JButton BSuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
