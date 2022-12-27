import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBitSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        BitSet[] a = new BitSet[] {null, new BitSet(N), new BitSet(N)};
        int M = scanner.nextInt();


        for(int k=0; k<M; k++){
            String option = scanner.next();
            int k1 = scanner.nextInt();
            int k2 = scanner.nextInt();

            if(option.equals("AND"))
                a[k1].and(a[k2]);
            else if(option.equals("OR"))
                a[k1].or(a[k2]);
            else if(option.equals("XOR"))
                a[k1].xor(a[k2]);
            else if(option.equals("FLIP"))
                a[k1].flip(k2);
            else if(option.equals("SET"))
                a[k1].set(k2);


            System.out.println(a[1].cardinality() + " " + a[2].cardinality());
        }
    }
}