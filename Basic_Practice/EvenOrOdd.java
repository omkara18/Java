import java.util.Scanner;
public class EvenOrOdd {

    void EvenOdd()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Positive Number :: ");
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is even number");
        }
        else
        {
            System.out.println(n+" is odd number");
        }
        sc.close();

    }
    public static void main(String[] argv)
    {
         EvenOrOdd eo =new EvenOrOdd();
         eo.EvenOdd();
    }
    
}
