package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JLabel l1=new JLabel("Result: ");
        l1.setBounds(20,120,90,50);

        JRadioButton r1 = new JRadioButton("+",true);
        r1.setBounds(20, 80, 50, 50);

        JRadioButton r2 = new JRadioButton("-");
        r2.setBounds(80, 80, 50, 50);

        JRadioButton r3 = new JRadioButton("/");
        r3.setBounds(140, 80, 50, 50);

        JRadioButton r4 = new JRadioButton("*");
        r4.setBounds(200, 80, 50, 50);

        JTextField t1=new JTextField();
        t1.setBounds(20,50,80,20);

        JTextField t2=new JTextField();
        t2.setBounds(120,50,80,20);

        JButton button=new JButton("Submit");
        button.setBounds(20,170,90,50);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (r1.isSelected()){
                    int a=Integer.parseInt(t1.getText());
                    int b=Integer.parseInt(t2.getText());
                    int c= a+b;
                    l1.setText("Result: "+String.valueOf(c));

                }
                if (r2.isSelected()){
                    int a=Integer.parseInt(t1.getText());
                    int b=Integer.parseInt(t2.getText());
                    int c= a-b;
                    l1.setText("Result: "+String.valueOf(c));

                }
                if (r3.isSelected()){
                    int a=Integer.parseInt(t1.getText());
                    int b=Integer.parseInt(t2.getText());
                    int c= a/b;
                    l1.setText("Result: "+String.valueOf(c));

                }
                if (r4.isSelected()){
                    int a=Integer.parseInt(t1.getText());
                    int b=Integer.parseInt(t2.getText());
                    int c= a*b;
                    l1.setText("Result: "+String.valueOf(c));

                }
            }
        });

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.add(r1);
        frame.add(r2);
        frame.add(r3);
        frame.add(r4);
        frame.add(t1);
        frame.add(t2);
        frame.add(button);
        frame.add(l1);

    }
}
