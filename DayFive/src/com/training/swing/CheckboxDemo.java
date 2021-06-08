package com.training.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckboxDemo extends JFrame implements ItemListener
{
	
	private static final long serialVersionUID = 1L;
	JTextField tf ;
	JCheckBox namebox, boldbox, italicbox ;

	public CheckboxDemo( )
	{
		Container c = getContentPane( ); 	
		c.setLayout(new FlowLayout( ));
		// create the text field
		tf = new JTextField("J2EE or .NET; which will be popular", 30);
		c.add(tf);
		// create JCheckBox objects
		namebox = new JCheckBox("Monospaced");
		c.add(namebox);		

		boldbox = new JCheckBox("Bold"); // Bold will be displayed 
		c.add(boldbox);		   // besides the checkbox

		italicbox = new JCheckBox("Italic");
		c.add(italicbox);		
		// register each checkbox with ItemListener
		namebox.addItemListener(this);
		boldbox.addItemListener(this);
		italicbox.addItemListener(this);

		addWindowListener( new WindowAdapter( )
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		} ) ;

		setTitle("Learning JButton");
		setSize(400,200);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		String fontname = "";  // some compilers will raise error if local variables

		int b = 0, i = 0 ;	// are not initialized

		if(namebox.isSelected( ) )
			fontname = "Monospaced";
		else
			fontname = "Serif";

		if(boldbox.isSelected( ) )
			b = Font.BOLD;
		else
			b = Font.PLAIN;

		if(italicbox.isSelected( ) )
			i = Font.ITALIC;
		else
			i = Font.PLAIN;

		Font f = new Font(fontname, b + i , 15);			
		tf.setFont( f );  // setting a font to the text in the text field
	}

	public static void main( String args[ ] )
	{
		new CheckboxDemo( ) ;
	}
}

