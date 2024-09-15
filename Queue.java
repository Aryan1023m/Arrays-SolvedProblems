package Arrays;

public class Queue<E> {

        private E[] arr;
        private int front;
        private int rear;
        private int capacity;

        public Queue(int size) {
            capacity = size;
            arr = (E[]) new Object[capacity];
            front = rear = 0;
        }

        public void enqueue(E data) {
            if (rear == capacity) {
                System.out.println("Queue is full (Overflow)");
                return;
            }
            arr[rear++] = data;
        }

        public void dequeue() {
            if (front == rear) {
                System.out.println("Queue is empty (Underflow)");
                return;
            }
            for (int i = 0; i < rear - 1; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
        }

        public E getFront() {
            if (front == rear) {
                System.out.println("Queue is empty");
                return null;
            }
            return arr[front];
        }

        public void display() {
            if (front == rear) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = front; i < rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Queue<Integer> queue = new Queue<>(4);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);

            System.out.print("Queue elements: ");
            queue.display();

            queue.enqueue(60);
            System.out.print("Queue elements after adding 60: ");
            queue.display();

            queue.dequeue();
            queue.dequeue();
            System.out.print("Queue elements after two deletions: ");
            queue.display();

            System.out.println("Front element: " + queue.getFront());
        }
    }

