package com.training.jdbc;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	
	private JLabel usernameLbl, passwordLbl, note;
	private JTextField username, password;
	
	private JButton login;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	public LoginForm() {
		Connection conn=null;
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver"); //Driver name
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/example","debian-sys-maint","a48qIJwnTfPENyKp");
			
			if(conn != null) {
				System.out.println("Connected");
				this.conn = conn;
			}
			else
				System.out.println("Not conencted");
		} //catch (ClassNotFoundException e) {
			//System.out.println(e.getMessage());
	//	} 
	catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
		}
		
		usernameLbl = new JLabel("Username :");
		passwordLbl = new JLabel("Password: ");
		note = new JLabel("");
		
		username = new JTextField("", 15);
		password = new JPasswordField("",15);
		
		login = new JButton("Login");
		login.addActionListener(this);
		GridBagLayout layout = new GridBagLayout();
		
		this.setLayout(layout);
		GridBagConstraints con = new GridBagConstraints();
		
		con.gridx = 0;
        con.gridy = 0; 
        
		this.add(usernameLbl, con);
		
		con.gridx = 1;
        con.gridy = 0;
		
		this.add(username, con);
		con.gridx = 0;
        con.gridy = 1;
		
		this.add(passwordLbl, con);
		con.gridx = 1;
        con.gridy = 1;
		
		this.add(password, con);
		con.gridx = 2;
        con.gridy = 1;
		
		this.add(login, con);
		this.add(note);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
	}
	
	public static void main(String... args) {
		new LoginForm().setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		try {
		pstmt = conn.prepareStatement("select * from login where usernm=?");
		pstmt.setString(1, this.username.getText());
		rs = pstmt.executeQuery();
		if(rs.next()) {
			//String uname = rs.getString("usernm");
			String pass = rs.getString("pass");
			if(pass.equals(this.password.getText())) {
				note.setText("Login success");
			}
		}else {
			note.setText("Incorrect credentials.");
		}
		}catch (Exception em) {
		}
	
	}

}
