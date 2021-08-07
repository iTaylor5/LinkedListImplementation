package main;

import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import main.DefaultMyList;

public class MainListChecker {

    DefaultMyList test1;

    @Before
    public void setUp() throws Exception {
        test1 = new DefaultMyList();
        test1.add("one");
        test1.add("1");
        test1.add("2");
        test1.add("3");
    }

    /**
     * Test examines a BearFactory with 1 simple bear in it. The bear costs $30
     * and there are no savings.
     */
    @Test
    public void testSize() {
        assertEquals("Check the size method", test1.size(), 4);
    }

//    public static void main(String[] args) {
//
//        DefaultMyList test1 = new DefaultMyList();
//        System.out.println(test1);
//        test1.remove("2");

//        System.out.println(myList);
//
//        myList.add("2");
//        System.out.println(myList);
//        System.out.println(myList.remove("1"));
//
//        System.out.println(myList);
//        myList.add("1");
//        System.out.println(myList);
//        System.out.println(myList.remove("3"));
//        System.out.println(myList);
//
//        System.out.println(myList.remove("5"));
//        System.out.println(myList.remove("2"));
//        System.out.println(myList.remove("1"));
//
//        System.out.println(myList);
//        myList.add("1");
//        myList.add("2");
//        myList.add("3");
//        System.out.println(myList);
//        myList.clear();
//        System.out.println(myList);
//
//        myList.add("1");
//        myList.add("2");
//        myList.add("3");
//        System.out.println(myList);
//        System.out.println(myList.size());
//
//        System.out.println(Arrays.toString(myList.toArray()));
//        System.out.println(myList.contains("2"));
//        System.out.println(myList.contains(null));
//
//        DefaultMyList myList2 = new DefaultMyList();
//        myList2.add("2");
//        myList2.add("4");
//        System.out.println(myList.containsAll(myList2));

//    }
}
