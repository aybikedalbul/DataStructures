public class QuadraticProbing {
    int[] table = new int[10];
    int index = 0;
    int i = 1;
    public int hashFunction(int key){
        int hash = key % table.length;
        return hash;
    }

    public void add(int key){
        index = hashFunction(key);
         int index2 = index;

        if (table[index] == 0){
            table[index] = key;
        }else {
            while (table[index2] != 0){
                index2 = (index + (i * i)) % 10;
                i++;
            }
            table[index2] = key;
        }
    }

    public int search(int key){
        index = hashFunction(key);
        int index2 = index;
        if (table[index] == key){
            return index;
        }
        else {
            while (table[index2] != 0) {
                index2 = (index + (i * i)) % 10;
                i++;
                if (table[index2] == key){
                    return index2;
                }
            }
            return -1;
        }
    }

    public void delete(int key){
            index = search(key);

        if (index != -1 && table[index] != 0) {
            table[index] = -1;
        }
    }
    public void list(){
        for (int i = 0; i < table.length; i++){
            System.out.print(table[i] + " ");
        }
    }
}
