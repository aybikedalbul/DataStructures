public class Main {
    
    public static void main(String[] args) {

        Stack list = new Stack();

        list.push(new Node(10));
        list.push(new Node(15));
        list.push(new Node(12));
        list.push(new Node(17));
        list.push(new Node(20));
        list.push(new Node(8));
        list.push(new Node(25));

        list.view();

        list.pop();
        list.view();

        list.top();
        System.out.println("Number of elements of the stack: " + list.numberOfElements());

        list.push(new Node(42));
        list.view();

        list.pop();
        list.view();

    }

}
