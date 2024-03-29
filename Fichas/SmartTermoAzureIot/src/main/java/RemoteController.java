/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.microsoft.azure.sdk.iot.service.devicetwin.DeviceMethod;
import com.microsoft.azure.sdk.iot.service.devicetwin.MethodResult;
import com.microsoft.azure.sdk.iot.service.exceptions.IotHubException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.swing.JTextField;

/**
 *
 * @author Turma A
 */
public class RemoteController extends javax.swing.JFrame {

    /**
     * Creates new form RemoteController
     */
    public RemoteController() {
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
        jTextFieldTelInterval = new javax.swing.JTextField();
        jButtonSetInterval = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Telemetry Interval");

        jTextFieldTelInterval.setText("jTextField1");

        jButtonSetInterval.setText("SET");
        jButtonSetInterval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetIntervalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTelInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButtonSetInterval)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldTelInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jButtonSetInterval)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSetIntervalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetIntervalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSetIntervalActionPerformed

    public static final String iotHubConnectionString = "HostName=ad-smart-termo.azure-devices.net;DeviceId=MyJavaDevice;SharedAccessKey=CDCPdgjFbgdQkl1aOHYB4kXi7sWI1BN2zbYbLZrejI8=";

  // Device to call direct method on.
  public static final String deviceId = "MyJavaDevice";

  // Name of direct method and payload.
  public static final String methodName = "SetTelemetryInterval";
  public static final int payload = 10; // Number of seconds for telemetry interval.

  public static final Long responseTimeout = TimeUnit.SECONDS.toSeconds(30);
  public static final Long connectTimeout = TimeUnit.SECONDS.toSeconds(5);
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
            java.util.logging.Logger.getLogger(RemoteController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoteController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoteController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoteController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoteController().setVisible(true);
            }
        });
        try {
      System.out.println("Calling direct method...");

      // Create a DeviceMethod instance to call a direct method.
      DeviceMethod methodClient = DeviceMethod.createFromConnectionString(iotHubConnectionString);

      int playload = Integer.parseInt(JTextFieldInterval.getText())
      // Call the direct method.
      MethodResult result = methodClient.invoke(deviceId, methodName, responseTimeout, connectTimeout, payload);

      if (result == null) {
        throw new IOException("Direct method invoke returns null");
      }

      // Show the acknowledgement from the device.
      System.out.println("Status: " + result.getStatus());
      System.out.println("Response: " + result.getPayload());
    } catch (IotHubException e) {
      System.out.println("IotHubException calling direct method:");
      System.out.println(e.getMessage());
    } catch (IOException e) {
      System.out.println("IOException calling direct method:");
      System.out.println(e.getMessage());
    }
        System.out.println("Done!");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSetInterval;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldTelInterval;
    // End of variables declaration//GEN-END:variables
}
