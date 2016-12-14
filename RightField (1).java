package Battleships;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RightField extends JPanel {
 
 JButton[][] jb = new JButton[15][15];
 
 public RightField(){
  init();
 }

 private void init() {
  setLayout(new BorderLayout());
  JLabel title = new JLabel("                                                            Player 2");
  add(title, BorderLayout.NORTH);
  
  JPanel middlePanel = new JPanel();
  middlePanel.setLayout(new GridLayout(15,15));
  for (int i = 0; i < 15; i++){
   for (int j = 0 ; j < 15; j++){
    jb[i][j] = new JButton();
    jb[i][j].setPreferredSize(new Dimension(10,10));
    middlePanel.add(jb[i][j]);
   }
  }
  
  add(middlePanel, BorderLayout.CENTER);
  
  JPanel bottomPanel = new JPanel();
  bottomPanel.setLayout(new GridLayout(1,2));
  
  bottomPanel.add(new JButton("Bomb buttons"));
  bottomPanel.add(new JButton("Cash and Done button"));
  
  
  
  add(bottomPanel, BorderLayout.SOUTH);
  
 }

}