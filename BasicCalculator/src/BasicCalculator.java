import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Calculator extends JFrame  implements ActionListener {





    Calculator() {
        JFrame Frame = new JFrame();

        Frame.setTitle("Basic Calculator");
        Frame.setSize(580, 580);
        Frame.setLayout(new GridLayout(5, 3));
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.getContentPane().setBackground(new Color(110, 115, 125));
        Frame.setResizable(false);


        JButton Button0 = new JButton("0");
        JButton Button1 = new JButton("1");
        JButton Button2 = new JButton("2");
        JButton Button3 = new JButton("3");
        JButton Button4 = new JButton("4");
        JButton Button5 = new JButton("5");
        JButton Button6 = new JButton("6");
        JButton Button7 = new JButton("7");
        JButton Button8 = new JButton("8");
        JButton Button9 = new JButton("9");
        JButton ButtonClr = new JButton("Clear");
        JButton ButtonPnt = new JButton(".");
        JButton ButtonEquals = new JButton("=");

        Frame.add(Button0);
        Frame.add(Button1);
        Frame.add(Button2);
        Frame.add(Button3);
        Frame.add(Button4);
        Frame.add(Button5);
        Frame.add(Button6);
        Frame.add(Button7);
        Frame.add(Button8);
        Frame.add(Button9);
        Frame.add(ButtonClr);
        Frame.add(ButtonPnt);
        Frame.add(ButtonEquals);
        Button0.setFocusable(false);
        Button1.setFocusable(false);
        Button2.setFocusable(false);
        Button3.setFocusable(false);
        Button4.setFocusable(false);
        Button5.setFocusable(false);
        Button6.setFocusable(false);
        Button7.setFocusable(false);
        Button8.setFocusable(false);
        Button9.setFocusable(false);
        ButtonClr.setFocusable(false);
        ButtonPnt.setFocusable(false);
        ButtonEquals.setFocusable(false);
        Button0.setBackground(new Color(5, 11, 15));
        Button1.setBackground(new Color(5, 11, 15));
        Button2.setBackground(new Color(5, 11, 15));
        Button3.setBackground(new Color(5, 11, 15));
        Button4.setBackground(new Color(5, 11, 15));
        Button5.setBackground(new Color(5, 11, 15));
        Button6.setBackground(new Color(5, 11, 15));
        Button7.setBackground(new Color(5, 11, 15));
        Button8.setBackground(new Color(5, 11, 15));
        Button9.setBackground(new Color(5, 11, 15));
        ButtonClr.setBackground(new Color(5, 11, 15));
        ButtonPnt.setBackground(new Color(5, 11, 15));
        ButtonEquals.setBackground(new Color(220, 100, 150));

        Button0.setForeground(new Color(240, 240, 240));
        Button1.setForeground(new Color(240, 240, 240));
        Button2.setForeground(new Color(240, 240, 240));
        Button3.setForeground(new Color(240, 240, 240));
        Button4.setForeground(new Color(240, 240, 240));
        Button5.setForeground(new Color(240, 240, 240));
        Button6.setForeground(new Color(240, 240, 240));
        Button7.setForeground(new Color(240, 240, 240));
        Button8.setForeground(new Color(240, 240, 240));
        Button9.setForeground(new Color(240, 240, 240));
        ButtonClr.setForeground(new Color(240, 240, 240));
        ButtonEquals.setForeground(new Color(240, 240, 240));
        ButtonPnt.setForeground(new Color(240, 240, 240));


        Frame.setVisible(true);


    }


    public static void main(String[] Args) {

        new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}