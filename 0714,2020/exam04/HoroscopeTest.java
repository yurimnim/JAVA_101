package com.bit.exam04;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Horoscope extends JFrame {
	JTextField myBirthDay;
	JButton submit;
	JLabel mySign;
	JLabel myPersonality;
	JButton renew;
	
	public Horoscope() {
		//�ֿ� �ʼ��� �� �͵� ����
		JLabel jl = new JLabel("������ �Է��ϼ��� ex)7�� 14�� ==> 7/14");
		myBirthDay = new JTextField(20);
		submit = new JButton("���");
		mySign = new JLabel();
		myPersonality = new JLabel();
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		setLayout(new BorderLayout()); //����� �Է�ĭ�� ��ư�� ��ܿ� ��ġ�ؾ� �ϱ� ������
		// �ǳڿ� �� ��ҵ� �ֱ�
		p1.add(jl);
		p1.add(myBirthDay);
		p1.add(submit);
		p2.add(mySign);
		p2.add(myPersonality);
		p3.add(renew);
		
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		
		//��ư�� ���� �ɸ´� Action�� �߰�. 
		submit.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String bd = myBirthDay.getText();
				String mySignResult = getMySign(bd);
				mySign.setText(mySignResult);//�� 1�� ������� ���ڸ��� �ѷ��ݴϴ�.			
				String myPersonalityResult = getMyPersonality(mySignResult);
				myPersonality.setText(myPersonalityResult); //�� 2�� ������� ���ڸ��� �´� ������ �ѷ��ݴϴ�. 
				
			}
		});
		
		renew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myBirthDay.setText("");
				renew.setText("");
				myPersonality.setText("");
			}
		});
		
		setSize(600, 400);
		setVisible(true);			
	}

	protected String getMyPersonality(String mySignResult) {
		HashMap<String,String> ps = new HashMap <String,String>();
		ps.put("�����ڸ�", " â����, ������ �̹���, ������,\r\n" + 
				"\r\n" + 
				"�����й��ϸ鼭�� ������, ������,\r\n" + 
				"\r\n" + 
				"���� �Ǹ�, �����ϰ� ������, ģ���ϰ� ���ǹٸ� �µ�\r\n");
		ps.put("������ڸ�", "ǳ���ϰ� �ΰ��� ����, ������, ������ �� ��,\r\n" + 
				"\r\n" + 
				"ģ���ϰ� �������� ����, ��ȭ��, ���ǹٸ� �µ�,\r\n" + 
				"\r\n" + 
				"�α���, �پ �𺯷°� ����\r\n");
		
		String myP = ps.get(mySignResult);
		return myP;
	}

	protected String getMySign(String bd) {
		int month, day;
		String[] arr = bd.split("/");
		month = Integer.parseInt(arr[0]);
		day = Integer.parseInt(arr[1]);
		
		String mySignst = "";
		switch(month) {
			case 1:if(day < 20) {
				mySignst = "�����ڸ�"; break;
			}else {
				mySignst = "�����ڸ�"; break;
			}	
			case 2: if(day < 20) {
				mySignst = "�����ڸ�"; break;
			} else {
				mySignst = "������ڸ�"; break;
			}
			
	}
		return mySignst;
 }
}

public class HoroscopeTest {
	public static void main(String[] args) {
		Horoscope h = new Horoscope();
	}

}
