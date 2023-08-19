import java.util.Scanner;

public class qstn4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = n-1; i >=0; --i) {
            for(int j = 0; j < n; ++j) {
                if (i>  j) {
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
            }

            System.out.println();
        }

    }


}
