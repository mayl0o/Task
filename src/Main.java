import jdk.jshell.SourceCodeAnalysis;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        byte,short,int,long
//        float,double
//        char
//        boolean
//
//        for (int i = 0 ; i<200; i++) {
//            if (i % 2 == 1)
//                System.out.println(i);
//        }
//
//        for (int i = 0 ; i < 250; i++) {
//            if( i % 2 == 0 )
//                System.out.println(i);
//    }


//        int i = 1;
//        for (i = 1; i <= 10; i++) {
//           System.out.println(i);
//        }
//        int i =10;
//        while (i>=1) {
//            System.out.println(i);
//            i--;
//        }
//        int i = 6;
//        int b = 1;
//        for (b = 1; b <= 10; b++) {
//            System.out.println(i + "*" + b + "=" + i * b);
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println();
//
//        int number = sc.nextInt();
//
//        System.out.println();
//        int i = 1;
//        int sum = 0;
//        while (i<= number) {
//            sum = i + sum;
//            i++;
//
//        }
//        System.out.println(sum);
//        for (int i = 1; i <= 1000; i = i + 2) {
//            System.out.println(i);
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println();
//
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//
//        System.out.println();
//        int x = 0;
//        if (number1 > number2) {
//            x = number1 * number2 + 1;
//        } else if (number1 == number2) {
//            x = 25;
//        } else {
//            x = (number1 - 5) / number2;
//        }
//        System.out.println(x);
//        №5
//        int i = 7;
//        while (i <=98){
//            System.out.print(i + " ");
//            i += 7;
//        }
//        №6
//        for(int i=0; i<3; i++){
//            for(int a=0; a<5; a++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        №7
//        char point = '.';
//        int space = 0;
//        Scanner scan = new Scanner(System.in);
//        for (; ; ) {
//            System.out.print("enter symbol ");
//            char symbol = scan.next().charAt(0);
//
//            if (symbol == ' ') {
//               space++;
//            } else {
//
//                if (symbol ==point) {
//                    System.out.println("point!");
//                    System.out.print("spaces " + space);
//                    break;
//                } else continue;
//            }
//        }
//        №8
//        String answer;
//        boolean exit;
//        System.out.println ("Что это такое: синий, большой, с усами и полностью набит зайцами?");
//        Scanner inputAnswer = new Scanner (System.in);
//
//        exit = false;
//        for(int i = 1; i <= 3; i++){
//            if (exit == true)
//                break;
//            answer = inputAnswer.next ();
//            switch (answer){
//                case ("троллейбус"):
//                    System.out.println ("правильно ");
//                    exit = true;
//                    break;
//                case ("сдаюсь"):
//                    System.out.println ("правильный ответ: троллейбус ");
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("подумай еще ");
//            }
//        }
//        №9
//        №2.2
//        Scanner sc = new Scanner(System.in);
//        System.out.println();
//
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//
//        System.out.println();
//        int x = 0;
//        if (number1 > number2) {
//            x = number1 * number2 - 3;
//        } else if (number1 == number2) {
//            x = 2;
//        } else {
//            x = (number1 * number1 * number1 + 1) / number2;
//        }
//        System.out.println(x);
//        №2.3
//        Scanner sc = new Scanner(System.in);
//        System.out.println();
//
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//
//        System.out.println();
//        int x = 0;
//        if (number1 > number2) {
//            x = number1 / number2 + 5;
//        } else if(number1==number2) {
//            x = -5;
//        }else {
//            x=(number1*number1-number2)/number2;
//        }
//        System.out.println(x);
        //        №2.4
//        Scanner sc = new Scanner(System.in);
//        System.out.println();
//
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//
//        System.out.println();
//        int x = 0;
//        if (number1 > number2) {
//            x = number1 / number2 + 1;
//        } else if(number1==number2) {
//            x = -1;
//        }else {
//            x=(number1*number2-5)/number1;
//        }
//        System.out.println(x);
        //        №2.5
