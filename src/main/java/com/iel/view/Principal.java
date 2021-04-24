/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iel.view;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author cristian
 */
public class Principal extends javax.swing.JFrame {

    public boolean qmJoga = true;
    public String[] arrayJogo = new String[9];
    public int tamTab = 3;
    public String[] nomes = new String[12];

    public Principal() {
        nomes[0] = "Magalu";
        nomes[1] = "BIA";
        nomes[2] = "Mudae";
        nomes[3] = "Bahianinho.old";
        nomes[4] = "SkyNet";
        nomes[5] = "CB";
        nomes[6] = "Pedro";
        nomes[7] = "Garoto de Programa";
        nomes[8] = "Craudo";
        nomes[9] = "Megumin";
        nomes[10] = "NatNatu";
        
        initComponents();

    }

    public void geraJogoPvp() {
        lblJogador1.setText(pegaNome("Jogador1"));
        lblJogador2.setText(pegaNome("Jogador2"));
    }

    public void geraJogoPvm() {
        Random nomeM = new Random();
        nomes[11] = pegaNome("Jogador1");
        lblJogador1.setText(nomes[11]);
        lblJogador2.setText(nomes[nomeM.nextInt(11)]);
    }

    public String pegaNome(String jogador) {
        String nomeJ = JOptionPane.showInputDialog(this, "Insira o nome do " + jogador, "Nome do jogador", JOptionPane.INFORMATION_MESSAGE);
        if (nomeJ == null || nomeJ.isEmpty()) {

            nomeJ = pegaNome(jogador);
        }
        return nomeJ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJogador1 = new javax.swing.JLabel();
        lblJogador2 = new javax.swing.JLabel();
        lblPonto1 = new javax.swing.JLabel();
        lblPonto2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnZeroZero = new javax.swing.JButton();
        btnZeroUm = new javax.swing.JButton();
        btnZeroDois = new javax.swing.JButton();
        btnUmZero = new javax.swing.JButton();
        btnUmUm = new javax.swing.JButton();
        btnUmDois = new javax.swing.JButton();
        btnDoisZero = new javax.swing.JButton();
        btnDoisUm = new javax.swing.JButton();
        btnDoisDois = new javax.swing.JButton();
        lblAtaul = new javax.swing.JLabel();
        mnuBar = new javax.swing.JMenuBar();
        mnuJogo = new javax.swing.JMenu();
        mnuPvp = new javax.swing.JMenuItem();
        mnuPvm = new javax.swing.JMenuItem();
        mnuMdoente = new javax.swing.JMenuItem();
        mnuSob = new javax.swing.JMenu();
        mnuSobre = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblJogador1.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 18)); // NOI18N
        lblJogador1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJogador1.setText("Jogador 1");

        lblJogador2.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 18)); // NOI18N
        lblJogador2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJogador2.setText("Jogador 2");

        lblPonto1.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 25)); // NOI18N
        lblPonto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPonto1.setText("0");

        lblPonto2.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 25)); // NOI18N
        lblPonto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPonto2.setText("0");

        btnZeroZero.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 25)); // NOI18N
        btnZeroZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroZeroActionPerformed(evt);
            }
        });

        btnZeroUm.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 25)); // NOI18N
        btnZeroUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroUmActionPerformed(evt);
            }
        });

        btnZeroDois.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 25)); // NOI18N
        btnZeroDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroDoisActionPerformed(evt);
            }
        });

        btnUmZero.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 25)); // NOI18N
        btnUmZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmZeroActionPerformed(evt);
            }
        });

        btnUmUm.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 25)); // NOI18N
        btnUmUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmUmActionPerformed(evt);
            }
        });

        btnUmDois.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 25)); // NOI18N
        btnUmDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmDoisActionPerformed(evt);
            }
        });

        btnDoisZero.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 25)); // NOI18N
        btnDoisZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoisZeroActionPerformed(evt);
            }
        });

        btnDoisUm.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 25)); // NOI18N
        btnDoisUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoisUmActionPerformed(evt);
            }
        });

        btnDoisDois.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 25)); // NOI18N
        btnDoisDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoisDoisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnZeroZero, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnZeroUm, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnZeroDois, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUmZero, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUmUm, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUmDois, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDoisZero, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDoisUm, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDoisDois, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnZeroZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnZeroUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnZeroDois, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUmZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUmUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUmDois, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDoisZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoisUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoisDois, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblAtaul.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 25)); // NOI18N
        lblAtaul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAtaul.setText("X");

        mnuJogo.setText("Novo Jogo");

        mnuPvp.setText("P.v.P.");
        mnuPvp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPvpActionPerformed(evt);
            }
        });
        mnuJogo.add(mnuPvp);

        mnuPvm.setText("P.v.M.");
        mnuPvm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPvmActionPerformed(evt);
            }
        });
        mnuJogo.add(mnuPvm);

        mnuMdoente.setText("Modo Doente");
        mnuJogo.add(mnuMdoente);

        mnuBar.add(mnuJogo);

        mnuSob.setText("Sobre");

        mnuSobre.setText("Sobre");
        mnuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSobreActionPerformed(evt);
            }
        });
        mnuSob.add(mnuSobre);

        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        mnuSob.add(mnuSair);

        mnuBar.add(mnuSob);

        setJMenuBar(mnuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPonto1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAtaul, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPonto2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblJogador2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(lblPonto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblPonto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblJogador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAtaul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUmDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmDoisActionPerformed
        viraBotao(btnUmDois, 5);
    }//GEN-LAST:event_btnUmDoisActionPerformed

    private void btnZeroZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroZeroActionPerformed
        viraBotao(btnZeroZero, 0);
    }//GEN-LAST:event_btnZeroZeroActionPerformed

    private void btnZeroUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroUmActionPerformed
        viraBotao(btnZeroUm, 1);
    }//GEN-LAST:event_btnZeroUmActionPerformed

    private void btnZeroDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroDoisActionPerformed
        viraBotao(btnZeroDois, 2);
    }//GEN-LAST:event_btnZeroDoisActionPerformed

    private void btnUmZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmZeroActionPerformed
        viraBotao(btnUmZero, 3);
    }//GEN-LAST:event_btnUmZeroActionPerformed

    private void btnUmUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmUmActionPerformed
        viraBotao(btnUmUm, 4);
    }//GEN-LAST:event_btnUmUmActionPerformed

    private void btnDoisZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoisZeroActionPerformed
        viraBotao(btnDoisZero, 6);
    }//GEN-LAST:event_btnDoisZeroActionPerformed

    private void btnDoisUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoisUmActionPerformed
        viraBotao(btnDoisUm, 7);
    }//GEN-LAST:event_btnDoisUmActionPerformed

    private void btnDoisDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoisDoisActionPerformed
        viraBotao(btnDoisDois, 8);
    }//GEN-LAST:event_btnDoisDoisActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_mnuSairActionPerformed

    private void mnuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSobreActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Este é um jogo da velha dinamico, que vai de tabuleiro 3x3 até o quanto o monitor e a RAM aguentar. \nFeito por Cristian Robert e Douglas Morona", "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mnuSobreActionPerformed

    private void mnuPvpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPvpActionPerformed
        // TODO add your handling code here:
        geraJogoPvp();
    }//GEN-LAST:event_mnuPvpActionPerformed

    private void mnuPvmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPvmActionPerformed
        // TODO add your handling code here:
        geraJogoPvm();

    }//GEN-LAST:event_mnuPvmActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public void viraBotao(JButton botao, int valorBotao) {
        if (botao.getText() == "" && botao.getText() != "X" && botao.getText() != "O") {
            String valorJogador;
            if (qmJoga) {
                valorJogador = "X";
                lblAtaul.setText("O");
            } else {
                valorJogador = "O";
                lblAtaul.setText("X");
            }
            botao.setText(valorJogador);
            arrayJogo[valorBotao] = valorJogador;
            if (verificaVitoria(valorJogador)) {
                String jogador;
                if (valorJogador == "X") {
                    jogador = lblJogador1.getText();
                } else {
                    jogador = lblJogador2.getText();
                }
                JOptionPane.showMessageDialog(this, "Parabéns, o jogador " + jogador + " venceu o jogo", "VENCEDOR", JOptionPane.INFORMATION_MESSAGE);
            }
            qmJoga = !qmJoga;
        }
        if (verificaVelha()) {
            JOptionPane.showMessageDialog(this, "Putz, deu velha, vamos jogar de novo", "VELHA", JOptionPane.WARNING_MESSAGE);
        }
    }

    public boolean verificaVelha() {
        for (String v : arrayJogo) {
            if (v != "X" && v != "O") {
                return false;
            }
        }
        return true;
    }

    public boolean verificaVitoria(String valorJogador) {
        for (int i = 0; i < tamTab; i++) {
            if (verificaHorizontal(valorJogador, tamTab * i)) {
                return true;
            }
        }
        for (int i = 0; i < tamTab; i++) {
            if (verificaVertical(valorJogador, tamTab + i)) {
                return true;
            }
        }
        if (verificaDiagonal1(valorJogador)) {
            return true;
        }
        if (verificaDiagonal2(valorJogador)) {
            return true;
        }
        return false;
    }

    public boolean verificaHorizontal(String valorJogador, int valor) {
        for (int i = valor; i < valor + tamTab; i++) {
            if (arrayJogo[i] != valorJogador) {
                return false;
            }
        }
        return true;
    }

    public boolean verificaVertical(String valorJogador, int valor) {
        for (int i = valor; i < Math.pow(tamTab, 2); i += tamTab) {
            if (arrayJogo[i] != valorJogador) {
                return false;
            }
        }
        return true;
    }

    public boolean verificaDiagonal1(String valorJogador) {
        for (int i = 0; i < Math.pow(tamTab, 2); i += tamTab + 1) {
            if (arrayJogo[i] != valorJogador) {
                return false;
            }
        }
        return true;
    }

    public boolean verificaDiagonal2(String valorJogador) {
        for (int i = 0; i < Math.pow(tamTab, 2); i += tamTab - 1) {
            if (arrayJogo[i] != valorJogador) {
                return false;
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoisDois;
    private javax.swing.JButton btnDoisUm;
    private javax.swing.JButton btnDoisZero;
    private javax.swing.JButton btnUmDois;
    private javax.swing.JButton btnUmUm;
    private javax.swing.JButton btnUmZero;
    private javax.swing.JButton btnZeroDois;
    private javax.swing.JButton btnZeroUm;
    private javax.swing.JButton btnZeroZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAtaul;
    private javax.swing.JLabel lblJogador1;
    private javax.swing.JLabel lblJogador2;
    private javax.swing.JLabel lblPonto1;
    private javax.swing.JLabel lblPonto2;
    private javax.swing.JMenuBar mnuBar;
    private javax.swing.JMenu mnuJogo;
    private javax.swing.JMenuItem mnuMdoente;
    private javax.swing.JMenuItem mnuPvm;
    private javax.swing.JMenuItem mnuPvp;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JMenu mnuSob;
    private javax.swing.JMenuItem mnuSobre;
    // End of variables declaration//GEN-END:variables
}
