package com.practice.sorting;

public class BubbleSort1
{
	public static void main(String[] args)
	{
		int[] arr = {4, 6, 3, 7, 5, 9, 1, 2};
		int[] sortedArray = bubbleSort(arr);
		for (int a : arr)
		{
			System.out.print(a + " ");
		}
	}

	private static int[] bubbleSort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length - 1; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
