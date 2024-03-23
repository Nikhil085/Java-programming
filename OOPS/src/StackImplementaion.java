import java.util.EmptyStackException;

class Stack{
    private int[] arr;
    private int capacity;
    private int top;


    Stack(){
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int value){
        if(isFull()){
            throw new StackOverflowError("Stack Is OverFlow");
        }
        top++;
        System.out.println("Element "+value+"  Is Inserted In Stack !");
        arr[top] = value;
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int poped = top--;
        System.out.println("Value = "+poped+"  Is Pop Out !");
        return poped;
    }

 public boolean isEmpty(){
        return top == - 1;
 }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return arr[top];
    }

    public int size(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top + 1;
    }

public void sort(){
        if(isEmpty()){
            System.out.println("Stack Is Empty : ");
        }
        Stack tempStack = new Stack();
        while (!isEmpty()){
            int temp = pop();

            while (!tempStack.isEmpty() && tempStack.peek() > temp){
                push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        while (!isEmpty()){
            push(tempStack.pop());
        }
}


    public void show(){
        if(isEmpty()){
            System.out.println("Stack Is Empty !");
           return;
        }
        System.out.println("Stack Is ");
        for(int i=top; i>=0; i--){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}


public class StackImplementaion {
    public static void main(String[] args) {
      Stack stack = new Stack();
        stack.push(10);
        stack.push(50);
        stack.push(20);
        stack.push(40);
        stack.push(30);
        stack.show();
        stack.sort();
       stack.show();
    }
}
