public class Queue {
    private int[] array;
    private int first;
    private int lastElement;
    private int capacity;
    private int count;

    Queue(int size) {
        array = new int[size];
        capacity = size;
        first = 0;
        lastElement = -1;
        count = 0;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow\n Program Terminated");
            System.exit(-1);
        }
        int x = array[first];
        System.out.println("Removing " + x);
        first = (first + 1) % capacity;
        count--;
        return x;
    }

    public void enqueue(int point) {
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Inserting " + point);

        lastElement = (lastElement + 1) % capacity;
        array[lastElement] = point;
        count++;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Underflow\n Program Terminated ");
            System.exit(-1);
        }
        return array[first];
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public boolean isFull() {
        return (size() == capacity);
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Front element is " + queue.peek());
        queue.dequeue();
        System.out.println("Front element is " + queue.peek());
        System.out.println("Queue size is " + queue.size());
        queue.dequeue();
        queue.dequeue();
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
    }
}
