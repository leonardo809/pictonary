/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionarios;

import Cuestionarios.Menu_Resultados;
import com.sun.awt.AWTUtilities;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author USUARIO
 */
public class F_Cuestionario extends javax.swing.JFrame {
int x,y;

    public F_Cuestionario() {
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
                
        op_Cafeteria.add(op1);
        op_Cafeteria.add(op2);
        op_Cafeteria.add(op3);
            
        cor1.setVisible(false);
        preg.setText("");
        ///Aqui se debe marcar la pregunta incial;!!!!!!!!!!!!!!!!
        ///Aqui se debe marcar la pregunta incial;!!!!!!!!!!!!!!!!
        ///Aqui se debe marcar la pregunta incial;!!!!!!!!!!!!!!!!
        ///Aqui se debe marcar la pregunta incial;!!!!!!!!!!!!!!!!
    }
    

    //Variables:
    
    //q = Numero de la pregunta.
    //acieto = Respuestas correctas.
    //error = Respuestas incorrectas.
    //b = bandera
    int q=1, acierto=0, error=0, b=0 ;
    String nom;    
    int eje1;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        op_Cafeteria = new javax.swing.ButtonGroup();
        bSalir = new javax.swing.JButton();
        bMinimizar = new javax.swing.JButton();
        Bot_in = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lBarra = new javax.swing.JLabel();
        preg = new javax.swing.JLabel();
        bot1 = new javax.swing.JButton();
        score_a = new javax.swing.JLabel();
        cor1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        op3 = new javax.swing.JCheckBox();
        op1 = new javax.swing.JCheckBox();
        op2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        score_e = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Test");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Salir/20.png"))); // NOI18N
        bSalir.setBorder(null);
        bSalir.setBorderPainted(false);
        bSalir.setContentAreaFilled(false);
        bSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Salir/10.png"))); // NOI18N
        bSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Salir/15.png"))); // NOI18N
        bSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Salir/10.png"))); // NOI18N
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        getContentPane().add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 5, -1, -1));

        bMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Minimizar/20.png"))); // NOI18N
        bMinimizar.setBorder(null);
        bMinimizar.setBorderPainted(false);
        bMinimizar.setContentAreaFilled(false);
        bMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bMinimizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Minimizar/10.png"))); // NOI18N
        bMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Minimizar/15.png"))); // NOI18N
        bMinimizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Minimizar/20.png"))); // NOI18N
        bMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(bMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 5, -1, -1));

        Bot_in.setFont(new java.awt.Font("Caviar Dreams", 1, 30)); // NOI18N
        Bot_in.setForeground(new java.awt.Color(255, 255, 255));
        Bot_in.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Normal/Normal150.png"))); // NOI18N
        Bot_in.setText("START");
        Bot_in.setBorder(null);
        Bot_in.setBorderPainted(false);
        Bot_in.setContentAreaFilled(false);
        Bot_in.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bot_in.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Normal/Normal130.png"))); // NOI18N
        Bot_in.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Normal/Normal140.png"))); // NOI18N
        Bot_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot_inActionPerformed(evt);
            }
        });
        getContentPane().add(Bot_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 200, 150, 48));

        jLabel4.setBackground(new java.awt.Color(255, 102, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/FondoAnimadoImagen.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 450));

        lBarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Barra.jpg"))); // NOI18N
        lBarra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lBarraMouseDragged(evt);
            }
        });
        lBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lBarraMousePressed(evt);
            }
        });
        getContentPane().add(lBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 30));

        preg.setFont(new java.awt.Font("Caviar Dreams", 1, 36)); // NOI18N
        preg.setForeground(new java.awt.Color(255, 255, 255));
        preg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preg.setText("--");
        getContentPane().add(preg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 140, 130));

        bot1.setFont(new java.awt.Font("Caviar Dreams", 1, 30)); // NOI18N
        bot1.setForeground(new java.awt.Color(255, 255, 255));
        bot1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Normal/Normal150.png"))); // NOI18N
        bot1.setText("Enter");
        bot1.setBorderPainted(false);
        bot1.setContentAreaFilled(false);
        bot1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bot1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Normal/Normal130.png"))); // NOI18N
        bot1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Normal/Normal140.png"))); // NOI18N
        bot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot1ActionPerformed(evt);
            }
        });
        getContentPane().add(bot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 305, 150, 48));

        score_a.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        score_a.setForeground(new java.awt.Color(255, 255, 255));
        score_a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score_a.setText("0");
        score_a.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(score_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 400, 30, -1));

        cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_cor.png"))); // NOI18N
        getContentPane().add(cor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 265, -1, -1));

        jLabel3.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Score");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 365, 80, -1));

        op3.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        op3.setForeground(new java.awt.Color(255, 255, 255));
        op3.setText("op3");
        op3.setOpaque(false);
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });
        getContentPane().add(op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 412, 170, -1));

        op1.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        op1.setForeground(new java.awt.Color(255, 255, 255));
        op1.setText("op1");
        op1.setOpaque(false);
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });
        getContentPane().add(op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 289, 170, -1));

        op2.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        op2.setForeground(new java.awt.Color(255, 255, 255));
        op2.setText("op2");
        op2.setOpaque(false);
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });
        getContentPane().add(op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 170, -1));

        jLabel5.setBackground(new java.awt.Color(255, 102, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/CuestionarioImagen.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 450));

        score_e.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        score_e.setForeground(new java.awt.Color(255, 255, 255));
        score_e.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score_e.setText("0");
        score_e.setEnabled(false);
        getContentPane().add(score_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 70, -1));

        jLabel2.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Error");
        jLabel2.setEnabled(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Menu_Resultados MR = new Menu_Resultados();
    
    /*
    NO MODIFICAR!!!!!!!!!! SON LOS OBJETOS DE LAS RESPUESTAS!!!!!
    */
    
    public void ac1(){
            if(op1.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_cor.png")));
                cor1.setVisible(true);
                acierto++;
                score_a.setText(String.valueOf(acierto));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
            if(op2.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_inco.png")));
                cor1.setVisible(true);
                error++;
                score_e.setText(String.valueOf(error));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
            if(op3.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_inco.png")));
                cor1.setVisible(true);
                error++;
                score_e.setText(String.valueOf(error));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }    
}
    public void ac2(){
            if(op1.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_inco.png")));
                cor1.setVisible(true);
                error++;
                score_e.setText(String.valueOf(error));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
            if(op2.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_cor.png")));
                cor1.setVisible(true);
                acierto++;
                score_a.setText(String.valueOf(acierto));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
            if(op3.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_inco.png")));
                cor1.setVisible(true);
                error++;
                score_e.setText(String.valueOf(error));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
}
    public void ac3(){
            if(op1.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_inco.png")));
                cor1.setVisible(true);
                error++;
                score_e.setText(String.valueOf(error));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
            if(op2.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_inco.png")));
                cor1.setVisible(true);
                error++;
                score_e.setText(String.valueOf(error));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
            if(op3.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_cor.png")));
                cor1.setVisible(true);
                acierto++;
                score_a.setText(String.valueOf(acierto));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
}
    
    private void bot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot1ActionPerformed
        // TODO add your handling code here:
//        JOptionPane.showMessageDialog(null,"Es " + eje);
        if(!op3.isSelected() && !op2.isSelected() && !op1.isSelected()){
            JOptionPane.showMessageDialog(null,"Check an option");
        }
        if(b==1){
            bot1.setText("Accept");
            q++;    b=0;
            op_Cafeteria.clearSelection();
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
        }
        cor1.setVisible(false);

        //No modificar;
        pregunta_selec();

        if(q==11){
        MR.l1.setText(String.valueOf(acierto));
        MR.l2.setText(String.valueOf(error));
        MR.l3.setText(nom);
        MR.setVisible(true);
        this.dispose();    
        }
    
    }//GEN-LAST:event_bot1ActionPerformed
    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op1ActionPerformed
    //Aqui se escriben la primera pregunta!!!!!!!!!!!!!!!!
    //Aqui se escriben la primera pregunta!!!!!!!!!!!!!!!!
    //Es un boton "INICIO" que escribe la primera pregunta, se borra 
    //se oculta despues de precionarlo; si en el Frame anterior
    //si selecciono en el Frame anterior ("Munu_Test") un modo que no ha 
    //sido añadido dara "error 505"
    
    private void Bot_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot_inActionPerformed
        // TODO add your handling code here:
            switch (eje1) {
            case 0:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/TOYS.png")));
            op1.setText("Heat"); 
            op2.setText("Stomach");
            op3.setText("Toys");//corr
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;        
                
            case 1:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_1.png")));
            op1.setText("Stock Exchange");
            op2.setText("Money Changer");
            op3.setText("Changer"); //car
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 2:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SHELF.png")));
            op1.setText("Spray");
            op2.setText("Hair");
            op3.setText("Shelf"); //corr
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 3:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/11.png")));
            op1.setText("air machine");///Corecta
            op2.setText("air conditioner");
            op3.setText("fan"); 
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 4:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_1.png")));
            op1.setText("Cupcake"); //corr
            op2.setText("Cake");
            op3.setText("Drink");
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;

            case 5:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/31.png")));
            op1.setText("lolli pops");///Corecta
            op2.setText("gummies");
            op3.setText("bubble gum"); 
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 6:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/1.png")));
            op1.setText("token");//Corecta
            op2.setText("rulette");
            op3.setText("card"); 
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 7:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_001.png")));
            op1.setText("Soft-drink"); //cor
            op2.setText("Pizza");
            op3.setText("Milkshake");
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;    
            
            case 8:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_1.png")));
            op1.setText("Shirt");
            op2.setText("Blouse");
            op3.setText("Dress"); //car
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;    
            
            case 9:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_001.png")));
            op1.setText("Keyboard"); //Cor
            op2.setText("Mouse"); 
            op3.setText("Screen");
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;    
            
            case 10:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_1.png")));
            op1.setText("Vacumm");
            op2.setText("Iron");
            op3.setText("Fridge"); //car
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break; 
            
            case 11:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_1.png")));
            op1.setText("Roasted Chicken");
            op2.setText("Fried Chicken");
            op3.setText("Skewers"); //car
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break; 
            
            case 12:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/CASH REGISTRER.png")));
            op1.setText("Cash registrer"); //corr
            op2.setText("Boy");
            op3.setText("Playing");
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;

            case 13:
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/GLASSES.png")));
            op1.setText("Mirror"); 
            op2.setText("Clock");
            op3.setText("Glasses");//corr
            break;

            case 14:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/TICKET.png")));
            op1.setText("Look"); 
            op2.setText("Children");
            op3.setText("Ticket");//corr
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 15:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_001.png")));
            op1.setText("Bike");
            op2.setText("Helicopter"); 
            op3.setText("Toys"); // cor
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 16:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_1.png")));
            op1.setText("Fried Chicken");
            op2.setText("Roasted Chicken");
            op3.setText("Salad"); //car
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;            
            
            case 17:  ///////////
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_001.png")));
            op1.setText("Belt"); 
            op2.setText("Helmet"); //Correcto
            op3.setText("Ice Axe");
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;    

            case 18:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/21.png")));
            op1.setText("brand");///Corecta
            op2.setText("telephone");
            op3.setText("table"); 
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 19:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_001.png")));
            op1.setText("Helicopter");
            op2.setText("Ball");
            op3.setText("Toy hoops"); //car
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 20:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_1.png")));
            op1.setText("Red Light");
            op2.setText("Fire Alarm");
            op3.setText("Charger"); //car
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 21:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/41.png")));
            op1.setText("mirror");///Corecta
            op2.setText("shelf");
            op3.setText("house"); 
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            default: JOptionPane.showMessageDialog(null,"Error 505"); break;
        }
            
    }//GEN-LAST:event_Bot_inActionPerformed

    private void lBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lBarraMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_lBarraMouseDragged

    private void lBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lBarraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lBarraMousePressed

    private void bMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
        this.setExtendedState(1);
    }//GEN-LAST:event_bMinimizarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op3ActionPerformed

//Aqui se escbriben las preguntas y las opciones para contestar;

    public void imagen_cafeteria(){
                //Pregunta 1-------------------------        
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_1.png")));
            op1.setText("Cupcake"); //corr
            op2.setText("Cake");
            op3.setText("Drink");
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_2.png")));
            op1.setText("Cake");
            op2.setText("Dessert");
            op3.setText("Drinks machine");  //Corecta
            ac3();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_3.png")));
            op1.setText("Wallet"); //correcta
            op2.setText("Pizza");  
            op3.setText("Bag");
            ac1();
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_4.png")));
            op1.setText("Bag"); //Correcto
            op2.setText("Sandwich");
            op3.setText("Drink Machine");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_5.png")));
            op1.setText("Pizza"); //Correcto
            op2.setText("Hot-Dog");
            op3.setText("Sandwich");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_6.png")));
            op1.setText("Pizza"); 
            op2.setText("Frenchfries"); //Correcto
            op3.setText("Skewers");
            ac2();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_7.png")));
            op1.setText("Eraser"); 
            op2.setText("Bag");
            op3.setText("Knife"); //Correcto
            ac3();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_8.png")));
            op1.setText("Milkshake"); //Correcto
            op2.setText("Pizza");
            op3.setText("Drink");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_9.png")));
            op1.setText("Milkshake"); 
            op2.setText("Pizza");
            op3.setText("Lemonade");//Correcto
            ac3();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_10.png")));
            op1.setText("Coffee"); //Correcto
            op2.setText("Milkshake");
            op3.setText("Drink Machine");
            ac1();
        }  
    }
    public void imagen_cine() {
        //Pregunta 1-------------------------        
        if(q==1){  
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_001.png")));
            op1.setText("Soft-drink"); //cor
            op2.setText("Pizza");
            op3.setText("Milkshake");
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_002.png")));
            op1.setText("Pizza"); //Corecta
            op2.setText("3D Glasses");
            op3.setText("Bag"); 
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_003.png")));
            op1.setText("Advert"); //correcta
            op2.setText("Bag");  
            op3.setText("Menu");
            ac1();           
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_004.png")));
            op1.setText("Drink machine"); 
            op2.setText("Popcorn machine"); //Correcto
            op3.setText("Hot-Dog");
            ac2();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_005.png")));
            op1.setText("Bag"); //Correcto
            op2.setText("Advert");
            op3.setText("Tickets");
            ac3();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_006.png")));
            op1.setText("Popcorn"); //Correcto
            op2.setText("Pizza"); 
            op3.setText("Skewers");
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_007.png")));
            op1.setText("Advert"); 
            op2.setText("Menu");
            op3.setText("Poster"); //Correcto
            ac3();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_008.png")));
            op1.setText("Ad"); //Correcto
            op2.setText("Advert");
            op3.setText("Poster");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_009.png")));
            op1.setText("Pizza"); 
            op2.setText("Milkshake");
            op3.setText("Candy");//Correcto
            ac3();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_010.png")));
            op1.setText("Ice cream"); //Correcto
            op2.setText("Milkshake");
            op3.setText("Pizza");
            ac1();
        }          
    }
    public void imagen_mascotas(){
        //Pregunta 1-------------------------    
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_001.png")));
            op1.setText("Bike");
            op2.setText("Helicopter"); 
            op3.setText("Toys"); // cor
            ac3();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_002.png")));
            op1.setText("Bowl"); //Corecta
            op2.setText("Drums");
            op3.setText("Car");  
            ac1();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_003.png")));
            op1.setText("Lizard"); //correcta
            op2.setText("Bear");  
            op3.setText("Ball");
            ac1();            
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_004.png")));
            op1.setText("Bear"); 
            op2.setText("Lizard");
            op3.setText("Dog"); //Correcto
            ac3();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_005.png")));
            op1.setText("Bike"); 
            op2.setText("Leash"); //Correcto
            op3.setText("Ball");
            ac2();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_006.png")));
            op1.setText("Drink"); 
            op2.setText("Birdcage"); //Correcto
            op3.setText("Dog");
            ac2();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_007.png")));
            op1.setText("Dog"); 
            op2.setText("Car");
            op3.setText("Brush"); //Correcto
            ac3();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_008.png")));
            op1.setText("Collar"); //Correcto
            op2.setText("Drums");
            op3.setText("Lizard");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_009.png")));
            op1.setText("Ferret"); //Correcto
            op2.setText("Dog");
            op3.setText("Lizard");
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_010.png")));
            op1.setText("Pet food"); //Correcto
            op2.setText("Dog");
            op3.setText("Milkshake");
            ac1();
        }
    }
    public void imagen_computo(){
        //Pregunta 1-------------------------        
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_001.png")));
            op1.setText("Keyboard"); //Cor
            op2.setText("Mouse"); 
            op3.setText("Screen");
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_002.png")));
            op1.setText("Monitor");
            op2.setText("Mouse");
            op3.setText("License");  //Corecta
            ac3();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_003.png")));
            op1.setText("Printer"); //correcta
            op2.setText("Mouse");  
            op3.setText("Keyboard");
            ac1();                 
        }
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_004.png")));
            op1.setText("Pen Drive"); 
            op2.setText("Power supply"); //Correcto
            op3.setText("Mouse");
            ac2();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_005.png")));
            op1.setText("Pen drive"); //Correcto
            op2.setText("License");
            op3.setText("Mouse");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_006.png")));
            op1.setText("License"); 
            op2.setText("Mouse"); //Correcto
            op3.setText("Keyboard");
            ac2();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_007.png")));
            op1.setText("License"); 
            op2.setText("Mouse");
            op3.setText("Software"); //Correcto
            ac3();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_008.png")));
            op1.setText("Keyboards"); 
            op2.setText("Horns"); //Correcto
            op3.setText("Window");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_009.png")));
            op1.setText("Software"); 
            op2.setText("License");
            op3.setText("Disk");//Correcto
            ac3();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_010.png")));
            op1.setText("Charger"); //Correcto
            op2.setText("Mouse");
            op3.setText("Keyboard");
            ac1();
        }        

}
    public void imagen_deportes(){
        
//Pregunta 1-------------------------
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_001.png")));
            op1.setText("Belt"); 
            op2.setText("Helmet"); //Correcto
            op3.setText("Ice Axe");
            ac2();     
    }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_002.png")));
            op1.setText("Hula Hula Ring");
            op2.setText("Helmet");
            op3.setText("Ice Axe");  //Corecta
            ac3();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_003.png")));
            op1.setText("Hula hula Ring"); //correcta
            op2.setText("Drums");  
            op3.setText("Ball");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_004.png")));
            op1.setText("Helmet"); 
            op2.setText("Ball"); 
            op3.setText("Floret"); //Correcto
            ac3();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_005.png")));
            op1.setText("Boxing gloves"); //Correcto
            op2.setText("Drums");
            op3.setText("Ball");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_006.png")));
            op1.setText("Floret"); 
            op2.setText("Hockey stick"); //Correcto
            op3.setText("Ball");
            ac2();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_007.png")));
            op1.setText("Ball"); 
            op2.setText("Cue"); //Correcto
            op3.setText("Stick"); 
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_008.png")));
            op1.setText("Racquet"); //Correcto
            op2.setText("Boxing gloves");
            op3.setText("Cue");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_009.png")));
            op1.setText("Ball"); 
            op2.setText("Monocycle");
            op3.setText("Unicycle");//Correcto
            ac3();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_010.png")));
            op1.setText("Goggles"); //Correcto
            op2.setText("Balls");
            op3.setText("Stick");
            ac1();
        }        
}
    public void imagen_juguetes(){
       
        //Pregunta 1-------------------------        
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_001.png")));
            op1.setText("Helicopter");
            op2.setText("Ball");
            op3.setText("Toy hoops"); //car
            ac3();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_002.png")));
            op1.setText("Toy hoops"); //Corecta
            op2.setText("Helicopter");
            op3.setText("Toy choper");
            ac1();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_003.png")));
            op1.setText("Teddy Bear"); 
            op2.setText("Helicopter");  //correcta
            op3.setText("Ballonn");
            ac3();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_004.png")));
            op1.setText("Toy sword"); //Correcto
            op2.setText("Ball");
            op3.setText("Keyboard");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_005.png")));
            op1.setText("Toy rocket"); //Correcto
            op2.setText("Helicopter");
            op3.setText("Ballonn");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_006.png")));
            op1.setText("Ball"); 
            op2.setText("Teddy Bear");
            op3.setText("Toy duck"); //Correcto
            ac3();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_007.png")));
            op1.setText("Soldier"); //Correcto
            op2.setText("Toy Duck");
            op3.setText("Ball");
            ac1();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_008.png")));
            op1.setText("Balls");
            op2.setText("Dolls"); //Correcto
            op3.setText("Teddy Bear");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_009.png")));
            op1.setText("Toy chicken");//Correcto
            op2.setText("Ball");
            op3.setText("Toy Duck"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_010.png")));
            op1.setText("Ball"); 
            op2.setText("Knife");
            op3.setText("Kite"); //Correcto
            ac3();      
    }
}   

 //FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO 

