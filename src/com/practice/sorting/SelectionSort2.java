package com.practice.sorting;

public class SelectionSort2
{
	public static void main(String[] args)
	{
		int[] arr = {4, 6, 3, 7, 5, 9, 1, 2};
		int[] sortedArray = SelectionSort(arr);
		for (int a : arr)
		{
			System.out.print(a + " ");
		}
	}

	private static int[] SelectionSort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[j] < arr[minIndex])
				{
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		return arr;
	}
}
