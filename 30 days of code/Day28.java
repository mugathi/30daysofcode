import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] data=new String[N];
        int l=0;

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            int k=emailID.length();
            if((emailID.substring(k-10,k)).equals("@gmail.com"))
                data[l++]=firstName;
        }
        String[] daa=new String[l];
        for(int i=0;i<l;i++)
            daa[i]=data[i];
        Arrays.sort(daa);
        for(int i=0;i<l;i++)
            System.out.println(daa[i]);
        scanner.close();
    }
}