//String �� �Һ��� Ư¡�� �������ִ�. ������ �ʴ� ���ڿ�! 

class StringTest02 
{
	public static void main(String[] args) 
	{
		String str = "   hello   ";
		System.out.println("|"+str+"|");  // | ����������   
		System.out.println( str.length());

		System.out.println("|"+ str.trim() +"|"); //trim ����ũ�� ���������.
		System.out.println("|"+str+"|"); //trim �� string ���� ��ȯ�������� �����Ƿ� ���⼭ �ٽ� ����ũ�ִ� ��ο� ����. 

		str = str.trim(); //trim ���� ����Ȱ��� �ٽ� str�� ��������. ��Ʈ���� �Һ��̴ϱ�.
		System.out.println("|"+str+"|");
	}
}