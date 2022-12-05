public class Chaining {
    int index = 0;
    int data = 0;
    Node[] table = new Node[10];
    public int hashFunction(int key){
        return key % table.length;
    }
    public void add(Node node){
        index = hashFunction(node.data);
        if (table[index] == null){
            table[index] = node;
        }else{
            Node temp = table[index];
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void view(){
        for (int i = 0; i < table.length; i++){
            if (table[i] == null) {
                table[i] = new Node();
                table[i].data = 0;
            }
            System.out.print(i + ". index: " + table[i].data);

            if (table[i].next != null){
                Node temp = table[i];
                while (temp.next != null){
                    temp = temp.next;
                    System.out.print(" -> " + temp.data);
                }
            }System.out.println();
        }
    }

    public Node search(int key){
        index = hashFunction(key);
        Node temp = table[index];
        while (temp.next == null){
            if (temp.data == key){
                return temp;
            }
            temp = temp.next;
        }
        return  null;
    }

    public void delete(int value){
        index = hashFunction(value);
        if (table[index].data == value) {
            if (table[index].next != null) {
                table[index] = table[index].next;
            }
            else {
                table[index].data = 0;
            }

        }else{
            Node temp = table[index];
            while (temp.next.data != value){
                    temp = temp.next;
            }
                temp.next = temp.next.next;

        }

    }




}
