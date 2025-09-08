package assignments;

/**
 * Author :Jetty.Srikar
 * Date :Sep 8, 2025
 * Time :9:07:55 AM
 *project : projCoreJava
 */

public class SwapNumbersWithoutThird {

    public static void main(String[] args) {
        int a = 10, b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
