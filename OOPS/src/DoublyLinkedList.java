public class DoublyLinkedList {
    private int size;
    private Node head;
    private Node tail;
    DoublyLinkedList(){
        this.size = 0;
    }

    void InsertFirst(int val){
        Node node = new Node(val, head, null);
        if(head != null){
            head.prev = node;
        }
        head = node;
        if(tail == null){
            tail = node;
        }
        size++;
    }


    void InsertLast(int val){
        Node node = new Node(val, null, tail);
        if(tail != null){
            tail.next = node;
        }
        tail = node;
        if(head == null){
            head = node;
        }
        size++;
    }

    int DeleteFront(){
        if(head == null){
        }
        if(head == tail){
            head = null;
            tail = null;
        }
        int val = head.value;
        head = head.next;
        head.prev = null;
        System.out.println("Element Deleteed = "+val);
        return val;
    }

    int DeleteLast(){
        if(tail == null){
        }
        if(head == null){
            tail = null;
            head = null;
        }
        int val = tail.value;
        tail = tail.prev;
        tail.next = null;
        System.out.println("Last Element is Deleted = "+val);
        return val;
    }



    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
    }
    int max(){
        Node temp = head;
        int max = temp.value;
        while (temp != null){
            if(temp.value > max){
                max = temp.value;
            }else{
                temp = temp.next;
            }
        }
        return max;
    }

    int min(){
        Node temp = head;
        int min = temp.value;
        while (temp != null){
            if(temp.value < min){
                min = temp.value;
            }else{
                temp = temp.next;
            }
        }
        return min;
    }


    void displayReverse(){
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.prev;
        }
    }

    class Node{
        private int value;
        private Node next;
        private Node prev;

        Node(int value){
            this.value = value;
        }
        Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList s = new DoublyLinkedList();
        s.InsertFirst(10);
        s.InsertFirst(20);
        s.InsertFirst(30);
        s.InsertFirst(40);
        s.InsertFirst(50);
        s.display();
        System.out.println();
        s.DeleteFront();
        System.out.println();
        s.display();
        System.out.println();
        s.DeleteLast();
        s.display();
        System.out.println();
        System.out.println("Max Value Is = "+s.max());
        System.out.println("Min Value Is = "+s.min());


    }
}
