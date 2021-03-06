/*
	어제 숙제 1번 
	사용자한테 문장을 입력받아 단어별 빈도수를 구하는 것
*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;

class  WordCountTEST
{	
	public static void main(String[] args) 
	{

		ArrayList<String> listWord = new ArrayList<String>();
		ArrayList<Integer> listCnt = new ArrayList<Integer>();



		Scanner sc = new Scanner(System.in);
		String str;
					
		System.out.print("문장을 입력하세요==>");
		str = sc.nextLine();
		
		HashMap<String,Integer> map = new HashMap<String,Integer>(); //단어별 빈도수를 담기위한 맵

		String[] arr = str.split(" ");	//블랭크로 단어 분리
		
		for( String s : arr ){
			int n = 0;
			if( map.get(s) != null ){ //가져온 단어가 null이 아니면 있는 단어임.
				n = map.get(s);
			}
			n++;  //가져온 단어가 있으니까 빈도수를 +1 증가시키기.
			map.put(s,n);
		}
		System.out.println(map);
		
		 Set keySet = map.keySet();
		//map으로부터 key를 모두 뽑아와요! 
		
		System.out.println(keySet);
		
		//key의 데이터 수 만큼 반복수행해요.
		//set 자체는 반복문을 수행할 길이 없어요! 그래서 Iterator를 사용해서 반복문 

		Iterator iter = keySet.iterator();
		while( iter.hasNext()  ){
			String key = (String)iter.next();
			//key만큼 루프를 돌아서 키를 알았음

			//벨류를 뽑자
			Integer cnt = map.get(key);
			///System.out.println(key +"," + cnt);	
			listWord.add(key);
			listCnt.add(cnt);
			
		}
		for(int i = 0 ; i < listCnt.size() ; i++){
			for(int j = i+1 ; j < listCnt.size(); j++){
				if( listCnt.get(j) >  listCnt.get(i) ){
					String temp = listWord.get(i);
					listWord.set(i, listWord.get(j));
					listWord.set(j,temp);

					Integer temp2 = listCnt.get(i);
					listCnt.set(i, listCnt.get(j));
					listCnt.set(j,temp2);

				}
			}
		}
		for( int i =0; i < 3 ; i++ ){
			System.out.println(listWord.get(i)+ "," + listCnt.get(i));
		}
	}
}
