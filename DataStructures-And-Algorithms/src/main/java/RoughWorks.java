import java.util.*;

public class RoughWorks {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.add(2);
        stack.push(3);
        System.out.println(stack.peek());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
