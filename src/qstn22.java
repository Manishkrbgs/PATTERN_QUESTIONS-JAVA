import java.util.Scanner;

public class qstn22 {


        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int spc = -1;
            int str = n;
            for(int i = 1;i<=n;i++)
            {

                for(int j = 1;j<=str ;j++){
                    System.out.print("*\t");

                }

                for(int j = 1;j<=spc;j++){
                    System.out.print("\t");
                }

                for(int j = 1;j<=str;j++){
                    if(j<n)
                        System.out.print("*\t");
                }


                spc+=2;
                str--;

                System.out.println();
            }

        }
    }

