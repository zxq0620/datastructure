package stack;


import java.util.Scanner;
import java.util.Stack;

/**
 * 栈的应用：数制转换，输入一个十进制数，将其转换成八进制数
 * */
public class Conversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Stack stack = conversion(num);
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
    }

    private static Stack<Integer> conversion(int num) {
        Stack<Integer> stack = new Stack<>();//空栈
        while (num!=0){
            stack.push(num%8);
            num=num/8;
        }
        return stack;
    }
}
