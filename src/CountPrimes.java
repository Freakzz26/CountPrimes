import java.util.Scanner;

public class CountPrimes {
    static void count(int n)
    {
        int flag=0;
        int count=0;
        if(n==1 || n==0)
        {
            System.out.println(0);
        }
        else
        {
            for (int i=2;i<=n;i++){
                flag=0;
                for (int j=1;j<=i;j++)
                {
                    if((i%j)==0)
                    {
                        flag++;
                    }
                }
                if(flag==2)
                {
                    count=count+1;
                }
            }
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        count(n);
    }
}
