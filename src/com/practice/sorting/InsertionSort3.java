package com.practice.sorting;

public class InsertionSort3
{
	public static void main(String[] args)
	{
		int[] arr = {5, 8, 7, 2, 9};
		int[] sortedArr = insertionSort(arr);
		for (int s : sortedArr)
		{
			System.out.print(s + " ");
		}
	}

	public static int[] insertionSort(int[] arr)
	{
		for (int i = 1; i < arr.length; i++)
		{
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key)
			{
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
}
