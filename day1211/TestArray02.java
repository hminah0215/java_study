//�迭 LAB1�� -2 , for each�ݺ����� ���
import java.util.Scanner;
class  TestArray02
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
			
			for( int v : arr ){  //�迭(arr)�� �ִ� ������(int v)�� �ϳ��� ������ �ݺ��ؼ� �����.
			System.out.print( v +" ");	
			}

			
				

	}
}
