package Bai19_String;

public class Demo {
    public static void main(String[] args) {
//        String string = "Hello";
//        string = string + "Codegym ";
//        System.out.println("String - "+ string);
//
//        System.out.println("Length of string: " + string.length());
//        System.out.println("Length of string after trim: " + string.trim().length());
//        System.out.println("Words of string from 2 to end: " + string.substring(2));
//        System.out.println("Words of string from 2 to 5: " + string.substring(2,5));
//        System.out.println("Character at 0 index in String: " + string.charAt(0));
//
//        int count = 0;
//        for (int i=0; i<string.length(); i++){
//            if (string.charAt(i) == 'e')
//                count++;
//        }
//        System.out.println("'e' appeared "+count+" time in String");
//
//        System.out.println("String after UpperCase: " + string.toUpperCase());
//        System.out.println("String after LowerCase: " + string.toLowerCase());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("Codegym");
        stringBuilder.insert(13, " System");

        System.out.println("StringBuilder - "+stringBuilder.toString());

        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("Codegym");
        stringBuffer.insert(13, " System");

        System.out.println("StringBuffer - " + stringBuffer.toString());



    }
}
