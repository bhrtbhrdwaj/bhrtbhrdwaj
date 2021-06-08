package com.training.swing;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameDemo2 {
	public static void main(String[] args) {
		JFrame jF=new JFrame();
		JButton btn=new JButton("Click");
		JTextField tf=new JTextField("", 15);
		btn.addActionListener(new ActionListener() {
		@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("Hello im back");
			}
		});
		jF.add(btn);
		jF.add(tf);
		
		jF.setSize(400,500);
		jF.setLayout(null);
		jF.setVisible(true);
	}
}