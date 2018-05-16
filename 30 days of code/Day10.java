import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {
int max=0;
int count(int x)
{
if(x==0||x==1)return x;
int k= count(x/2);
if(x%2==0&&k>=max){max=k;return 0;}
else if(x%2==0)return 0;
else return k+1;
}
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Day10 call=new Day10();
        int l=call.count(n);
        int p=call.max;
        if(l>p)System.out.println(l);
        else System.out.println(p);
        scanner.close();
    }
}