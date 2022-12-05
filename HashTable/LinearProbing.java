public class LinearProbing { // H(x) + i

     int[] table = new int[10];
    int index = 0;

    public int hashFunction(int key){
        int hash = key % table.length;
        return  hash;
    }

    public void add(int key){
        index = hashFunction(key);

        if (table[index] == 0){
            table[index] = key;
        }else {
            while (table[index] != 0){
                index = (index + 1) % 10;
            }
            table[index] = key;
        }
    }

    public int search(int key){
        index = hashFunction(key);
        if (table[index] == key){
            return index;
        }
        else {
            while (table[index] != 10){
                index = (index + 1) % 10;
                if (table[index] == key){
                    return index;
                }
            }
        }
        return  -1; // Not found
    }

    public void delete(int key){
        index = search(key);
        if (table[index] != -1 && table[index] != 0){
            table[index] = -1;
        }
    }

    public void list(){

        for (int i = 0; i < 10; i++){
            System.out.print(table[i] + " ");
        }
    }
}
