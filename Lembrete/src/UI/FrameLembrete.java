package UI;

import infra.LembreteHibernateDAO;
import java.util.ArrayList;
import java.util.List;
import model.Lembrete;

public class FrameLembrete extends javax.swing.JFrame {

    Lembrete lem = new Lembrete();
    LembreteHibernateDAO lemDAO = new LembreteHibernateDAO();

    public FrameLembrete() {
        initComponents();
        getListLembretes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMensagem = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCriar = new javax.swing.JButton();
        txtTitulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblResultadoLembrete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(46, 175, 109));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Titulo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, 30));

        txtMensagem.setBackground(new java.awt.Color(46, 175, 109));
        txtMensagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMensagem.setForeground(new java.awt.Color(255, 255, 255));
        txtMensagem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 330, 30));

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 410, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mensagem");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 180, 30));

        btnCriar.setBackground(new java.awt.Color(255, 255, 255));
        btnCriar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCriar.setText("Criar");
        btnCriar.setBorder(null);
        btnCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCriar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 120, 40));

        txtTitulo.setBackground(new java.awt.Color(46, 175, 109));
        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 330, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cadastrar lembrete");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 230, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 550));

        jPanel3.setBackground(new java.awt.Color(36, 113, 163));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.setToolTipText("");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 20, 30));

        lblResultadoLembrete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblResultadoLembrete.setForeground(new java.awt.Color(255, 255, 255));
        lblResultadoLembrete.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(lblResultadoLembrete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 390, 490));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 450, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        Lembrete lem = new Lembrete();
        lem = criarLembrete();
        if (lemDAO.create(lem)) {
            lblStatus.setText("Lembrete cadastrado com sucesso");
        } else {
            lblStatus.setText("Não foi possível cadastrar o lembrete");
        }
        getListLembretes();
    }//GEN-LAST:event_btnCriarActionPerformed

    private Lembrete criarLembrete() {
        Lembrete lem = new Lembrete();
        lem.setTitulo(txtTitulo.getText());
        lem.setMensagem(txtMensagem.getText());
        return lem;
    }
    
    
    private void getListLembretes(){
        lblResultadoLembrete.setText("Carregando...");
        List<Lembrete> listLem =  new ArrayList<>();
        listLem = lemDAO.read();
        String listaLembretes ="<html>";
        for (Lembrete lem: listLem) {
            listaLembretes += lem.getTitulo() + "<br>Mensagem: " + lem.getMensagem();
        }
        listaLembretes += "</html>";
        
        lblResultadoLembrete.setText(listaLembretes);
    }
    

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLembrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new FrameLembrete().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblResultadoLembrete;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtMensagem;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