//BANCOS 
    public void imagen_banco(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_1.png")));
            op1.setText("Stock Exchange");
            op2.setText("Money Changer");
            op3.setText("Changer"); //car
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_2.png")));
            op1.setText("Chart"); //Corecta
            op2.setText("Worldwide Map");
            op3.setText("Box");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_3.png")));
            op1.setText("Security Cam"); 
            op2.setText("Fire Alarm");  //correcta
            op3.setText("Plant");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_4.png")));
            op1.setText("Thief"); //Correcto
            op2.setText("Fox");
            op3.setText("Camera");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_5.png")));
            op1.setText("Cash Box"); //Correcto
            op2.setText("ATM");
            op3.setText("Safe Lock box");
            ac2();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_6.png")));
            op1.setText("Wallet"); 
            op2.setText("Whale");
            op3.setText("While"); //Correcto
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_7.png")));
            op1.setText("Box"); //Correcto
            op2.setText("Money Box");
            op3.setText("Safe Lock Box");
            ac3();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_8.png")));
            op1.setText("Timer");
            op2.setText("Clock"); //Correcto
            op3.setText("Ruler");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_9.png")));
            op1.setText("Cash");//Correcto
            op2.setText("Coins");
            op3.setText("Bills"); 
            ac2();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_10.png")));
            op1.setText("Carpet"); 
            op2.setText("Column");
            op3.setText("Clock"); //Correcto
            ac1();      
    }
}
//ROPA   
    public void imagen_ropa(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_1.png")));
            op1.setText("Shirt");
            op2.setText("Blouse");
            op3.setText("Dress"); //car
            ac2();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_2.png")));
            op1.setText("Dress"); //Corecta
            op2.setText("Top");
            op3.setText("Shirt");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_3.png")));
            op1.setText("Dress"); 
            op2.setText("Vest");  //correcta
            op3.setText("Suit");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_4.png")));
            op1.setText("Socks"); //Correcto
            op2.setText("Cardigan");
            op3.setText("Belt");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_5.png")));
            op1.setText("Hells"); //Correcto
            op2.setText("Hels");
            op3.setText("Heels");
            ac3();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_6.png")));
            op1.setText("Belt"); 
            op2.setText("Velt");
            op3.setText("Bellt"); //Correcto
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_7.png")));
            op1.setText("Heels"); //Correcto
            op2.setText("Cap");
            op3.setText("Head Shield");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_8.png")));
            op1.setText("T-Shirt");
            op2.setText("Shirt"); //Correcto
            op3.setText("Blouse");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_9.png")));
            op1.setText("T-Shirt");//Correcto
            op2.setText("Blouse");
            op3.setText("Suit"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_10.png")));
            op1.setText("Cardigan"); 
            op2.setText("Dress");
            op3.setText("Suit"); //Correcto
            ac3();      
    }
}    
//ELECTRÃ“NICOS
    public void imagen_electronicos(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_1.png")));
            op1.setText("Vacumm");
            op2.setText("Iron");
            op3.setText("Fridge"); //car
            ac2();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_2.png")));
            op1.setText("Tablet"); //Corecta
            op2.setText("Television");
            op3.setText("Cellphone");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_3.png")));
            op1.setText("Laptop"); 
            op2.setText("PC");  //correcta
            op3.setText("Fridge");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_4.png")));
            op1.setText("Multifunctional"); //Correcto
            op2.setText("Fan");
            op3.setText("Printer");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_5.png")));
            op1.setText("Headphones"); //Correcto
            op2.setText("Tablet");
            op3.setText("Cellphone");
            ac3();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_6.png")));
            op1.setText("Tablet"); 
            op2.setText("Television");
            op3.setText("Cellphone"); //Correcto
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_7.png")));
            op1.setText("Fan"); //Correcto
            op2.setText("Vacumm");
            op3.setText("Fridge");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_8.png")));
            op1.setText("Fridge");
            op2.setText("Fan"); //Correcto
            op3.setText("Vacumm");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_9.png")));
            op1.setText("Headphones");//Correcto
            op2.setText("Aud-Ears");
            op3.setText("Free-Hands"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_10.png")));
            op1.setText("Vacumm"); 
            op2.setText("Printer");
            op3.setText("Fridge"); //Correcto
            ac3();      
    }
}  
//COMIDAFAST
   public void imagen_comidafast(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_1.png")));
            op1.setText("Roasted Chicken");
            op2.setText("Fried Chicken");
            op3.setText("Skewers"); //car
            ac2();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_2.png")));
            op1.setText("Skewers"); //Corecta
            op2.setText("French Fries");
            op3.setText("Beverage");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_3.png")));
            op1.setText("Milkshake"); 
            op2.setText("Drink");  //correcta
            op3.setText("Dessert");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_4.png")));
            op1.setText("Plate"); //Correcto
            op2.setText("Dish");
            op3.setText("Skewers");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_5.png")));
            op1.setText("Dessert"); //Correcto
            op2.setText("Plate");
            op3.setText("Bags");
            ac3();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_6.png")));
            op1.setText("Beverage"); 
            op2.setText("Milkshake");
            op3.setText("Salad"); //Correcto
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_7.png")));
            op1.setText("Heels"); //Correcto
            op2.setText("Cap");
            op3.setText("Head Shield");
            ac2();
        } 
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_8.png")));
            op1.setText("Plate");
            op2.setText("Bowl"); //Correcto
            op3.setText("Dish");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_9.png")));
            op1.setText("Bowl");//Correcto
            op2.setText("Dessert");
            op3.setText("Beverage"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_10.png")));
            op1.setText("Dessert"); 
            op2.setText("Salad");
            op3.setText("Skewers"); //Correcto
            ac3();      
    }
}   
//RESTAURANTE
   public void imagen_restaurante(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_1.png")));
            op1.setText("Fried Chicken");
            op2.setText("Roasted Chicken");
            op3.setText("Salad"); //car
            ac2();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_2.png")));
            op1.setText("Roasted Chicken"); //Corecta
            op2.setText("Salad");
            op3.setText("Drink");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_3.png")));
            op1.setText("Bottle of Wine"); 
            op2.setText("Bottle of Champagne");  //correcta
            op3.setText("Table");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_4.png")));
            op1.setText("Cup of Wine"); //Correcto
            op2.setText("Bottle of Wine");
            op3.setText("Drink");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_5.png")));
            op1.setText("Plate"); //Correcto
            op2.setText("Dish");
            op3.setText("Table");
            ac2();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_6.png")));
            op1.setText("Flower Pot"); 
            op2.setText("Dish");
            op3.setText("Bowl"); //Correcto
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_7.png")));
            op1.setText("Table"); //Correcto
            op2.setText("Chandelier");
            op3.setText("Waiter");
            ac2();
        } 
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_8.png")));
            op1.setText("Plate");
            op2.setText("Table"); //Correcto
            op3.setText("Chandelier");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_9.png")));
            op1.setText("Waiter");//Correcto
            op2.setText("Chandelier");
            op3.setText("Waitress"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_10.png")));
            op1.setText("Plate"); 
            op2.setText("Table");
            op3.setText("Tablecoth"); //Correcto
            ac3();      
    }
}   
//VIDEOJUEGOS   
    public void imagen_videojuegos(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_1.png")));
            op1.setText("Red Light");
            op2.setText("Fire Alarm");
            op3.setText("Charger"); //car
            ac2();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_2.png")));
            op1.setText("Table"); //Corecta
            op2.setText("Ad");
            op3.setText("Advert");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_3.png")));
            op1.setText("Security Cam"); 
            op2.setText("Fire Alarm");  //correcta
            op3.setText("Desk");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_4.png")));
            op1.setText("Teddy Bear"); //Correcto
            op2.setText("Toy");
            op3.setText("Furry");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_5.png")));
            op1.setText("Histography"); //Correcto
            op2.setText("Videogame");
            op3.setText("Comic");
            ac3();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_6.png")));
            op1.setText("Wallet"); 
            op2.setText("Gift Card");
            op3.setText("Toy"); //Correcto
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_7.png")));
            op1.setText("Bagpack"); //Correcto
            op2.setText("Cap");
            op3.setText("Head Shield");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_8.png")));
            op1.setText("Comic");
            op2.setText("Videogame"); //Correcto
            op3.setText("Bagpack");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_9.png")));
            op1.setText("Console");//Correcto
            op2.setText("Videogame");
            op3.setText("Comic"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_10.png")));
            op1.setText("Toy"); 
            op2.setText("Bagpack");
            op3.setText("Gift Card"); //Correcto
            ac3();      
    }
}   
//FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO  
//Rebeca //Rebeca //Rebeca //Rebeca  //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca 
    
