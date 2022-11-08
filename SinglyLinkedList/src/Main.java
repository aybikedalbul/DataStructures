public class Main {
    public static void main(String[] args) {


        SinglyLinkedList list = new SinglyLinkedList();
        SinglyLinkedList list1 = new SinglyLinkedList();

        list.addFirst(new Node("Ankara"));
        list.addFirst(new Node("İstanbul"));
        list.addFirst(new Node("İzmir"));
        list.addFirst(new Node("Antalya"));


        list1.addAnd(new Node("Mersin"));
        list1.addAnd(new Node("Tekirdag"));
        list1.addAnd(new Node("Eskisehir"));
        // list.addIndex(new Node("Bolu"),2);
        // list.deleteLast();

        //list.view();
        System.out.println();

        Node text = list.merge(list,list1);
        list.view(text);





    }




}
