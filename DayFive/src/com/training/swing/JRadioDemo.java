package com.training.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JRadioDemo extends JFrame implements ItemListener
{
	private static final long serialVersionUID = 1L;
	JRadioButton shirtbut, pantbut, sareebut, brownbut, graybut, creambut ;

	public JRadioDemo( )
	{
	Container c = getContentPane( ); 	
	c.setLayout(new FlowLayout( ));

// to create ButtonGroup objects that group checkboxes
	ButtonGroup group1 = new ButtonGroup( ) ;
	ButtonGroup group2 = new ButtonGroup( ) ;

// first set of radio buttons for clothes selection
	shirtbut = new JRadioButton("Shirt");
	pantbut = new JRadioButton("Pant");
	sareebut = new JRadioButton("Saree");

// second set of radio buttons for color selection
	brownbut = new JRadioButton("Brown");
	graybut = new JRadioButton("Gray");
	creambut = new JRadioButton("Cream");		

// grouping the radio buttons
  // shirtbut, pantbut and sareebut are made into one group by name group1 of ButtonGroup class
	group1.add(shirtbut);
	group1.add(pantbut); 
	group1.add(sareebut);  

// for second group, group2
	group2.add(brownbut); 
	group2.add(graybut);
	group2.add(creambut);

// add individual radio buttons to the container
		c.add(shirtbut); 
		c.add(pantbut);
		c.add(sareebut);
		c.add(brownbut);
		c.add(graybut);
		c.add(creambut);

// register each radio button with the listener
		shirtbut.addItemListener(this);
		pantbut.addItemListener(this);
		sareebut.addItemListener(this);
		brownbut.addItemListener(this);
		graybut.addItemListener(this);
		creambut.addItemListener(this);
// for window closing
		addWindowListener( new 			WindowAdapter( )
			{
	     public void windowClosing(WindowEvent e)
	    {
		System.exit(0);
	    }
	} ) ;

		setTitle("Learning Radio Buttons");
		setSize(250,200);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
	String name = " ", color = " " ;  // two local variables

	if(shirtbut.isSelected( ) )
		name = "Shirt";
	else if(pantbut.isSelected( ) )
		name = "Pant";
	else if(sareebut.isSelected( ) )
		name = "Saree";

	if(brownbut.isSelected( ) )
		color = "Brown";
	else if(graybut.isSelected( ) )
		color = "Gray";
	else if(creambut.isSelected( ))
		color = "Cream";
		JOptionPane.showMessageDialog(null, "You wanted " + name + " in color " + color,  "Learning Applications", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main( String args[ ] )
	{
	               new JRadioDemo( ) ;
                   }
 }
