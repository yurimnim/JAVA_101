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
		//주요 필수로 들어갈 것들 생성
		JLabel jl = new JLabel("생일을 입력하세요 ex)7월 14일 ==> 7/14");
		myBirthDay = new JTextField(20);
		submit = new JButton("결과");
		mySign = new JLabel();
		myPersonality = new JLabel();
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		setLayout(new BorderLayout()); //사용자 입력칸과 버튼은 상단에 위치해야 하기 떄문에
		// 판넬에 각 요소들 넣기
		p1.add(jl);
		p1.add(myBirthDay);
		p1.add(submit);
		p2.add(mySign);
		p2.add(myPersonality);
		p3.add(renew);
		
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		
		//버튼에 따라 걸맞는 Action값 추가. 
		submit.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String bd = myBirthDay.getText();
				String mySignResult = getMySign(bd);
				mySign.setText(mySignResult);//라벨 1에 사용자의 별자리를 뿌려줍니다.			
				String myPersonalityResult = getMyPersonality(mySignResult);
				myPersonality.setText(myPersonalityResult); //라벨 2에 사용자의 별자리에 맞는 성격을 뿌려줍니다. 
				
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
		ps.put("물병자리", " 창의적, 지적인 이미지, 독립적,\r\n" + 
				"\r\n" + 
				"자유분방하면서도 공정함, 안정적,\r\n" + 
				"\r\n" + 
				"강한 의리, 차분하고 신중함, 친절하고 예의바른 태도\r\n");
		ps.put("물고기자리", "풍부하고 민감한 상상력, 직관적, 교감을 잘 함,\r\n" + 
				"\r\n" + 
				"친절하고 동정심이 많음, 온화함, 예의바른 태도,\r\n" + 
				"\r\n" + 
				"인기인, 뛰어난 언변력과 재주\r\n");
		
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
				mySignst = "염소자리"; break;
			}else {
				mySignst = "물병자리"; break;
			}	
			case 2: if(day < 20) {
				mySignst = "물병자리"; break;
			} else {
				mySignst = "물고기자리"; break;
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
