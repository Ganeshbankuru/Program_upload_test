import java.util.Scanner;

public class primeornot {
    public static void main(String args[])
    {
        int i,n,count=0;
        Scanner pc=new Scanner(System.in);
        n=pc.nextInt();
        for(i=2;i<=n;i++){
        if(n%i==0)
        {
            count+=1;
        }
        }
     if(count==1)
     System.out.print("given number is prime");
     else
     System.out.print("given number is not prime");
    }
    
}
