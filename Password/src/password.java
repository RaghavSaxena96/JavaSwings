/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raghav Saxena
 */
import java.util.*;

public class password
{
 
    public static void main(String args[])
    {
     
        int len=10;
        String p=getpass(len);
        System.out.println("Your new Password is " + p);
    }
    
   static String getpass(int len)
    {
        
        String C="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String S="abcdefghijklmnopqrstuvwxyz";
        String N="0123456789";
        String H="!@#$%^&*_?.";
        
        String w=C+S+N+H;
        
        int i;
        Random rd=new Random();
        String s="";
        for(i=0;i<len;i++)
        {
            s=s+w.charAt(rd.nextInt(w.length()));
        }
        
        return s;
        
    }
    
  
}
