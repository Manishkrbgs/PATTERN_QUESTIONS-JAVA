import java.util.Scanner;

public class qstn17 {


        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int str = (n/2)+1;
            int spc = 1;

            for(int i = 1;i<=n;i++)
            {

                for(int j = 1;j<str;j++)
                {
                    System.out.print("*\t");
                }
                for(int j = 1;j<=spc;j++)
                {
                    System.out.print("\t");
                }
                for(int j = 1;j<str;j++)
                {
                    System.out.print("*\t");
                }
                System.out.println();
                if(i<=n/2){
                    str--;
                    spc+=2;
                }
                else{
                    str++;
                    spc-=2;
                }
            }
        }
    }

