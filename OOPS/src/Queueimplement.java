public class Queueimplement {
    private int[] arr;
    private int rear;
    private int front;
    private int size;


    Queueimplement(int size){
        arr = new int[size];
        front = -1;
        rear = -1;
    }

     boolean isEmpty(){
        if(rear == size -1){
            return true;
        }
        return false;
     }

    boolean isFull(){
        if(front == 0 && rear == size - 1){
            return true;
        }
        return false;
    }

    void Enqueue(int element) throws Exception{
        if(isFull()){
            throw new Exception("Queue Is Full");
        }
        else{
           if(front == -1){
               front = 0;
           }
           rear++;
           arr[rear] = element;
            System.out.println("Element "+element+" Is Inserted :");
        }
    }


    int Dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue Is Empty :");
        }
        else{
           int element = arr[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front++;
        }
            System.out.println("Elemet "+element+" IS Deleted:");
        return element;
        }
    }


    void display()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue Is Empty :");
        }
        System.out.println("Front Is ="+front);
        for(int i=front; i<=rear ; i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args)throws Exception{
        Queueimplement s = new Queueimplement(3);
        s.Enqueue(10);
        s.Enqueue(20);
        s.Enqueue(30);
s.display();
        s.Dequeue();
        s.Dequeue();
        s.Dequeue();
    s.display();
    }


}
