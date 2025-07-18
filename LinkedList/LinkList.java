package LinkedList;

public class LinkList {
    public static void main(String[] args){
        LinkList obj = new LinkList();
        obj.insertTail(10);
        obj.printList();
        obj.deletetTail();
        obj.printList();
        obj.updateNode(3, 40);
        obj.printList();
    }



    Node<Integer> head;
    int size;

    LinkList() {
        this.head = null;
        this.size = 0;
    }

    public void insertNode(int data, int position) {
        if (position > size + 1 || position <= 0) {
            System.out.println("wrong input");
            return;
        }
        // head
        if (position == 1) {
            insertHead(data);

        } else if (position == size + 1) {
            insertTail(data);

        } else {
            int counter = 1;
            Node<Integer> newNode = new Node<>(data);
            Node<Integer> temp = head;
            while (counter < position - 1 && temp != null) {
                counter++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
        System.out.println("insertion is sucessful at position");
    }



    // insertion at head
    public void insertHead(int data) {
        Node<Integer> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            System.out.println("insertion at head is successful");
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        System.out.println("insertion at head is successful");
        size++;
    }

    // insertion at tail
    public void insertTail(int data) {
        Node<Integer> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            System.out.println("insertion at tail is successful");
            size++;
            return;
        }
        Node<Integer> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("insertion at tail is successful");
        size++;
    }

    public void printList(){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.println("data is ->" + temp.data);
            temp = temp.next;
        }
    }

    public void deleteHead(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        Node<Integer> temp = head;
        head = head.next;
        temp.next = null;
        System.out.println("deletion at head is successful");
        size--;
    }

     public void deletetTail() {
        
        if (head == null) {
           
            System.out.println("linked list is empty");
           
            return;
        }
        if(head.next==null){
            head = null;
            size--;
            System.out.println("deletion at head is successful");
            return;
        }
        Node<Integer> temp = head;
        Node<Integer> prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        System.out.println("deletion at tail is successful");
        size--;
    }

    
    public void deletetNode(int position) {
        if (position > size  || position <= 0) {
            System.out.println("wrong input");
            return;
        }
        // head
        if (position == 1) {
            deleteHead();

        } else if (position == size) {
            deletetTail();

        } else {
            int counter = 1;
            Node<Integer> prev = null;
            Node<Integer> temp = head;
            while (counter < position - 1 && temp != null) {
                counter++;
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            temp.next = null;
            size--;
            System.out.println("deletion is sucessful at position" + position);
        }
        
    }

    public void updateNode(int position, int updateValue){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        int counter = 1;
        Node<Integer> temp = head;
        while(counter<position && temp!=null){
            counter++;
            temp = temp.next;

        }
        if(temp != null && counter==position){
            temp.data = updateValue;
        } else{
            System.out.println("size of linked list is smaller than position" + position);
            return;
        }
        System.out.println("Update at position " + position + "was successful");
    }




    


}



class Node<T> {
    T data;
    Node<T> next;

    Node() {
        this.next = null;
    }

    Node(T data) {
        this.next = null;
        this.data = data;

    }

}
