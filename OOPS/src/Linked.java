class Linked{
    private Node head;
    private Node tail;
    private int size;

    Linked(){
        this.size = 0;
    }
    void display(){
        Node temp = head;
        for(int i=0; i<size; i++){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print(" End");

    }

    void InserFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    void InserRandom( int index, int val){
        if(index == 0){
            InserFirst(val);
            return;
        }
        if(index == size){
            InsertLast(val);
            return;
        }
        Node temp = head;
        for(int i=0; i<index - 1; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    void InsertLast(int val){
        if(tail == null){
            InserFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    Node removeDublicate(){
        Node current = head;
        while (current != null){
            Node runner = current;
            while (runner.next != null){
                if(runner.next.value == current.value){
                    runner.next = runner.next.next;
                    size--;
                }else{
                    runner = current.next;
                }
            }
            current = current.next;
        }
        return current;
    }

    void removeDu(){
        Node temp = removeDublicate();
        for(int i=0; i<size; i++){
            System.out.print(temp.value+" <- ");
            temp = temp.next;
        }
        System.out.print(" Start");
    }

    public int DeleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    int DeleteRandom(int index){
        if(index == 0){
            return DeleteFirst();
        }
        if(index == size - 1){
            return DeleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

   int DeleteLast(){
        if(size <= 1){
            return DeleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
       System.out.println();
       System.out.println("Last Element Deleted "+val);
        return val;
   }
    int Max(){
        Node temp = head;
        int max = temp.value;
        while(temp != null){
            if(temp.value > max){
                max = temp.value;
            }else{
                temp = temp.next;
            }
        }
        return max;
    }

    int Min(){
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

    Node reversList(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }


    void reverse(){
        Node temp = reversList();
        for(int i=0; i<size; i++){
            System.out.print(temp.value+" <- ");
            temp = temp.next;
        }
        System.out.print(" Start");
    }


    private class Node{
        private int value;
        private Node  next;

        Node(int value){
            this.value = value;
        }
        Node(int value, Node next){
            this.next = next;
            this.value = value;
        }

    }

    public static void main(String[] args) {

        Linked s = new Linked();
        s.InserFirst(10);
        s.InserFirst(30);
        s.InserFirst(50);
        s.InserFirst(40);
        s.InserFirst(20);


        s.display();
    }

}