/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Duc;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.FlagTerm;
import javax.swing.JDialog;
import javax.swing.JTable;

/**
 *
 * @author Duc
 */
public class MailReceive extends javax.swing.JFrame {

    public static String user = "";
    public static String password = "";
    public static String imapServer = "";

    /**
     * Creates new form MailReceive
     */
    public MailReceive() {
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

        nameEmail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInbox = new javax.swing.JTable();
        btCompose = new javax.swing.JButton();
        btCheck = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbUnreadMailsCount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbNewMailsCount = new javax.swing.JLabel();
        cbUnread = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        nameEmail.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        nameEmail.setText("INBOX");

        tblInbox.setAutoCreateRowSorter(true);
        tblInbox.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Receive Time", "Sender", "Title"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInbox.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        tblInbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInboxMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInbox);
        tblInbox.getColumnModel().getColumn(0).setMinWidth(50);
        tblInbox.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblInbox.getColumnModel().getColumn(0).setMaxWidth(50);
        tblInbox.getColumnModel().getColumn(1).setMinWidth(150);
        tblInbox.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblInbox.getColumnModel().getColumn(1).setMaxWidth(150);
        tblInbox.getColumnModel().getColumn(2).setMinWidth(250);
        tblInbox.getColumnModel().getColumn(2).setPreferredWidth(250);
        tblInbox.getColumnModel().getColumn(2).setMaxWidth(250);

        btCompose.setText("Compose");
        btCompose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComposeActionPerformed(evt);
            }
        });

        btCheck.setText("Check new");
        btCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCheckActionPerformed(evt);
            }
        });

        jLabel1.setText("Unread Mails:");

        lbUnreadMailsCount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbUnreadMailsCount.setForeground(new java.awt.Color(255, 0, 0));
        lbUnreadMailsCount.setText("0");

        jLabel2.setText("New Mails:");

        lbNewMailsCount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNewMailsCount.setForeground(new java.awt.Color(255, 0, 0));
        lbNewMailsCount.setText("0");

        cbUnread.setText("Unread Only");
        cbUnread.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbUnreadItemStateChanged(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("#Tip: Double click to view mail detail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCompose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbUnread)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbUnreadMailsCount)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNewMailsCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(446, 446, 446)
                .addComponent(nameEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(417, 417, 417))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameEmail)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCompose)
                    .addComponent(btCheck)
                    .addComponent(jLabel1)
                    .addComponent(lbUnreadMailsCount)
                    .addComponent(jLabel2)
                    .addComponent(lbNewMailsCount)
                    .addComponent(cbUnread)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btComposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComposeActionPerformed
        // TODO add your handling code here:
        Login.composeFrame.setVisible(true);
        Login.composeFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_btComposeActionPerformed

    private void btCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCheckActionPerformed
        // TODO add your handling code here:
        messagesAll = getMessages();

        try {
            fillTable(cbUnread.isSelected());
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btCheckActionPerformed

    private void tblInboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInboxMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            selectedRow = tblInbox.getSelectedRow();

            JDialog mailDetail;
            try {
                mailDetail = new MailDetail(this, true);
                mailDetail.setLocationRelativeTo(null);
                mailDetail.setVisible(true);
            } catch (MessagingException ex) {
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_tblInboxMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        messagesAll = getMessages();
        try {
            fillTable(false);
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_formWindowOpened

    private void cbUnreadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbUnreadItemStateChanged
        // TODO add your handling code here:
        try {
            fillTable(cbUnread.isSelected());
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_cbUnreadItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MailAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MailAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MailAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MailAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login.inboxFrame.setVisible(true);
            }
        });
    }

    public static void fillTable(boolean unreadOnly) throws Exception {
        clearTable(tblInbox);

        try {
            //Đảo để lấy mail mới nhất, vì cái này nó get theo thời gian từ đầu
            messageReverse = reverseMessageOrder(messagesAll);
            if (unreadOnly) {
                messageReverse = unreadMessages;
            }

            //Phun vào Jtable
            int i = 0;

            DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            for (Message message : messageReverse) {
                tblInbox.getModel().setValueAt(i + 1, i, 0);
                tblInbox.getModel().setValueAt(df.format(message.getSentDate()), i, 1);

                String fromAddress = message.getFrom()[0].toString();
                int lastPostOfEmailAdress = (fromAddress.lastIndexOf('>') == fromAddress.length() - 1) ? fromAddress.length() - 1 : fromAddress.length();
                fromAddress = fromAddress.substring(fromAddress.lastIndexOf('<') + 1, lastPostOfEmailAdress);

                tblInbox.getModel().setValueAt(fromAddress, i, 2);
                tblInbox.getModel().setValueAt(message.getSubject(), i, 3);

                i++;
            }
        } catch (NoSuchProviderException e) {
            System.exit(1);
        } catch (MessagingException e) {
            System.exit(2);
        }
    }

    //Hàm đảo cho nó lấy cuối lên đầu, lastest email trước
    private static Message[] reverseMessageOrder(Message[] messages) {
        Message revMessages[] = new Message[messages.length];
        int i = messages.length - 1;
        for (int j = 0; j < messages.length; j++, i--) {
            revMessages[j] = messages[i];
        }
        return revMessages;
    }

    public static void clearTable(final JTable table) {
        for (int i = 0; i < table.getRowCount(); i++) {
            for (int j = 0; j < table.getColumnCount(); j++) {
                table.setValueAt("", i, j);
            }
        }
    }

    private static Message[] getMessages() {
        final int MAX_MESSAGES = 20;
        Message messages[] = null;

        Properties props = System.getProperties();
        props.setProperty("mail.store.protocol", "imaps");

        try {
            //Kết nối đến Imap server
            Session session = Session.getInstance(props, null);
            Store store = session.getStore("imaps"); //url kêt nối
            store.connect(imapServer, user, password);

            //Mở thư mục INBOX
            Folder inbox = store.getFolder("Inbox");
            inbox.open(Folder.READ_ONLY);

            lbUnreadMailsCount.setText(String.valueOf(inbox.getUnreadMessageCount()));
            lbNewMailsCount.setText(String.valueOf(inbox.getNewMessageCount()));

            //Lấy messages từ server -> Tôi lấy 20 lastest!
            int end = inbox.getMessageCount();
            int start = end - MAX_MESSAGES + 1;
            messages = inbox.getMessages(start, end);
            unreadMessages = inbox.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));

        } catch (Exception ex) {
        }
        return messages;
    }
    private static Message messageReverse[];
    private static Message messagesAll[];
    private static Message unreadMessages[];
    private static int selectedRow;

    public static int getSelectedRow() {
        return selectedRow;
    }

    public static Message[] getMessageReverse() {
        return messageReverse;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCheck;
    private javax.swing.JButton btCompose;
    private javax.swing.JCheckBox cbUnread;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel lbNewMailsCount;
    private static javax.swing.JLabel lbUnreadMailsCount;
    private javax.swing.JLabel nameEmail;
    private static javax.swing.JTable tblInbox;
    // End of variables declaration//GEN-END:variables
}