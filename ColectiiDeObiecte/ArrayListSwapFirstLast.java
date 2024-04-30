package ColectiiDeObiecte;

import java.util.ArrayList;

public class ArrayListSwapFirstLast {

    public static ArrayList<String> swapFirstLast(ArrayList<String> list) {
        if (list.size() > 1) {
            String string = list.get(0);
            list.set(0, list.get(list.size() - 1));
            list.set(list.size() - 1, string);
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");

        ArrayList<String> swappedList = swapFirstLast(list);

        System.out.println(swappedList);
    }
}
