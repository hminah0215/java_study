
import java.util.Random;
class  AutoLotto
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		int []a = new int[6];
		
		for(	int i = 0;	i < a.length ;	 ){
			int n =	r.nextInt( 45 )+1;
			boolean flag = false;		//���¸� ������� ����. �ߺ��� �Ǵ��� �Ǵ��ϱ� ����. 
			for(	int j = 0	; j< i	; j++){		//�̹� �ִ� �����͸� �˻��ؼ� 
				if( n == a[j] ){			//Ȥ�� �ߺ��� ���� ������
					flag = true;			// ���� �ư�
				}
			}
			if( flag == true ){		//���̸� ���
				continue;
			}
			a[i] = n;	//i�� 0�̸� ������ �����. ���� �ڵ尡 ����. �� �ڿ��͵��� �����ϸ� �ȵ�. 
			i++;		 // �̶� i�� �����ϸ� �ȵǴϱ� for �ݺ����� �ִ� i++�� ��. 
		}

		for(	int i=0	; i < a.length	; i++	){
			for( int j= i+1; j < a.length; j++){
				if (a[j] < a[i]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("*** �̹��� �ζ� ��õ ��ȣ ***");
		for( int i =0 ; i < a.length; i++ ){
			System.out.print( a[i] + " ");
		}
	}
}