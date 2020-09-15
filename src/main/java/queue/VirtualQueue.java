package queue;

import java.util.Stack;

public class VirtualQueue {

    Stack<Integer> stackWithOldOnTop = new Stack<>();
    private Stack<Integer> stackWithNewOnTop = new Stack<>();

    public void enqueue(int item) {
        stackWithNewOnTop.push(item);
    }

    public int dequeue() {
        shiftStacks();
        return stackWithOldOnTop.pop();
    }

    private void shiftStacks() {
        if (stackWithOldOnTop.isEmpty()) {
            while (!stackWithNewOnTop.isEmpty()) {
                stackWithOldOnTop.push(stackWithNewOnTop.pop());
            }
        }
    }

    public static void main(String[] args) {
        VirtualQueue virtualQueue = new VirtualQueue();
        virtualQueue.enqueue(1);
        virtualQueue.enqueue(2);
        virtualQueue.enqueue(3);
        System.out.println(virtualQueue.dequeue());
    }
}
