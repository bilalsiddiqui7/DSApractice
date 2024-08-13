package com.practice.sorting;

public class QuickSort4
{
	public static void main(String[] args)
	{
		int[] arr = {4, 6, 2, 3, 7, 1, 9};
		quickSort(arr, 0, arr.length - 1);
		for (int a : arr)
		{
			System.out.print(a + " ");
		}
	}

	private static void quickSort(int[] arr, int low, int high)
	{
		if (low < high)
		{
			int pi = getPivot(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}

	}

	private static int getPivot(int[] arr, int low, int high)
	{
		int pi = high;
		int i = low - 1;
		for (int j = low; j < high; j++)
		{
			if (arr[j] < arr[pi])
			{
				i++;
				// swapping i and j
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}
		}
		// swap arr[i+1] and arr[high]
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}
}
