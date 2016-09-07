import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) {
		int []list = new int[50];
		Random random = new Random();
		
		System.out.print("Before: ");
		for(int i=0; i<list.length; i++)
		{
			list[i] = random.nextInt(50)+1;
			for(int j=0; j < i ; j++)
				if(list[j] == list[i])
					i--;
		}
		
		for(int i=0; i<50; i++)
			System.out.print(list[i] + " ");
		
		System.out.println();;
		BubbleSort(list);
		System.out.print("After: ");
		for(int i=0; i<50; i++)
			System.out.print(list[i] + " ");
	}
	
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
}