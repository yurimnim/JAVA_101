package com.bit.exam04;
//�����غ�����: �������� �ҷ��ͼ� ����Ű ������ ��ȭ�ִٰ� ��..��� ��ĥ��
//�������� vs �������� ���� �� �����ϰ� �ڵ带 ©����/ Ű���忡�� �ش���°� ����� �����غ���  
//������ - �����Է� - �����ϴ��� - �����Ͻðڽ��ϱ�? - �� - ����â�� - ��� ������ ���� ������ �����Ǿ�� �Ǵµ� ������ó���� ��. �̰� ��� �ذ��ұ�?
//����� ���� �ְ� �߰��� ���� ������ ����ðڽ��ϱ�? ��������� 


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class MyFrame extends JFrame{
	JTextArea jta; 	//�޸����� �� ������ ǥ���ϱ� ���� Text Area
	JFileChooser jfc; // ���� & �о���� �� �� ������ �����ϱ� ���� dialogue
	JFrame f; //filechooser�� �޼����� ��ﶧ �ʿ���  Parents frame �� ������ ����
	File file; // ���� �۾����� ������ ������ ������� ����, �о���⳪ �����ϱ� ������ ������ ������ ��ƿ��� 
	boolean isNew;// �޸��忡 ����� ������ �ִ��� �Ǻ��ϱ� ���� ����, textarea ��  ������ ������= true / �����ϱ⳪,�о����,������ �� ��������(��ȭ����) = false 
		
	public MyFrame() { //������ 
		isNew = false; //����:����ȳ��� �����Ƿ�  false ��� 
		setTitle("�������"); //����ǥ���� : �������
		
		f= this;//������� f�� �� �ڽ� this�� ��´�(this=�� �ڽ�..myframe ���� �� Ŭ������ ��ü!) 
		//jfilechooser�� �޼���â ��� (�θ� Ŭ���� ����� �޼ҵ��) �������ٶ�� �̰� ����� 
		
		jfc = new JFileChooser("c:/myData");//������ �����ϱ� ���� �⺻��θ� c:/MyData�� �����Ѵ� 
		jta = new JTextArea(20, 80); //�޸��� Textarea ��ü ����
		
		JScrollPane jsp = new JScrollPane(jta); //Textarea�� ũ��� ����� ũ�� ��� �� ����. 
		//�Է��� �� �ִ� ������ ����� ũ�⸦ ��� �� ������ ��ũ�ѹ� ����, ����� ũ�� ����� �ټ���ŭ ĭ����ŭ �Է� �� �� ���� 
		
		add(jsp);
		//frame ���� textarea �� ��� ���� �ƴϰ� textarea �� �����ϰ��ִ� ��ũ����(���� jsp)�� ��´�.

		JMenuBar jmb = new JMenuBar(); //�޴��� ǥ���ϱ� ���Ͽ� �޴��� ����
		JMenu mn_file = new JMenu("����");//�ָ޴� "����"�� ����
		
		JMenuItem file_new = new JMenuItem("������");
		JMenuItem file_open = new JMenuItem("����");
		JMenuItem file_save = new JMenuItem("����");
		//�θ޴� ����:������,����,����
		
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		//������ ������ �θ޴� --> �ָ޴��� ��´�. 
		
		jmb.add(mn_file);//�ָ޴�"����"�� �޴��ٿ� ��´�.
		
		setJMenuBar(jmb);//�޴��ٸ� �����ӿ� �����Ѵ�.
		
		setSize(400, 300); //������ ũ�⼳��
		setVisible(true);//������ ȭ�鿡 ���̵��� ���� 
		
		// TextArea �� key event ����(Ű����)
		// key event �� textarea ���� Ű�����̺�Ʈ�� �߻��� �� �����Ѵ�. 
		// ������ keyTyped, keyReleased, keyPressed�� ���� 
		// keyPressed: Ű�� ������ ���� �߻��ϴ� �̺�Ʈ 
		// keyReleased: Ű�� �����ٰ� ���¼��� �߻��ϴ� �̺�Ʈ 
		// keyTyped: Ű�� �����ٰ� ���� �Ͱ��� ��set
		// �������==> textarea ���� k��� ���ڸ� Ÿ���� �ߴٸ� KeyPressed - KeyReleased - KeyTyped ������ �߻�
		// �츮�� �޴��߿� "������" ó���� ���� ����� �ֽ��� ������ �Ǻ��ϱ� ����  TextArea Ű�̺�Ʈ ��� - ���ο� ������ ���������� �Ǻ��ϱ� ���� �뵵 keyrelease ���
		jta.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				int code = e.getKeyCode(); //����Ű �������� ���� ã�Ƴ��� ���ܽ�Ű�� ��ĥ������ 
				
				isNew = true;//Textarea �� Ű�� �������ٰ� ���¼��� ->isNew�� ����߻�ǥ�� 
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		
		//�θ޴� "����" �̺�Ʈó�� 
		file_open.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			
				openFile(); //���Ͽ��� �޼ҵ� ȣ�⹮
			}
		});
		
		//�θ޴� "����" �̺�Ʈó�� 
		file_save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});
		
		//�θ޴� "������" �̺�Ʈó�� 
		//����  ���� ���� ������ų�,�����ѹ� �� ���¿��� ���泻���� �ִµ� ���� ��������"�����Ͻðڽ��ϱ�?" â�������� 
		//��� yes=����, ������ ó�� 
		//���� �ٷ� ����ͼ� ����ȳ��� ������ �׳� �ٷ� ������ó�� ����
		file_new.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ����� ����(isNew=true)�ִ���/ Textarea �� ���� �ѱ��ڶ� �ִ���?
				if(isNew && jta.getText().length() > 0) { 
					int re = JOptionPane.showConfirmDialog(f, "�����Ͻðڽ��ϱ�?"); //���� �����ϱ� �޼����Ѹ�
					//�� :0, �ƴϿ�:1, ���:2 - ����ڰ� ������ �ɼ� int�� �����س��� 
					if(re == 0) { //���� ����
						saveFile(); // ���� �޼ҵ� ȣ�� 
					}
					if(re == 0 || re == 1) { //���� ����, ���� �� ��ư �������� ó�� ����ߵ� ���� 
						jta.setText("");//�޸������
						setTitle("�������");
						isNew = false; //���� �� ó�� �����ϱ� �ٽ� �������� == ����������� ó�� 
						file = null;//������, ���Ϻ����� ��������
					}
				} else {//(isNew == false && jta.getText().length() = 0)��� = ���뺯�� ������! �׳� �ٷ� ������ ó�� ����
					jta.setText("");
					setTitle("�������");
					isNew = false; 
					file = null;//������ ó���ϴ� ����� ��� �ݺ� �Ǵϱ� �޼ҵ� ����� ���� ���� ���?
				}
			}
		});		
	}
	//�������� ���� ����ϴ� �޼ҵ� 
	protected void openFile() {
		int re = jfc.showOpenDialog(f);
		//���� �����ϱ� ���� dialogue���� �����: ����,��� �����Ϳ� ����  int���� �־��� ��Ҵ����� �ϰ͵� ���ؾ���
		
		if( re == 0) { //���� �������� ���ư��� �ڵ� ����=0; (���� ������ ���� �����̸���)
			try {
				file = jfc.getSelectedFile();
				FileReader fr = new FileReader(file);
				//������ ������ �޸𸮷� �о���̱� ����  file ��ü ����
				//�����ڿ��� �о�� ���� �Ű������� ���� 
				
				int ch;// ������ ������ �ѱ��ھ� �о�������� ��������
				String str = "";//������ ������ ���� ������� ���ڿ� ������ �����Ѵ�. 
				
				//������ ���� �ƴҶ����� ������ ������ �ѱ��ھ� ��� �о�´�. 
				//read �޼ҵ带 ���� ���� �ѱ��ھ� �о�ͼ� ascii �ڵ�� ��ȯ : �� �о�� ���� ������ -1 ��ȯ
				//���� �о�ͼ�  ch�� ����, -1�� �ƴҶ����� �ݺ����� 
				while((ch = fr.read()) != -1) {
					str = str + (char)ch; //�ƽ�Ű �ڵ�� �Ͼ�ͼ� char�� ��ȯ, str �� ����
				}
				
				fr.close();
				//������ ����� ��� ������ ����� ������ �ݾ���. 
				
				jta.setText(str); //���Ͽ��� �о�� str�� �޸��忡 �ѷ���
				setTitle(file.getName());//�����̸� ����ǥ�ùٿ� ǥ��
				isNew = false;//�����Ͽ����� ��ȭ����  �ٽ� ����������� ��ȯ

			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	//���� ������ �޼ҵ� 
	protected void saveFile() {
		//�޴����� ���崩�� - ����/���ϳ��� �����Ұ��� ���
		//0 ���� 1��� : ���� ���������� ����ó���� :re�� ���������� ���� ��´�. 
		//0�� �⺻���� ����: �̹� ����������̳� �ҷ�������(���빰 �ִµ� ��ȭ ��������) ���� ���̾�α� ����ʿ����. 
		int re = 0;
		
		//file�� null�̸� ���� ��� ���ϸ� ��� �¾��ؾ��� 
		//�̹� �ѹ� ����/�ҷ����� �Ѱɷ� ��ģ�Ÿ� ����â �� �ʿ䰡 ����. 
		if(file == null) {
			re = jfc.showSaveDialog(f); //file�� null�̴ϱ� ����.: ���ٰ� �����̸����� �����Ұ��� ����/��� ������  re�� ���� 
			file  = jfc.getSelectedFile();// �����ϱ� ��ȭ���ڿ��� ������ ���� ��������� ����
		}
		
		if(re == 0) { //"�����ϱ�" �������ϱ� ���� ó�� ���� 
			String str = jta.getText();//�޸��� ����  str�� ���� 
			try {
				FileWriter fw = new FileWriter(file);//�޸� ������ ���Ϸ� ��´���ϴ� ��ü����
				fw.write(str);//filewrite���� str���� ->���Ϸ���� 
				fw.close();//���ϻ�� ������ ����� ���� �ݾ��ֱ� 
//				System.out.println("���Ͽ� ����Ͽ����ϴ�.");
				JOptionPane.showMessageDialog(f, "�����Ͽ����ϴ�."); //���� �ٵƴٰ� �޼���â �����
				setTitle(file.getName());//������ ���ϸ� ����â�� �����
				isNew = false;//��ȭ �ִ°� ó���������� �ٽ� ��ȭ����
			}catch (Exception ex) {
				System.out.println("���ܹ߻�:"+ex.getMessage());
			}
		}
	}
}

public class NotePadTest {

	public static void main(String[] args) {
		new MyFrame();
	}

}