public void imagen_joyeria(){
        //Pregunta 1-------------------------        
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/CASH REGISTRER.png")));
            op1.setText("Cash registrer"); //corr
            op2.setText("Boy");
            op3.setText("Playing");
            ac1();
        }
        //Pregunta 2-------------------------
        if(q==2){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/BAG.png")));
            op1.setText("Bag"); //corr
            op2.setText("Bored");
            op3.setText("Bounce");
            ac1();
        }
        //Pregunta 3-------------------------
        if(q==3){       
             preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/BOX.png")));
            op1.setText("Chash"); 
            op2.setText("Box");//corr
            op3.setText("Brooch");
            ac2();
        }
        //Pregunta 4-------------------------
        if(q==4){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/MIRROR_1.png")));
            op1.setText("Hand"); 
            op2.setText("Computer");
            op3.setText("Mirror");//corr
            ac3();
        }
        //Pregunta 5-------------------------
        if(q==5){       
             preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/BRACELETE.png")));
            op1.setText("Car"); 
            op2.setText("Pen");
            op3.setText("Bracelet");//corr
            ac3();
        }
        //Pregunta 6-------------------------
        if(q==6){       
             preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/BROOCH.png")));
            op1.setText("Blush"); 
            op2.setText("Brooch");//corr
            op3.setText("Eyes");
            ac2();
        }
        //Pregunta 7-------------------------
        if(q==7){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/RING.png")));
            op1.setText("Ring"); //corr
            op2.setText("Rang");
            op3.setText("Rinng");
            ac1();
        }
        //Pregunta 8-------------------------
        if(q==8){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/LINK.png")));
            op1.setText("Linkk"); 
            op2.setText("LLink");
            op3.setText("Link");//corr
            ac3();
        }
        //Pregunta 9-------------------------
        if(q==9){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/EARRINGS.png")));
            op1.setText("Earrings"); //corr
            op2.setText("Sound");
            op3.setText("Music");
            ac1();
        }
        //Pregunta 10-------------------------
        if(q==10){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SALESWOMAN.png")));
            op1.setText("Letter"); 
            op2.setText("Saleswoman");//corr
            op3.setText("Chair");
            ac2();
        }
   
    }
