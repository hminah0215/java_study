import java.util.Arrays;
class ArraysTest03
{
	public static void main(String[] args) 
	{
		int []a = {100,200,300};
		int []b = {100,200,300};

		//Arrays Ŭ������ �޼ҵ带 �̿��Ͽ� �� �迭�� ���� ���� ������� �Ǻ��ϵ��� �ϼ���.
		
		boolean flag = Arrays.equals(a,b);
		if( flag ){
			System.out.println("�� �迭�� �����ϴ�.");
		}else{
			System.out.println("�� �迭�� �ٸ��ϴ�.");
		}

		/*
		if( Arrays.equals(a,b) ){ �ٷ� �׳� ����־ ��.
			System.out.println("�� �迭�� �����ϴ�.");
		}else{
			System.out.println("�� �迭�� �ٸ��ϴ�.");
		}
		*/
	
	}
}