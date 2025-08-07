package Queue;

public class Myqueue {
    int rear;
    int front;
    int size;
    int capacity;
    int queue[];

    public Myqueue(int capacity) {
        queue = new int[capacity];
        capacity = this.capacity;
        size = 0;
        rear = front = -1;

    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public int size(){
        return size;
    }

    public boolean isFull() {
        if (rear == capacity - 1) {
            return true;
        }
        return false;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        return queue[front];
    }

    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;

        } else {
            rear++;

        }
        size++;
        queue[rear] = val;

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;

        }
        int val = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        }else{
        front++;
        }
        size--;
        return val;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("empty");
            return;

        }
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
            if (i != rear) {
                System.out.println(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Myqueue myQueue = new Myqueue(5);
        myQueue.enqueue(7);
        myQueue.capacity;

    }

}
