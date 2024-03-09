/*
 * This is Samuel writing, I write in English, so don't be weirded out about not finding anything in Portuguese; :)
 * I added these comments so both you and I can understand the logic behind this algorithm;
 *
 */

package eg;

import java.math.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.*;

public class Fibonacci {

    public static boolean isFibonacci() {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number:"));

        // First Fibonacci numbers:
        int a = 0;
        int b = 1;

        if (n < 0) {
            JOptionPane.showMessageDialog(null, "Number cannot be less than zero.");

        } else {
            JOptionPane.showMessageDialog(null, "The number is: " + n);
        }

        while (a <= n) {
            // this if statement checks if the number is indeed in the Fibonacci range
            if (a == n) {
                return true; // Found the number in the sequence
            }
            int c = a + b; // Calculate the next Fibonacci number
            a = b; // Shift previous values, a is now 1
            b = c; // b is now 1 too
        }
        return false;
    }

    public static void main(String[] args) {

        if (isFibonacci()) {
            JOptionPane.showMessageDialog(null, "The number is in the Fibonacci sequence.");
        } else {
            JOptionPane.showMessageDialog(null, "The number is not in the Fibonacci sequence.");
        }

    }

}