public void imagen_estacionamiento(){
        //Pregunta 1-------------------------
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/TICKET.png")));
            op1.setText("Look"); 
            op2.setText("Children");
            op3.setText("Ticket");//corr
            ac3();
        }
        //Pregunta 2-------------------------
        if(q==2){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/PICKET.png")));
            op1.setText("Picket"); //corr
            op2.setText("Pen");
            op3.setText("Computer");
            ac1();
        }
        //Pregunta 3-------------------------
        if(q==3){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/LOKERPARK.png")));
            op1.setText("Tree"); 
            op2.setText("Locker park");//corr
            op3.setText("School");
            ac2();
        }
        //Pregunta 4-------------------------
        if(q==4){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/PARKING PEN.png")));
            op1.setText("Room"); 
            op2.setText("Chair");
            op3.setText("Parking pen");//corr
            ac3();
        }
        //Pregunta 5-------------------------
        if(q==5){       
             preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/CAMARA.png")));
            op1.setText("Camera"); 
            op2.setText("Music");
            op3.setText("Security cam");//corr
            ac3();
        }
        //Pregunta 6-------------------------
        if(q==6){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/OFICIAL.png")));
            op1.setText("Sound"); 
            op2.setText("Official");//corr
            op3.setText("Meter");
            ac2();
        }
        //Pregunta 7-------------------------
        if(q==7){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SKULLS.png")));
            op1.setText("Skulls"); //corr
            op2.setText("Official");
            op3.setText("Boot");
            ac1();
        }
        //Pregunta 8-------------------------
        if(q==8){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SIGNALBOOT.png")));
            op1.setText("School"); 
            op2.setText("Pen");
            op3.setText("Signal boot");//corr
            ac3();
        }
        //Pregunta 9-------------------------
        if(q==9){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/CAR.png")));
            op1.setText("Car"); //corr
            op2.setText("Zoo");
            op3.setText("Room");
            ac1();
        }
        //Pregunta 10-------------------------
        if(q==10){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SPEENDOMETER.png")));
            op1.setText("Look"); 
            op2.setText("Spendometer");//corr
            op3.setText("Computer");
            ac2();
        }
           
        
        
    }
