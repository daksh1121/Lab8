package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testPushPop() {
        myStack<Integer> stack = new myStack<>();
        stack.push(1);
        assertEquals(1, stack.pop().intValue());
    }

    public void testPushPopWithDelegate() {
        myStack<Integer> stack = new myStack<>();
        stack.push(7);
        assertEquals(7, stack.pop().intValue());
    }

    public void testEmpty() {
        myStack<Integer> stack = new myStack<>();
        assertTrue(stack.isEmpty());
    }

    public void testSize() {
        myStack<Integer> stack = new myStack<>();
        stack.push(10);
        stack.push(7);
        stack.push(18);
        assertEquals(3, stack.getSize());
    }
}
