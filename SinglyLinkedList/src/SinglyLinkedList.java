public class SinglyLinkedList {

    Node node_first;

    public void addFirst(Node node){
        node.next = node_first;
        node_first = node;
    }

    public void addAnd(Node node){
        Node temp = node_first;
        if (node_first == null){
            node_first = node;
        }
        else {
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void view(){
        Node temp = node_first;

        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void view(Node temp){

        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void addIndex(Node node,int index){
        Node temp = node_first;
        if (node_first == null) {
            node_first = node;
        }
        else {
            for (int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;

        }
    }
    //Silme işlemleri

    public void deleteFirst(){
        node_first = node_first.next;
    }
    public void deleteLast(){
        Node temp = node_first;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public void deleteIndex(int index){
        Node temp = node_first;

        for (int i = 0; i < index-1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
      
    }

    
    public Node merge(SinglyLinkedList list1, SinglyLinkedList list2){
        Node temp = list1.node_first;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = list2.node_first;
        return list1.node_first;

  }

}
