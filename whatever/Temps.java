import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
//import Temperatures.java;

public class Temps extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;
    
    public Temps() {
	this.setTitle("Temps GUI");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
	JButton CF = new JButton("To Fahrenheit");
	CF.addActionListener(this);
	CF.setActionCommand("CtoF");
	JButton FC = new JButton("To Celsius");
	FC.addActionListener(this);
	FC.setActionCommand("FtoC");
	t = new JTextField(10);
	j = new JLabel("Your answer: ");
	pane.add(CF);
	pane.add(FC);
	pane.add(j);
	pane.add(t);
    }
    public static double CtoF(double t){
	return t * 9 / 5 + 32;
    }
    public static double FtoC(double t){
	return (t - 32) * 5 / 9;
    }
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("CtoF")){
	    double temp = Double.parseDouble(t.getText());
	    j.setText("Your answer: " + CtoF(temp));
	}
	if (event.equals("FtoC")){
	    double temp = Double.parseDouble(t.getText());
	    j.setText("Your answer: " + FtoC(temp));
	}
    }
    public static void main(String[] args) {
	Temps g = new Temps();
	g.setVisible(true);
    }
}
	    
