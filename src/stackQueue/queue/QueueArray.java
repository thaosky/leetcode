package stackQueue.queue;

import stackQueue.IStackAndQueue;

public class QueueArray implements IStackAndQueue {
    private int[] arr;
    private int size;
    private int headIdx;
    private int tailIdx;

    public QueueArray(int size) {
        this.size = size;
        arr = new int[size];
        headIdx = tailIdx = -1;
    }

    @Override
    public boolean push(int value) {
        return false;
    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public boolean isFull() {
        return tailIdx == size - 1;
    }

    @Override
    public boolean isEmpty() {
        return (headIdx == -1 && tailIdx == -1);
    }

    @Override
    public void print() {
        for (int i = 0; i <= tailIdx; i++) {

        }
    }
}
