package trabalho_jogo;

public class JogoVelha extends javax.swing.JFrame {
    
   public boolean jog1=true;
   public boolean jog2=true;
   public int contpos=0;
   public int k=0, i=0;
   int op;
   
   public String linha1, linha2, linha3, coluna1, coluna2, coluna3, diagonal1, diagonal2;
   String [][] posvetor=new String [3][3];
   
   

    public JogoVelha() {
        initComponents();
    }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnJogarNovamente = new javax.swing.JButton();
        txtVisor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnJogarNovamente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnJogarNovamente.setText("JOGAR NOVAMENTE");
        btnJogarNovamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarNovamenteActionPerformed(evt);
            }
        });

        txtVisor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtVisor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnJogarNovamente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(txtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnJogarNovamente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void verificarPrimeiroJogador() {
        if(jog1&&jog2) {
        this.op=1;
        jog1=false;
        jog2=true;
        txtVisor.setText("Vez do jogador O");
       } else if(jog1&&jog2==false) {
        
        this.op=1;
        jog1=false;
        jog2=true;
        txtVisor.setText("Vez do jogador O");
      
    }else{
        this.op=2;
        jog1=true;
        jog2=false;
        txtVisor.setText("Vez do jogador X");
     }
    } 
    public void LimparPosicoes()  {
       for(i=0; i<3; i++) {
       for(k=0; k<3; k++) {
       posvetor[i][k]= "";
     } 
    }
   }
   public void DesativaBotoes(){
    
    btn1.setEnabled(false);
    btn2.setEnabled(false);
    btn3.setEnabled(false);
    btn4.setEnabled(false);
    btn5.setEnabled(false);
    btn6.setEnabled(false);
    btn7.setEnabled(false);
    btn8.setEnabled(false);
    btn9.setEnabled(false);
   
   }
   public void VerificaPos(){
      contpos=0; 
      for(i=0; i<3; i++) {
      for(k=0; k<3; k++) {
      if(posvetor[i][k]=="X" | posvetor[i][k]=="O" ){
      contpos+=1;
      
      
      }}
  }
 }  
   public void VerificaVencedor(){
   
  linha1=posvetor[0][0]+posvetor[0][1]+posvetor[0][2];
  linha2=posvetor[1][0]+posvetor[1][1]+posvetor[1][2];
  linha3=posvetor[2][0]+posvetor[2][1]+posvetor[2][2];
  
  
  coluna1=posvetor[0][0]+posvetor[1][0]+posvetor[2][0];
  coluna2=posvetor[0][1]+posvetor[1][1]+posvetor[2][1];
  coluna3=posvetor[0][2]+posvetor[1][2]+posvetor[2][2];
  
  
  diagonal1=posvetor[0][0]+posvetor[1][1]+posvetor[2][2];
  diagonal2=posvetor[0][2]+posvetor[1][1]+posvetor[2][0];
  
  if(linha1.equals("XXX")|linha2.equals("XXX")|linha3.equals("XXX")|coluna1.equals("XXX")|coluna2.equals("XXX")|coluna3.equals("XXX" )|diagonal1.equals("XXX")|diagonal2.equals("XXX")){
  txtVisor.setText("O vencedor foi o X!!!");
  DesativaBotoes();
  
  } else if (linha1.equals("OOO")|linha2.equals("OOO")|linha3.equals("OOO")|coluna1.equals("OOO")|coluna2.equals("OOO")|coluna3.equals("OOO" )|diagonal1.equals("OOO")|diagonal2.equals("OOO")){
  txtVisor.setText("O vencedor foi o O!!!"); 
  DesativaBotoes();
  
  } else if(contpos==9){
      txtVisor.setText(" NÃO HOUVE VENCEDOR!!!");
  }
 
 }
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
          verificarPrimeiroJogador();
          if(op==1){
          btn1.setText("X");
          posvetor[0][0]= "X";
          
          }else {
          btn1.setText("O");
          posvetor[0][0]= "O";
          }
          btn1.setEnabled(false);
          VerificaPos();
          VerificaVencedor();
          
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       verificarPrimeiroJogador();
          if(op==1){
          btn2.setText("X");
          posvetor[0][1]= "X";
          
          }else {
          btn2.setText("O");
          posvetor[0][1]= "O";
          }
          btn2.setEnabled(false);
          VerificaPos();
          VerificaVencedor();
         
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
         verificarPrimeiroJogador();
          if(op==1){
          btn3.setText("X");
          posvetor[0][2]= "X";
          
          }else {
          btn3.setText("O");
          posvetor[0][2]= "O";
          }
          btn3.setEnabled(false);
          VerificaPos();
         VerificaVencedor();
         
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
         verificarPrimeiroJogador();
          if(op==1){
          btn4.setText("X");
          posvetor[1][0]= "X";
          
          }else {
          btn4.setText("O");
          posvetor[1][0]= "O";
          }
          btn4.setEnabled(false);
          VerificaPos();
        VerificaVencedor();
       
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
          verificarPrimeiroJogador();
          if(op==1){
          btn5.setText("X");
          posvetor[1][1]= "X";
          
          }else {
          btn5.setText("O");
          posvetor[1][1]= "O";
          }
          btn5.setEnabled(false);
          VerificaPos();
          VerificaVencedor();
          
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
         verificarPrimeiroJogador();
          if(op==1){
          btn6.setText("X");
          posvetor[1][2]= "X";
          
          }else {
          btn6.setText("O");
          posvetor[1][2]= "O";
          }
          btn6.setEnabled(false);
          VerificaPos();
         VerificaVencedor();
         
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
          verificarPrimeiroJogador();
          if(op==1){
          btn7.setText("X");
          posvetor[2][0]= "X";
          
          }else {
          btn7.setText("O");
          posvetor[2][0]= "O";
          }
          btn7.setEnabled(false);
          VerificaPos();
         VerificaVencedor();
         
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
         verificarPrimeiroJogador();
          if(op==1){
          btn8.setText("X");
          posvetor[2][1]= "X";
          
          }else {
          btn8.setText("O");
          posvetor[2][1]= "O";
          }
          btn8.setEnabled(false);
          VerificaPos();
         VerificaVencedor();
         
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        verificarPrimeiroJogador();
          if(op==1){
          btn9.setText("X");
          posvetor[2][2]= "X";
          
          }else {
          btn9.setText("O");
          posvetor[2][2]= "O";
          }
          btn9.setEnabled(false);
          VerificaPos();
          VerificaVencedor();
          
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnJogarNovamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarNovamenteActionPerformed
          
        btn1.setText(" ");
        btn1.setEnabled(true);
        btn2.setText(" ");
        btn2.setEnabled(true);
        btn3.setText(" ");
        btn3.setEnabled(true);
        btn4.setText(" ");
        btn4.setEnabled(true);
        btn5.setText(" ");
        btn5.setEnabled(true);
        btn6.setText(" ");
        btn6.setEnabled(true);
        btn7.setText(" ");
        btn7.setEnabled(true);
        btn8.setText(" ");
        btn8.setEnabled(true);
        btn9.setText(" ");
        btn9.setEnabled(true);
        jog1=true;
        jog2=true;
        LimparPosicoes();
        txtVisor.setText("");
        
    }//GEN-LAST:event_btnJogarNovamenteActionPerformed

    
    public static void main(String args[]) {
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
       

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnJogarNovamente;
    private javax.swing.JTextField txtVisor;
    // End of variables declaration//GEN-END:variables
}
