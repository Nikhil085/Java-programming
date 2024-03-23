class Queue{
    private int[] arr;
    private int rear;
    private int front;
    private int size;
    private int capacity;

    Queue(int size){
        capacity = size;
        arr = new int[size];
        rear = -1;
        front = 0;
        this.size = 0;
    }

    public void push(int x) throws Exception{
        if(isFull()){
            throw new Exception("Queue Is Full Here");
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
        System.out.println("Element "+x+" iS Inserted Here !");
    }

    public int delete() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue Is Empty Here !");
        }
        int deleted = arr[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Element "+deleted+" iS deleted Here !");
       return deleted;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue Is Empty Here !");
        }
        return arr[front];
    }

    public void data(){
        if(isEmpty()){
            System.out.println("Queue Is Empty Here !");
        }
        System.out.println();
        for(int i=0; i<size; i++){
            int index = (front + i) % capacity;
            System.out.print(arr[index]+" ");
        }
    }

    public int size(){
        if(isEmpty()){
            System.out.println("Queue Is Empty Here !");
        }
        return rear + 1;
    }
    public boolean isFull(){
        return size == capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}

public class QueueImplementaionUsingArray {
    public static void main(String[] args) throws Exception {
 Queue s = new Queue(3);
        s.push(10);
        s.push(20);
        s.push(30);
        s.data();
        s.push(40);
        System.out.println("Size OF Queue Is = "+s.size());


    }
}
