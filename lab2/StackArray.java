
public class StackArray {
    int max;
    int top;
    int arr[];
    int size;

    public StackArray() {
        max = 10;
        top = 0;
        arr = new int[max];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int top() {
        if (isEmpty()) {
            return 0;
        } else {
            return top;
        }
    }

    public void push(int a) {
        if (top > max) {
            System.out.println("StackOverflowError");
        } else {
            arr[top++] = a;
            System.out.println(a);
        }
        size = size + 1;
    }

    public int pop() {
        if (size == 0) {
            System.out.println("stackUnderFlow");
        } else {
            top = arr[top - 1];

        }
        size = size - 1;
        return arr[top + 1];

    }

    public static void main(String[] args) {
        StackArray obj = new StackArray();

        obj.push(2);
        obj.push(4);
        obj.push(2);
        

        obj.push(4);
        obj.push(2);
        obj.push(4);
        System.out.println("the popped num = " + obj.pop());
        System.out.println("the size of the array is " + obj.size());

        assert (obj.isEmpty() == false);
        assert (obj.top() == 4);
        assert (obj.size() == 6);
        System.out.println("success");

    }
}