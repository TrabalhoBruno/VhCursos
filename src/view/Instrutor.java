/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.InstrutorDao;
import model.Instrutorr;
/**
 *
 * @author 201811640024
 */
public class Instrutor extends javax.swing.JFrame {

    /**
     * Creates new form Instrutor
     */
    public Instrutor() {
        initComponents();
        setSize(914, 644);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        iCPF = new javax.swing.JTextField();
        iRG = new javax.swing.JTextField();
        iTelef = new javax.swing.JTextField();
        iData = new javax.swing.JTextField();
        iDataA = new javax.swing.JTextField();
        btnCadasInstrutor = new javax.swing.JButton();
        iNomei = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        iEnd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 150, 70, 30);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setText("Data de admissão:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 410, 160, 20);

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel3.setText("CPF: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 200, 50, 20);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setText("Data de Nascimento:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 350, 150, 30);

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel6.setText("RG:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 250, 40, 20);

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 300, 70, 20);

        iCPF.setText("Digite com pontos(.) e traços(-)");
        getContentPane().add(iCPF);
        iCPF.setBounds(190, 200, 190, 30);

        iRG.setText("Digite com pontos(.) e traços(-)");
        getContentPane().add(iRG);
        iRG.setBounds(190, 250, 190, 30);

        iTelef.setText("Digite o ddd entre parenteses (**) e digite o número com o traço (-)");
        getContentPane().add(iTelef);
        iTelef.setBounds(200, 300, 420, 30);

        iData.setText("Digite usando barras (**/**/****)");
        iData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iDataActionPerformed(evt);
            }
        });
        getContentPane().add(iData);
        iData.setBounds(280, 350, 200, 30);

        iDataA.setText("Digite usando barras (**/**/****)");
        getContentPane().add(iDataA);
        iDataA.setBounds(280, 410, 210, 30);

        btnCadasInstrutor.setBackground(new java.awt.Color(255, 198, 89));
        btnCadasInstrutor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnCadasInstrutor.setText("Cadastrar");
        btnCadasInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadasInstrutorActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadasInstrutor);
        btnCadasInstrutor.setBounds(710, 520, 130, 40);

        iNomei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iNomeiActionPerformed(evt);
            }
        });
        getContentPane().add(iNomei);
        iNomei.setBounds(190, 150, 430, 30);

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel10.setText("Endereço:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(130, 460, 80, 30);
        getContentPane().add(iEnd);
        iEnd.setBounds(210, 460, 420, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 898, 605);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iDataActionPerformed

    private void iNomeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iNomeiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iNomeiActionPerformed

    private void btnCadasInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadasInstrutorActionPerformed
        Instrutorr i = new Instrutorr();
        i.setNome(iNomei.getText());
        i.setCpf(iCPF.getText());
        i.setRg(iRG.getText());
        i.setNome(iNomei.getText());
        i.setTelefone(iTelef.getText());
        i.setDataNascimento(iData.getText());
        i.setDataAdmissao(iDataA.getText());
        i.setEndereco(iEnd.getText());
        InstrutorDao dao = new InstrutorDao();
        dao.cadastrar(i);
    }//GEN-LAST:event_btnCadasInstrutorActionPerformed

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
            java.util.logging.Logger.getLogger(Instrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instrutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadasInstrutor;
    private javax.swing.JTextField iCPF;
    private javax.swing.JTextField iData;
    private javax.swing.JTextField iDataA;
    private javax.swing.JTextField iEnd;
    private javax.swing.JTextField iNomei;
    private javax.swing.JTextField iRG;
    private javax.swing.JTextField iTelef;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
