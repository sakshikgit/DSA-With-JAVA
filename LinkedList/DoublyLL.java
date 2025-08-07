package LinkedList;

public class DoublyLL {
    public static void main(String[] args) {
        DoublyLL obj = new DoublyLL();
        obj.insertTail(10);
        obj.printList();
        // obj.deletetTail();
        // obj.printList();
        // obj.updateNode(3, 40);
        // obj.printList();
    }

    DoublyNode<Integer> head;
    DoublyNode<Integer> tail;
    int size;

    DoublyLL() {
        this.head = null;
        this.tail = null;
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
            DoublyNode<Integer> newNode = new DoublyNode<>(data);
            DoublyNode<Integer> temp = head;
            while (counter < position - 1 && temp != null) {
                counter++;
                temp = temp.next;
            }
            DoublyNode<Integer> currentNode = temp.next;
            newNode.next = currentNode;
            currentNode.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;

            size++;

        }
        System.out.println("insertion is sucessful at position");
    }

    // insertion at head
    public void insertHead(int data) {
        DoublyNode<Integer> newNode = new DoublyNode<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            System.out.println("insertion at head is successful");
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        System.out.println("insertion at head is successful");
        size++;
    }

    // insertion at tail
    public void insertTail(int data) {
        DoublyNode<Integer> newNode = new DoublyNode<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            System.out.println("insertion at tail is successful");
            size++;
            return;
        }
        DoublyNode<Integer> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;
        System.out.println("insertion at tail is successful");
        size++;
    }

    public void printList() {
        DoublyNode<Integer> temp = head;
        while (temp != null) {
            System.out.println("data is ->" + temp.data);
            temp = temp.next;
        }
    }

    public void printListReverse() {
        DoublyNode<Integer> temp = tail;
        while (temp != null) {
            System.out.println("data is ->" + temp.data);
            temp = temp.prev;
        }
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }
        DoublyNode<Integer> temp = head;
        head = head.next;
        temp.next = null;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }

        System.out.println("deletion at head is successful");
        size--;
    }

    public void deletetTail() {

        if (head == null) {

            System.out.println("linked list is empty");

            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            size--;
            System.out.println("deletion at head is successful");
            return;
        }
        DoublyNode<Integer> temp = head;
        DoublyNode<Integer> prevNode = null;
        while (temp.next != null) {
            prevNode = temp;
            temp = temp.next;
        }
        prevNode.next = null;
        temp.prev = null;
        tail = prevNode;
        System.out.println("deletion at tail is successful");
        size--;
    }

    public void deletetNode(int position) {
        if (position > size || position <= 0) {
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
            DoublyNode<Integer> prevNode = null;
            DoublyNode<Integer> temp = head;
            while (counter < position - 1 && temp != null) {
                counter++;
                prevNode = temp;
                temp = temp.next;
            }
            DoublyNode<Integer> nextNode = temp.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            temp.prev = null;
            temp.next = null;
            size--;
            System.out.println("deletion is sucessful at position" + position);
        }

    }

    public void updateNode(int position, int updateValue) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        int counter = 1;
        DoublyNode<Integer> temp = head;
        while (counter < position && temp != null) {
            counter++;
            temp = temp.next;

        }
        if (temp != null && counter == position) {
            temp.data = updateValue;
        } else {
            System.out.println("size of linked list is smaller than position" + position);
            return;
        }
        System.out.println("Update at position " + position + "was successful");
    }

}

class DoublyNode<T> {
    T data;
    DoublyNode<T> next;
    DoublyNode<T> prev;

    DoublyNode() {
        this.next = null;
        this.prev = null;
    }

    DoublyNode(T data) {
        this.next = null;
        this.data = data;
        this.prev = null;

    }

}
