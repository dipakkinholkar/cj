import javax.swing.JFrame;
import javax.swing.JTextField;
public class JFrameClass 
{
public static void main(String args[])
{
JTextField t1=new JTextField();
t1.setSize(50,100);


JTextField t2=new JTextField();
t2.setSize(50,100);

JFrame f=new JFrame("Calculator"); 
f.setSize(600,600);
f.add(t1);
f.add(t2);




f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);  
f.setVisible(true);
}
}