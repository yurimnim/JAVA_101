package com.bit.exam07;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame{
	private JTextField jt01;
	private JButton btn1;
	private JButton btn2;
	private JLabel jl1;
	
	public MyFrame(String s) {
		super(s);
		jt01 = new JTextField(8);
		btn1 = new JButton("새 게임");
		btn2 = new JButton("종료");
		jl1 = new JLabel();
		jl1.setOpaque(true);
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		
		setLayout(new BorderLayout());
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		add(p4, BorderLayout.EAST);
		add(p5, BorderLayout.WEST);
		
		p1.setLayout(new FlowLayout());
		p1.add(new Label("숫자를 추측하시오 : "));
		p1.add(jt01);
		
		p2.setLayout(new FlowLayout());
		p2.add(jl1);
		
		p3.setLayout(new FlowLayout());
		p3.add(btn1);
		p3.add(btn2);
		
	
		setSize(400, 150);
		setVisible(true);
		game();
	
		btn1.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				//new MyFrame("숫자게임"); 질문
				//game()
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0); // 와일문 탈출할 방법 질문
			}
		});
	}
	
	public void game() {
		Random rand = new Random();
		int com = rand.nextInt(100)+ 1;
		
		while(true) {
			try {
				Thread.sleep(3000);	
				System.out.println("runnung......");
				if(jt01.getText().trim().length()==0) {
					continue;
				}
			    int user = Integer.parseInt(jt01.getText().trim());
				System.out.println("com:"  + com + " user:" + user);
			    if(com == user) {
					jl1.setBackground(Color.CYAN);
					jl1.setText("정답!! (컴퓨터  : " + com+ " )");
					break;
				}
				if(user-com >= 50) {
					jl1.setBackground(Color.RED);
					jl1.setText("너무 높아요");
					
				}
				else if(user-com > 0 && user-com <50) {
					jl1.setBackground(Color.PINK);
					jl1.setText("높아요");
				}
				else if(com-user >= 50) {
					jl1.setBackground(Color.GREEN);
					jl1.setText("너무 낮아요");
				}
				else if(com-user > 0 && com-user <50) {
					jl1.setBackground(Color.green);
					jl1.setText("낮아요");
				}				
		   } catch (Exception e) {
			   System.out.println("예외발생" + e.getMessage());
			   //continue; // null 오류 안나는 방법 질문
			 }
	}
		
 }
}

public class Programing04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new MyFrame("숫자게임");
	}

}
