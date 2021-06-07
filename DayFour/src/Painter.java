import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Painter extends Applet implements ActionListener{
private Label firstName, lastName, username, display;
private TextField first, last, uname;
private String gen;
private Button signup, reset;
private Checkbox male, female;
private CheckboxGroup gender;

@Override
public void init() {
	firstName = new Label("Enter first name: ");
	first = new TextField("", 20);
	
	lastName = new Label("Enter last name: ");
	last = new TextField("", 20);
	
	username = new Label("Enter username");
	uname =new TextField("", 20);
	
	gender = new CheckboxGroup();
	male = new Checkbox("Male", gender, false);
	female = new Checkbox("Female", gender, false);
	
	display = new Label("");
	
	
	signup = new Button("Sign up");
	
	reset = new Button("Reset");
	signup.addActionListener(this);
	reset.addActionListener(this);
	
	male.addItemListener(new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
		gen = "Male";	
		}
	});  
    female.addItemListener(new ItemListener() {  
        public void itemStateChanged(ItemEvent e) {               
        	gen = "Female";
        }  
     });  
	

	add(firstName);
	add(first);
	add(lastName);
	add(last);
	add(username);
	add(uname);
	add(male);
	add(female);
	add(signup);
	add(reset);
	add(display);
	
}

@Override
public void actionPerformed(ActionEvent e){
	
	if(e.getActionCommand().equals("Sign up")) {
		display.setText(this.first.getText() + " " 
	+ this.last.getText() + "Username: " + this.uname.getText() + "Gender: " + this.gen);
		this.first.setText("");
		this.last.setText("");
		this.uname.setText("");
	}if(e.getActionCommand().equals("Reset")) {
		this.first.setText("");
		this.last.setText("");
		this.uname.setText("");
	}
} 
}
