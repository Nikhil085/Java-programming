    class StackimpUsingLL{

    Node head;
    int size;

    StackimpUsingLL(){
        head = null;
    }

    void push(int value){
        Node ExtraNode = head;
        head = new Node();
        head.value = value;
        head.next = ExtraNode;
        size++;
        System.out.println("Element "+value+" is Inserted : ");
    }

    int pop()throws Exception{
        if(head == null){
            throw new Exception("Stack Is Empty : ");
        }
        int poped = head.value;
        head = head.next;
        size--;
        System.out.println("Element "+poped+" Is Deleted : ");
        return poped;
    }

    int peek()throws Exception{
        if(head == null){
            throw new Exception("Stack Is Empty : ");
        }
        return head.value;
    }

    void display()throws Exception{
        if(head == null){
            throw new Exception("Stack Is Empty : ");
        }
        Node temp = head;
        for(int i=0; i<size; i++){
            System.out.println(temp.value+" ");
            temp = temp.next;
        }
    }

    class Node{
        int value;
        Node next;

    }
    public static void main(String[] args)throws Exception{
        StackimpUsingLL list = new StackimpUsingLL();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.display();
        list.pop();
        list.pop();
        list.display();


    }
}











