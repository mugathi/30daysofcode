import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int j=0;j<n;j++)
        {
            String s=in.next();
            String k="",l="";
            for(int i=0;i<s.length();i++)
            {
                if(i%2==0)k+=s.charAt(i);
                else l+=s.charAt(i);
            }
            System.out.print(k+" ");
            System.out.println(l+" ");
        }
    }
}