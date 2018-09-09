package stack;


import java.util.Scanner;
import java.util.Stack;

/**
 * 栈的应用：括号匹配
 * */
public class BracketMapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        bracketmapping(string);
    }

    private static void bracketmapping(String string) {
        Stack<Character> stack = new Stack<>();//
        for (int i = 0 ; i < string.length() ; i++){
            if (isLeft(string.charAt(i))){
                stack.push(string.charAt(i));
            }
            if (isRight(string.charAt(i))){
                if (stack.empty()){
                    System.out.println("匹配失败");
                    return;
                }
                if (mapping(string.charAt(i),stack.peek())){
                    stack.pop();
                }else {
                    System.out.println("匹配失败");
                    return;
                }
            }
        }
        if (stack.empty()){
            System.out.println("匹配成功");
        }else System.out.println("匹配失败");
    }

    private static boolean mapping(char c, char peek) {
        switch (c){
            case '}':if (peek=='{') return true;break;
            case ']':if (peek=='[') return true;break;
            case ')':if (peek=='(') return true;break;
        }
        return false;
    }

    private static boolean isLeft(char c) {
        if (c=='{'||c=='['||c=='('){
            return true;
        }
        return false;
    }

    private static boolean isRight(char c) {
        if (c=='}'||c==']'||c==')'){
            return true;
        }
        return false;
    }

}
