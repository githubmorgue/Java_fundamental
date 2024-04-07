package fundmental_exercise;

import java.util.Scanner;


public class user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello, %s. How old are you? ",  name);
        int age = scanner.nextInt();

        // cleans up input buffer
        scanner.nextLine();

        System.out.printf("%d is a good age to learn programming. What language do you prefer? ",  age);
        String language = scanner.nextLine();

        System.out.printf("%s is a popular programming language. ",  language);

        System.out.printf("What is your GPA? ");
        double gpa = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f is good", gpa);

        scanner.close();
    }
}
