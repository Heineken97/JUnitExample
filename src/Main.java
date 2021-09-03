import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
    }

    public static int mult_karatsuba(int a,int b) {
        if (a/10==0 || b/10==0 ){
            return a*b;
        }
        else {
            int n = max(Integer.toString(a).length(), Integer.toString(b).length());
            int n2 = n / 2;
            int m= (int) pow(10,n2);
            int c = a /m;
            int d = a % m;
            int e = b / m;
            int f = b % m;
            int ce = mult_karatsuba(c, e);
            int df = mult_karatsuba(d, f);
            int cf_p_de = mult_karatsuba(c + d, e + f) - ce - df;
            return (int) (ce * pow(10 ,2 * n2) + cf_p_de *m + df);
        }
    }
}
