import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletExample extends Frame implements ActionListener
{   
	// no window closing, you can write extra

	// creating reference variables
	Label lab1;
	TextField tf1, tf2, tf3;
	Button btn;
	// constructor
	public AppletExample( )
	{
		setLayout(new GridLayout(4,2,10,15));

		// 3 rows, 2 columns, 10 Hgap, 15 Vgap

		// filling the gaps with yellow color
		setBackground(Color.yellow);

		// Label is a component like a Button
		lab1= new Label("Enter User Name");

		// creating text fields
		tf1 = new TextField(15);
		tf2 = new TextField(15);
		tf3 = new TextField("I Display",15);  

		btn = new Button("VALIDATE");
		// registering text field with AL
		btn.addActionListener(this);

		// beautification(optional)
		tf2.setEchoChar('*');          // displayed as *
		tf3.setEditable(false);         // user cannot enter anything
		tf3.setBackground(Color.cyan);
		tf3.setForeground(Color.blue);
		tf3.setFont(new Font("Monospaced", Font.BOLD, 25));

		// adding components, order is important
		add(lab1);
		add(tf1);
		// adding anonymous label
		add(new Label("Enter Password"));
		add(tf2);

		add(new Label("CLICK HERE"));
		add(btn);


		add(new Label("Result"));
		add(tf3);

		setTitle("Validating User name and Password ");
		setSize(300,200);
		setVisible(true);
	}

	// override the only abstract method of AL
	public void actionPerformed(ActionEvent e)
	{
		// to read what the user entered
		String s1 = tf1.getText();  
		String s2 = tf2.getText();
		// validation
		if(s1.equalsIgnoreCase("snrao")&&(s2.equalsIgnoreCase("java")))
		{
			// displaying in text field
			tf3.setText("VALID");  
			tf3.setBackground(Color.green);
		}
		else
		{
			tf3.setText("INVALID");
			tf3.setBackground(Color.red);
		}
	}  // close of actionPerformed( )

	public static void main(String[] args)
	{
		new AppletExample();
	}
}
