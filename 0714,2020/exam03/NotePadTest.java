package com.bit.exam03;
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
	JTextArea jta;
	JFileChooser jfc;
	JFrame f;
	File file;
	boolean isNew;
		
	public MyFrame() {
		setTitle("제목없음");
		f= this;
		jfc = new JFileChooser("c:/myData");
		jta = new JTextArea(20, 80);
		JScrollPane jsp = new JScrollPane(jta);
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
		
		setSize(400, 300);
		setVisible(true);
		
		jta.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				isNew = true;
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		file_open.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
				openFile();
			}
		});
		
		file_save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				saveFile();
			}
		});
		
		file_new.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(isNew && jta.getText().length() > 0) {
					int re = JOptionPane.showConfirmDialog(f, "저장하시겠습니까?");
					//예 :0, 아니오:1, 취소:2
					if(re == 0) {
						saveFile();
					}
					if(re == 0 || re == 1) {
						jta.setText("");
						setTitle("제목없음");
						isNew = false;
						file = null;
					}
				} else {
					jta.setText("");
					setTitle("제목없음");
					isNew = false;
					file = null;
				}
			}
		});		
	}
	protected void openFile() {
		// TODO Auto-generated method stub
		int re = jfc.showOpenDialog(f);
		if( re == 0) {
			try {
				file = jfc.getSelectedFile();
				FileReader fr = new FileReader(file);
				int ch;
				String str = "";
				while((ch = fr.read()) != -1) {
					str = str + (char)ch;
				}
				
				fr.close();
				jta.setText(str);
				setTitle(file.getName());
				isNew = false;

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	protected void saveFile() {
		// TODO Auto-generated method stub
		int re = 0;
		if(file == null) {
			re = jfc.showSaveDialog(f);
			file  = jfc.getSelectedFile();
		}
		
		if(re == 0) {
			String str = jta.getText();
			try {
				FileWriter fw = new FileWriter(file);
				fw.write(str);
				fw.close();
//				System.out.println("파일에 기록하였습니다.");
				JOptionPane.showMessageDialog(f, "저장하였습니다.");
				setTitle(file.getName());
				isNew = false;
			}catch (Exception ex) {
				// TODO: handle exception
				System.out.println("예외발생:"+ex.getMessage());
			}
		}
	}
}

public class NotePadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}