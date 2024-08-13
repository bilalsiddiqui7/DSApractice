package com.practice.searching;

public class BinarySearchUsingRecurssion3
{
	public static void main(String[] args)
	{
		int[] arr = {4, 56, 78, 89, 98, 110, 123, 125, 456, 789};
		int find = 789;
		int result = binarySearchUsingRecurssion(arr, find, 0, arr.length);
		if (result > 0)
			System.out.println("The index of " + find + " is " + result);
		else
			System.out.println("Element not found");
	}

	private static int binarySearchUsingRecurssion(int[] arr, int find,
		int start, int end)
	{
		int mid = (start + end) / 2;
		if (arr[mid] == find)
		{
			return mid;
		}
		else if (find > arr[mid])
		{
			return binarySearchUsingRecurssion(arr, find, mid + 1, end);
		}
		else
		{
			return binarySearchUsingRecurssion(arr, find, start, mid - 1);
		}
	}
}
