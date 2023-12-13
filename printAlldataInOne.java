package Array_Program;

import java.util.*;

public class printAlldataInOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press START, to Enter the data");

        String start = sc.nextLine();
        if (start.equalsIgnoreCase("Start")) {
            String stop = "";
            while (!stop.equalsIgnoreCase("N")) {
                System.out.println("\nEnter Name");
                String name = sc.nextLine();
                System.out.println("Enter Age");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Mail");
                String mail = sc.nextLine();
                System.out.println("\nData After Entered:");
                System.out.println(name);
                System.out.println(age);
                System.out.println(mail);

                System.out.println("Press N to Stop");
                stop = sc.nextLine();
            }
        } else {
            System.out.println("Press Correct Value");
        }
    }
}
