class stack {
    int a[] = new int[5];
    int top=-1;
    int g;

    public void push(int data) {
        if (top== a.length - 1) {
            System.out.println("STACK IS FULL");
        }
        else{
            top++;
            a[top]=data;
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("STACK IS EMPTY");
        }
        else{
            System.out.println("POPPED ELEMENT IS "+a[top]);
            top--;


        }
    }
    class Stack {
        int a[] = new int[5];
        int top = -1;

        public void push(int data) {
            if (top == a.length - 1) {
                System.out.println("STACK IS FULL");
            } else {
                a[++top] = data;
                System.out.println("Pushed: " + data);
            }
        }

        public void pop() {
            if (top == -1) {
                System.out.println("STACK IS EMPTY");
            } else {
                System.out.println("Popped: " + a[top]);
                top--;
            }
        }

        public void display() {
            if (top == -1) {
                System.out.println("Stack is empty.");
                return;
            }
            System.out.print("Elements in the stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        public void peak() {
            if (top == -1) {
                System.out.println("STACK IS EMPTY");
            } else {
                System.out.println("PEAK ELEMENT IN THE STACK IS: " + a[top]);
            }
        }
    }

    public class StackOperationsUsingArray {
        public static void main(String[] args) {
            Stack s = new Stack();

            System.out.println("ELEMENTS AFTER PUSHING");
            s.push(4);
            s.push(3);
            s.push(2);
            s.push(1);
            s.display();

            System.out.println("ELEMENTS AFTER POPPING");
            s.pop();
            s.display();

            s.peak();
            s.display();
        }
    }
