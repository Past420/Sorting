package BubbleSort;
import java.util.*;
public class BubbleSort
{
	public static void main(String args[])
	{
		ArrayList<Integer> sort_list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = s.nextInt();
		int temp;
		for(int i = 0;i<n;i++)
		{
			System.out.print("Enter Element: ");
			temp = s.nextInt();
			sort_list.add(temp);
		}
		
		System.out.print("Before Sorting: ");
		for(int i = 0;i<n;i++)
		{
			System.out.print(String.valueOf(sort_list.get(i))+" ");
		}
		
		for(int i = 0;i<n-1;i++)
		{
			for(int j = 0;j<n-i-1;j++)
			{
				if(sort_list.get(j)>sort_list.get(j+1))
				{
					Collections.swap(sort_list, j+1,j);
				}
			}
		}
		System.out.println();
		System.out.print("After Sorting: ");
		for(int i = 0;i<n;i++)
		{
			System.out.print(String.valueOf(sort_list.get(i)+" "));
		}
	}
}