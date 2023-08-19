import java.util.Scanner;

public class qstn32 {


        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int str = 1;
            int m = (2*n)-1;
            int num = 1;
            for(int i = 1 ;i<=m;i++)
            {
                for(int j = 0;j<str;j++)
                {
                    if(j%2==0)
                    {
                        System.out.print(num+"\t");
                    }
                    else {
                        System.out.print("*\t");
                    }
                }
                System.out.println() ;
                if(i<n) {
                    num++;
                    str+=2;
                }
                else {
                    num--;
                    str-=2;
                }

            }
        }
    }

