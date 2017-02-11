import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        int ctr=1;
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
            
        }
 HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
              
        for(int i=0;i<n;i++)
            {
            
           
            if(h1.containsKey(types[i]))
                {
                h1.put(types[i],h1.get(types[i])+1);
            }
            else
                {
            h1.put(types[i],ctr);
         
            }
        }
      ArrayList <Integer> a =new ArrayList<Integer>();
       
       
        for(int key:h1.keySet())
            {
            
            for(int j=0;j<h1.size();j++)
                {
                a.add(h1.get(key));
                
            }
            Collections.sort(a);
        }
        
          int p=a.get(a.size()-1);
int typ=0;
        int ct=0;
                 for(int key:h1.keySet())
            {
                     
                  if((h1.get(key).equals(p))&&(ct==0))
                      {
                      typ=key;
                       ct++;                  
                  }
               
             }
       System.out.println(typ);

        // your code goes here
    }
}
