/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author ASUS
 */
public class Pembayaran extends javax.swing.JFrame {

    /**
     * Creates new form Pembayaran
     */
    public Pembayaran() {
        initComponents();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Bar1 = new javax.swing.JTextField();
        Bar2 = new javax.swing.JTextField();
        Bar3 = new javax.swing.JTextField();
        Bar4 = new javax.swing.JTextField();
        Diskon = new javax.swing.JTextField();
        Proses = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        Hapus = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Pembayaran");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(181, 11, 90, 14);

        jLabel2.setText("Barang 1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 39, 60, 14);

        jLabel3.setText("Barang 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 70, 70, 14);

        jLabel4.setText("Barang 3");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 101, 60, 14);

        jLabel5.setText("Barang 4");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 132, 70, 14);

        jLabel6.setText("Diskon");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 163, 55, 14);
        getContentPane().add(Bar1);
        Bar1.setBounds(113, 36, 252, 30);
        getContentPane().add(Bar2);
        Bar2.setBounds(113, 67, 252, 30);
        getContentPane().add(Bar3);
        Bar3.setBounds(113, 98, 252, 30);
        getContentPane().add(Bar4);
        Bar4.setBounds(113, 129, 252, 30);
        getContentPane().add(Diskon);
        Diskon.setBounds(113, 160, 252, 30);

        Proses.setText("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });
        getContentPane().add(Proses);
        Proses.setBounds(40, 198, 80, 23);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 232, 325, 96);

        Hapus.setText("Hapus ");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus);
        Hapus.setBounds(154, 198, 90, 23);

        Keluar.setBackground(new java.awt.Color(255, 204, 204));
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar);
        Keluar.setBounds(275, 198, 90, 23);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 350);

        setSize(new java.awt.Dimension(416, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
      double bar1 = Integer.parseInt(Bar1.getText());
      double bar2 = Integer.parseInt(Bar2.getText());
      double bar3 = Integer.parseInt(Bar3.getText());
      double bar4 = Integer.parseInt(Bar4.getText());
      double diskon = Integer.parseInt(Diskon.getText());
      double hasil;
      double hasil2;
      double hasil3;
      
      hasil = ((bar1+bar2+bar3+bar4)*diskon/100);
      hasil2 = bar1+bar2+bar3+bar4;
      hasil3 = hasil2-hasil;
      
      TA.setText("Barang 1 : "+bar1+"\nBarang 2 : "+bar2+"\nBarang 3 : "+bar3+""
              + "\nBarang 4 : "+bar4+"\nDiskon : "+diskon+
              "\nTotal Harga : "+hasil2+"\nTotal Pembayaran : "+hasil3);
    }//GEN-LAST:event_ProsesActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
     TA.setText(" ");
     Bar1.setText(" ");
     Bar2.setText(" ");
     Bar3.setText(" ");
     Bar4.setText(" ");
     Diskon.setText(" ");
    }//GEN-LAST:event_HapusActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
    dispose();
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bar1;
    private javax.swing.JTextField Bar2;
    private javax.swing.JTextField Bar3;
    private javax.swing.JTextField Bar4;
    private javax.swing.JTextField Diskon;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton Proses;
    private javax.swing.JTextArea TA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}