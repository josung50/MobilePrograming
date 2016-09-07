import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int []list = new int[50];
		Random random = new Random();
		
		for(int i=0; i<list.length; i++)
		{
			list[i] = random.nextInt(100)+1; // 1~100 사이의 난수 생성 , 크기는 50
			for(int j=0; j < i ; j++)
				if(list[j] == list[i])
					i--;
		}
					
		BubbleSort(list); // 전제조건 선 정렬
		System.out.print("list : ");
		for(int i=0; i<list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();
		
		int Target = -1;
		
		System.out.print("FInd number : ");
		Scanner input = new Scanner(System.in);
		Target = input.nextInt();
		
		int Check;
		Check = BinarySearch(list , Target , 0 , list.length);
		if(Check == -1)
			System.out.println("Not Found.");
		else
			System.out.println("Index is " + Check);
	}
	
	
	// 버블 정렬
	public static void BubbleSort(int []list)
	{
		int temp;
		for(int i=0; i<49; i++)
			for(int j=0; j<49; j++)
				if(list[j] > list[j+1])
				{
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
	}
	
	
	// 이분 탐색
	public static int BinarySearch(int []list , int Target , int Begin , int End)
	{
		int Mid = 0;
		if(Begin > End)
			return -1; // 탈출 조건 , 탐색 실패
		
		Mid = (Begin + End) / 2;
		
		if(list[Mid] == Target)
			return Mid;
		else if( Target < list[Mid])
			return BinarySearch(list , Target , Begin , Mid-1);
		else if( Target > list[Mid])
			return BinarySearch(list , Target , Mid+1 , End);
		return -1;
	}
}