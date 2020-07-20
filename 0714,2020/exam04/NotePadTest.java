package com.bit.exam04;
//생각해볼문제: 기존파일 불러와서 방향키 눌러도 변화있다고 뜸..어떻게 고칠까
//이전파일 vs 현재파일 내용 다 대조하게 코드를 짤건지/ 키보드에서 해당없는거 골라낼지 생각해보자  
//새파일 - 내용입력 - 새파일누름 - 저장하시겠습니까? - 네 - 저장창뜸 - 취소 누르면 원래 내용이 보존되어야 되는데 새파일처리가 됨. 이건 어떻게 해결할까?
//변경된 내용 있고 중간에 열기 눌러도 저장시겠습니까? 물어봐야함 


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
	JTextArea jta; 	//메모장의 글 내용을 표현하기 위한 Text Area
	JFileChooser jfc; // 저장 & 읽어오기 할 때 파일을 선택하기 위한 dialogue
	JFrame f; //filechooser나 메세지를 띄울때 필요한  Parents frame 을 참조할 변수
	File file; // 현재 작업중인 파일의 정보를 담기위한 변수, 읽어오기나 저장하기 했을때 파일의 변수를 담아오기 
	boolean isNew;// 메모장에 변경된 내용이 있는지 판별하기 위한 변수, textarea 에  내용이 써질때= true / 저장하기나,읽어오기,새파일 막 열었을때(변화없음) = false 
		
	public MyFrame() { //생성자 
		isNew = false; //최초:변경된내용 없으므로  false 담기 
		setTitle("제목없음"); //제목표시줄 : 제목없음
		
		f= this;//멤버변수 f에 나 자신 this를 담는다(this=나 자신..myframe 현재 이 클래스의 객체!) 
		//jfilechooser나 메세지창 기능 (부모 클래스 물어보는 메소드들) 설정해줄라면 이걸 써야함 
		
		jfc = new JFileChooser("c:/myData");//파일을 선택하기 위한 기본경로를 c:/MyData에 설정한다 
		jta = new JTextArea(20, 80); //메모장 Textarea 객체 생성
		
		JScrollPane jsp = new JScrollPane(jta); //Textarea의 크기는 모니터 크기 벗어날 수 없다. 
		//입력할 수 있는 내용이 모니터 크기를 벗어날 수 없으니 스크롤바 생성, 모니터 크기 벗어나는 줄수만큼 칸수만큼 입력 할 수 있음 
		
		add(jsp);
		//frame 에는 textarea 를 담는 것이 아니고 textarea 를 포함하고있는 스크롤팬(위에 jsp)를 담는다.

		JMenuBar jmb = new JMenuBar(); //메뉴를 표현하기 위하여 메뉴바 생성
		JMenu mn_file = new JMenu("파일");//주메뉴 "파일"을 생성
		
		JMenuItem file_new = new JMenuItem("새파일");
		JMenuItem file_open = new JMenuItem("열기");
		JMenuItem file_save = new JMenuItem("저장");
		//부메뉴 생성:새파일,열기,저장
		
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		//위에서 생성한 부메뉴 --> 주메뉴에 담는다. 
		
		jmb.add(mn_file);//주메뉴"파일"을 메뉴바에 담는다.
		
		setJMenuBar(jmb);//메뉴바를 프레임에 설정한다.
		
		setSize(400, 300); //프레임 크기설정
		setVisible(true);//프레임 화면에 보이도록 설정 
		
		// TextArea 에 key event 설정(키보드)
		// key event 는 textarea 에서 키보드이벤트가 발생할 떄 동작한다. 
		// 종류는 keyTyped, keyReleased, keyPressed가 있음 
		// keyPressed: 키를 누르는 순간 발생하는 이벤트 
		// keyReleased: 키를 눌렀다가 떄는순간 발생하는 이벤트 
		// keyTyped: 키를 눌렀다가 때는 것가지 한set
		// 예를들어==> textarea 에서 k라는 문자를 타이핑 했다면 KeyPressed - KeyReleased - KeyTyped 순으로 발생
		// 우리는 메뉴중에 "새파일" 처리를 위해 변경된 최신의 내용이 판별하기 위해  TextArea 키이벤트 등록 - 새로운 내용이 쓰여지는지 판별하기 위한 용도 keyrelease 사용
		jta.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				int code = e.getKeyCode(); //방향키 눌렀을때 값을 찾아내서 제외시키면 고칠수있음 
				
				isNew = true;//Textarea 에 키가 눌러졌다가 떼는순간 ->isNew에 변경발생표시 
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		
		//부메뉴 "열기" 이벤트처리 
		file_open.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			
				openFile(); //파일열기 메소드 호출문
			}
		});
		
		//부메뉴 "저장" 이벤트처리 
		file_save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});
		
		//부메뉴 "새파일" 이벤트처리 
		//만약  기존 파일 열어오거나,저장한번 한 상태에서 변경내용이 있는데 저장 안했으면"저장하시겠습니까?" 창띄워서물어봄 
		//대답 yes=저장, 새파일 처리 
		//파일 바로 열어와서 변경된내용 없으면 그냥 바로 새파일처리 ㄱㄱ
		file_new.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 변경된 내용(isNew=true)있는지/ Textarea 에 글자 한글자라도 있는지?
				if(isNew && jta.getText().length() > 0) { 
					int re = JOptionPane.showConfirmDialog(f, "저장하시겠습니까?"); //변경 됐으니깐 메세지뿌림
					//예 :0, 아니오:1, 취소:2 - 사용자가 선택한 옵션 int에 저장해놓음 
					if(re == 0) { //저장 ㅇㅋ
						saveFile(); // 저장 메소드 호출 
					}
					if(re == 0 || re == 1) { //저장 ㅇㅋ, ㄴㄴ 라도 여튼 새파일은 처리 해줘야됨 ㅇㅇ 
						jta.setText("");//메모장비우기
						setTitle("제목없음");
						isNew = false; //저장 다 처리 했으니깐 다시 새파일임 == 변경없음으로 처리 
						file = null;//새파일, 파일변수도 비워줘야함
					}
				} else {//(isNew == false && jta.getText().length() = 0)라면 = 내용변경 없으면! 그냥 바로 새파일 처리 ㄱㄱ
					jta.setText("");
					setTitle("제목없음");
					isNew = false; 
					file = null;//새파일 처리하는 기능이 계속 반복 되니깐 메소드 만들어 보는 것이 어떤지?
				}
			}
		});		
	}
	//기존파일 열기 담당하는 메소드 
	protected void openFile() {
		int re = jfc.showOpenDialog(f);
		//파일 선택하기 위한 dialogue파일 띄워줌: 열기,취소 눌른것에 따라  int값에 넣어줌 취소누르면 암것도 안해야함
		
		if( re == 0) { //열기 눌렀을때 돌아가는 코드 열기=0; (열기 눌렀을 때만 할일이많지)
			try {
				file = jfc.getSelectedFile();
				FileReader fr = new FileReader(file);
				//파일의 내용을 메모리로 읽어들이기 위한  file 객체 생성
				//생성자에게 읽어올 파일 매개변수로 전달 
				
				int ch;// 파일의 내용을 한글자씩 읽어오기위해 변수선언
				String str = "";//파일의 내용을 전부 담기위한 문자열 변수를 선언한다. 
				
				//파일의 끝이 아닐때까지 파일의 내용을 한글자씩 담아 읽어온다. 
				//read 메소드를 통해 파일 한글자씩 읽어와서 ascii 코드로 변환 : 더 읽어올 글자 없으면 -1 반환
				//글자 읽어와서  ch에 저장, -1이 아닐때까지 반복실행 
				while((ch = fr.read()) != -1) {
					str = str + (char)ch; //아스키 코드로 일어와서 char로 변환, str 에 누적
				}
				
				fr.close();
				//파일의 사용이 모두 끝나면 사용한 파일을 닫아줌. 
				
				jta.setText(str); //파일에서 읽어온 str을 메모장에 뿌려줌
				setTitle(file.getName());//파일이름 제목표시바에 표시
				isNew = false;//막파일열었음 변화없음  다시 변경없음으로 변환

			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	//파일 저장담당 메소드 
	protected void saveFile() {
		//메뉴에서 저장누름 - 어떤경로/파일네임 저장할건지 띄움
		//0 저장 1취소 : 저장 눌렀을때만 저장처리함 :re에 뭐눌렀는지 정보 담는다. 
		//0이 기본값인 이유: 이미 저장된파일이나 불러온파일(내용물 있는데 변화 없는파일) 저장 다이얼로그 띄울필요없음. 
		int re = 0;
		
		//file이 null이면 저장 경로 파일명 등등 셋업해야함 
		//이미 한번 저장/불러오기 한걸로 고친거면 저장창 열 필요가 없음. 
		if(file == null) {
			re = jfc.showSaveDialog(f); //file이 null이니깐 띄운다.: 어디다가 무슨이름으로 저장할건지 저장/취소 누른거  re에 담음 
			file  = jfc.getSelectedFile();// 저장하기 대화상자에서 선택한 파일 멤버변수에 담음
		}
		
		if(re == 0) { //"저장하기" 눌렀으니깐 저장 처리 진행 
			String str = jta.getText();//메모장 내용  str에 담음 
			try {
				FileWriter fw = new FileWriter(file);//메모리 내용을 파일로 출력담당하는 객체생성
				fw.write(str);//filewrite통해 str내용 ->파일로출력 
				fw.close();//파일사용 끝나면 사용한 파일 닫아주기 
//				System.out.println("파일에 기록하였습니다.");
				JOptionPane.showMessageDialog(f, "저장하였습니다."); //저장 다됐다고 메세지창 띄워줌
				setTitle(file.getName());//저장한 파일명 제목창에 띄워줌
				isNew = false;//변화 있는거 처리해줬으니 다시 변화없음
			}catch (Exception ex) {
				System.out.println("예외발생:"+ex.getMessage());
			}
		}
	}
}

public class NotePadTest {

	public static void main(String[] args) {
		new MyFrame();
	}

}