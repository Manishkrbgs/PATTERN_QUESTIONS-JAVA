import java.util.Scanner;

public class qstn20 {


        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int spc =n/2;
            int str =1;
            for(int i = 0;i<n/2;i++)
            {     int x= spc;
                int y= str;
                while(x>0){
                    System.out.print("\t");
                    x--;
                }
                while(y>0){
                    if(y==str|| y==1)
                        System.out.print("*\t");
                    else  System.out.print("\t");
                    y--;
                }

                spc--;
                str+=2;
                System.out.println();
            }
            spc =0;
            str= n;
            for(int i = 0;i<n/2+1;i++)
            {     int x= spc;
                int y= str;
                while(x>0){
                    System.out.print("\t");
                    x--;
                }
                while(y>0){
                    if(y==str|| y==1)
                        System.out.print("*\t");
                    else  System.out.print("\t");
                    y--;
                }

                spc++;
                str-=2;
                System.out.println();
            }
        }
    }

