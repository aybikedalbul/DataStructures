import java.util.Scanner;

public class Main {

    static DoubleHashing doubleHashing = new DoubleHashing();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* //LinearProbing
        LinearProbing lp = new LinearProbing();

        lp.add(35);
        lp.add(42);
        lp.add(72);
        lp.add(55);
        lp.add(11);
        lp.add(79);

        lp.list();*/

     /*   //QuadraticProbing
        QuadraticProbing qp = new QuadraticProbing();

        qp.add(35);
        qp.add(55);
        qp.add(15);
        qp.add(82);
        qp.add(97);
        qp.add(37);
        qp.add(88);
        qp.add(111);

        qp.list();
        System.out.println();
        qp.delete(37);
        qp.list();*/
     /*
       -- Chaining Hashing --

        Chaining chaining = new Chaining();

        chaining.add(new Node(10));
        chaining.add(new Node(25));
        chaining.add(new Node(33));
        chaining.add(new Node(42));
        chaining.add(new Node(4));
        chaining.add(new Node(88));
        chaining.add(new Node(79));
        chaining.add(new Node(11));
        chaining.add(new Node(111));
        chaining.add(new Node(21));
        chaining.add(new Node(5));
        chaining.view();*/
    /* -- Double Hashing --
        doubleHashing.add(65);
        doubleHashing.add(75);
        doubleHashing.add(27);
        doubleHashing.add(17);
        doubleHashing.add(47);
        doubleHashing.list();

        System.out.println("----");
        System.out.print("Enter a key from the table: ");
        int key = scanner.nextInt();
        System.out.println("The value you entered is at index : " + doubleHashing.search(key));*/

    }
}
