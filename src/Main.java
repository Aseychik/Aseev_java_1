import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int a = in.nextInt();
        if(a < 0){
            out.print(":(");
            return;
        }
        int nw2a = 0, c = 1;
        while(a > 0){
            nw2a += (a % 2) * c;
            c *= 10;
            a /= 2;
        }
        out.print(nw2a);
        /* обратно
        int a = in.nextInt();
        if(a < 0){
            out.print(":(");
            return;
        }
        int nw2a = 0, c = 1;
        while(a > 0){
            nw2a += (a % 10) * c;
            c *= 2;
            a /= 10;
        }
        out.print(nw2a); */
    }
}
