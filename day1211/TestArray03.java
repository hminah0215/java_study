//�迭 LAB1�� -3 ,  �������� ����ض�.
import java.util.Scanner;
class  TestArray03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//10���� ������ ������ �� �ִ� �迭�� �����ϰ� �����϶�. 
		int []arr =  new int[10];

		//����ڷκ��� ������ �޾Ƽ� �迭�� �����ϴ� �ݺ� ����
		for( int i = 0; i < arr.length ; i++ ){
			System.out.print( ( i+1) +"��° ���� �Է��ϼ��� ==>");
			arr[i] = sc.nextInt();
			
			}
			
			for ( int i = arr.length-1   ; i  >=0  ;  i-- ){
				System.out.print( arr[i]+" ");	
			}

	}
}
