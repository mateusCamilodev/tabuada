import java.util.Scanner;

public class tabuada {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


        System.out.println("digite algum numero e veja a tabuada:");
        int  numero  = sc.nextInt();

         for (int i = 1 ; i <= 10 ; i ++) {

             System.out.println(numero + " X " + i +  " = " + numero *i );
         }
    sc.close();
    }
}