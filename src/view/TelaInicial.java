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
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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
        jEditorPane1 = new javax.swing.JEditorPane();
        btnCadasCurso = new javax.swing.JButton();
        btnCadasAluno = new javax.swing.JButton();
        btnVerCursos = new javax.swing.JButton();
        btnCadasInstru = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVerCursos1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnCadasCurso.setBackground(new java.awt.Color(255, 198, 89));
        btnCadasCurso.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        btnCadasCurso.setText("Cadastrar  um curso");
        btnCadasCurso.setBorderPainted(false);
        btnCadasCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadasCursoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadasCurso);
        btnCadasCurso.setBounds(450, 460, 180, 50);

        btnCadasAluno.setBackground(new java.awt.Color(255, 198, 89));
        btnCadasAluno.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        btnCadasAluno.setText("Cadastrar \num aluno");
        btnCadasAluno.setBorderPainted(false);
        btnCadasAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadasAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadasAluno);
        btnCadasAluno.setBounds(80, 460, 149, 50);

        btnVerCursos.setBackground(new java.awt.Color(255, 198, 89));
        btnVerCursos.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        btnVerCursos.setText("Ver lista de Instrutores/ Estudantes");
        btnVerCursos.setBorderPainted(false);
        btnVerCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCursosActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerCursos);
        btnVerCursos.setBounds(280, 530, 300, 50);

        btnCadasInstru.setBackground(new java.awt.Color(255, 198, 89));
        btnCadasInstru.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        btnCadasInstru.setText("Cadastrar  um instrutor");
        btnCadasInstru.setBorderPainted(false);
        btnCadasInstru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadasInstruActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadasInstru);
        btnCadasInstru.setBounds(250, 460, 180, 50);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(86, 1354, 0, 0);

        btnVerCursos1.setBackground(new java.awt.Color(255, 198, 89));
        btnVerCursos1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        btnVerCursos1.setText("Ver os cursos");
        btnVerCursos1.setBorderPainted(false);
        btnVerCursos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCursos1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerCursos1);
        btnVerCursos1.setBounds(640, 460, 180, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telaInicio.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 898, 605);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadasAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadasAlunoActionPerformed
        Estudantes in = new Estudantes();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadasAlunoActionPerformed

    private void btnCadasCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadasCursoActionPerformed
        Cursos in = new Cursos();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadasCursoActionPerformed

    private void btnVerCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCursosActionPerformed
       PesquisaInstEstudant in = new PesquisaInstEstudant();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerCursosActionPerformed

    private void btnCadasInstruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadasInstruActionPerformed
     Instrutor in = new Instrutor();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadasInstruActionPerformed

    private void btnVerCursos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCursos1ActionPerformed
        Cursosdeseja in = new Cursosdeseja();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerCursos1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadasAluno;
    private javax.swing.JButton btnCadasCurso;
    private javax.swing.JButton btnCadasInstru;
    private javax.swing.JButton btnVerCursos;
    private javax.swing.JButton btnVerCursos1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
