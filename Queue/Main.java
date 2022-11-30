public class Main {
    public static void main(String[] args) {
        Queue list = new Queue();

        list.enqueue(new Node(1));
        list.enqueue(new Node(3));
        list.enqueue(new Node(5));
        list.enqueue(new Node(7));
        list.enqueue(new Node(9));

        list.view();
        System.out.println("First element: " + list.first());

        System.out.println("---------");
        list.dequeue();
        list.view();

        System.out.println("First element: " + list.first());
        System.out.println("Size : " + list.size());


    }


}
