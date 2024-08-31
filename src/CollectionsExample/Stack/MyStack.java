package CollectionsExample.Stack;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();
        myStack.add(1);
        myStack.add(7);
        myStack.add(8);
        myStack.add(14);

        System.out.println(myStack); // изначальный стэк
        System.out.println(myStack.pop());// "взяли" верхний элемент
        System.out.println(myStack); // стэк уменьшился
        System.out.println(myStack.peek()); // "взяли" верхний элемент, но стэк не уменьшился (в отличии от pop)
        System.out.println(myStack);

    }
}
