import java.util.Scanner;

public class Count {
    
    void divisibleNumberCount()
    {
            System.out.print("Enter Size Of Array :: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.print("Enter Element Array :: ");
            int cnt =0;
            int [] Array = new int[n];
            for(int i=0;i<n;i++)
            {
              Array[i]=sc.nextInt();
            }
            System.out.print("Find divisible Element in Array by :: ");
            int n1 = sc.nextInt();
            System.out.print("Divisible  Element by "+n1+" are ");

            for(int i=0;i<n;i++)
            {
                if(Array[i]%n1==0)
                {
                    System.out.print(Array[i]+" ");
                    cnt++;
                }
            }
            System.out.println("Count ::"+cnt);

            sc.close();
    }

    public static void main(String[] args)
    {
         Count count = new Count();
         count.divisibleNumberCount();

    }
}
