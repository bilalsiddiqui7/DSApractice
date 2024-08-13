package com.practice.searching;

public class BinarySearch2
{
	public static void main(String[] args)
	{
		int[] arr = {4, 56, 78, 89, 98, 110, 123, 125, 456, 789};
		int find = 789;
		int result = BinarySearch(arr, find);
		if (result > 0)
			System.out.println("The index of " + find + " is " + result);
		else
			System.out.println("Element not found");
		
		int totalSteps=BinarySearchStepsCounter(arr, find);
		System.out.println("Total steps " + totalSteps);
	}

	private static int BinarySearch(int[] arr, int find)
	{
		int start = 0;
		int end = arr.length;
		while (start <= end)
		{
			int mid = (start + end) / 2;
			if (arr[mid] == find)
			{
				return mid;
			}
			else if (find > arr[mid])
			{
				start = mid + 1;
			}
			else
			{
				end = mid - 1;
			}
		}
		return -1;
	}
	
	// Check number of steps taken to perform the operation
	private static int BinarySearchStepsCounter(int[] arr, int find)
	{
		int steps=0;
		int start = 0;
		int end = arr.length;
		while (start <= end)
		{
			steps++;
			int mid = (start + end) / 2;
			if (arr[mid] == find)
			{
				return steps;
			}
			else if (find > arr[mid])
			{
				start = mid + 1;
			}
			else
			{
				end = mid - 1;
			}
		}
		return steps;
	}
}
