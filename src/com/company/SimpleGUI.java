package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
  private JButton button  = new JButton("Нажми");
  private JTextField input = new JTextField("",5);
  private JLabel label = new JLabel("Введите:");
  private JRadioButton radio1= new JRadioButton("Выбирите это");
  private JRadioButton radio2= new JRadioButton("Выбирите эту");
  private JCheckBox check= new JCheckBox("Chek",false);

  public SimpleGUI () {
      super("Пример");
      this.setBounds(100,100,250,100);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Container container = this.getContentPane();
      container.setLayout(new GridLayout(3,2,2,2));
      container.add(label);
      container.add(input);
      ButtonGroup group = new ButtonGroup();
      group.add(radio1);
      group.add(radio2);
      container.add(radio1);
      radio1.setSelected(true);
      container.add(radio2);
      container.add(check);
      button.addActionListener(new ButtonEvent());
      container.add(button);
  }

  class ButtonEvent implements ActionListener {
      public void actionPerformed (ActionEvent e){
          String message = "";
          message +="Button was pressend\n";
          message +="Text is " + input.getText() + "\n";
          message +=(radio1.isSelected() ? "Raddio #1" : "Raddio 2") + "is selected! \n";
          message += "Chekbox is " + ((check.isSelected()) ? "checked" : "unCkecked \n");
          JOptionPane.showMessageDialog(null, message, "output", JOptionPane.PLAIN_MESSAGE);
      }
  }
}
