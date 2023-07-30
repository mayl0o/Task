import java.awt.*;
import java.sql.Struct;
import java.util.*;

public class FinalTask {
    private static Vector<Object> ArrayUtils;

    public static void main(String[] args) {
        int[] storage = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("what do you want to do?");

        System.out.println("1-add number");
        System.out.println("2-delete number");
        System.out.println("3-check number list");
        System.out.println("4-quit");
        int toggle = 0;
        boolean quit = false;
        while (!quit) {
            String action = sc.nextLine();
            switch (action) {
                case ("1"):
                    if (toggle != 2) {
                        Scanner numbScan = new Scanner(System.in);
                        System.out.println("insert a number");
                        int num = sc.nextInt();
                        storage[toggle] = num;
                        toggle += 1;
                        System.out.println("number added");
                    } else {
                        System.out.println("Storage is full! If you want to add a number delete previous one!");
                    }
                    break;
                case ("2"):
                    toggle -= 1;
                    storage[toggle] = 0;
                    System.out.println("number deleted");
                    break;
                case ("3"):
                    System.out.println(Arrays.toString(storage));
                    break;
                case ("4"):
                    quit = true;
                    break;
                default:
                    System.out.println("there is no such action");
            }
            System.out.println("1-add number");
            System.out.println("2-delete number");
            System.out.println("3-check number list");
            System.out.println("4-quit");
        }
    }
}

