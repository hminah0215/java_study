//HashSet 중복을 허용하지 않음. java.util =>set에서 찾을 수 있음.
//TreeSet 순서대로 정렬해줌 
import java.util.TreeSet;

import java.util.Random;
class AutoLottoSet 
{
	public static void main(String[] args) 
	{
		TreeSet hs = new TreeSet();		//내가 데이터를 넣는만큼 커지고 작아지고 그럼. 	
		Random r = new Random();
		
		while (hs.size() < 6){
			hs.add(	r.nextInt(45)+1 );
		}
		/*while(true){   //계속돌아
				hs.add(	r.nextInt(45)+1 );
				if(hs.size() == 6 ){		//hs 사이즈가 6개가될때 탈출해.
				break;
			}
		} 위에나 이것처럼 둘다 같음*/

		System.out.println("*** 이번주 로또 추천번호 ***");
		System.out.println( 	hs	);
		//실행시 note 나오는건 무시
	}
}
