package beat;

import javax.swing.JFrame;

public class beat extends JFrame{
	
	public beat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 게임 창 크기
		setResizable(false); // 창 사이즈 변경 불가
		setLocationRelativeTo(null); // 컴퓨터 정 중앙에 화면이 뜰수있게
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임 종료시 프로그램 전체 종료 
		setVisible(true); //게임이 정상적으로 출력
	}

}
