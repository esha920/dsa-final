import java.util.Stack;

public class StringReversal {
    public static String reverseString(String input) {

        Stack<Character> stack = new Stack<>();


        for (char c : input.toCharArray()) {
            stack.push(c);
        }


        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        String input = "hello";
        String reversed = reverseString(input);
        System.out.println("Input: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
