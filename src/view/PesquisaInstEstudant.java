/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author 201811640024
 */
public class PesquisaInstEstudant extends javax.swing.JFrame {

    /**
     * Creates new form PesquisaInstEstudant
     */
    public PesquisaInstEstudant() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 400, 420);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(480, 120, 410, 420);

        jButton1.setBackground(new java.awt.Color(255, 198, 89));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jButton1.setText("Ver lista completa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(670, 560, 220, 30);

        jButton3.setBackground(new java.awt.Color(255, 198, 89));
        jButton3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jButton3.setText("Excluir");
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 560, 90, 30);

        jButton4.setBackground(new java.awt.Color(255, 198, 89));
        jButton4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jButton4.setText("Excluir");
        getContentPane().add(jButton4);
        jButton4.setBounds(480, 560, 90, 30);

        jButton5.setBackground(new java.awt.Color(255, 198, 89));
        jButton5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jButton5.setText("Ver lista completa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(190, 560, 220, 30);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 11)); // NOI18N
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(500, 80, 40, 15);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(550, 70, 230, 30);

        jButton6.setBackground(new java.awt.Color(255, 198, 89));
        jButton6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton6.setText("Pesquisar");
        jButton6.setBorderPainted(false);
        getContentPane().add(jButton6);
        jButton6.setBounds(790, 70, 90, 25);

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 11)); // NOI18N
        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 40, 15);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(70, 70, 230, 30);

        jButton8.setBackground(new java.awt.Color(255, 198, 89));
        jButton8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton8.setText("Pesquisar");
        jButton8.setBorderPainted(false);
        getContentPane().add(jButton8);
        jButton8.setBounds(310, 70, 90, 23);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Istrutor-estudan.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 898, 605);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         PesInstrutor in = new PesInstrutor();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       PesEstudante in = new PesEstudante();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PesquisaInstEstudant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaInstEstudant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaInstEstudant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaInstEstudant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaInstEstudant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
