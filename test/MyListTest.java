

import org.junit.*;

public class MyListTest {

    @Test
    public void isEmpty() {
        MyList list = new MyList(5);
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void add() {
        MyList list = new MyList(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Assert.assertEquals(6,list.get(5));
    }

    @Test
    public void remove() {
    }

    @Test
    public void testContains() {
        MyList list = new MyList(2);
        list.add(0, 1);
        list.add(1, 2);
        Assert.assertTrue(list.contains(1));
    }


    @Test
    public void get() {
        MyList list = new MyList(2);
        list.add(0, 1);
        list.add(1, 2);
        Assert.assertEquals(2, list.get(1));
    }

    @Test
    public void testAdd() {
        MyList list = new MyList(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3, "sss");
        Assert.assertEquals(list.get(3), "sss");
    }

    @Test
    public void testRemove() {
        MyList list = new MyList(2);
        list.add(0, 1);
        list.add(1, 2);
        list.remove(1);
        Assert.assertFalse(list.contains(2));
    }
}