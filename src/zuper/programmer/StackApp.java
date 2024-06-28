package zuper.programmer;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Mohammad");
        stack.push("Sirajul");
        stack.push("Umam");

        for (var next = stack.pop(); next != null; next = stack.pop()) {
            System.out.println(next);
        }
    }
}
