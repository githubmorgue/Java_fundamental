package Application;

import java.util.Stack;

/**
 * stack
 * author: 吴师兄学算法 https://www.algomooc.com
 */
public class stack {

    public static void main(String[] args) {
        // Create an instance of the stack class
        stack stackObj = new stack();

        // Call the isValid method with a sample string
        boolean result = stackObj.isValid("sample string");

        // Print the result
        System.out.println("Result: " + result);
    }

    public boolean isValid(String s) {
        aboutStack();
        return true;
    }

    public void aboutStack() {

        // 初始化栈，数据类型为 Integer
        Stack<Integer> s = new Stack<Integer>();

        // 练习栈的 5 个基本操作

        // 1. push()
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.printf("s = %s \n", s.toString());
        System.out.println("------------------");

        // 2、top()，在 Java 中 Stack 这个类是用 peek 获取栈顶元素的
        System.out.printf("s.top() = %d \n", s.peek());
        System.out.println("------------------");

        // 3、pop()
        s.pop();
        System.out.printf("s = %s \n", s.toString());
        s.pop();
        System.out.printf("s = %s \n", s.toString());
        System.out.println("------------------");
        

        // 4、empty()
        if(s.isEmpty()) {
            System.out.println("s is empty! ");
        } else {
            System.out.println("s is not empty!");
        }
        System.out.println("------------------");

        // 5、size()
        System.out.printf("s = %s \n", s.toString());
        System.out.printf("s.size = %d \n", s.size());
        System.out.println("------------------");
    }
}