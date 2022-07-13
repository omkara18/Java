import java.util.Scanner;

public class Prime {


    void prime(int m)
    {
    
        int flag=0;
        for(int i=2;i<=m/2;i++)
        {
            if(m%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.print("It is not prime number");
        }
        else
        {
            System.out.print("It is prime number");
        }

    }
    
    public static void main(String[] args)
    {
       
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        Prime p = new Prime();
        p.prime(n);
        sc.close();

    }
    
}
