
package TogetherWeCan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class loginfundraiser extends javax.swing.JFrame {
    
    public loginfundraiser() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txusername3 = new javax.swing.JTextField();
        btnlogin2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnregister = new javax.swing.JButton();
        txpassword3 = new javax.swing.JPasswordField();
        btnregister4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255), 2));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setInheritsPopupMenu(true);
        jPanel4.setPreferredSize(new java.awt.Dimension(444, 531));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/rsz_msg936016891-20149_1.jpg"))); // NOI18N

        txusername3.setText("Username");
        txusername3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txusername3ActionPerformed(evt);
            }
        });

        btnlogin2.setBackground(new java.awt.Color(0, 102, 102));
        btnlogin2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnlogin2.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin2.setText("LOGIN");
        btnlogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Belum memiliki akun?");

        btnregister.setBackground(new java.awt.Color(0, 204, 255));
        btnregister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnregister.setForeground(new java.awt.Color(255, 255, 255));
        btnregister.setText("BUAT AKUN BARU");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });

        txpassword3.setText("passwird");
        txpassword3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txpassword3ActionPerformed(evt);
            }
        });

        btnregister4.setBackground(new java.awt.Color(102, 102, 102));
        btnregister4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnregister4.setForeground(new java.awt.Color(255, 255, 255));
        btnregister4.setText("CANCEL");
        btnregister4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregister4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(131, 131, 131))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 67, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnregister4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txpassword3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txusername3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txusername3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txpassword3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnregister4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(588, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(443, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txusername3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txusername3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txusername3ActionPerformed

    private void btnlogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin2ActionPerformed
        try{
            Connection c = koneksi.getkoneksi();
            Statement s = c.createStatement();

            String sql = "SELECT * FROM fundraiser WHERE Username='" + txusername3.getText()
            +"' and Password='"+ txpassword3.getText() + "'";
            ResultSet r = s.executeQuery(sql);

            if (r.next()){
                this.dispose();
                menuutamafundraiser a = new menuutamafundraiser();
                a.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Wrong Username or Password");
                txpassword3.requestFocus();
            }
        }catch(SQLException e){
            System.out.println("error");
        }
    }//GEN-LAST:event_btnlogin2ActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        this.dispose();
        registerfundraiser a = new registerfundraiser();
        a.setVisible(true);
    }//GEN-LAST:event_btnregisterActionPerformed

    private void txpassword3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txpassword3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txpassword3ActionPerformed

    private void btnregister4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregister4ActionPerformed
        this.dispose();
        halamandepan a = new halamandepan();
        a.setVisible(true);
    }//GEN-LAST:event_btnregister4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin2;
    private javax.swing.JButton btnregister;
    private javax.swing.JButton btnregister4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField txpassword3;
    private javax.swing.JTextField txusername3;
    // End of variables declaration//GEN-END:variables
}
