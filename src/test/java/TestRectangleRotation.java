import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRectangleRotation {

    @Test
    public void test1() {
        final int a = 6;
        final int b = 4;
        final int expectedOutput = 23;
        final int test = CommonTasks.rectangleRotation(a, b);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test2() {
        final int a = 30;
        final int b = 2;
        final int expectedOutput = 65;
        final int test = CommonTasks.rectangleRotation(a, b);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test3() {
        final int a = 8;
        final int b = 6;
        final int expectedOutput = 49;
        final int test = CommonTasks.rectangleRotation(a, b);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test4() {
        final int a = 16;
        final int b = 20;
        final int expectedOutput = 333;
        final int test = CommonTasks.rectangleRotation(a, b);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test5() {
        final int a = 20;
        final int b = 32;
        final int expectedOutput = 653;
        final int test = CommonTasks.rectangleRotation(a, b);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test6() {
        final int a = 30;
        final int b = 26;
        final int expectedOutput = 795;
        final int test = CommonTasks.rectangleRotation(a, b);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test9() {
        final int a = 50;
        final int b = 50;
        final int expectedOutput = 2521;
        final int test = CommonTasks.rectangleRotation(a, b);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test10() {
        final int a = 38;
        final int b = 42;
        final int expectedOutput = 1563;
        final int test = CommonTasks.rectangleRotation(a, b);
        assertEquals(expectedOutput, test);
    }

}
