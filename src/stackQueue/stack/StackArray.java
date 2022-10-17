package stackQueue.stack;

import stackQueue.IStackAndQueue;

public class StackArray implements IStackAndQueue {
    private int[] arr;
    private int size;
    private int topIndex;

    public StackArray(int size) {
        this.size = size;
        arr = new int[size];
        topIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            topIndex++;
            arr[topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int value = arr[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return topIndex == size - 1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public void print() {
        if (isEmpty()) System.out.println("Stack is empty");
        for (int i = 0; i <= topIndex; i++) {
            System.out.println(arr[i]);
        }
    }
}
