import java.util.Scanner;

public class Lab1{

    public static void main(String[] args)
    {
        System.out.println("Hello, I am Leong Weng Yan Ivan");

        System.out.print("Enter module code>: ");
        Scanner in = new Scanner(System.in);
        String modCode = in.nextLine();

        switch (modCode) {
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1007":
                System.out.println("Operating Systems");
                break;
            case "CSC1008":
                System.out.println("Data Structures and Algorithms");
                break;
            case "CSC1009":
                System.out.println("Object Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
            default:
                System.out.println("Could not find a module with code 5");
        }

        for(int a = 102; a > 66; --a)
        {
            if (a % 2 == 1)
            {
                System.out.println(a);
            }
        }
    }
}
