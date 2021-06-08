package com.training.swing;


import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameDemo extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JLabel welcome, nameLbl;
	private JTextField name;
	private JButton btn;
	
	public LayoutManager layout;
	public void init() {
		welcome = new JLabel("Welcome!");
		nameLbl = new JLabel("Enter name: ");
		name = new JTextField("", 15);
		btn = new JButton("Show welcome message.");
		btn.addActionListener(this);
		layout = new FlowLayout();
		this.setLayout(layout);
		this.add(welcome);
		this.add(nameLbl);
		this.add(name);
		this.add(btn);
	}
	
	public FrameDemo() {
		this.init();
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String... args) {
		FrameDemo frame = new FrameDemo();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Show welcome message.")) {
			welcome.setText("Welcome, " + name.getText());
		}
		
	}
	
	
}
