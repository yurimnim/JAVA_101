package com.bit.exam11;
//0~9까지 수를 입력받아 한글표기식을 출력 ㄱ

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class KorNum extends JFrame{	
	JButton trans; 
	public KorNum() {
		setLayout(new FlowLayout());
		
		JLabel label = new JLabel("0부터 9까지 수를 입력하시오.");
		JTextField num = new JTextField(5);
		JTextField kor = new JTextField(20);	
		trans = new JButton("전환");		
		add(label);
		add(num);
		add(trans);
		add(kor);
		
		String[] arr = {"영","일","이","삼","사","오","육","칠","팔","구"};
		trans.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(num.getText());
				try {
				kor.setText(arr[a]);
				}catch(Exception ex) {
					kor.setText("0부터 10까지 숫자만 입력가능!");
				}
			}
		});		
		setSize(200, 500);
		setVisible(true);	
	}
}


public class KorNumTest {
	public static void main(String[] args) {
		new KorNum();
	}
}
