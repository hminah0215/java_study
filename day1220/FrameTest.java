import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MyFrame extends Frame implements ActionListener
{
	Button ok;

	public MyFrame(String title){
		super(title);
		
		ok = new Button("수지야 안녕!");
		ok.addActionListener(this);
		setLayout(  new FlowLayout()	);  //버튼을 플로우레이아웃 방식으로 배치해줘.

		add(ok);
		
		setSize( 400, 300 ); //java.awt에 클래스 윈도우에서 확인가능.
		setVisible(true); //창을 보여주세요! 
	}
	public void actionPerformed(ActionEvent e){
		System.out.println("응~ 안녕");
	}
}


class FrameTest
{
	public static void main(String[] args) 
	{
		MyFrame f = new MyFrame("안녕하세요.");

	}
}