public void imagen_bebe(){
        
        //Pregunta 1-------------------------
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/TOYS.png")));
            op1.setText("Heat"); 
            op2.setText("Stomach");
            op3.setText("Toys");//corr
            ac3();
        }
        //Pregunta 2-------------------------
        if(q==2){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/T-SHIRT.png")));
            op1.setText("T-shirt"); //corr
            op2.setText("Eyes");
            op3.setText("Computer");
            ac1();
        }
        //Pregunta 3-------------------------
        if(q==3){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/DRESS.png")));
            op1.setText("T-shirt"); 
            op2.setText("Dress");//corr
            op3.setText("Toys");
            ac2();
        }
        //Pregunta 4-------------------------
        if(q==4){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/ARMCHAIR.png")));
            op1.setText("Children"); 
            op2.setText("Secret");
            op3.setText("Armchair");//corr
            ac3();
        }
        //Pregunta 5-------------------------
        if(q==5){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/FURNITURE.png")));
            op1.setText("Love"); 
            op2.setText("Music");
            op3.setText("Furniture");//corr
            ac3();
        }
        //Pregunta 6-------------------------
        if(q==6){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/PACIFIER.png")));
            op1.setText("Pen"); 
            op2.setText("Pacifier");//corr
            op3.setText("Book");
            ac2();
        }
        //Pregunta 7-------------------------
        if(q==7){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/WOODY HOURSE.png")));
            op1.setText("Woody hourse"); //corr
            op2.setText("Hour");
            op3.setText("Dog");
            ac1();
        }
        //Pregunta 8-------------------------
        if(q==8){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/MILK POWDER.png")));
            op1.setText("Cat"); 
            op2.setText("Bottle");
            op3.setText("Milk powder");//corr
            ac3();
        }
        //Pregunta 9-------------------------
        if(q==9){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/DEAPERS.png")));
            op1.setText("Diaper"); //corr
            op2.setText("Speendometer");
            op3.setText("Look");
            ac1();
        }
        //Pregunta 10-------------------------
        if(q==10){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/jumpers.png")));
            op1.setText("Beaty"); 
            op2.setText("Jumpers");//corr
            op3.setText("D");
            ac2();
        }
           
        
        
    }
