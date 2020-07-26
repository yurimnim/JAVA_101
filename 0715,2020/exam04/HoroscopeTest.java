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
						renew = new JButton("다시보기");
						
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
							mySign.setText("");
							myPersonality.setText("");
						}
					});
				
					setSize(600, 400);
					setVisible(true);			
			}

	protected String getMyPersonality(String mySignResult) {
				HashMap<String,String> ps = new HashMap <String,String>();
					ps.put("물병자리", " 대체적으로 의리가 강하고, 친절하며, 함부로 행동하지 않는다고 해요\n" + 
							"\n" + "타인을 존경하고 예의를 잘 갖추며, 인생을 안정적으로 꾸리려고 한답니다\n" + 
							"\n" + "하지만 자기표현방식이 서툴러 이론이나 법칙에 철두철미하며\n" + 
							"\n" + "음식 및 의상면에서 까다로운 면이 있으며, 성격이 예민하고 내성적인 편이랍니다.");
					
					ps.put("물고기자리", "매우 친절하며 예의를 중요시여기고, 동정심또한 엄청 강하답니다\n" + 
							"\n" + "재주가 좋고 언어력이 뛰어나 이성에게 인기가 많으며, "
									+ "인생을 활기차고 생동감 넘치게 사는편이랍니다.\n" + 
							"\n" + "하지만, 비현실적이며 주위의 감정따위는 중요하게 생각하지 않아\n" + 
							"\n" + "충동적, 본능적으로 행동하며 신경이 매우 예민하답니다.");
					
					ps.put("양자리" , "홀로서기를 좋아하며 현실에 충실하고, 지도력이 뛰어나 목표하는 일이 생기면\n" + 
							"\n" + "일을 향해서 직선적으로 돌진하는 끈기가 많아요\n" + "\n" + 
							"하지만, 주변에서 하는 잔소리나 명령을 싫어하고 자기주장이 강하며\n" + 
							"\n" + "화가 나면 공격적으로 돌변하여 독자적으로 행동하며, "
									+ "혼자 살더라도 외로움을 못느낀다고 합니다.\n" + "\n");
					
					ps.put("황소자리", "손재주가 뛰어나고 머리가 매우 명석하여 "
							+ "재물을 다루는 능력이 탁월해 풍족한 인생을 꾸려나갑니다\n" + 
							"\n" +"하지만, 자기 눈에 비친 한가지면만 보고 행동하는 경향이 있어\n" + "\n" + 
							"비현실적인 행동을 많이 하며 고집이 상당히 세다고 합니다.");
					
					ps.put("쌍둥이자리", "사람을 좋아하여 잘 사귀며, 타인의 마음을 "
							+ "대변하는 능력이 뛰어나며\n" + "\n" + 
							"주변사람들과 항상 소통하고 따뜻한 배려로 사람과의 관계를 잘 유지하는 편이예요\n" + 
							"\n" + "하지만, 생각이 많고 명석하여 잘못하면 피상적인 생각에 빠져들기 쉬우며\n" + 
							"\n" + "먹고 마시는 일에는 관심이 없고, "
									+ "행동이 가벼우며 호기심이 지나치게 많은 편이랍니다.");
					
					ps.put("게자리", "대체적으로 가정적이며 사랑이 풍부하고, "
							+ "돈도 함부로 사용치 않아 생활에 있어\n" + "\n" + 
							"필요한 것을 빨리 습득하는 편이랍니다\n" + "\n" + 
							"하지만, 자신이 옳다고 생각하는 것만 고집하며 음주가무를 좋아하고,\n" + 
							"\n" + "대인관계에 있어서 유연성이 없고, 자기중심적이라고 합니다.");
					
					ps.put("사자자리", "능력이 뛰어나고 개성이 강해 모든면에 있어 승진이나 출세가 빠르고 "
							+ "목표가 있으면\n" + "\n" + "그것에 대해 도전정신이 강하며, "
									+ "개방적이고 솔직한 성격으로 존경을 많이 받는다\n" + 
							"\n" + "하지만, 지나치게 활력적이고 자기중심적이며 주변사람들을 많이 피곤하게 하며\n" + 
							"\n" + "본인의 뽐내기를 좋아하여 가정생활면에서는 만족감을 잘 못느끼는 편이랍니다.");
					
					ps.put("처녀자리", "자신을 내세우지 않는 미덕을 지니고 있으며, 성실하여 자신의 일을 잘 처리하고\n" + 
							"\n" + "예술적 감각이 뛰어나고, 봉사정신 또한 투철하다\n" + "\n" + 
							"하지만, 자신이 해결할 수 없는 큰일은 포기하는 경향이 많으며\n" + 
							"\n" + "심신이 미약해 잔병치례가 많고, 질서가 흐트러지면 이해하기 어려워하는 성향이 있다고 해요.");
					
					ps.put("처녀자리", "자신을 내세우지 않는 미덕을 지니고 있으며, 성실하여 자신의 일을 잘 처리하고\n" + 
							"\n" + "예술적 감각이 뛰어나고, 봉사정신 또한 투절하다\n" + 
							"\n" + "하지만, 자신이 해결할 수 없는 큰일은 포기하는 경향이 많으며\n" + 
							"\n" + "심신이 미약해 잔병치례가 많고, 질서가 흐트러지면 이해하기 어려워하는 성향이 있다고 해요.");
					
					ps.put("천칭자리", "성품이 명량하여 사람들을 잘 사귀며, 우아하고 세련미가 넘치고,\n" + "\n" + 
							"목표의식이 확실히 목표를 달성하기 위해 끈임없이 도전하며, 인관관계의 조화를 중요하게 생각한다\n" + 
							"\n" + "하지만, 사람간의 인물을 많이 따지는 편이며 육체적인 희생정신이 약하다고 합니다.");
					
					ps.put("전갈자리", "이성을 사로잡은 매력이 넘치며, 돈을 함부로 낭비하지 않으며\n" + "\n" + 
							"관심이 있는 분야가 생기면 최선을 다하고 능력을 키워나가는 편이예요\n" +  "\n" + 
							"하지만, 지배하려는 성품이 있으며 매우 보수적이고 이성에 대한 집착이나\n" + 
							"\n" + "놀이를 좋아하며, 죽음에 관련된 일이나 생각에 집중을 하기도 하답니다.");
					
					ps.put("사수자리", "친근함과 유쾌함으로 주위 사람들에게 인기가 많으며, "
							+ "임기응변에 강하고 재주가 많아\n" + 
							"\n" +"말 또한 함부로 하지 않으며, 두뇌가 총명하답니다\n" + "\n" + 
							"하지만, 이성간에 자기본위적이고 음주가무를 좋아하며, 자신의 말과 행동이 모순되어도\n" + 
							"\n" + "그것을 인지하지 못한다고 합니다.");
					
					ps.put("염소자리", "자기 절제가 뛰어나며, 머리가 비상해 나이가 들면서 "
							+ "야심도 발전하고 직위도 높아진다고 해요\n" + 
							"\n" + "고상, 정숙하며 안전주의적이므로 낭비하는 것 또한 싫어한다고 합니다.\n" + "\n" + 
							"하지만, 이성과 결혼을 함에 이어서 돈과 배경을 중요하게 생각하며,\n" + "\n" + 
							"아닌 점에 있어서 타인을 비판하기도 하고, 계산적이고 타협을 싫어한다고 한답니다.");
			
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
						mySignst = "염소자리";break;
					}else {
						mySignst = "물병자리";break;
					}	
					case 2: if(day < 20) {
						mySignst = "물병자리";break;
					} else {
						mySignst = "물고기자리";break;
					}
					case 3: if(day < 21) {
						mySignst = "물고리자리";break;
					} else {
						mySignst = "양자리";break;
					}
					case 4: if(day < 20) {
						mySignst = "양자리";break;
					} else {
						mySignst = "황소자리";break;
					}
					case 5: if(day < 21) {
						mySignst = "황소자리";break;
					} else {
						mySignst = "쌍둥이자리";break;
					}
					case 6: if(day < 22) {
						mySignst = "쌍둥이자리";break;
					} else {
						mySignst = "게자리";break;
					}
					case 7: if(day < 23) {
						mySignst = "게자리";break;
					} else {
						mySignst = "사자자리";break;
					}
					case 8: if(day < 23) {
						mySignst = "사자자리";break;
					} else {
						mySignst = "처녀자리";break;
					}
					case 9: if(day < 23) {
						mySignst = "처녀자리";break;
					} else {
						mySignst = "천칭자리";break;
					}
					case 10: if(day < 23) {
						mySignst = "천칭자리";break;
					} else {
						mySignst = "전갈자리";break;
					}
					case 11: if(day < 23) {
						mySignst = "전갈자리";break;
					} else {
						mySignst = "사수자리";break;
					}
					case 12: if(day < 25) {
						mySignst = "사수자리";break;
					} else {
						mySignst = "염소자리";break;
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