//        Scanner sc = new Scanner(System.in);
//        System.out.println();
//
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//
//        System.out.println();
//        int x = 0;
//        if (number1 > number2) {
//            x = number1 / number2 - 1;
//        } else if (number1 == number2) {
//            x = -25;
//        } else {
//            x = (number1 * number1 * number1 - 5) / number1;
//        }
//        System.out.println(x);
//        №2.6
//        Scanner sc = new Scanner(System.in);
//        System.out.println();
//
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//
//        System.out.println();
//        int x = 0;
//        if (number1 > number2) {
//            x = number1 + number2 + 21;
//        } else if (number1 == number2) {
//            x = -1;
//        } else {
//            x = 3 * number1 / number2 + 1;
//        }
//        System.out.println(x);
//        №2.7
//        Scanner sc = new Scanner(System.in);
//        System.out.println();
//
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//
//        System.out.println();
//        int x = 0;
//        if (number1 > number2) {
//            x = 5 * number1 + number2;
//        } else if (number1 == number2) {
//            x = -125;
//        } else {
//            x = (number1 - 5) / number2;
//        }
//        System.out.println(x);
//        №2.8
//        Scanner sc = new Scanner(System.in);
//        System.out.println();
//
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//
//        System.out.println();
//        int x = 0;
//        if (number1 > number2) {
//            x = number1 * number2 - 1;
//        }else if(number1 == number2) {
//            x = 255;
//        }else{
//            x=(number1-5)/number2;
//        }
//        System.out.println(x);
//        int[] i = new int[2];
//        i[0] = 8;
//        i[1] = 4;
//        for (int j = 0; j < i.length; j++) {
//            System.out.println(i[j]);
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input array size");
//        int size = sc.nextInt();
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        int maxNum = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (maxNum < array[i]) {
//                maxNum = array[i];
//            }
//        }
//        System.out.println(maxNum);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input array size");
//        int size = sc.nextInt();
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        int minNum = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (minNum > array[i]) {
//                minNum = array[i];
//            }
//        }
//        System.out.println(minNum);

//        int x = -3;
//        int y = 7;
//        y = x < 0 ? 10 : 20;
//        System.out.println(y);
//         3.3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input array size");
//        int size = sc.nextInt();
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        int aaa = array[0];
//        int maxMax = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (aaa < array[i]) {
//            maxMax+=1;
//            }
//        }
//        System.out.println(maxMax);
//        3.4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input array size");
//        int size = sc.nextInt();
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        int aaa = array[0];
//        int maxMax = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (aaa > array[i]) {
//                maxMax += 1;
//            }
//        }
//        System.out.println(maxMax);
//        3
//        int[] numbers = new int[10];
//        double sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = (int)(Math.random() * 100);
////            System.out.println(Arrays.toString(numbers));
//            sum = sum + (double) numbers[i] /10;
//        }
//        System.out.println(sum);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input word");
//        String str = sc.nextLine();
//        char a[] = str.toCharArray();
//        for (int i = 0; i < a.length; i++) {
//            a[i] = (char) ((int) a[i] - 3);
//        }
//        String s = String.valueOf(a);
//        System.out.println(s);
//
//        char b[] = s.toCharArray();
//        for (int i = 0; i < b.length; i++) {
//            b[i] = (char) ((int) b[i] + 3);
//        }
//        String f = String.valueOf(b);
//        System.out.println(f);
//        №5.3    ???
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input a line");
//        String originalString = sc.nextLine();
//
//
//        char[] c = originalString.toCharArray();
//        for (int i = 0; i == c.length; i++) {
//
//        }
//        String swappedString = new String(c);
//
//        System.out.println(originalString);
//        System.out.println(swappedString);
//        №5.4 ???
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input word");
//        String word = sc.nextLine();
//        char[] sym;
//        char t1;
//
//        sym = word.toCharArray();
//
//        t1 = sym[0];
//        sym[0] = sym[sym.length-1];
//        sym[sym.length-1] = t1;
//
//        String wordNew = new String(sym);
//        System.out.println(wordNew);
//        №10
//        int[] a = new int[8];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = (int) (Math.random() * 10);
//            System.out.print(a[i]);
//            System.out.println(" ");
//        }
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 1) a[i] = 0;
//            System.out.print(a[i] + " ");
//        }
//        №11
//        int[] mas = new int[12];
//        int maxNumber = 0;
//        int maxIndex = 0;
//
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = (int) (Math.random() * 31) - 15;
//            if (maxNumber <= mas[i]) {
//                maxNumber = mas[i];
//                maxIndex = i;
//            }
////            System.out.println(mas[i]);
//        }
//        System.out.print("Max index: " + maxIndex);

    }
}





