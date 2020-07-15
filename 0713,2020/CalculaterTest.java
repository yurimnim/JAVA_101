package com.bit.exam08;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calc extends JFrame {
	JTextField jtf01;
	int num1;
	int num2;
	int r;
	String op;
	
	public Calc() {
		setLayout(new BorderLayout());
		JPanel p2 = new JPanel();
		jtf01 = new JTextField(20);
		
		String[] arr = {"1","2","3","4","5","6","7","8","9","+","-","*","/","C","="};
		JButton[] btn = new JButton[arr.length]; 
		p2.setLayout(new GridLayout(4,4));
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(arr[i]);
			p2.add(btn[i]);
			
			btn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();					
						if(cmd.equals("+")||cmd.equals("-")||cmd.equals("*")||cmd.equals("/")) {
							num1 = Integer.parseInt(jtf01.getText());
							op = cmd;
							jtf01.setText("");							
						}else if(cmd.equals("=")) {
							num2 = Integer.parseInt(jtf01.getText());
							switch(op){
								case "+":r=num1+num2;break;
								case "-":r=num1-num2;break;
								case "*":r=num1*num2;break;
								case "/":r=num1/num2;break;
							}
							jtf01.setText(r+"");
						}else if(cmd.equals("C")) {
							num1 = 0;
							num2 = 0;
							op = "";
							jtf01.setText("");
						}else { 
							jtf01.setText(jtf01.getText() + cmd);
						}
				}
			});
		}
	
		add(jtf01,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p2);
	
		setSize(500, 200);
		setVisible(true);
		
	}
}

public class CalculaterTest {

	public static void main(String[] args) {
		new Calc();

	}

}
