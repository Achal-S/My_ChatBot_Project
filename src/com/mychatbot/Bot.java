package com.mychatbot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame {
	
	private JTextArea txtChat= new JTextArea();
	private JTextField txtEnter= new JTextField();
	
	public Bot(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("My ChatBot");
		
		txtEnter.setLocation(2,540);
		txtEnter.setSize(590,30);
		this.add(txtEnter);
		
		txtChat.setLocation(20,0);
		txtChat.setSize(550,540);
		this.add(txtChat);
		
		txtEnter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String uText= txtEnter.getText();
				txtChat.append("You :" + uText+ "\n");
				response("Hello");
				txtEnter.setText("");
				
			}
		});
		
	}
public static void main(String[] args) {
	new Bot();
}

public void response(String s){
	txtChat.append("Bot:"+ s + "\n");
	
}
}
