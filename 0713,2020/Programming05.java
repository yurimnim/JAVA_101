package com.bit.exam08;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	String[] arr = {"���� ���� ��ȯ","�ڵ����ӱ� ���� ��ȯ","������ ���� ��ȯ", "Ÿ�̾� ��ȯ"};
	int[] price = {45000,80000,30000,100000};
	JCheckBox[] jcb;
	JLabel jlb01; 
	
	public MyFrame(){
	  jcb = new JCheckBox[arr.length];
	  jlb01 = new JLabel();
	  JPanel p1 = new JPanel();
	  JPanel p2 = new JPanel();
	  setLayout(new GridLayout(2,1));
	  for(int i=0;i<jcb.length;i++) {
		  jcb[i] = new JCheckBox(arr[i]);
		  p1.add(jcb[i]);
		  jcb[i].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				  int total = 0;
				for(int j=0;j<jcb.length;j++) {
					if(jcb[j].isSelected()) {
						total += price[j];	
					}		
				}
				jlb01.setText("��������� ������ " + total + " �� �Դϴ�.");
			}
		});
	  }
	  p2.add(jlb01);
	  add(p1);
	  add(p2);	  
	  setSize(600,300);
	  setVisible(true);
	}
}
public class Programming05 {
	public static void main(String[] args) {
		new MyFrame();

	}

}
