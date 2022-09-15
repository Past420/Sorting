package NewSort;

import java.util.*;

public class NewSort {

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = s.nextInt();
		int[]sort_list = new int[n];
		int temp;
		for(int i = 0;i<n;i++)
		{
			System.out.print("Enter Element: ");
			temp = s.nextInt();
			sort_list[i] = temp;
		}
		
		System.out.print("Before Sorting: ");
		for(int i = 0;i<n;i++)
		{
			System.out.print(String.valueOf(sort_list[i])+" ");
		}
		
		int i,j,key;
		for(i = 1;i<n;i++)
		{
			key = sort_list[i];
			j = i - 1;
			while(j>=0 && key<sort_list[j])
			{
				sort_list[j+1] = sort_list[j];
				j = j - 1;
			}
			sort_list[j+1] = key;
			
		}
		
		System.out.println();
		System.out.print("After Sorting: ");
		for(int k = 0;k<n;k++)
		{
			System.out.print(String.valueOf(sort_list[k]+" "));
		}
	}

}
