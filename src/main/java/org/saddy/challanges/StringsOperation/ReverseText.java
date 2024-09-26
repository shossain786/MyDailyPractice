package org.saddy.challanges.StringsOperation;

public class ReverseText {
//    Write a Java program to reverse the words in a given string without
//    changing their order. For example:
//    Input:
//    "Java is fun"
//    Output:
//    "fun is Java"
    public String reverse(String text){
        String[] arrayText = text.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        byte arraylength = (byte) arrayText.length;
        for (int i = arraylength -1; i>=0; i--)
            stringBuilder.append(arrayText[i]).append(" ");

        return stringBuilder.toString();
    }
}
