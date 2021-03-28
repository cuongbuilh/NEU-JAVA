package ex3_arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("apples");
        list.add("bananas");
        list.add("grapes");
        list.add("pears");
        list.add("black plums");
        System.out.println("My array list currently includes: " + list);

        list.add("apples");
        list.add("bananas");
        list.add("grapes");
        list.add("pears");
        list.add("black plums");
        System.out.println("My array list currently includes: " + list);

        System.out.println("The size of our current array list is: " + list.size());
        list.clear();
        System.out.println("The array list is currently empty: " + list.isEmpty());
    }
}
