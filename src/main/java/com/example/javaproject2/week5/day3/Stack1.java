package com.example.javaproject2.week5.day3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack1 {

    private int[] arr = new int[10000];
    private int pointer = 0;

    public void push(int value) {
        this.arr[pointer++] = value;
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        else return this.arr[--pointer];
    }

    public boolean isEmpty() {
        return this.pointer == 0;
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return this.arr[pointer - 1];
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);
        System.out.println(st.peek());
        System.out.println(st.peek());
    }
}
