package com.university;
import java.util.Stack;
class stacks{
    static void stack_push(Stack<Integer> stack){
        System.out.println("This a method which implements the Push operation");
        for(int i = 0; i < 5;i++){
            stack.push(i);
        }

    }

    static void stack_pop(Stack<Integer> stack){
        System.out.println("This a method which implements the Pop operation");
        for(int i = 0; i < 5;i++) {
            Integer x = stack.pop();
            System.out.println(x);
        }
    }
}
public class TestofStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stacks.stack_push(stack);
        stacks.stack_pop(stack);

    }
}
