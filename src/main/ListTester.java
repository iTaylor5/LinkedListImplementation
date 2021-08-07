package main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ListTester {

    DefaultMyList test1;

    @Before
    public void setUp() throws Exception {
        test1 = new DefaultMyList();
        test1.add("one");
        test1.add("1");
        test1.add("2");
        test1.add("3");
    }

    @After
    public void tearDown() throws Exception {
        test1 = null;
    }

    /**
     * Test ensures the add() worked and the size() works
     */
    @Test
    public void testSize() {
        assertEquals("Check the size method", test1.size(), 4);
    }

    /**
     * Test checks the add()
     */
    @Test
    public void testAdd() {
        test1.add("four");
        assertEquals("Check the list has increased by one", test1.size(), 5);
    }

    /**
     * Test checks the remove()
     */
    @Test
    public void testRemove() {
        test1.remove("four");
        assertEquals("Check the list has decreased by one", test1.size(), 4);
        assertFalse(test1.contains("four"));
    }

    /**
     * Test checks the contains()
     */
    @Test
    public void testContains() {

        assertTrue(test1.contains("one"));
        assertFalse(test1.contains("4"));
    }

    /**
     * Test checks the containsAll()
     */
    @Test
    public void testContainsAll() {
        DefaultMyList list = new DefaultMyList();
        list.add("one");
        list.add("1");
        assertTrue(test1.containsAll(list));
        DefaultMyList list1 = new DefaultMyList();
        list1.add("one");
        list1.add("4");
        assertFalse(test1.containsAll(list1));
    }
}
