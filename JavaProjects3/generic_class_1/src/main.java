import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Array;
import java.util.*;

import java.lang.Math;

public class main {

    public static void main(String[] args) {

        String [] stringArray = {"Erdem" , "Nayin" , "180202050"};
        Integer[] intArray = {170,95,63};
        Double[] doubleArray = {98.7818,1566.212315,8498949.5161};
        Character[] charArray = {'c','h','a','n','d','e','l','i','e','r'};

        StringDiziYazan printString = new StringDiziYazan();
        printString.yazdir(stringArray);

        IntegerDiziYazan printInt = new IntegerDiziYazan();
        printInt.yazdir(intArray);

        DoubleDiziYazan printDouble = new DoubleDiziYazan();
        printDouble.yazdir(doubleArray);

        CharDiziYazan printChar = new CharDiziYazan();
        printChar.yazdir(charArray);

        System.out.println();System.out.println();

        DiziYazan<String> yazdirString = new DiziYazan<>();
        yazdirString.yazdir(stringArray);

        DiziYazan<Integer> yazdirInt = new DiziYazan<>();
        yazdirInt.yazdir(intArray);

        DiziYazan<Double> yazdirDouble = new DiziYazan<>();
        yazdirDouble.yazdir(doubleArray);

        DiziYazan<Character> yazdirChar = new DiziYazan<>();
        yazdirChar.yazdir(charArray);

    }

}

