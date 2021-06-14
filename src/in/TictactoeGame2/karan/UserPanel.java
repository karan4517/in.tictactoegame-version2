/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.TictactoeGame2.karan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author karan
 */
public class UserPanel implements ActionListener {
    JFrame jf;
    JTextField jt1 , jt2;
    JButton jb;
    JLabel jl1 ,jl2;

    UserPanel() //constructor
    {
        jf=new JFrame("TicTacToe Game by Karan Gupta");
        
        jf.setSize(600, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        
        jl1=new JLabel("Enter player one : (x) ");
        jl1.setBounds(70, 80, 120, 40);
        jf.add(jl1);
        
        jt1=new JTextField();
        jt1.setBounds(200, 80, 250 , 40);
        jf.add(jt1);
        
          jl2=new JLabel("Enter player two : (0) ");
        jl2.setBounds(70, 150, 120, 40);
        jf.add(jl2);
        
        jt2=new JTextField();
        jt2.setBounds(200, 150, 250 , 40);
        jf.add(jt2);
        
        jb=new JButton("Start Game");
        jb.setBounds(200, 280,150 , 50);
        jb.addActionListener(this);
        jf.add(jb);
        
        jf.setVisible(true);
    }
    public static void main(String[] args)
    {
        new UserPanel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          if(e.getSource()==jb)
          {
              String player1=jt1.getText();
              String player2=jt2.getText();
              
             GamePanel gp= new GamePanel(player1 , player2);
             gp.openGamwPanel();
             jf.setVisible(false);
          }
    }
    }
