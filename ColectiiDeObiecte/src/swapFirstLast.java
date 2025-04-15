
import java.util.ArrayList;

public class swapFirstLast {

    public ArrayList<String> swapFirstLast(ArrayList<String> list){
        String aux;
        if(list.size() > 1){
            aux = list.getFirst();
            list.set(0, list.getLast());
            list.set(list.size() - 1, aux);

            return list;
        }
        return list;
    }

    public static void main(String[] args) {

        swapFirstLast swap = new swapFirstLast();

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("hello");
        list1.add("world");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("hello");

        ArrayList<String> list3 = new ArrayList<String>();

        System.out.println(swap.swapFirstLast(list1));
        System.out.println(swap.swapFirstLast(list2));
        System.out.println(swap.swapFirstLast(list3));

    }
}