
import java.util.ArrayList;
import java.util.List;

public class MyHashMap {
    private List<List<Integer>> entries;
    // static List<Integer> l1 = new ArrayList<>(List.of(key, value));
    
    public MyHashMap() {
        this.entries = new ArrayList<>();
    }
    
    public void put(int key, int value) {
         for (List<Integer> list : this.entries) {
            // if (list.get(0)==key) {
            //     list.set(1, value);
            //     return ;
            // }
            list.set(0,key);
            list.set(1,value);
         }
         this.entries.add(new ArrayList<>(List.of(key,value)));
        // l1.add(key, value);
    }
    
    public int get(int key) {
        for (List<Integer> list : this.entries) {
            if (list.get(0)==key) {
                return list.get(1);
            }
        }
        return -1;
        // return l1.get(key);
    }
    
    public void remove(int key) {
        // l1.remove(key);
        for (List<Integer> list : entries) {
            if (list.get(0)==key) {
                entries.remove(list);
            }
        }
        
    }

    public static void main(String[] args) {
        MyHashMap l1 = new MyHashMap();
        l1.put(1, 10);
        l1.put(2,20);
        l1.remove(1);
        System.out.println(l1.get(2));

        List<Integer> name = new ArrayList<>();
        name.add(10);
        name.add(11);
        System.out.println(name.get(1));
        System.out.println(name.size());

        List<List<Integer>> lll1=new ArrayList<>(List.of(List.of(1,2),List.of(2,3)));
        System.out.println(lll1);

    }
}

