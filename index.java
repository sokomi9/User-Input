import java.util.Scanner;

public class index{
    public static void main(String[] args) {
        System.out.println("Enter Name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name);

        System.out.println("Enter Number");
        Scanner input2 = new Scanner(System.in);
        int number = input2.nextInt();
        System.out.println(number);
    }
}