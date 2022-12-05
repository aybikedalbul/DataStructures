public class DoubleHashing  {
    int[] table = new int[10];
    int index = 0;

    public int hashFunction1(int key){
        return key % table.length;
    }
    public int hashFunction2(int key){
        return  ((key % 7) * 3) % table.length;
    }

    public void add(int value){
        index = hashFunction1(value);
        int index2 = index;
        int counter = 1;

        while (table[index2] != 0){
            index2 = (index + counter * hashFunction2(value)) % table.length;
            counter++;
        }
        table[index2] = value;
    }
    public int search(int key){
        index = hashFunction1(key);
        if (table[index] == key){
            return index;
        }else {
           int index2 = index;
           int counter = 1;

            while (table[index2] != 0){
                index2 = (index + counter * hashFunction2(key)) % table.length;
                if (table[index2] == key) {
                    return index2;
                }
                }
                counter++;
            }
        return -1;
        }


    public void delete(int key){
        index = search(key);
        table[index] = 0;
    }
    public void list(){
        for (int i = 0; i < table.length; i++){
            System.out.println(i + ". index: " + table[i]);
        }
    }
}

