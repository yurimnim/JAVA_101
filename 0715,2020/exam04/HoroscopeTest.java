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
						renew = new JButton("�ٽú���");
						
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
							mySign.setText("");
							myPersonality.setText("");
						}
					});
				
					setSize(600, 400);
					setVisible(true);			
			}

	protected String getMyPersonality(String mySignResult) {
				HashMap<String,String> ps = new HashMap <String,String>();
					ps.put("�����ڸ�", " ��ü������ �Ǹ��� ���ϰ�, ģ���ϸ�, �Ժη� �ൿ���� �ʴ´ٰ� �ؿ�\n" + 
							"\n" + "Ÿ���� �����ϰ� ���Ǹ� �� ���߸�, �λ��� ���������� �ٸ����� �Ѵ�ϴ�\n" + 
							"\n" + "������ �ڱ�ǥ������� ������ �̷��̳� ��Ģ�� ö��ö���ϸ�\n" + 
							"\n" + "���� �� �ǻ�鿡�� ��ٷο� ���� ������, ������ �����ϰ� �������� ���̶��ϴ�.");
					
					ps.put("������ڸ�", "�ſ� ģ���ϸ� ���Ǹ� �߿�ÿ����, �����ɶ��� ��û ���ϴ�ϴ�\n" + 
							"\n" + "���ְ� ���� ������ �پ �̼����� �αⰡ ������, "
									+ "�λ��� Ȱ������ ������ ��ġ�� ������̶��ϴ�.\n" + 
							"\n" + "������, ���������̸� ������ ���������� �߿��ϰ� �������� �ʾ�\n" + 
							"\n" + "�浿��, ���������� �ൿ�ϸ� �Ű��� �ſ� �����ϴ�ϴ�.");
					
					ps.put("���ڸ�" , "Ȧ�μ��⸦ �����ϸ� ���ǿ� ����ϰ�, �������� �پ ��ǥ�ϴ� ���� �����\n" + 
							"\n" + "���� ���ؼ� ���������� �����ϴ� ���Ⱑ ���ƿ�\n" + "\n" + 
							"������, �ֺ����� �ϴ� �ܼҸ��� ����� �Ⱦ��ϰ� �ڱ������� ���ϸ�\n" + 
							"\n" + "ȭ�� ���� ���������� �����Ͽ� ���������� �ൿ�ϸ�, "
									+ "ȥ�� ����� �ܷο��� �������ٰ� �մϴ�.\n" + "\n");
					
					ps.put("Ȳ���ڸ�", "�����ְ� �پ�� �Ӹ��� �ſ� ���Ͽ� "
							+ "�繰�� �ٷ�� �ɷ��� Ź���� ǳ���� �λ��� �ٷ������ϴ�\n" + 
							"\n" +"������, �ڱ� ���� ��ģ �Ѱ����鸸 ���� �ൿ�ϴ� ������ �־�\n" + "\n" + 
							"���������� �ൿ�� ���� �ϸ� ������ ����� ���ٰ� �մϴ�.");
					
					ps.put("�ֵ����ڸ�", "����� �����Ͽ� �� ��͸�, Ÿ���� ������ "
							+ "�뺯�ϴ� �ɷ��� �پ��\n" + "\n" + 
							"�ֺ������� �׻� �����ϰ� ������ ����� ������� ���踦 �� �����ϴ� ���̿���\n" + 
							"\n" + "������, ������ ���� ���Ͽ� �߸��ϸ� �ǻ����� ������ ������� �����\n" + 
							"\n" + "�԰� ���ô� �Ͽ��� ������ ����, "
									+ "�ൿ�� ������� ȣ����� ����ġ�� ���� ���̶��ϴ�.");
					
					ps.put("���ڸ�", "��ü������ �������̸� ����� ǳ���ϰ�, "
							+ "���� �Ժη� ���ġ �ʾ� ��Ȱ�� �־�\n" + "\n" + 
							"�ʿ��� ���� ���� �����ϴ� ���̶��ϴ�\n" + "\n" + 
							"������, �ڽ��� �Ǵٰ� �����ϴ� �͸� �����ϸ� ���ְ����� �����ϰ�,\n" + 
							"\n" + "���ΰ��迡 �־ �������� ����, �ڱ��߽����̶�� �մϴ�.");
					
					ps.put("�����ڸ�", "�ɷ��� �پ�� ������ ���� ���鿡 �־� �����̳� �⼼�� ������ "
							+ "��ǥ�� ������\n" + "\n" + "�װͿ� ���� ���������� ���ϸ�, "
									+ "�������̰� ������ �������� ������ ���� �޴´�\n" + 
							"\n" + "������, ����ġ�� Ȱ�����̰� �ڱ��߽����̸� �ֺ�������� ���� �ǰ��ϰ� �ϸ�\n" + 
							"\n" + "������ �˳��⸦ �����Ͽ� ������Ȱ�鿡���� �������� �� �������� ���̶��ϴ�.");
					
					ps.put("ó���ڸ�", "�ڽ��� �������� �ʴ� �̴��� ���ϰ� ������, �����Ͽ� �ڽ��� ���� �� ó���ϰ�\n" + 
							"\n" + "������ ������ �پ��, �������� ���� ��ö�ϴ�\n" + "\n" + 
							"������, �ڽ��� �ذ��� �� ���� ū���� �����ϴ� ������ ������\n" + 
							"\n" + "�ɽ��� �̾��� �ܺ�ġ�ʰ� ����, ������ ��Ʈ������ �����ϱ� ������ϴ� ������ �ִٰ� �ؿ�.");
					
					ps.put("ó���ڸ�", "�ڽ��� �������� �ʴ� �̴��� ���ϰ� ������, �����Ͽ� �ڽ��� ���� �� ó���ϰ�\n" + 
							"\n" + "������ ������ �پ��, �������� ���� �����ϴ�\n" + 
							"\n" + "������, �ڽ��� �ذ��� �� ���� ū���� �����ϴ� ������ ������\n" + 
							"\n" + "�ɽ��� �̾��� �ܺ�ġ�ʰ� ����, ������ ��Ʈ������ �����ϱ� ������ϴ� ������ �ִٰ� �ؿ�.");
					
					ps.put("õĪ�ڸ�", "��ǰ�� ���Ͽ� ������� �� ��͸�, ����ϰ� ���ṵ̀� ��ġ��,\n" + "\n" + 
							"��ǥ�ǽ��� Ȯ���� ��ǥ�� �޼��ϱ� ���� ���Ӿ��� �����ϸ�, �ΰ������� ��ȭ�� �߿��ϰ� �����Ѵ�\n" + 
							"\n" + "������, ������� �ι��� ���� ������ ���̸� ��ü���� ��������� ���ϴٰ� �մϴ�.");
					
					ps.put("�����ڸ�", "�̼��� ������� �ŷ��� ��ġ��, ���� �Ժη� �������� ������\n" + "\n" + 
							"������ �ִ� �о߰� ����� �ּ��� ���ϰ� �ɷ��� Ű�������� ���̿���\n" +  "\n" + 
							"������, �����Ϸ��� ��ǰ�� ������ �ſ� �������̰� �̼��� ���� �����̳�\n" + 
							"\n" + "���̸� �����ϸ�, ������ ���õ� ���̳� ������ ������ �ϱ⵵ �ϴ�ϴ�.");
					
					ps.put("����ڸ�", "ģ���԰� ���������� ���� ����鿡�� �αⰡ ������, "
							+ "�ӱ������� ���ϰ� ���ְ� ����\n" + 
							"\n" +"�� ���� �Ժη� ���� ������, �γ��� �Ѹ��ϴ�ϴ�\n" + "\n" + 
							"������, �̼����� �ڱ⺻�����̰� ���ְ����� �����ϸ�, �ڽ��� ���� �ൿ�� ����Ǿ\n" + 
							"\n" + "�װ��� �������� ���Ѵٰ� �մϴ�.");
					
					ps.put("�����ڸ�", "�ڱ� ������ �پ��, �Ӹ��� ����� ���̰� ��鼭 "
							+ "�߽ɵ� �����ϰ� ������ �������ٰ� �ؿ�\n" + 
							"\n" + "���, �����ϸ� �����������̹Ƿ� �����ϴ� �� ���� �Ⱦ��Ѵٰ� �մϴ�.\n" + "\n" + 
							"������, �̼��� ��ȥ�� �Կ� �̾ ���� ����� �߿��ϰ� �����ϸ�,\n" + "\n" + 
							"�ƴ� ���� �־ Ÿ���� �����ϱ⵵ �ϰ�, ������̰� Ÿ���� �Ⱦ��Ѵٰ� �Ѵ�ϴ�.");
			
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
						mySignst = "�����ڸ�";break;
					}else {
						mySignst = "�����ڸ�";break;
					}	
					case 2: if(day < 20) {
						mySignst = "�����ڸ�";break;
					} else {
						mySignst = "������ڸ�";break;
					}
					case 3: if(day < 21) {
						mySignst = "�����ڸ�";break;
					} else {
						mySignst = "���ڸ�";break;
					}
					case 4: if(day < 20) {
						mySignst = "���ڸ�";break;
					} else {
						mySignst = "Ȳ���ڸ�";break;
					}
					case 5: if(day < 21) {
						mySignst = "Ȳ���ڸ�";break;
					} else {
						mySignst = "�ֵ����ڸ�";break;
					}
					case 6: if(day < 22) {
						mySignst = "�ֵ����ڸ�";break;
					} else {
						mySignst = "���ڸ�";break;
					}
					case 7: if(day < 23) {
						mySignst = "���ڸ�";break;
					} else {
						mySignst = "�����ڸ�";break;
					}
					case 8: if(day < 23) {
						mySignst = "�����ڸ�";break;
					} else {
						mySignst = "ó���ڸ�";break;
					}
					case 9: if(day < 23) {
						mySignst = "ó���ڸ�";break;
					} else {
						mySignst = "õĪ�ڸ�";break;
					}
					case 10: if(day < 23) {
						mySignst = "õĪ�ڸ�";break;
					} else {
						mySignst = "�����ڸ�";break;
					}
					case 11: if(day < 23) {
						mySignst = "�����ڸ�";break;
					} else {
						mySignst = "����ڸ�";break;
					}
					case 12: if(day < 25) {
						mySignst = "����ڸ�";break;
					} else {
						mySignst = "�����ڸ�";break;
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
