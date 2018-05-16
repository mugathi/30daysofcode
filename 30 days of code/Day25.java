import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            int k=in.nextInt();
            boolean flag=false;
            if(k==2)flag=false;
            else if(k==1||k%2==0)flag=true;
            for(long j=3;j*j<=k;j=j+2)
            {
                if(k%j==0){flag=true;break;}
            }
            if(flag==true)System.out.println("Not prime");
            else System.out.println("Prime");
        }
    }
}
