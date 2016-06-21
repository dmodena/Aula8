/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.Animal;
import com.dmodena.model.Cachorro;
import com.dmodena.model.Gato;
import com.dmodena.model.Leao;
import com.dmodena.model.Lobo;
import com.dmodena.model.AnimalBrincar;

/**
 *
 * @author dmodena
 */
public class FrmAnimais extends javax.swing.JFrame {
    Animal a;
    AnimalBrincar ab;
    
    /**
     * Creates new form FrmAnimais
     */
    public FrmAnimais() {
        initComponents();
        this.setLocationRelativeTo(null);
        iniciarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTipoAnimal = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdCachorro = new javax.swing.JRadioButton();
        rdGato = new javax.swing.JRadioButton();
        rdLeao = new javax.swing.JRadioButton();
        rdLobo = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        tfPeso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfHabitat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblBrinca = new javax.swing.JLabel();
        tfBrincadeira = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfAlimentar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Animais");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Escolha um animal");

        btnGroupTipoAnimal.add(rdCachorro);
        rdCachorro.setText("Cachorro");
        rdCachorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdCachorroActionPerformed(evt);
            }
        });

        btnGroupTipoAnimal.add(rdGato);
        rdGato.setText("Gato");
        rdGato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdGatoActionPerformed(evt);
            }
        });

        btnGroupTipoAnimal.add(rdLeao);
        rdLeao.setText("Leão");
        rdLeao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdLeaoActionPerformed(evt);
            }
        });

        btnGroupTipoAnimal.add(rdLobo);
        rdLobo.setText("Lobo");
        rdLobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdLoboActionPerformed(evt);
            }
        });

        jLabel2.setText("Peso");

        tfPeso.setDisabledTextColor(java.awt.Color.black);
        tfPeso.setEnabled(false);

        jLabel3.setText("Habitat");

        tfHabitat.setDisabledTextColor(java.awt.Color.black);
        tfHabitat.setEnabled(false);

        jLabel4.setText("O animal brinca?");

        lblBrinca.setText("Não");

        tfBrincadeira.setDisabledTextColor(java.awt.Color.black);
        tfBrincadeira.setEnabled(false);

        jLabel5.setText("Alimentação");

        tfAlimentar.setDisabledTextColor(java.awt.Color.black);
        tfAlimentar.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfAlimentar)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfHabitat))
                    .addComponent(tfBrincadeira)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeso))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdCachorro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdGato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdLeao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdLobo))
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBrinca)))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdCachorro)
                    .addComponent(rdGato)
                    .addComponent(rdLeao)
                    .addComponent(rdLobo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAlimentar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblBrinca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBrincadeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdCachorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdCachorroActionPerformed
        a = new Cachorro(25, "América do Sul");
        ab = (AnimalBrincar) a;
        atualizarCampos();
    }//GEN-LAST:event_rdCachorroActionPerformed

    private void rdGatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdGatoActionPerformed
        a = new Gato(15, "Europa");
        ab = (AnimalBrincar) a;
        atualizarCampos();
    }//GEN-LAST:event_rdGatoActionPerformed

    private void rdLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdLeaoActionPerformed
        a = new Leao(80, "Africa");
        ab = null;
        atualizarCampos();
    }//GEN-LAST:event_rdLeaoActionPerformed

    private void rdLoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdLoboActionPerformed
        a = new Lobo(35, "América do Norte");
        ab = null;
        atualizarCampos();
    }//GEN-LAST:event_rdLoboActionPerformed

    private void iniciarCampos() {
        rdCachorro.setSelected(true);        
        a = new Cachorro(25, "América do Sul");
        ab = (AnimalBrincar) a;
        atualizarCampos();
    }
    
    private void atualizarCampos() {
        tfPeso.setText(String.valueOf(a.getPeso()));
        tfHabitat.setText(a.getHabitat());
        tfAlimentar.setText(a.alimentar());
        
        if(ab != null) {
            lblBrinca.setText("Sim");
            tfBrincadeira.setText(ab.brincar());
        }
        else {
            lblBrinca.setText("Não");
            tfBrincadeira.setText("");
        }
        
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
            java.util.logging.Logger.getLogger(FrmAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAnimais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupTipoAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBrinca;
    private javax.swing.JRadioButton rdCachorro;
    private javax.swing.JRadioButton rdGato;
    private javax.swing.JRadioButton rdLeao;
    private javax.swing.JRadioButton rdLobo;
    private javax.swing.JTextField tfAlimentar;
    private javax.swing.JTextField tfBrincadeira;
    private javax.swing.JTextField tfHabitat;
    private javax.swing.JTextField tfPeso;
    // End of variables declaration//GEN-END:variables
}
