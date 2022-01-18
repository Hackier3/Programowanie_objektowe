package pl.imiajd.grzes;

import java.util.Stack;

public class zadanie6 {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        int number = 2015;
        while(number>0){
            stack.add(number%10);
            number = number/10;
        }
        while(stack.isEmpty() != true)
        System.out.println(stack.pop());
    }
}
