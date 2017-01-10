/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.*;

/**
 *
 * @author Prashanth
 */
public class positive_or_negative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
       int userval=0;
       boolean flag=false;
       try{
           System.out.println("Enter the value to be test --> ");
           userval = Integer.parseInt(br.readLine());
       }
       catch(IOException e){
               System.out.println("There causes an IO Exception while receving a value from the user");
                flag=true;
      
        }
       catch(NumberFormatException e)
       {
               System.out.println("There causes an NumberFormat Exception while receving a value from the user");
                flag=true;
       }
       
       if(userval<0)
       {
           System.out.println("This is a negative value--->   "+userval);
       }else if(userval==0 && flag==false)
       {
           System.out.println("This is a ZERO -->   "+ userval);
       }
       else if(userval>0){
           System.out.println("This is a Positive value -->   "+ userval);
       }
    }
    
}
