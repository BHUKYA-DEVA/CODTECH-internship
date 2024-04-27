import java.util.*;
import java.io.*;

public class chatbot {

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ASK ME ANYTHING....");
            String User = sc.nextLine();
            if ((User.equals("Hi!")) || (User.equals("Hi")) || (User.equals("HI")) || (User.equals("hi"))
                    || (User.equals("hello")) || (User.equals("HELLO")) || (User.equals("Hello"))) {
                System.out.println("BOT:" + "Hello");
            } else if ((User.equals("who are you ")) || (User.equals("WHO ARE YOU "))) {
                System.out.println("BOT:" + " i am a bot to assist u");
            } else if (User.equals("how are you") || (User.equals("HOW ARE YOU"))) {
                System.out.println("BOT:" + " i am fine what about you");
            } else if (User.equals("WANNA BE MY FRIEND ? ") || User.equals("wanna be my friend ?")) {
                System.out.println("BOT:" + " we are already friends ");
            } else if ((User.equals("TELL ME A JOKE ")) || (User.equals("tell me a joke"))) {
                System.out.println("BOT:" + "whats the next thing about Switzerland?" +
                        "i dont know, but the flag is big plus. hehhhehhe");
            } else if ("ADDING TWO NUMBERS".equals(User) || User.equals("adding two numbers ")) {
                System.out.println("first number=");
                int num1 = sc.nextInt();
                System.out.println("enter second number= ");
                int num2 = sc.nextInt();
                System.out.println("BOT:" + "addition of two numbers is " + (num1 + num2));
            } else if (User.equals("DIVIDE TWO NUMBERS") || User.equals("divide two numbers")) {
                System.out.println("first number=");
                int num1 = sc.nextInt();
                System.out.println("enter second number= ");
                int num2 = sc.nextInt();
                System.out.println("BOT:" + "division of two numbers is " + (num1 / num2));
            } else if ((User.equals("table")) || (User.equals("TABLE"))) {
                System.out.println("enter any number=");
                int num = sc.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + "*" + i + "=" + i * num);
                }
            } else if (User.equals("SUBTRACT TWO NUMBERS") || User.equals("subtract two numbers ")) {
                System.out.println("first number=");
                int num1 = sc.nextInt();
                System.out.println("enter second number= ");
                int num2 = sc.nextInt();
                System.out.println("BOT:" + "subtraction of two numbers is " + (num1 - num2));
            } else if ((User.equals("MULTIPLICATION OF  TWO NUMBERS  "))
                    || (User.equals("multiplication of  two numbers "))) {
                System.out.println("first number=");
                int num1 = sc.nextInt();
                System.out.println("enter second number= ");
                int num2 = sc.nextInt();
                System.out.println("BOT:" + "multiplication of two numbers is " + (num1 * num2));
            } else if (User.equals("OPEN NOTEPAD") || User.equals("open notepad")) {
                Runtime rs = Runtime.getRuntime();
                try {

                    rs.exec("notepad");
                } catch (IOException e) {
                    System.out.println(e);
                }
            } else if (User.equals("EXIT") || User.equals("exit")) {
                System.exit(0);
            }
        }
    }
}
