
import java.util.Calendar;
class CalendarTest01 
{
	public static void main(String[] args) 
	{
		Calendar today = Calendar.getInstance();
		int year = today.get( Calendar.YEAR );
		int mon =  today.get( Calendar.MONTH )+1;
		int day = today.get( Calendar.DATE );
		int week = today.get( Calendar.DAY_OF_WEEK )-1;
		int hours = today.get( Calendar.HOUR_OF_DAY );
		int min = today.get( Calendar.MINUTE );
		int sec = today.get( Calendar.SECOND );
		
		String []yoil = {"��","��","ȭ","��","��","��","��"};

		StringBuffer sb = new StringBuffer();
		sb.append(year+"�� ");
		sb.append(mon+"�� ");
		sb.append(day+"�� ");
		sb.append(yoil[week]+"���� ");
		sb.append(hours+"�� ");
		sb.append(min+"�� ");
		sb.append(sec+"�� ");

		System.out.println(sb);
		//String []yoil = {"��","��","ȭ","��","��","��","��"};
		//String str =year+"�� "+mon+"�� "+day+"�� "+yoil[week]+"���� "+hours+"�� "+min+"�� "+sec+"�� ";
		//System.out.println(str);
	}
}
