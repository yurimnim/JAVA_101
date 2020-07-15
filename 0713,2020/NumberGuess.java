package com.bit.exam06;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	JTextField jtf01;
	JTextField jlb01;
	int com; 
	int cnt;
	Random r;
	
	public MyFrame() {
		r = new Random();
		setTitle("숫자알아맞추기");
		com = r.nextInt(100)+1;
		setLayout(new GridLayout(3,0));
		jtf01 = new JTextField(5);
		jlb01 = new JTextField(15);
		JButton btn01 = new JButton("새 게임");
		JButton btn02 = new JButton("종료");

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
				
		p1.add(new JLabel("숫자를 추측하시오"));
		p1.add(jtf01);
		p2.add(jlb01);
		p3.add(btn01);
		p3.add(btn02);	
		
		add(p1);
		add(p2);
		add(p3);
		//Actionlisteners
		
		jtf01.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt++;
				setTitle(cnt +"번 시도함");
				int user = Integer.parseInt(jtf01.getText());
				if(user < com) {
					jlb01.setText(" 너무 낮습니다 ");
					jlb01.setBackground(Color.CYAN);
				}else if(user > com) {
					jlb01.setText(" 너무 높습니다 ");
					jlb01.setBackground(Color.RED);
				}else {
					jlb01.setText(" 정답!축하합니다! ");
					jlb01.setBackground(Color.YELLOW);
				}
			}
		});		
		btn01.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				com = r.nextInt(100)+1;
				jtf01.setText("");
				jlb01.setText("");
				jlb01.setBackground(Color.WHITE);
				cnt = 0;
			}
		});
		btn02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
		setSize(350, 150);
		setVisible(true);
	}
}


public class NumberGuess {
	public static void main(String[] args) {
		new MyFrame();

	}

}
