import java.io.*;
import java.util.*;


public class Day8 {
        String[] data=new String[1000000];
        Integer[] num=new Integer[1000000];
        int hash(String x)
        {
           return Math.abs((x.hashCode())%1000000);
        }
        void insert(String name,int number)
        {
            int i=hash(name);
         for(;data[i]!=null;i=(i+1)%1000000)
         {
            if(data[i].equals(name))break;
         }
           data[i]=name;
           num[i]=number;
        }
        int number(String name)
        {
         for(int i=hash(name);data[i]!=null;i=(i+1)%1000000)
         {
            if(data[i].equals(name))return num[i];
         }
         return 0;
        }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Day8 call=new Day8();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            call.insert(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
             int k=call.number(s);
             if(k==0)System.out.println("Not found");
             else System.out.println(s+"="+k);
        }
        in.close();
    }

}

