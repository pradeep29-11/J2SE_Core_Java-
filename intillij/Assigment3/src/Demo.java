import javax.swing.*;
import java.awt.event.*;
public class Demo extends JFrame implements ActionListener
{
    JLabel l;
    JTextField tf;
    JButton b1,b2;

    Demo()
    {
        setLayout(null);
        l=new JLabel("Message : ");
        l.setSize(200,30);
        l.setLocation(50,30);
        add(l);

        tf=new JTextField(10);
        tf.setSize(200,30);
        tf.setLocation(150,30);
        add(tf);

        b1=new JButton("Show");
        b1.setSize(100,30);
        b1.setLocation(90,80);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Clear");
        b2.setSize(100,30);
        b2.setLocation(230,80);
        b2.addActionListener(this);
        add(b2);

        setSize(450,300);
        setLocation(300,250);
        setTitle("TCA");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String a=(String)ae.getActionCommand();

        if(a.contains("Show"))
        {
            tf.setText("I Love India");
        }
        if(a.equals("Clear"))
        {
            tf.setText("");
        }
    }
    public static void main(String[] args)
    {
        Demo ob = new Demo();
    }
}
