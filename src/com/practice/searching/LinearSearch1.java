package com.practice.searching;

public class LinearSearch1
{
	public static void main(String[] args)
	{
		int[] arr = {4, 6, 3, 7, 5, 9, 1, 2};
		int find = 5;
		int result = linearSearch(arr, find);
		if (result > 0)
			System.out.println("The index of " + find + " is " + result);
		else
			System.out.println("Element not found");

		int totalSteps = linearSearchStepsCounter(arr, find);
		System.out.println("Total steps " + totalSteps);
	}

	private static int linearSearch(int[] arr, int find)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == find)
			{
				return i;
			}
		}
		return -1;
	}

	// Check number of steps taken to perform the operation
	private static int linearSearchStepsCounter(int[] arr, int find)
	{
		int steps = 0;
		for (int i = 0; i < arr.length; i++)
		{
			steps++;
			if (arr[i] == find)
			{
				return steps;
			}
		}
		return steps;
	}
}
