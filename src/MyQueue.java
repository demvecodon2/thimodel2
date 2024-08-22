import quan_ly_ngan_hang.Account;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    private Queue<Integer> queue;

    public MyQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(int item) {
        queue.add(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Dequeue from an empty queue");
        }
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Peek from an empty queue");
        }
        return queue.peek();
    }
}
public static void main(String[] args) {
    Account acc1 = new Account(123456789, "Nguyen Van A");
    Account acc2 = new Account(987654321, "Tran Thi B", 1000);

    System.out.println(acc1);
    acc1.deposit(200);
    acc1.withdraw(50, 5);
    acc1.accrueInterest();
    System.out.println(acc1);

    acc1.transfer(acc2, 100);
    System.out.println(acc1);
    System.out.println(acc2);
}

