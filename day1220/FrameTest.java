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
		
		ok = new Button("������ �ȳ�!");
		ok.addActionListener(this);
		setLayout(  new FlowLayout()	);  //��ư�� �÷ο췹�̾ƿ� ������� ��ġ����.

		add(ok);
		
		setSize( 400, 300 ); //java.awt�� Ŭ���� �����쿡�� Ȯ�ΰ���.
		setVisible(true); //â�� �����ּ���! 
	}
	public void actionPerformed(ActionEvent e){
		System.out.println("��~ �ȳ�");
	}
}


class FrameTest
{
	public static void main(String[] args) 
	{
		MyFrame f = new MyFrame("�ȳ��ϼ���.");

	}
}
