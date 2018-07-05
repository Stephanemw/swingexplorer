/*
 * PnlNoAgentModeMessage.java
 *
 * Created on March 9, 2008, 3:25 PM
 */

package org.swingexplorer;

import java.awt.Component;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import javax.swing.JOptionPane;

/**
 *
 * @author  Maxim Zakharenkov
 */
public class PnlNoAgentModeMessage extends javax.swing.JPanel {
    
    /** Creates new form PnlNoAgentModeMessage */
    public PnlNoAgentModeMessage() {
        initComponents();
        lblMessage.setText("<html> This functionality is available only when application<br>" +
        						   "is executed with instrumentation agent!<br> " +
        						   "You should run your program using the following command line:<br> </html>");
        txaCommand.setText("java -javaagent:swag.jar\n" +
        				   "    -Xbootclasspath/p:swag.jar\n" +
        				   "    -classpath <your_class_path>;swexpl.jar\n" +
        				   "    org.swingexplorer.Launcher <Your_main_class>");
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMessage = new javax.swing.JLabel();
        txaCommand = new javax.swing.JTextArea();
        btnCopy = new javax.swing.JButton();

        lblMessage.setText("<htmL> Event dispatch thread violation monitoring is available only in \"Agent\" mode.<br> You should run your program using the following command line:<br> </html>");

        txaCommand.setBackground(javax.swing.UIManager.getDefaults().getColor("Panel.background"));
        txaCommand.setColumns(103);
        txaCommand.setEditable(false);
        txaCommand.setRows(4);
        txaCommand.setWrapStyleWord(true);

        btnCopy.setText("Copy to clipboard");
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(txaCommand, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 331, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(btnCopy))
            .add(lblMessage)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(lblMessage)
                .add(13, 13, 13)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(txaCommand, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnCopy)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        
        String txt = txaCommand.getText();
        txt = txt.replace("\n", "");
        StringSelection seleciton = new StringSelection(txt);
        clip.setContents(seleciton, seleciton);
    }//GEN-LAST:event_btnCopyActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnCopy;
    javax.swing.JLabel lblMessage;
    javax.swing.JTextArea txaCommand;
    // End of variables declaration//GEN-END:variables
    
    
    /**
     * Open dialog
     */
    public static void openDialog(Component parent) {
    	JOptionPane.showMessageDialog(parent, new PnlNoAgentModeMessage());
    }
}