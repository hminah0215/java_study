
import java.util.Random;
class  AutoLotto
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		int []a = new int[6];
		
		for(	int i = 0;	i < a.length ;	 ){
			int n =	r.nextInt( 45 )+1;
			boolean flag = false;		//상태를 담기위한 변수. 중복이 되는지 판단하기 위해. 
			for(	int j = 0	; j< i	; j++){		//이미 있는 데이터를 검사해서 
				if( n == a[j] ){			//혹시 중복된 값이 있으면
					flag = true;			// 참을 싣고
				}
			}
			if( flag == true ){		//참이면 계속
				continue;
			}
			a[i] = n;	//i가 0이면 무조건 여기로. 묻는 코드가 없음. 그 뒤에것들은 증가하면 안됨. 
			i++;		 // 이때 i가 증가하면 안되니까 for 반복문에 있던 i++을 뺌. 
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
		System.out.println("*** 이번주 로또 추천 번호 ***");
		for( int i =0 ; i < a.length; i++ ){
			System.out.print( a[i] + " ");
		}
	}
}
