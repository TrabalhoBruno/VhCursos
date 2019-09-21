/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.InstrutorDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Instrutorr;

/**
 *
 * @author 201811640024
 */
public class PesInstrutor extends javax.swing.JFrame {
private List<Instrutorr> listaB = new ArrayList<>();
    /**
     * Creates new form PesInstrutor
     */
    public PesInstrutor() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        campoPES = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaHein = new javax.swing.JTable();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 198, 89));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(640, 100, 90, 25);

        jButton2.setBackground(new java.awt.Color(255, 198, 89));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButton2.setText("Excluir");
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 570, 90, 29);

        jButton3.setBackground(new java.awt.Color(255, 198, 89));
        jButton3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButton3.setText("Volta ao início ");
        getContentPane().add(jButton3);
        jButton3.setBounds(750, 570, 135, 29);
        getContentPane().add(campoPES);
        campoPES.setBounds(260, 100, 360, 30);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 110, 50, 20);

        tabelaHein.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "RG", "Data de Nacimento", "Data de Admissao", "Endereço", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaHein);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 150, 880, 402);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/7.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(-2, 0, 900, 605);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         InstrutorDao dao = new InstrutorDao();
        listaB = dao.pesquisaCurso(campoPES.getText());
        DefaultTableModel model = (DefaultTableModel) tabelaHein.getModel();

        model.setNumRows(0);
        for (Instrutorr i : listaB) {
            model.addRow(new Object[]{i.getNome(), i.getCpf(), i.getRg(), i.getDataNascimento(), i.getDataAdmissao(),
            i.getEndereco(), i.getTelefone()});
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         
        //criar o DAO para cessar ao BD
        InstrutorDao dao = new InstrutorDao();
        //chama metodo de recuperação e armazena o retorno
        listaB.clear();
        listaB = dao.recuperaIns();
        //mostra na tabela, recuperar o medel da tabela
        DefaultTableModel model = (DefaultTableModel) tabelaHein.getModel();
        //percorrer a lista de retorno
        for (Instrutorr i : listaB) {
            //usar o model para add uma linha na tabela
            model.addRow(new Object[]{i.getNome(), i.getCpf(), i.getRg(), i.getDataNascimento(), i.getDataAdmissao(),
            i.getEndereco(), i.getTelefone()});
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(PesInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesInstrutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JTextField campoPES;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaHein;
    // End of variables declaration//GEN-END:variables
}