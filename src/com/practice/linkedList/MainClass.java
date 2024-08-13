package com.practice.linkedList;

public class MainClass
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.insert(55);
		l.insert(65);
		l.insert(25);
		l.insert(45);
		l.insert(95);

		// l.insertAtStart(10);
		// l.insertAtIndex(20, 0);
		l.deleteAtIndex(1);

		l.show();
	}
}
