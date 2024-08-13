package com.practice.sorting;

public class MergeSort5
{
	public static void main(String[] args)
	{
		int[] arr = {8, 3, 2, 4, 5, 9, 1, 6, 7};
		mergeSort(arr, 0, arr.length - 1);
//		for (int a : arr)
//		{
//			System.out.println(a + " ");
//		}
	}

	private static void mergeSort(int[] arr, int l, int r)
	{
		if (l < r)
		{
			//TO-DO understand how we are calling the recursion two times
			int mid = (l + r) / 2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);
			merge(arr, l, mid, r);
		}
	}

	private static void merge(int[] arr, int l, int mid, int r)
	{
		int lLength = mid - l + 1;
		int rLength = r - mid;

		int[] lArr = new int[lLength];
		int[] rArr = new int[rLength];

		for (int x = 0; x < lArr.length; x++)
		{
			lArr[x] = arr[l + x];
		}
		for (int y = 0; y < rArr.length; y++)
		{
			rArr[y] = arr[mid + 1 + y];
		}

		int i = 0;
		int j = 0;
		int k = l;
		while (i < lLength && j < rLength)
		{
			if (lArr[i] < rArr[j])
			{
				arr[k] = lArr[i];
				i++;
			}
			else
			{
				arr[k] = rArr[j];
				j++;
			}
			k++;
		}

		while (i < lLength)
		{
			arr[k] = lArr[i];
			i++;
			k++;
		}

		while (j < rLength)
		{
			arr[k] = rArr[j];
			j++;
			k++;
		}

	}

}