public void imagen_optica(){
        
        //Pregunta 1-------------------------
        if(q==1){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/GLASSES.png")));
            op1.setText("Mirror"); 
            op2.setText("Clock");
            op3.setText("Glasses");//corr
            ac3();
        }
        //Pregunta 2-------------------------
        if(q==2){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/EYE.png")));
            op1.setText("Eye"); //corr
            op2.setText("Nose");
            op3.setText("Stomach");
            ac1();
        }
        //Pregunta 3-------------------------
        if(q==3){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/LAMP.png")));
            op1.setText("Lips"); 
            op2.setText("Lamp");//corr
            op3.setText("Room");
            ac2();
        }
        //Pregunta 4-------------------------
        if(q==4){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/PATIENT.png")));
            op1.setText("Packet"); 
            op2.setText("Outside");
            op3.setText("Patient");//corr
            ac3();
        }
        //Pregunta 5-------------------------
        if(q==5){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/DESK.png")));
            op1.setText("Badroom"); 
            op2.setText("Mirror");
            op3.setText("Desk");//corr
            ac3();
        }
        //Pregunta 6-------------------------
        if(q==6){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SCREW.png")));
            op1.setText("Drunk"); 
            op2.setText("Screw");//corr
            op3.setText("Cat");
            ac2();
        }
        //Pregunta 7-------------------------
        if(q==7){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/OPTOMETRIC CHAR.png")));
            op1.setText("Optometric char"); //corr
            op2.setText("Tree");
            op3.setText("Table");
            ac1();
        }
        //Pregunta 8-------------------------
        if(q==8){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/NURSE.png")));
            op1.setText("Doctor"); 
            op2.setText("Teacher");
            op3.setText("Nurse");//corr
            ac3();
        }
        //Pregunta 9-------------------------
        if(q==9){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/OPTI..png")));
            op1.setText("Ophthalmologist"); //corr
            op2.setText("Nurse");
            op3.setText("Doctor");
            ac1();
        }
        //Pregunta 10-------------------------
        if(q==10){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/COMPUTER.png")));
            op1.setText("Bag"); 
            op2.setText("Computer");//corr
            op3.setText("Box");
            ac2();
        }
           
        
        
    }
