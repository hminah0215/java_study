/*Ű���忡�� ������ �ϳ��� �о ������ ������ �����ϴ� ���α׷��� �ۼ��Ͽ�����.
switch���� ����Ͽ� ���ڸ� �����Ѵ�.�ε� �̰� if�� �غ�.*/
import java.util.Scanner;
class  Alpa02
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String eng;
		
	
		System.out.print("������ �ϳ��� �Է��ϼ���===>");
		eng = sc.next();
		
	
		if(eng.equals ("a") || eng.equals ("e") || eng.equals ("i")|| eng.equals ("o") ||eng.equals ("u") ){
			System.out.println(eng + " �� �����Դϴ�.");
				
			}else {
				System.out.println(eng + " �� �����Դϴ�.");
		
		}
					
	}
}
