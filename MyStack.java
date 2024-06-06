package com.mycompany.mystack;

class Stack {
    private int mSize;
    private int[] stackArray;
    private int top;
 
    public Stack(int m) {
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;
    }
 //Добавление элемента в стек 
    public void Push(int element) {
        stackArray[++top] = element;
    }
 //Удаление элемента из стека
    public int Pop() {
        return stackArray[top--];
    }
 //Просмотр верхнего элемента стека
    public int Peek() {
        return stackArray[top];
 
    }
 
    public boolean isEmpty() {
        return (top == -1);
    }
 
    public boolean isFull() {
        return (top == mSize - 1);
    }
}
 
public class MyStack {
 
    public static void main(String[] args) {
        Stack mStack = new Stack(10);
 
        mStack.Push(79);
        mStack.Push(59);
        mStack.Push(35);
        mStack.Push(24);
 
        mStack.Pop();
 
        System.out.print("Стек: ");
        while (!mStack.isEmpty()) {
            int value;
            value = mStack.Pop();
            System.out.print(value);
            System.out.print(" ");
        }
            System.out.println("");
    }
}
