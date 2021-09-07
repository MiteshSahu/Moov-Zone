public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MooV_Zone = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Now = new javax.swing.JLabel();
        Up = new javax.swing.JLabel();
        img1 = new javax.swing.JButton();
        des1 = new javax.swing.JButton();
        img2 = new javax.swing.JButton();
        des2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        img3 = new javax.swing.JButton();
        des3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setMaximumSize(new java.awt.Dimension(1300, 800));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setPreferredSize(new java.awt.Dimension(1300, 800));
        setResizable(false);

        MooV_Zone.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        MooV_Zone.setText("MooV_Zone");
        MooV_Zone.setMaximumSize(new java.awt.Dimension(200, 40));
        MooV_Zone.setMinimumSize(new java.awt.Dimension(200, 40));
        MooV_Zone.setPreferredSize(new java.awt.Dimension(200, 40));

        Now.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Now.setText("Now Showing :");

        Up.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Up.setText("UpComing Show :");

        img1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        img1.setText("Image 1");
        img1.setMaximumSize(new java.awt.Dimension(400, 450));
        img1.setMinimumSize(new java.awt.Dimension(400, 450));
        img1.setPreferredSize(new java.awt.Dimension(400, 450));
        img1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img1ActionPerformed(evt);
            }
        });

        des1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        des1.setText("Description 1");
        des1.setMaximumSize(new java.awt.Dimension(400, 128));
        des1.setMinimumSize(new java.awt.Dimension(400, 128));
        des1.setPreferredSize(new java.awt.Dimension(400, 128));
        des1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                des1ActionPerformed(evt);
            }
        });

        img2.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        img2.setText("Image 2");
        img2.setMaximumSize(new java.awt.Dimension(400, 450));
        img2.setMinimumSize(new java.awt.Dimension(400, 450));
        img2.setPreferredSize(new java.awt.Dimension(400, 450));
        img2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img2ActionPerformed(evt);
            }
        });

        des2.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        des2.setText("Description 2");
        des2.setMaximumSize(new java.awt.Dimension(400, 128));
        des2.setMinimumSize(new java.awt.Dimension(400, 128));
        des2.setPreferredSize(new java.awt.Dimension(400, 128));
        des2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                des2ActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        img3.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        img3.setText("Image 3");
        img3.setMaximumSize(new java.awt.Dimension(400, 450));
        img3.setMinimumSize(new java.awt.Dimension(400, 450));
        img3.setPreferredSize(new java.awt.Dimension(400, 450));

        des3.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        des3.setText("Description 3");
        des3.setMaximumSize(new java.awt.Dimension(400, 128));
        des3.setMinimumSize(new java.awt.Dimension(400, 128));
        des3.setPreferredSize(new java.awt.Dimension(400, 128));

        Logout.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Logout.setText("Logout");
        Logout.setMaximumSize(new java.awt.Dimension(200, 30));
        Logout.setMinimumSize(new java.awt.Dimension(200, 30));
        Logout.setPreferredSize(new java.awt.Dimension(200, 30));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Now)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(des1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(des2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Up)
                            .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(des3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(550, 550, 550)
                        .addComponent(MooV_Zone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(MooV_Zone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Now)
                            .addComponent(Up))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(des2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(des3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(des1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addComponent(jSeparator3))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void img1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img1ActionPerformed
        setVisible(false);
        new Slot().setVisible(true);
    }//GEN-LAST:event_img1ActionPerformed

    private void img2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img2ActionPerformed
        setVisible(false);
        new Slot().setVisible(true);
    }//GEN-LAST:event_img2ActionPerformed

    private void des1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_des1ActionPerformed
        setVisible(false);
        new Slot().setVisible(true);
    }//GEN-LAST:event_des1ActionPerformed

    private void des2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_des2ActionPerformed
        setVisible(false);
        new Slot().setVisible(true);
    }//GEN-LAST:event_des2ActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JLabel MooV_Zone;
    private javax.swing.JLabel Now;
    private javax.swing.JLabel Up;
    private javax.swing.JButton des1;
    private javax.swing.JButton des2;
    private javax.swing.JButton des3;
    private javax.swing.JButton img1;
    private javax.swing.JButton img2;
    private javax.swing.JButton img3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}