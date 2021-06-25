import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        char grade = sc.next().charAt(0);


        switch(grade){
        case 'A':
            System.out.println("your grade is good");
            break;
        case 'B':
            System.out.println("keep improving");
            break;
        case 'C':
            System.out.println("Learn more");
            break;
        default:
            System.out.println("wrong argument");

        }
    }
    
}