public void imagen_belleza(){
        
        //Pregunta 1-------------------------
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SHELF.png")));
            op1.setText("Spray");
            op2.setText("Hair");
            op3.setText("Shelf"); //corr
            ac1();
        }
        //Pregunta 2-------------------------
        if(q==2){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/BRUSH.png")));
            op1.setText("Brush"); //corr
            op2.setText("Druck");
            op3.setText("Bad");
            ac1();
        }
        //Pregunta 3-------------------------
        if(q==3){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/CHAIR.png")));
            op1.setText("Cheese"); 
            op2.setText("Chair");//corr
            op3.setText("Boot");
            ac2();
        }
        //Pregunta 4-------------------------
        if(q==4){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/FLOWERS.png")));
            op1.setText("Plants"); 
            op2.setText("Food");
            op3.setText("Flowers");//corr
            ac3();
        }
        //Pregunta 5-------------------------
        if(q==5){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/HAIR DRYER.png")));
            op1.setText("Room"); 
            op2.setText("Car");
            op3.setText("Hair dryer");//corr
            ac3();
        }
        //Pregunta 6-------------------------
        if(q==6){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/HAIR IRON.png")));
            op1.setText("Iron"); 
            op2.setText("Hair iron");//corr
            op3.setText("Bag");
            ac2();
        }
        //Pregunta 7-------------------------
        if(q==7){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/MIRROR.png")));
            op1.setText("Mirror"); //corr
            op2.setText("Glasses");
            op3.setText("More");
            ac1();
        }
        //Pregunta 8-------------------------
        if(q==8){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SHAMPOO.png")));
            op1.setText("Ticher"); 
            op2.setText("Room");
            op3.setText("Shampoo");//corr
            ac3();
        }
        //Pregunta 9-------------------------
        if(q==9){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SPRAY.png")));
            op1.setText("Spray"); //corr
            op2.setText("Shampoo");
            op3.setText("Mirror");
            ac1();
        }
        //Pregunta 10-------------------------
        if(q==10){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/TOILET PAPER.png")));
            op1.setText("Spray"); 
            op2.setText("Toilte paper");//corr
            op3.setText("Paper");
            ac2();
        }
           
        
        
    }
    
