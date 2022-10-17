package stackQueue;

import stackQueue.stack.StackArray;

public class Test {
    public static void main(String[] args) {
        StackArray stack = new StackArray(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.print();
        stack.pop();
        stack.print();
    }
}
