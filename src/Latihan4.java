/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK TELKOM
 */
public class Latihan4 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan4
     */
    public Latihan4() {
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

        buttonGroup9 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rpl = new javax.swing.JRadioButton();
        tkj = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        Ok = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Biodata Siswa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 120, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 50, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Absen");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, -1));
        getContentPane().add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 180, 30));
        getContentPane().add(Absen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 180, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Jurusan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, -1));

        buttonGroup9.add(rpl);
        rpl.setText("RPL");
        getContentPane().add(rpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 70, -1));

        buttonGroup9.add(tkj);
        tkj.setText("TKJ");
        getContentPane().add(tkj, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 110, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Hobi");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 50, -1));

        cb1.setText("Programing");
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 100, -1));

        cb2.setText("Animator");
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 100, -1));

        cb3.setText("Teknisi");
        getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 90, -1));

        cb4.setText("Designer");
        getContentPane().add(cb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 90, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Hasil");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 20));

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 256, 310, 110));

        Ok.setText("Submit");
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });
        getContentPane().add(Ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 70, -1));

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 70, -1));

        jPanel1.setBackground(new java.awt.Color(255, 102, 204));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 480, 400));

        setBounds(0, 0, 416, 413);
    }// </editor-fold>//GEN-END:initComponents

    private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        String absen = Absen.getText();
        String jurusan ;
        String hobi ="";
        //untuk rd
        if (rpl.isSelected())
            jurusan = "RPL";
        else if (tkj.isSelected())
            jurusan = "TKJ";    
        else 
            jurusan = " ";
        
        // untuk check box
        if (cb1.isSelected())
            hobi+=cb1.getText()+", ";
        if (cb2.isSelected())
            hobi+=cb2.getText()+", ";
        if (cb3.isSelected())
            hobi+=cb3.getText()+", ";
        if (cb4.isSelected())
            hobi+=cb4.getText()+", ";
        TA.setText("Nama siswa: "+nama+"\nAbsen siswa: "+absen+
                "\nJurusan anda: "+jurusan+"\nHobi anda: "+hobi);
    }//GEN-LAST:event_OkActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        TA.setText(" ");
        Nama.setText(" ");
        Absen.setText(" ");
        buttonGroup9.clearSelection();
        cb1.setSelected(false);
        cb2.setSelected(false);
        cb3.setSelected(false);
        cb4.setSelected(false);
    }//GEN-LAST:event_HapusActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton Ok;
    private javax.swing.JTextArea TA;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rpl;
    private javax.swing.JRadioButton tkj;
    // End of variables declaration//GEN-END:variables
}
