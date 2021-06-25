import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        // System.out.println("Enter your age: ");
        String name = sc.nextLine();
        // System.out.println("The age you enter is: " + age);
        System.out.println("The name you enter is: " + name);
    }
    
}
