/*
	���� ���� 1�� 
	��������� ������ �Է¹޾� �ܾ �󵵼��� ���ϴ� ��
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
					
		System.out.print("������ �Է��ϼ���==>");
		str = sc.nextLine();
		
		HashMap<String,Integer> map = new HashMap<String,Integer>(); //�ܾ �󵵼��� ������� ��

		String[] arr = str.split(" ");	//��ũ�� �ܾ� �и�
		
		for( String s : arr ){
			int n = 0;
			if( map.get(s) != null ){ //������ �ܾ null�� �ƴϸ� �ִ� �ܾ���.
				n = map.get(s);
			}
			n++;  //������ �ܾ �����ϱ� �󵵼��� +1 ������Ű��.
			map.put(s,n);
		}
		System.out.println(map);
		
		 Set keySet = map.keySet();
		//map���κ��� key�� ��� �̾ƿͿ�! 
		
		System.out.println(keySet);
		
		//key�� ������ �� ��ŭ �ݺ������ؿ�.
		//set ��ü�� �ݺ����� ������ ���� �����! �׷��� Iterator�� ����ؼ� �ݺ��� 

		Iterator iter = keySet.iterator();
		while( iter.hasNext()  ){
			String key = (String)iter.next();
			//key��ŭ ������ ���Ƽ� Ű�� �˾���

			//������ ����
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
