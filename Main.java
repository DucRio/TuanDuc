package com.company;

public class Main {

    public static void main(String[] args) {

        double doubleVar = 3.1416;

        System.out.println("doubleVar = "+ doubleVar);

        float floatVar = 30.05f;
        float result = 30.05f * 20.30f;
        System.out.println("result = "+ result);
        System.out.println("floatVar = "+floatVar);
        float modulus = 9 % 6;
        //Float.NEGATIVE_INFINITY;- 1/ 0
        System.out.println("modulus = "+modulus);
        int intVar = 10;
        long longVar = 969465L;
        System.out.println("intVar = "+intVar);
        System.out.println("Int Max = "+Integer.MAX_VALUE);
        System.out.println("Int Min = "+Integer.MIN_VALUE);
        System.out.println("longVar = "+longVar);
        System.out.println("Long Max = "+Long.MAX_VALUE);
        System.out.println("Long Min = "+Long.MIN_VALUE);

        boolean booVar1 = false;
        boolean booVar2 = false;
        System.out.println(booVar1 && booVar2);
        System.out.println(booVar1 || booVar2);
        System.out.println(booVar1 ^ booVar2);

        String stringVar1 = "hi everyone";
        String stringVar2 = "I Am is Duc";
        System.out.println(stringVar1 +"\n"+ stringVar2);

        System.out.println(stringVar1+","+stringVar2);

        String multilines =  "xin chào,"+
                "đây là máy tính của tôi,"+
                "tôi code nó từ máy tính này";
        String stringVar3 = "I Said : \" this is my computer \"";
        System.out.println(multilines);
        System.out.println(stringVar3);

        char c = 's';
        System.out.println(c);







	// write your code here
    }
}
