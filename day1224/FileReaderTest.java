import java.io.FileReader;
import java.io.IOException;

class FileReaderTest 
{
	public static void main(String[] args) 
	{
		try{
		FileReader fr = new FileReader("c:/javastudy/day1224/hello.txt");
		int ch;
		while( (ch = fr.read())  !=  -1   ){ //������ ���� �ƴҶ����� ���ϸ��� �޴��� üũ.
			System.out.print( (char)ch );
		}
		fr.close();
		}catch(IOException e){
			System.out.print("����ó���� ������ �߻��Ͽ����ϴ�.");
		}
	}
}