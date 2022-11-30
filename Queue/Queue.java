public class Queue {
    Node node_first;

    public void enqueue(Node node){
        if (node_first == null){
            node_first = node;
        }else{
            Node temp = node_first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void dequeue(){
        if (node_first.next ==  null){
            node_first = null;
        }else {
            node_first = node_first.next;
        }
    }

    public int first(){
        return node_first.data;
    }
    public int size(){
        int counter = 0;
        Node temp = node_first;

        while (temp.next != null) {
            temp = temp.next;
            counter++;
        }

        return ++counter;
    }

    public void view(){
        Node temp = node_first;

        while (temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
