package com.bit.exam05;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class ButtonFrame extends JFrame implements ActionListener {
	JButton btn01;
	JButton btn02;
	JTextField jtf01;
	
	public ButtonFrame() {
		setLayout(new FlowLayout());
		btn01 = new JButton("여자");
		btn02 = new JButton("남자");
		jtf01 = new JTextField(20);
		
		btn01.addActionListener(this);;
		btn02.addActionListener(this);;
		
		add(btn01);
		add(btn02);
		add(jtf01);
		
		setSize(500,200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		jtf01.setText(cmd + " 버튼을 눌렀습니다.");	
	}
}


public class ButtonTest {	
	public static void main(String[] args) {
		new ButtonFrame();

	}

}
