package eg;

import javax.swing.*;

public class InvertString {

    // public static String invert(String str) {

    // String s = JOptionPane.showInputDialog(null, "Enter your string");

    // // You need to declare a charArray in order to reverse your string here
    // char[] charArray = s.toCharArray();

    // return new String(charArray);
    // }

    public static void main(String[] args) {
        String s = "Target Sistemas";
        String invertedString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            invertedString += s.charAt(i);
        }
        System.out.println(invertedString);
    }
}
