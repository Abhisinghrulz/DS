package stack.misc;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Queue<Integer> queue = new LinkedList<>();
    Queue<Integer> tempQueue = new LinkedList<>();

    public void push(int data) {
        queue.add(data);
    }

    public void pop() {
        if (queue.size() < 1) {
            System.out.println("Nothing to pop");
            return;
        }

        while (queue.size() > 1) {
            tempQueue.add(queue.poll());
        }

        System.out.println(queue.poll());
        queue = tempQueue;
        tempQueue = new LinkedList<>();
    }

    public static void main(String[] args) {
        StackUsingQueue stackUsingQueue = new StackUsingQueue();
        stackUsingQueue.push(10);
        stackUsingQueue.push(20);
        stackUsingQueue.push(30);
        stackUsingQueue.push(40);
        stackUsingQueue.pop();
    }
}