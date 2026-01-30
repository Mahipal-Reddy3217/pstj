class Stack {
    private int[] stack = new int[4];
    private int top = -1;

    // Push operation
    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Push Overflow");
        } else {
            stack[++top] = value;
            System.out.println("Push(" + value + ")");
        }
    }

    // Pop operation
    public void pop() {
        if (top == -1) {
            System.out.println("Pop Underflow");
        } else {
            System.out.println("(" + stack[top--] + ")");
        }
    }

    // Display current stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack: []");
            return;
        }
        System.out.print("Stack: [");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]);
            if (i < top) System.out.print(", ");
        }
        System.out.println("]");
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.display();

        s.push(20);
        s.display();

        s.push(30);
        s.display();

        s.push(40);
        s.display();

        s.push(50);
        s.display();

        s.pop();
        s.display();

        s.pop();
        s.display();

        s.pop();
        s.display();

        s.pop();
        s.display();

        s.pop();
        s.display();



      

           
    }
}