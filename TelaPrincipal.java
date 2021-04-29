package trabalho_final;

import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLabel_Titulo = new javax.swing.JLabel();
        JLabel_Mascote = new javax.swing.JLabel();
        JLabel_Codigo = new javax.swing.JLabel();
        JLabel_Nome = new javax.swing.JLabel();
        JLabel_Apelido = new javax.swing.JLabel();
        JLabel_Localizacao = new javax.swing.JLabel();
        JLabel_AnodeFundacao = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();
        txt_Localizacao = new javax.swing.JTextField();
        txt_Nome = new javax.swing.JTextField();
        txt_Apelido = new javax.swing.JTextField();
        txt_Mascote = new javax.swing.JTextField();
        txt_AnodeFundacao = new javax.swing.JTextField();
        botao_Consultar = new javax.swing.JButton();
        botao_Cadastrar = new javax.swing.JButton();
        botao_Alterar = new javax.swing.JButton();
        botao_Excluir = new javax.swing.JButton();
        botao_Sair = new javax.swing.JButton();
        botao_Limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        JLabel_Titulo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        JLabel_Titulo.setText("         TIMES DE FUTEBOL");

        JLabel_Mascote.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLabel_Mascote.setText("Mascote");
        JLabel_Mascote.setToolTipText("");

        JLabel_Codigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLabel_Codigo.setText("Código do time");
        JLabel_Codigo.setToolTipText("");

        JLabel_Nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLabel_Nome.setText("Nome");
        JLabel_Nome.setToolTipText("");

        JLabel_Apelido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLabel_Apelido.setText("Apelido");
        JLabel_Apelido.setToolTipText("");

        JLabel_Localizacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLabel_Localizacao.setText("Localização");
        JLabel_Localizacao.setToolTipText("");

        JLabel_AnodeFundacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLabel_AnodeFundacao.setText("Ano de fundação");
        JLabel_AnodeFundacao.setToolTipText("");

        txt_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CodigoActionPerformed(evt);
            }
        });

        txt_Localizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LocalizacaoActionPerformed(evt);
            }
        });

        txt_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomeActionPerformed(evt);
            }
        });

        txt_Apelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApelidoActionPerformed(evt);
            }
        });

        txt_Mascote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MascoteActionPerformed(evt);
            }
        });

        txt_AnodeFundacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AnodeFundacaoActionPerformed(evt);
            }
        });

        botao_Consultar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botao_Consultar.setText("CONSULTAR");
        botao_Consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_ConsultarMouseClicked(evt);
            }
        });
        botao_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_ConsultarActionPerformed(evt);
            }
        });

        botao_Cadastrar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botao_Cadastrar.setText("CADASTRAR");
        botao_Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_CadastrarMouseClicked(evt);
            }
        });

        botao_Alterar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botao_Alterar.setText("ALTERAR");
        botao_Alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_AlterarMouseClicked(evt);
            }
        });
        botao_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_AlterarActionPerformed(evt);
            }
        });

        botao_Excluir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botao_Excluir.setText("EXCLUIR");
        botao_Excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_ExcluirMouseClicked(evt);
            }
        });

        botao_Sair.setBackground(new java.awt.Color(255, 51, 0));
        botao_Sair.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botao_Sair.setText("Sair");
        botao_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_SairMouseClicked(evt);
            }
        });
        botao_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_SairActionPerformed(evt);
            }
        });

        botao_Limpar.setBackground(new java.awt.Color(153, 204, 255));
        botao_Limpar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botao_Limpar.setText("Limpar campos");
        botao_Limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_LimparMouseClicked(evt);
            }
        });
        botao_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_LimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabel_AnodeFundacao)
                    .addComponent(JLabel_Codigo)
                    .addComponent(JLabel_Nome)
                    .addComponent(JLabel_Apelido)
                    .addComponent(JLabel_Mascote)
                    .addComponent(JLabel_Localizacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addComponent(txt_Mascote)
                        .addComponent(txt_AnodeFundacao)
                        .addComponent(txt_Apelido)
                        .addComponent(txt_Nome))
                    .addComponent(txt_Localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao_Consultar)
                    .addComponent(botao_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(190, 190, 190))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(JLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(botao_Cadastrar)
                        .addGap(36, 36, 36)
                        .addComponent(botao_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(JLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_Codigo)
                    .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_Nome)
                            .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(botao_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_Apelido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Apelido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_Mascote, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Mascote, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_AnodeFundacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_AnodeFundacao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_Localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(botao_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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

    private void txt_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CodigoActionPerformed

    private void txt_LocalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LocalizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LocalizacaoActionPerformed

    private void txt_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomeActionPerformed

    private void txt_ApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApelidoActionPerformed

    private void txt_MascoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MascoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MascoteActionPerformed

    private void txt_AnodeFundacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AnodeFundacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AnodeFundacaoActionPerformed

    private void botao_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_ConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_ConsultarActionPerformed

    private void botao_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_AlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_AlterarActionPerformed

    private void botao_CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_CadastrarMouseClicked
        Operacoes operacao = new Operacoes();
        Time timeGui;
        timeGui = new Time(Integer.parseInt(txt_Codigo.getText()), txt_Nome.getText(), 
                txt_Apelido.getText(), txt_Mascote.getText(), 
                Integer.parseInt(txt_AnodeFundacao.getText()), txt_Localizacao.getText());
        operacao.cadastrar(timeGui);
        
    }//GEN-LAST:event_botao_CadastrarMouseClicked

    private void botao_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_SairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_SairActionPerformed

    private void botao_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_LimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_LimparActionPerformed

    private void botao_LimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_LimparMouseClicked
        txt_Codigo.setText(null);
        txt_Nome.setText(null);
        txt_Apelido.setText(null);
        txt_Mascote.setText(null);
        txt_AnodeFundacao.setText(null);
        txt_Localizacao.setText(null);
    }//GEN-LAST:event_botao_LimparMouseClicked

    private void botao_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_SairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botao_SairMouseClicked

    private void botao_AlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_AlterarMouseClicked
        Operacoes operacao = new Operacoes();
        Time timeGui;
        timeGui = new Time(Integer.parseInt(txt_Codigo.getText()), txt_Nome.getText(), 
                txt_Apelido.getText(), txt_Mascote.getText(), 
                Integer.parseInt(txt_AnodeFundacao.getText()), txt_Localizacao.getText());
        operacao.alterar(timeGui);
    }//GEN-LAST:event_botao_AlterarMouseClicked

    private void botao_ConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_ConsultarMouseClicked
        //Leitura do id do time
        String cod = JOptionPane.showInputDialog("Insira o código do time:");
        //Transforma o numero que esta em String para um int
        int codigo = Integer.parseInt(cod);
        
        Operacoes operacao = new Operacoes();
        Time timeGui = operacao.consultar(codigo);
        
        txt_Codigo.setText(Integer.toString(timeGui.getId_time()));
        txt_Nome.setText(timeGui.getNome());
        txt_Apelido.setText(timeGui.getApelido());
        txt_Mascote.setText(timeGui.getMascote());
        txt_AnodeFundacao.setText(Integer.toString(timeGui.getAno_de_fundacao()));
        txt_Localizacao.setText(timeGui.getLocalizacao());
        
    }//GEN-LAST:event_botao_ConsultarMouseClicked

    private void botao_ExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_ExcluirMouseClicked
        Operacoes operacao = new Operacoes();
        String cod  = JOptionPane.showInputDialog("Insira o código do time:");
        int codigo = Integer.parseInt(cod);
        operacao.excluir(codigo);
    }//GEN-LAST:event_botao_ExcluirMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel_AnodeFundacao;
    private javax.swing.JLabel JLabel_Apelido;
    private javax.swing.JLabel JLabel_Codigo;
    private javax.swing.JLabel JLabel_Localizacao;
    private javax.swing.JLabel JLabel_Mascote;
    private javax.swing.JLabel JLabel_Nome;
    private javax.swing.JLabel JLabel_Titulo;
    private javax.swing.JButton botao_Alterar;
    private javax.swing.JButton botao_Cadastrar;
    private javax.swing.JButton botao_Consultar;
    private javax.swing.JButton botao_Excluir;
    private javax.swing.JButton botao_Limpar;
    private javax.swing.JButton botao_Sair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_AnodeFundacao;
    private javax.swing.JTextField txt_Apelido;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Localizacao;
    private javax.swing.JTextField txt_Mascote;
    private javax.swing.JTextField txt_Nome;
    // End of variables declaration//GEN-END:variables
}
