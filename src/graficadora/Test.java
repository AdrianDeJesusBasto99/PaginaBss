import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.InputMismatchException;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Test extends JFrame {
        JPanel contentpane;
        JTextField text1, text2, text3;

        public Test (){
            JFrame f = new JFrame("Menu");
            JButton button1 = new JButton("a: y = 2x");
            button1.setBounds(30, 30, 100, 50);
            JButton button2 = new JButton("b: y = 2x");
            button2.setBounds(30, 90, 100, 50);
            JButton button3 = new JButton("c: y = 2x + 4");
            button3.setBounds(30, 150, 100, 50);
            JButton button4 = new JButton("d: y = 3x");
            button4.setBounds(30, 210, 100, 50);
            JButton button5 = new JButton("e: h(x) = x + 2");
            button5.setBounds(30, 270, 100, 50);
            JButton button6 = new JButton("f: y = x²");
            button6.setBounds(30, 330, 100, 50);
            JButton button7 = new JButton("g: y = √16-x²");
            button7.setBounds(30, 390, 100, 50);
            JButton button8 = new JButton("h: y = √225+9x²/25");
            button8.setBounds(30, 450, 100, 50);
            setBounds(300, 300, 450, 300);
            f.add(button1);
            f.add(button2);
            f.add(button3);
            f.add(button4);
            f.add(button5);
            f.add(button6);
            f.add(button7);
            f.add(button8);
            f.setSize(800,800);  
            f.setLayout(null);  
            f.setVisible(true);   

            ActionListener event1 = new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae){
                    JOptionPane.showMessageDialog(null, "A");
                }
            };
    
            button1.addActionListener(event1);

            ActionListener event2 = new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae){
                    JOptionPane.showMessageDialog(null, "B");
                }
            };
    
            button2.addActionListener(event2);

            ActionListener event3 = new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae){
                    JOptionPane.showMessageDialog(null, "C");
                }
            };
    
            button3.addActionListener(event3);

            ActionListener event4 = new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae){
                    JOptionPane.showMessageDialog(null, "D");
                }
            };
    
            button4.addActionListener(event4);

            ActionListener event5 = new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae){
                    JOptionPane.showMessageDialog(null, "E");
                }
            };
    
            button5.addActionListener(event5);

            ActionListener event6 = new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae){
                    JOptionPane.showMessageDialog(null, "F");
                }
            };
    
            button6.addActionListener(event6);

            ActionListener event7 = new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae){
                    JOptionPane.showMessageDialog(null, "G");
                }
            };
    
            button7.addActionListener(event7);

            ActionListener event8 = new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae){
                    JOptionPane.showMessageDialog(null, "H");
                }
            };
    
            button8.addActionListener(event8);
        }
    public static void main(String[] args) {
        Test w = new Test();

    }
}
