public class QueueUsingLL {
    private Node rear = null;
    private Node front = null;
    private int size;


    boolean isEmpty(){
        return front == null && rear == null;
    }

    void Enqueue(int val){
        Node node = new Node(val);
        if(front == null){
            front = node;
            rear = node;
        }else{
            rear.next = node;
            rear = node;
        }
        size++;
        System.out.println("Element "+val+" Is Inserted : ");
    }

    int Dequeue()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue Is Empty : ");
        }
            Node temp = front;
            if(front != null){
                front = front.next;
                size--;
            }else{
                rear = null;
            }
            System.out.println("Element "+temp.value+" Is Deleted : ");
            return temp.value;
    }

    void display()throws Exception{
        if(front == null){
            throw new Exception("Queue Is Empty : ");
        }
        Node temp = front;
        while (temp != null){
            System.out.println(temp.value+" ");
            temp = temp.next;
        }
    }

    int peek()throws Exception{
        if(front == null){
            throw new Exception("Queue Is Empty : ");
        }
        return front.value;
    }


    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args)throws Exception{
        QueueUsingLL q = new QueueUsingLL();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.display();
        q.Dequeue();
        q.Dequeue();
q.display();
    }
}
