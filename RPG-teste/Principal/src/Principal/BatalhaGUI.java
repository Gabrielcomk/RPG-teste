
package Principal;

import Inimigo.EscolheInimigo;
import java.awt.Image;
import javax.swing.ImageIcon;

public class BatalhaGUI extends javax.swing.JFrame {
    private Classes.Personagem jogador;
    private Classes.Personagem inimigo;
    private int turno = 1;

    public BatalhaGUI(Classes.Personagem jogador) {
        initComponents();
        this.jogador = jogador;
        this.inimigo = EscolheInimigo.escolheInimigo();
        setSize(700, 800);
        setLocationRelativeTo(null);
        Acoes.setVisible(false);
        atualizarTela();
    }

    private void atualizarTela() {
        nomeJogador.setText(jogador.getNome());
        classeJogador.setText("Classe: " + jogador.getClasse());
        jogadorVida.setText("HP: " + jogador.getVida());
        jogadorEnergia.setText("Energia: " + jogador.getEnergia());

        nomeInimigo.setText(inimigo.getNome());
        classeInimigo.setText("Classe: " + inimigo.getClasse());
        vidaInimigo.setText("HP: " + inimigo.getVida());
        energiaInimigo.setText("Energia: " + inimigo.getEnergia());

        Turno.setText("Turno: " + turno);

        String nomeImagem = inimigo.getClasse() + ".png";
        java.net.URL imgURL = getClass().getResource("/imagens/" + nomeImagem);

        if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            Image imagemRedimensionada = icon.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
            imagemInimigo.setIcon(new ImageIcon(imagemRedimensionada));
        } else {
            System.err.println("Imagem do inimigo não encontrada: " + nomeImagem);
            imagemInimigo.setIcon(null);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ComboBatalha = new javax.swing.JTextArea();
        nomeJogador = new javax.swing.JTextField();
        classeJogador = new javax.swing.JTextField();
        jogadorEnergia = new javax.swing.JTextField();
        Atacar1 = new javax.swing.JButton();
        Atacar2 = new javax.swing.JButton();
        Atacar4 = new javax.swing.JButton();
        jogadorVida = new javax.swing.JTextField();
        vidaInimigo = new javax.swing.JTextField();
        classeInimigo = new javax.swing.JTextField();
        nomeInimigo = new javax.swing.JTextField();
        energiaInimigo = new javax.swing.JTextField();
        Turno = new javax.swing.JTextField();
        Acoes = new javax.swing.JInternalFrame();
        Acao1 = new javax.swing.JButton();
        Acao2 = new javax.swing.JButton();
        Acao3 = new javax.swing.JButton();
        Acao4 = new javax.swing.JButton();
        Atacar5 = new javax.swing.JButton();
        imagemInimigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboBatalha.setEditable(false);
        ComboBatalha.setColumns(20);
        ComboBatalha.setRows(5);
        jScrollPane1.setViewportView(ComboBatalha);

        nomeJogador.setEditable(false);
        nomeJogador.setText("Seu nome:");
        nomeJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeJogadorActionPerformed(evt);
            }
        });

        classeJogador.setEditable(false);
        classeJogador.setText("Sua classe:");

        jogadorEnergia.setEditable(false);
        jogadorEnergia.setText("Sua energia:");
        jogadorEnergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogadorEnergiaActionPerformed(evt);
            }
        });

        Atacar1.setText("Item");
        Atacar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atacar1ActionPerformed(evt);
            }
        });

        Atacar2.setText("Agir");
        Atacar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atacar2ActionPerformed(evt);
            }
        });

        Atacar4.setText("Fugir");
        Atacar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atacar4ActionPerformed(evt);
            }
        });

        jogadorVida.setEditable(false);
        jogadorVida.setText("Sua vida:");
        jogadorVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogadorVidaActionPerformed(evt);
            }
        });

        vidaInimigo.setEditable(false);
        vidaInimigo.setText("Sua vida:");
        vidaInimigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vidaInimigoActionPerformed(evt);
            }
        });

        classeInimigo.setEditable(false);
        classeInimigo.setText("Sua classe:");

        nomeInimigo.setEditable(false);
        nomeInimigo.setText("Seu nome:");

        energiaInimigo.setEditable(false);
        energiaInimigo.setText("Sua energia:");
        energiaInimigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                energiaInimigoActionPerformed(evt);
            }
        });

        Turno.setEditable(false);
        Turno.setText("Turno:");
        Turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnoActionPerformed(evt);
            }
        });

        Acoes.setVisible(true);

        Acao1.setText("Ação");

        Acao2.setText("Ação");

        Acao3.setText("Ação");

        Acao4.setText("Ação");

        javax.swing.GroupLayout AcoesLayout = new javax.swing.GroupLayout(Acoes.getContentPane());
        Acoes.getContentPane().setLayout(AcoesLayout);
        AcoesLayout.setHorizontalGroup(
            AcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Acao3, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(Acao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(AcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Acao2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Acao4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        AcoesLayout.setVerticalGroup(
            AcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcoesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(AcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Acao1)
                    .addComponent(Acao2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(AcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Acao3)
                    .addComponent(Acao4))
                .addGap(24, 24, 24))
        );

        Atacar5.setText("Lutar");
        Atacar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atacar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imagemInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nomeInimigo)
                                    .addComponent(vidaInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(energiaInimigo)
                                    .addComponent(classeInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Atacar5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Atacar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Turno, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nomeJogador)
                                        .addComponent(jogadorVida, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jogadorEnergia)
                                        .addComponent(classeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Atacar2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Atacar4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Acoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagemInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classeInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(energiaInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vidaInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(classeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jogadorEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jogadorVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Turno, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Atacar2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Atacar5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Atacar4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Atacar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Acoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jogadorEnergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogadorEnergiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jogadorEnergiaActionPerformed

    private void Atacar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atacar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Atacar1ActionPerformed

    private void Atacar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atacar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Atacar2ActionPerformed

    private void Atacar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atacar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Atacar4ActionPerformed

    private void jogadorVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogadorVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jogadorVidaActionPerformed

    private void vidaInimigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vidaInimigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vidaInimigoActionPerformed

    private void energiaInimigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_energiaInimigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_energiaInimigoActionPerformed

    private void nomeJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeJogadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeJogadorActionPerformed

    private void TurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TurnoActionPerformed

    private void Atacar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atacar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Atacar5ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acao1;
    private javax.swing.JButton Acao2;
    private javax.swing.JButton Acao3;
    private javax.swing.JButton Acao4;
    private javax.swing.JInternalFrame Acoes;
    private javax.swing.JButton Atacar1;
    private javax.swing.JButton Atacar2;
    private javax.swing.JButton Atacar4;
    private javax.swing.JButton Atacar5;
    private javax.swing.JTextArea ComboBatalha;
    private javax.swing.JTextField Turno;
    private javax.swing.JTextField classeInimigo;
    private javax.swing.JTextField classeJogador;
    private javax.swing.JTextField energiaInimigo;
    private javax.swing.JLabel imagemInimigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jogadorEnergia;
    private javax.swing.JTextField jogadorVida;
    private javax.swing.JTextField nomeInimigo;
    private javax.swing.JTextField nomeJogador;
    private javax.swing.JTextField vidaInimigo;
    // End of variables declaration//GEN-END:variables
}
