import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isStack = false;

        System.out.println("Do you want to use a stack or a queue? (type 'stack' or 'queue')");
        String input = scanner.nextLine().toLowerCase();
        if (input.equals("stack")) {
            isStack = true;
        } else if (!input.equals("queue")) {
            System.out.println("Invalid input. Defaulting to queue.");
        }

        if (isStack) {
            Stack<Integer> stack = new Stack<>();
            while (true) {
                System.out.println("Choose an action (type 'push', 'pop', 'peek', or 'exit')");
                input = scanner.nextLine().toLowerCase();
                if (input.equals("push")) {
                    System.out.println("Enter an integer to push:");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    stack.push(num);
                } else if (input.equals("pop")) {
                    if (stack.isEmpty()) {
                        System.out.println("The stack is empty.");
                    } else {
                        int num = stack.pop();
                        System.out.println("Popped " + num);
                    }
                } else if (input.equals("peek")) {
                    if (stack.isEmpty()) {
                        System.out.println("The stack is empty.");
                    } else {
                        int num = stack.peek();
                        System.out.println("Top element is " + num);
                    }
                } else if (input.equals("exit")) {
                    break;
                } else {
                    System.out.println("Invalid input.");
                }
            }
        } else {
            LinkedList<Integer> queue = new LinkedList<>();
            while (true) {
                System.out.println("Choose an action (type 'enqueue', 'dequeue', 'peek', or 'exit')");
                input = scanner.nextLine().toLowerCase();
                if (input.equals("enqueue")) {
                    System.out.println("Enter an integer to enqueue:");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    queue.add(num);
                } else if (input.equals("dequeue")) {
                    if (queue.isEmpty()) {
                        System.out.println("The queue is empty.");
                    } else {
                        int num = queue.remove();
                        System.out.println("Dequeued " + num);
                    }
                } else if (input.equals("peek")) {
                    if (queue.isEmpty()) {
                        System.out.println("The queue is empty.");
                    } else {
                        int num = queue.peek();
                        System.out.println("Front element is " + num);
                    }
                } else if (input.equals("exit")) {
                    break;
                } else {
                    System.out.println("Invalid input.");
                }
            }
        }

        scanner.close();
    }
}
