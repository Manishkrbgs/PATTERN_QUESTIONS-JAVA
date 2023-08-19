import java.util.Scanner;

public class qstn28 {


        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int nsp = n;
            int num = 1;
            int numPrnt = 1;
            for(int i = 1;i<=n;i++)
            {

                for(int j = 1;j<nsp;j++)
                {
                    System.out.print("\t");
                }
                int number = numPrnt;
                for(int j = 1;j<=num;j++)
                {
                    System.out.print( number+ "\t");
                    if(j<=num/2)
                        number++;
                    else
                        number--;
                }
                System.out.println();
                num+=2;
                nsp--;
                numPrnt++;

            }

        }
    }

