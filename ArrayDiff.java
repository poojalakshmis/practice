import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayDiff {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }   
        int d=0;
        int flag=0;
        ArrayList<Integer> diff=new ArrayList<Integer>();
        Arrays.sort(a);
        if(flag==0)
            {
        for (int i=0;i<a.length;i++)
            {
            if(i==a.length-1)
                {
                flag=1;
            }
            
            else {   
                d=a[i]-a[i+1];
                diff.add(Math.abs(d));
                 }
            
        }
        }
        
        Collections.sort(diff);
        
        System.out.println(diff.get(0));
        // your code goes here
    }
}
