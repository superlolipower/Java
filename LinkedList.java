
package com.mycompany.linkedlist;

public class LinkedList { 

	Node head; // "Голова" - первый элемент списка

	// Класс "Узел" - элемент списка 
	static class Node { 

		int data; 
		Node next; 

		// Конструктор
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	// Метод создания нового узла 
	public static LinkedList insert(LinkedList list, int data) 
	{ 
		// Создаем узел с данными
		Node newNode = new Node(data); 
		

		// Если список пустой
		// создаем узел "голову"
		if (list.head == null) { 
			list.head = newNode; 
		} 
		else { 
			// Следуем до последнего элемента списка
			// и вставляем новый узел
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			// Ввод нового элемента в конец списка
			last.next = newNode; 
		} 

		// Возврат списка по первому элементу
		return list; 
	} 

	// Вывод списка 
	public static void printList(LinkedList list) 
	{ 
		Node currNode = list.head; 
	
		System.out.print("LinkedList: "); 
	
		// Traverse through the LinkedList 
		while (currNode != null) { 
			// Вывод значения данного узла
			System.out.print(currNode.data + " "); 
	
			// Переход к следующему узлу
			currNode = currNode.next; 
		} 
	} 
	 
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		LinkedList list = new LinkedList(); 

		// 
		// ******INSERTION****** 
		// 

		// Ввод значений 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
		list = insert(list, 6); 
		list = insert(list, 7); 
		list = insert(list, 8); 

		// Вывод списка
		printList(list); 
	} 
}