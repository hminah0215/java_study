import java.awt.Frame;
import java.awt.Label;
import java.util.Calendar;

class MyFrame extends Frame
{
	Label view;
	public MyFrame(){
		view = new Label("���⿡ ����ð� ǥ��");
		add(view);
		setSize(400,300);
		setVisible(true);
	}
}


class CalendarTest02 
{
	public static void main(String[] args) 
	{
		
		
		MyFrame f = new MyFrame();
		String []yoil = {"��","��","ȭ","��","��","��","��"};

	while(true){
		Calendar today = Calendar.getInstance();
			int year = today.get( Calendar.YEAR );
			int mon =  today.get( Calendar.MONTH )+1;
			int day = today.get( Calendar.DATE );
			int week = today.get( Calendar.DAY_OF_WEEK )-1;
			int hours = today.get( Calendar.HOUR_OF_DAY );
			int min = today.get( Calendar.MINUTE );
			int sec = today.get( Calendar.SECOND );
		StringBuffer sb = new StringBuffer();
			sb.append(year+"�� ");
			sb.append(mon+"�� ");
			sb.append(day+"�� ");
			sb.append(yoil[week]+"���� ");
			sb.append(hours+"�� ");
			sb.append(min+"�� ");
			sb.append(sec+"�� ");

			f.view.setText(sb.toString());

			try{
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
		}
		
		
		//�̷��� �ص� ������ ��Ʈ������ ���迡.
		//String []yoil = {"��","��","ȭ","��","��","��","��"};
		//String str =year+"�� "+mon+"�� "+day+"�� "+yoil[week]+"���� "+hours+"�� "+min+"�� "+sec+"�� ";
		//System.out.println(str);
	}
}
