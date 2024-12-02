import java.util.Scanner;
public class Ch1Exercises {
    public static void main(String[] args) {
        for(int counter = 0; counter < 10; counter ++){
            System.out.println("Hello World");
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = keyboard.nextLine();
        System.out.println("Hello, " + name);
    }
}
