import java.io.FileWriter;
import java.io.IOException;
class FileWriterTest02
{
	public static void main(String[] args) 
	{
		try{
		FileWriter fw = new FileWriter("c:/javastudy/day1224/hello.txt");
		fw.write("�޸�ũ��������!!");
		fw.close();
		System.out.println("������ �����Ͽ����ϴ�.");
		}catch(IOException i){
			System.out.println("����ó���߿� ������ �߻��Ͽ����ϴ�.");
		}
	}
}