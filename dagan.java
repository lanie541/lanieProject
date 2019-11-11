
package main;
import java.applet.AudioClip;
import java.awt.event.*;
import java.lang.reflect.InvocationTargetException;
import javax.swing.Timer;
public  class dagan extends javax.swing.JApplet  {
    Timer time,timer2;
    AudioClip audio,music;
    methods obj=new methods();
    @Override
    public void init() {
        setSize(880,550);
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    initComponents(); 
                }
            });
        } catch (InterruptedException | InvocationTargetException ex) {
        }
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        main = new javax.swing.JPanel();
        gotoPnl = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        mainPanl = new javax.swing.JPanel();
        txtscore = new javax.swing.JTextField();
        player1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        f1 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        pow1 = new javax.swing.JLabel();
        enemy4 = new javax.swing.JLabel();
        enemy1 = new javax.swing.JLabel();
        enemy3 = new javax.swing.JLabel();
        wall11 = new javax.swing.JLabel();
        walla1 = new javax.swing.JLabel();
        wall = new javax.swing.JLabel();
        wallni8 = new javax.swing.JLabel();
        wall13 = new javax.swing.JLabel();
        walla4 = new javax.swing.JLabel();
        wall8 = new javax.swing.JLabel();
        wallni = new javax.swing.JLabel();
        wall2 = new javax.swing.JLabel();
        wall9 = new javax.swing.JLabel();
        walla6 = new javax.swing.JLabel();
        wallni1 = new javax.swing.JLabel();
        wall4 = new javax.swing.JLabel();
        walla5 = new javax.swing.JLabel();
        wall15 = new javax.swing.JLabel();
        wall5 = new javax.swing.JLabel();
        wallni2 = new javax.swing.JLabel();
        wall12 = new javax.swing.JLabel();
        wall1 = new javax.swing.JLabel();
        wallni3 = new javax.swing.JLabel();
        wall3 = new javax.swing.JLabel();
        walla2 = new javax.swing.JLabel();
        wall7 = new javax.swing.JLabel();
        walla3 = new javax.swing.JLabel();
        wallni4 = new javax.swing.JLabel();
        wall6 = new javax.swing.JLabel();
        walla = new javax.swing.JLabel();
        f5 = new javax.swing.JLabel();
        f6 = new javax.swing.JLabel();
        f7 = new javax.swing.JLabel();
        f8 = new javax.swing.JLabel();
        f91 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        d5 = new javax.swing.JLabel();
        d6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNamePnl = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        btnStart1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        endPnl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDisplay = new javax.swing.JLabel();
        txtDisplayName = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        victoryPnl = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDisplay1 = new javax.swing.JLabel();
        txtDisplayName1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jLabel1.setText("jLabel1");

        main.setLayout(new java.awt.CardLayout());

        gotoPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStart.setBackground(new java.awt.Color(0, 0, 204));
        btnStart.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btnStart.setForeground(new java.awt.Color(0, 0, 255));
        btnStart.setText("start");
        btnStart.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3.png"))); // NOI18N
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        gotoPnl.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 150, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        gotoPnl.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 550));

        main.add(gotoPnl, "card2");

        mainPanl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainPanl.add(txtscore, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 60, 20));

        player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/players.png"))); // NOI18N
        mainPanl.add(player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 30, 50));

        txt1.setVerifyInputWhenFocusTarget(false);
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt1KeyPressed(evt);
            }
        });
        mainPanl.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 100, 30));

        f1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/diamod.png"))); // NOI18N
        mainPanl.add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 80, 60));

        d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        mainPanl.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 110, 70));
        mainPanl.add(pow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 40, 30));

        enemy4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/enemy1.png"))); // NOI18N
        enemy4.setText("jLabel1");
        mainPanl.add(enemy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 70, 50));

        enemy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/enemy1.png"))); // NOI18N
        enemy1.setText("jLabel1");
        mainPanl.add(enemy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 70, 50));

        enemy3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/enemy3.png"))); // NOI18N
        mainPanl.add(enemy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 240, 60, 70));

        wall11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wall1.png"))); // NOI18N
        wall11.setText("jLabel3");
        mainPanl.add(wall11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 140, 40));

        walla1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/walll.png"))); // NOI18N
        mainPanl.add(walla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 40, 150));

        wall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wall1.png"))); // NOI18N
        wall.setText("jLabel3");
        mainPanl.add(wall, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 240, 20));

        wallni8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wallers.png"))); // NOI18N
        mainPanl.add(wallni8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 40, 170));

        wall13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wall1.png"))); // NOI18N
        wall13.setText("jLabel3");
        mainPanl.add(wall13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 80, 50));

        walla4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/walll.png"))); // NOI18N
        mainPanl.add(walla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 30, 170));

        wall8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wall1.png"))); // NOI18N
        wall8.setText("jLabel3");
        mainPanl.add(wall8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 240, -1));

        wallni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wallers.png"))); // NOI18N
        mainPanl.add(wallni, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 50, 160));

        wall2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wall1.png"))); // NOI18N
        wall2.setText("jLabel3");
        mainPanl.add(wall2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 80, 60));

        wall9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wall1.png"))); // NOI18N
        mainPanl.add(wall9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, -20, 260, 60));

        walla6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/walll.png"))); // NOI18N
        mainPanl.add(walla6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 30, 60));

        wallni1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wallers.png"))); // NOI18N
        mainPanl.add(wallni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 50, 240));

        wall4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wall1.png"))); // NOI18N
        mainPanl.add(wall4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 260, 50));

        walla5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/walll.png"))); // NOI18N
        mainPanl.add(walla5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 30, 40));

        wall15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wall1.png"))); // NOI18N
        wall15.setText("jLabel3");
        mainPanl.add(wall15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 220, 30));

        wall5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wall1.png"))); // NOI18N
        wall5.setText("jLabel3");
        mainPanl.add(wall5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 220, 50));

        wallni2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wallers.png"))); // NOI18N
        mainPanl.add(wallni2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 50, 110));

        wall12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wall1.png"))); // NOI18N
        wall12.setText("jLabel3");
        mainPanl.add(wall12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 180, 30));

        wall1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wall1.png"))); // NOI18N
        wall1.setText("jLabel3");
        mainPanl.add(wall1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 90, 20));

        wallni3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wallers.png"))); // NOI18N
        mainPanl.add(wallni3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 50, 180));

        wall3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wall1.png"))); // NOI18N
        wall3.setText("jLabel3");
        mainPanl.add(wall3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 230, 40));

        walla2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/walll.png"))); // NOI18N
        mainPanl.add(walla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 40, 70));

        wall7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wall1.png"))); // NOI18N
        wall7.setText("jLabel3");
        mainPanl.add(wall7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 220, 20));

        walla3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/walll.png"))); // NOI18N
        mainPanl.add(walla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 40, 80));

        wallni4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wallers.png"))); // NOI18N
        mainPanl.add(wallni4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 50, 160));

        wall6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/wall1.png"))); // NOI18N
        wall6.setText("jLabel3");
        mainPanl.add(wall6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 220, 40));

        walla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/walll.png"))); // NOI18N
        mainPanl.add(walla, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 20, 90));

        f5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/diamod.png"))); // NOI18N
        mainPanl.add(f5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 80, 60));

        f6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/diamod.png"))); // NOI18N
        mainPanl.add(f6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 80, 60));

        f7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/diamod.png"))); // NOI18N
        mainPanl.add(f7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 80, 60));

        f8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/diamod.png"))); // NOI18N
        mainPanl.add(f8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 80, 60));

        f91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/diamod.png"))); // NOI18N
        mainPanl.add(f91, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 80, 60));

        d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/takilid.png"))); // NOI18N
        mainPanl.add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 70, 90));

        d3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/takilid.png"))); // NOI18N
        mainPanl.add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 70, 90));

        d4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/takilid.png"))); // NOI18N
        mainPanl.add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, -1, 90));

        d5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/takilid.png"))); // NOI18N
        mainPanl.add(d5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 60, 80));

        d6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/takilid.png"))); // NOI18N
        mainPanl.add(d6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 70, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/road_1.png"))); // NOI18N
        mainPanl.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 550));

        main.add(mainPanl, "card3");

        userNamePnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        userNamePnl.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 210, 50));

        btnStart1.setBackground(new java.awt.Color(0, 0, 204));
        btnStart1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btnStart1.setForeground(new java.awt.Color(0, 0, 255));
        btnStart1.setText("Save Name");
        btnStart1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3.png"))); // NOI18N
        btnStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart1ActionPerformed(evt);
            }
        });
        userNamePnl.add(btnStart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 210, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        userNamePnl.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 550));

        main.add(userNamePnl, "card2");

        endPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel3.setText("Your score is");
        endPnl.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 370, 90));

        txtDisplay.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        txtDisplay.setForeground(new java.awt.Color(255, 255, 255));
        endPnl.add(txtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 240, 120));

        txtDisplayName.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        txtDisplayName.setForeground(new java.awt.Color(153, 255, 255));
        endPnl.add(txtDisplayName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 290, 70));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        endPnl.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        main.add(endPnl, "card2");

        victoryPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel4.setText("Your score is");
        victoryPnl.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 370, 90));

        txtDisplay1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        txtDisplay1.setForeground(new java.awt.Color(255, 255, 255));
        victoryPnl.add(txtDisplay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 240, 120));

        txtDisplayName1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        txtDisplayName1.setForeground(new java.awt.Color(153, 255, 255));
        victoryPnl.add(txtDisplayName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 290, 70));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ccong.png"))); // NOI18N
        victoryPnl.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        main.add(victoryPnl, "card2");

        getContentPane().add(main, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    //for my ccollisions
    public class move implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
          obj.one(music=getAudioClip(getCodeBase(),"sound//gameover.wav"));
        }
    }
    @Override
    public void start(){
        time=new Timer(100,(ActionListener) new dagan.move());
        time.start();
        player1.requestFocus();
    }
    //para dagan sa sprite
    private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
        txt1.requestFocus();
        obj.run(evt,audio=getAudioClip(getCodeBase(),"sound//walk.wav"));
    }//GEN-LAST:event_txt1KeyPressed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
       obj.frame(userNamePnl);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart1ActionPerformed
       obj.frame(mainPanl);
       txt1.requestFocus();
    }//GEN-LAST:event_btnStart1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStart1;
    public static javax.swing.JLabel d1;
    public static javax.swing.JLabel d2;
    public static javax.swing.JLabel d3;
    public static javax.swing.JLabel d4;
    public static javax.swing.JLabel d5;
    public static javax.swing.JLabel d6;
    public static javax.swing.JPanel endPnl;
    public static javax.swing.JLabel enemy1;
    public static javax.swing.JLabel enemy3;
    public static javax.swing.JLabel enemy4;
    public static javax.swing.JLabel f1;
    public static javax.swing.JLabel f5;
    public static javax.swing.JLabel f6;
    public static javax.swing.JLabel f7;
    public static javax.swing.JLabel f8;
    public static javax.swing.JLabel f91;
    private javax.swing.JPanel gotoPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel l2;
    public static javax.swing.JPanel main;
    private javax.swing.JPanel mainPanl;
    public static javax.swing.JLabel player1;
    private javax.swing.JLabel pow1;
    private javax.swing.JTextField txt1;
    public static javax.swing.JLabel txtDisplay;
    public static javax.swing.JLabel txtDisplay1;
    public static javax.swing.JLabel txtDisplayName;
    public static javax.swing.JLabel txtDisplayName1;
    public static javax.swing.JTextField txtName;
    public static javax.swing.JTextField txtscore;
    private javax.swing.JPanel userNamePnl;
    public static javax.swing.JPanel victoryPnl;
    public static javax.swing.JLabel wall;
    public static javax.swing.JLabel wall1;
    public static javax.swing.JLabel wall11;
    public static javax.swing.JLabel wall12;
    public static javax.swing.JLabel wall13;
    public static javax.swing.JLabel wall15;
    public static javax.swing.JLabel wall2;
    public static javax.swing.JLabel wall3;
    public static javax.swing.JLabel wall4;
    public static javax.swing.JLabel wall5;
    public static javax.swing.JLabel wall6;
    public static javax.swing.JLabel wall7;
    public static javax.swing.JLabel wall8;
    public static javax.swing.JLabel wall9;
    public static javax.swing.JLabel walla;
    public static javax.swing.JLabel walla1;
    public static javax.swing.JLabel walla2;
    public static javax.swing.JLabel walla3;
    public static javax.swing.JLabel walla4;
    private javax.swing.JLabel walla5;
    public static javax.swing.JLabel walla6;
    public static javax.swing.JLabel wallni;
    public static javax.swing.JLabel wallni1;
    public static javax.swing.JLabel wallni2;
    public static javax.swing.JLabel wallni3;
    public static javax.swing.JLabel wallni4;
    public static javax.swing.JLabel wallni8;
    // End of variables declaration//GEN-END:variables

    }
 
 
       
