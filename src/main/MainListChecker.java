package main;

import java.util.Arrays;

public class MainListChecker {

    public static void main(String[] args) {
        DefaultMyList myList = new DefaultMyList();

        myList.add("1");
        myList.add("2");
        myList.add("3");

        System.out.println(myList);
        myList.remove("2");
        System.out.println(myList);

        myList.add("2");
        System.out.println(myList);
        System.out.println(myList.remove("1"));

        System.out.println(myList);
        myList.add("1");
        System.out.println(myList);
        System.out.println(myList.remove("3"));
        System.out.println(myList);

        System.out.println(myList.remove("5"));
        System.out.println(myList.remove("2"));
        System.out.println(myList.remove("1"));

        System.out.println(myList);
        myList.add("1");
        myList.add("2");
        myList.add("3");
        System.out.println(myList);
        myList.clear();
        System.out.println(myList);

        myList.add("1");
        myList.add("2");
        myList.add("3");
        System.out.println(myList);
        System.out.println(myList.size());

        System.out.println(Arrays.toString(myList.toArray()));
        System.out.println(myList.contains("2"));
        System.out.println(myList.contains(null));

        DefaultMyList myList2 = new DefaultMyList();
        myList2.add("2");
        myList2.add("4");
        System.out.println(myList.containsAll(myList2));

    }
}
