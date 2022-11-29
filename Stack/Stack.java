import java.util.LinkedList;

public class Stack {
    Node node_first;

    public void push(Node node){
        if (node_first == null){
            node_first = node;
        }
        else{
            Node temp = node_first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void top(){
        Node temp = node_first;
        while (temp.next != null){
            temp = temp.next;
        }
        System.out.println("TOP : " + temp.data);
    }

    public void pop(){
        if (node_first.next == null){
            node_first = null;
        }else{
            Node temp = node_first;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;

        }
    }

    public void view(){
        Node temp = node_first;

        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);


    }

    public int numberOfElements(){
        int counter = 1;
        Node temp = node_first;

        while(temp.next != null){
            temp = temp.next;
            counter++;
        }
        return counter;
    }
}
