package org.saddy.challanges.StringsOperation;

/*
Swap every pair of characters from a string
*/

public class SwapChar {
    public static void main(String[] args) {
        swapTwoChar("Selenium");
    }
    static void swapTwoChar(String str) {
        char[] charArray = str.toCharArray();
        char temp;
        for (int i = 0; i<charArray.length; i += 2){
            temp = charArray[i];
            charArray[i] = charArray[i+1];
            charArray[i+1] = temp;
        }

        System.out.println(new String(charArray));
    }
}
