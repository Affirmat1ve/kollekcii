

import org.junit.*;


public class MyStackTest {

    @Test
    public void push() {
        MyStack stack = new MyStack();
        stack.push(5);
        Assert.assertEquals(1, stack.size());
        Assert.assertEquals(5, stack.peek());

    }

    @Test
    public void pop() {
        MyStack stack = new MyStack();
        stack.push(2);
        stack.push(3);
        Assert.assertEquals(3, stack.pop());
        Assert.assertEquals(1, stack.size());
    }

    @Test
    public void testPeekEmpty() {
        MyStack testStack = new MyStack();
        Assert.assertEquals(null, testStack.peek());
    }

    @Test
    public void testPeekNotEmpty() {
        MyStack testStack = new MyStack();
        testStack.push(5);
        Assert.assertEquals(5, testStack.peek());
    }

    @Test
    public void empty() {
        MyStack stack = new MyStack();
        Assert.assertTrue(stack.empty());
    }
}