//Rebeca //Rebeca //Rebeca //Rebeca  //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca 
//leo
public void palabra_casino(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/1.png")));
            op1.setText("token");//Corecta
            op2.setText("rulette");
            op3.setText("card"); 
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/2.png")));
            op1.setText("token"); 
            op2.setText("card");//Corecta
            op3.setText("target");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/3.png")));
            op1.setText("poker table");//Corecta 
            op2.setText("chess table");  
            op3.setText("poker game");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/4.png")));
            op1.setText("coin machine"); 
            op2.setText("money machine");
            op3.setText("slot machine");//Corecta
            ac3();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/5.png")));
            op1.setText("lever");//Corecta 
            op2.setText("lift");
            op3.setText("coin");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/6.png")));
            op1.setText("lamp"); 
            op2.setText("chandelier");//Corecta
            op3.setText("light"); 
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/7.png")));
            op1.setText("hat"); 
            op2.setText("Cap");//Corecta
            op3.setText("shoe");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/8.png")));
            op1.setText("roulette");//Corecta
            op2.setText("coin machine"); 
            op3.setText("bed");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/9.png")));
            op1.setText("chair");//Corecta
            op2.setText("table");
            op3.setText("bank"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/10.png")));
            op1.setText("clock"); //Corecta
            op2.setText("o'clock");
            op3.setText("bracelet"); 
            ac3();      
    }
}
public void libreria(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/11.png")));
            op1.setText("air machine");///Corecta
            op2.setText("air conditioner");
            op3.setText("fan"); 
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/12.png")));
            op1.setText("book case"); 
            op2.setText("shelf");//Corecta
            op3.setText("table");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/13.png")));
            op1.setText("books");//Corecta 
            op2.setText("magazines");  
            op3.setText("ebook");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/14.png")));
            op1.setText("book"); 
            op2.setText("card");
            op3.setText("offer");//Corecta
            ac3();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/15.png")));
            op1.setText("credit card");//Corecta 
            op2.setText("debit card");
            op3.setText("card");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/16.png")));
            op1.setText("keyboard"); 
            op2.setText("monitor");//Corecta
            op3.setText("TV"); 
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/17.png")));
            op1.setText("coin register"); 
            op2.setText("cash register");//Corecta
            op3.setText("money register");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/18.png")));
            op1.setText("ticket printer");//Corecta
            op2.setText("printer"); 
            op3.setText("ticket");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/19.png")));
            op1.setText("counter");//Corecta
            op2.setText("coin");
            op3.setText("book"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/20.png")));
            op1.setText("certification"); //Corecta
            op2.setText("master");
            op3.setText("advice"); 
            ac3();      
    }
}
public void telefoinia(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/21.png")));
            op1.setText("brand");///Corecta
            op2.setText("telephone");
            op3.setText("table"); 
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/22.png")));
            op1.setText("brand"); 
            op2.setText("cell phone");//Corecta
            op3.setText("tablet");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/23.png")));
            op1.setText("mica");//Corecta 
            op2.setText("adapter");  
            op3.setText("cell phone case");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/24.png")));
            op1.setText("tablet case"); 
            op2.setText("cell phone");
            op3.setText("cell phone case");//Corecta
            ac3();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/25.png")));
            op1.setText("tablet");//Corecta 
            op2.setText("ipod");
            op3.setText("celll phone");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/26.png")));
            op1.setText("walkman"); 
            op2.setText("tablet case");//Corecta
            op3.setText("cell phone"); 
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/27.png")));
            op1.setText("adapter"); 
            op2.setText("cell phone protector");//Corecta
            op3.setText("mica");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/28.png")));
            op1.setText("travel adapter");//Corecta
            op2.setText("car adaptter"); 
            op3.setText("airplane adpterr");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/29.png")));
            op1.setText("car adapter");//Corecta
            op2.setText("airplane adapterr");
            op3.setText("travel adaptter"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/30.png")));
            op1.setText("micro sd"); //Corecta
            op2.setText("usb");
            op3.setText("cd"); 
            ac3();      
    }
}
public void dulceria(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/31.png")));
            op1.setText("lolli pops");///Corecta
            op2.setText("gummies");
            op3.setText("bubble gum"); 
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/32.png")));
            op1.setText("lolli pops"); 
            op2.setText("bubble gum");//Corecta
            op3.setText("gummies");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/33.png")));
            op1.setText("gummies");//Corecta 
            op2.setText("bubble gum");  
            op3.setText("lolli pops");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/34.png")));
            op1.setText("lollipops"); 
            op2.setText("gummies");
            op3.setText("jelly");//Corecta
            ac3();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/35.png")));
            op1.setText("chocolate");//Corecta 
            op2.setText("cookies");
            op3.setText("gum");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/36.png")));
            op1.setText("jelly"); 
            op2.setText("cookies");//Corecta
            op3.setText("lolli pops"); 
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/37.png")));
            op1.setText("bubble gum"); 
            op2.setText("chewing gum machine");//Corecta
            op3.setText("cookies");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/38.png")));
            op1.setText("marzipan");//Corecta
            op2.setText("chococlate"); 
            op3.setText("pills");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/39.png")));
            op1.setText("pills");//Corecta
            op2.setText("cookies");
            op3.setText("mint"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/40.png")));
            op1.setText("sign"); //Corecta
            op2.setText("shelf");
            op3.setText("chewing gum machine"); 
            ac3();      
    }
}
public void bano(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/41.png")));
            op1.setText("mirror");///Corecta
            op2.setText("shelf");
            op3.setText("house"); 
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/42.png")));
            op1.setText("paper"); 
            op2.setText("toilet paper");//Corecta
            op3.setText("top");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/43.png")));
            op1.setText("washbasin");//Corecta 
            op2.setText("tube");  
            op3.setText("toilet");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/44.png")));
            op1.setText("handle"); 
            op2.setText("washbasin");
            op3.setText("cubicle");//Corecta
            ac3();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/45.png")));
            op1.setText("top");//Corecta 
            op2.setText("container");
            op3.setText("box");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/46.png")));
            op1.setText("container"); 
            op2.setText("toilet");//Corecta
            op3.setText("top"); 
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/47.png")));
            op1.setText("handle"); 
            op2.setText("plunger");//Corecta
            op3.setText("toilet");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/48.png")));
            op1.setText("drain");//Corecta
            op2.setText("plunger"); 
            op3.setText("handle");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/49.png")));
            op1.setText("handle");//Corecta
            op2.setText("drain");
            op3.setText("toilet paper"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/50.png")));
            op1.setText("tube"); //Corecta
            op2.setText("handle");
            op3.setText("drain"); 
            ac3();      
    }
}
//Aqui se escoejen las preguntas segun lo que se eligio en el modulo anterior;    
    public void pregunta_selec(){
        switch (eje1) {

            //Rebeca
            case 0:
                imagen_bebe();    break;
            
            case 1:
                imagen_banco();    break;
            //Rebeca
            case 2:
                imagen_belleza();          break;    
            
            case 3:
                libreria();  break;    
                
            case 4:
                imagen_cafeteria();    break;
            
            case 5:
                dulceria();    break;
                
            case 6:
                palabra_casino();    break;
                
            case 7:
                imagen_cine();         break;    
            
            case 8:
                imagen_ropa();         break;    
                
            case 9:
                imagen_computo();  break;    
            
            case 10:
                imagen_electronicos();  break;    
                
            case 11:
                imagen_comidafast();  break;    
            //Rebeca
            case 12:
                imagen_joyeria();          break;
            //Rebeca
            case 13:
                imagen_optica();           break;
            //Rebeca
            case 14:
                imagen_estacionamiento();  break;
                
            case 15:
                imagen_mascotas();  break;    
            
            case 16:
                imagen_restaurante();  break;    
                
            case 17:
                imagen_deportes();  break;    
                
            case 18:
                telefoinia();  break;    
                
            case 19:
                imagen_juguetes(); break;  
                
            case 20:
                imagen_videojuegos(); break;

            case 21:
                bano(); break;
                
                
            default: JOptionPane.showMessageDialog(null,"No se encontraron las preguntas;"); break;
        }
    }
    
/*        Estos son los numeros para el "swich"
0  Baby Shop  -----
1  Bank  -----
2  Beauty   ----
3  Book Shop
4  Cafetery -----
5  Candy Shop
6  Casino
7  Cinema  -----
8  Clothes Store   -.----
9  Computer Store  ------
10 Electronic  -----
11 Fast Food ----
12 Jewrly ----
13 Optic ----
14 Parking lot  ---
15 Pets -----
16 Restaurant
17 Sports -----
18 Telephone
19 Toy Shop  -----
20 Videogame Shop ----
21 WC
*/   
    
 
    


    
    /**
     * @param args the command line arguments
     */
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Cuestionario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bot_in;
    private javax.swing.JButton bMinimizar;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bot1;
    private javax.swing.JLabel cor1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lBarra;
    private javax.swing.JCheckBox op1;
    private javax.swing.JCheckBox op2;
    private javax.swing.JCheckBox op3;
    private javax.swing.ButtonGroup op_Cafeteria;
    private javax.swing.JLabel preg;
    private javax.swing.JLabel score_a;
    private javax.swing.JLabel score_e;
    // End of variables declaration//GEN-END:variables
}
