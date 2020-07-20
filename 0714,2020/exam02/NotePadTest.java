package com.bit.exam02;
//저장했을떄 gui 옵션 띄우는 버전 + 새파일 저장하는 기능 관리 
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
		
//		JLabel filename = new JLabel("파일명:");
//		p2.add(filename);
//		p2.add(jtf01);
		add(jsp);
		
		JMenuBar jmb = new JMenuBar();
		JMenu mn_file = new JMenu("파일");
		JMenuItem file_new = new JMenuItem("새파일");
		JMenuItem file_open = new JMenuItem("열기");
		JMenuItem file_save = new JMenuItem("저장");
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
					int re = JOptionPane.showConfirmDialog(f, "저장하시겠습니까?");
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
				fr.close();//이게 왜 나왔었지? 
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
				JOptionPane.showMessageDialog(f, "저장하였습니다.");
				//JOptionPane.showInternalMessageDialog(f, "저장하였습니다.");
				//System.out.println("파일을 기록하였습니다.");
			}catch(IOException ex) {
				System.out.println("예외발생" + ex.getMessage());
				
			 }
		}
	  }
}

public class NotePadTest {
	public static void main(String[] args) {
		new MyFrame();
	}

}
