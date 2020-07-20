package com.bit.exam02;
//���������� gui �ɼ� ���� ���� + ������ �����ϴ� ��� ���� 
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	JTextArea jta;
	JFileChooser jfc;
	JFrame f;
//	JTextField jtf01;
	
	public MyFrame() {
		f = this;
		jfc = new JFileChooser("c:/MyData");
		jta = new JTextArea(20, 80);
		JScrollPane jsp = new JScrollPane(jta);
		add(jsp);
		setLayout(new BorderLayout());
//		jtf01 = new JTextField(15);
//		JPanel p2= new JPanel();
//		add(p2,BorderLayout.CENTER);
		
//		JLabel filename = new JLabel("���ϸ�:");
//		p2.add(filename);
//		p2.add(jtf01);
		add(jsp);
		
		JMenuBar jmb = new JMenuBar();
		JMenu mn_file = new JMenu("����");
		JMenuItem file_new = new JMenuItem("������");
		JMenuItem file_open = new JMenuItem("����");
		JMenuItem file_save = new JMenuItem("����");
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		jmb.add(mn_file);
		setJMenuBar(jmb);
		
//		add(p2);
//		
		setSize(900, 500);
		setVisible(true);
		
		file_new.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jta.getText().length() > 0) {
					int re = JOptionPane.showConfirmDialog(f, "�����Ͻðڽ��ϱ�?");
					//0-yes 1-no 2-cancel
					if(re == 0) {
						saveFile();
					}
					if(re == 0||re==1) {
						jta.setText("");
					} 
				}
			}
		});
		file_open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openFile();
			}
		});
		file_save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});
	}
	
	protected void openFile() {
		int re = jfc.showOpenDialog(f);
		if(re==0) {
			try {
				File file = jfc.getSelectedFile();
				FileReader fr = new FileReader(file);
				int ch;
				String str = "";
				while((ch = fr.read()) != -1){
					str = str + (char)ch;
				}
				fr.close();//�̰� �� ���Ծ���? 
				jta.setText(str);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
}

	protected void saveFile() {
		int re = jfc.showSaveDialog(f);
		if(re == 0) {
			File file = jfc.getSelectedFile();
			String str = jta.getText();
			try {
				FileWriter fw = new FileWriter(file);
				fw.write(str);
				fw.close();
				JOptionPane.showMessageDialog(f, "�����Ͽ����ϴ�.");
				//JOptionPane.showInternalMessageDialog(f, "�����Ͽ����ϴ�.");
				//System.out.println("������ ����Ͽ����ϴ�.");
			}catch(IOException ex) {
				System.out.println("���ܹ߻�" + ex.getMessage());
				
			 }
		}
	  }
}

public class NotePadTest {
	public static void main(String[] args) {
		new MyFrame();
	}

}
