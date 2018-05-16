import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int d=in.nextInt();
        int m=in.nextInt();
        int y=in.nextInt();
        int d1=in.nextInt();
        int m1=in.nextInt();
        int y1=in.nextInt();
        int fine=0;
        if(y-y1>0)
            fine=10000;
        else if(y-y1<0)fine=0;
        else if(m-m1>0)
            fine=500*(m-m1);
        else if(m-m1<0)fine=0;
        else if(d-d1>0)
            fine=15*(d-d1);
        else fine=0;
        System.out.println(fine);
    }
}