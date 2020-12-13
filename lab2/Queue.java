public class Queue {
    int front;
    int max;
    int rear;
    int size;
    int arr[];

    public Queue() {
        front = 0;
        max = 10;
        rear = 0;
        size = 0;
        arr = new int[max];
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int len() {
        if (isEmpty()) {
            return 1;
        }
        return size;
    }

    public void enQueue(int x) {
        if (rear > max) {
            System.out.println("QueueOverFlowError");
        } else {
            arr[rear] = x;
            rear++;
            size++;
            System.out.println("Elements : " + x);
        }
    }

    public int deQueue() {
        if (rear > max) {
            System.out.println("QueueUnderFlowError");
        } else {
            int x;
            x = arr[front];
            front++;
            size--;
            return x;
        }
        return front;
    }

    public int printFirstElement() {
        if (isEmpty()) {
            return 1;
        } else {
            int x;
            x = arr[front];
            return x;
        }
    }

    public static void main(String[] args) {
        Queue obj = new Queue();
        obj.enQueue(3);
        obj.enQueue(2);
        obj.enQueue(7);
        obj.enQueue(30);
        obj.enQueue(11);
        obj.enQueue(99);
        System.out.println("removed element is: " + obj.deQueue());
        System.out.println("removed element is: " + obj.deQueue());
        System.out.println("After removing the element from queue the first element is : " + obj.printFirstElement());
        System.out.println("This is conditions whether it is empty or not : " + obj.isEmpty());
        System.out.println("The size of a queue after removing that element : " + obj.len());

        assert (obj.isEmpty() == false);
        //assert (obj.printFirstElement() == 10);
        assert (obj.len() == 5);
        System.out.println("Success");
    }
}