import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testMergeData1() {
        Main main = new Main();
        int[] customerData1 = {101, 104, 107, 0, 0, 0};
        int[] customerData2 = {102, 105, 108};
        int n = 3;
        int m = 3;
        int[] expectedOutput = {101, 102, 104, 105, 107, 108};
        Assertions.assertArrayEquals(expectedOutput, main.mergeData(customerData1, customerData2, n, m));
    }

    @Test
    public void testMergeData2() {
        Main main = new Main();
        int[] customerData1 = {103};
        int[] customerData2 = {};
        int n = 1;
        int m = 0;
        int[] expectedOutput = {103};
        Assertions.assertArrayEquals(expectedOutput, main.mergeData(customerData1, customerData2, n, m));
    }

    @Test
    public void testMergeData3() {
        Main main = new Main();
        int[] customerData1 = {};
        int[] customerData2 = {201, 202, 203};
        int n = 0;
        int m = 3;
        int[] expectedOutput = {201, 202, 203};
        Assertions.assertArrayEquals(expectedOutput, main.mergeData(customerData1, customerData2, n, m));
    }

    @Test
    public void testMergeData4() {
        Main main = new Main();
        int[] customerData1 = {301, 302, 303, 0, 0};
        int[] customerData2 = {304, 305};
        int n = 3;
        int m = 2;
        int[] expectedOutput = {301, 302, 303, 304, 305};
        Assertions.assertArrayEquals(expectedOutput, main.mergeData(customerData1, customerData2, n, m));
    }

    @Test
    public void testMergeData5() {
        Main main = new Main();
        int[] customerData1 = {401, 403, 405, 407, 0, 0, 0, 0};
        int[] customerData2 = {402, 404, 406, 408};
        int n = 4;
        int m = 4;
        int[] expectedOutput = {401, 402, 403, 404, 405, 406, 407, 408};
        Assertions.assertArrayEquals(expectedOutput, main.mergeData(customerData1, customerData2, n, m));
    }

    @Test
    public void testMergeData6() {
        Main main = new Main();
        int[] customerData1 = {501, 505, 509, 0, 0, 0, 0, 0, 0};
        int[] customerData2 = {502, 503, 504, 506, 507, 508};
        int n = 3;
        int m = 6;
        int[] expectedOutput = {501, 502, 503, 504, 505, 506, 507, 508, 509};
        Assertions.assertArrayEquals(expectedOutput, main.mergeData(customerData1, customerData2, n, m));
    }

    @Test
    public void testMergeData7() {
        Main main = new Main();
        int[] customerData1 = {601, 603, 605, 607, 609, 0, 0, 0, 0, 0};
        int[] customerData2 = {602, 604, 606, 608, 610};
        int n = 5;
        int m = 5;
        int[] expectedOutput = {601, 602, 603, 604, 605, 606, 607, 608, 609, 610};
        Assertions.assertArrayEquals(expectedOutput, main.mergeData(customerData1, customerData2, n, m));
    }
}