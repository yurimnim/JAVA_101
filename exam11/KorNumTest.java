package com.bit.exam11;
//0~9���� ���� �Է¹޾� �ѱ�ǥ����� ��� ��

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
		
		JLabel label = new JLabel("0���� 9���� ���� �Է��Ͻÿ�.");
		JTextField num = new JTextField(5);
		JTextField kor = new JTextField(20);	
		trans = new JButton("��ȯ");		
		add(label);
		add(num);
		add(trans);
		add(kor);
		
		String[] arr = {"��","��","��","��","��","��","��","ĥ","��","��"};
		trans.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(num.getText());
				try {
				kor.setText(arr[a]);
				}catch(Exception ex) {
					kor.setText("0���� 10���� ���ڸ� �Է°���!");
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
