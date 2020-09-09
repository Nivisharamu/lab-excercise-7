package worksheet6;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ELCOT
 */
public class sumavg {
    public static void main(String[] args) 
    {
      Scanner obj=new Scanner(System.in);
        int a[]=new int[20];
        int i,sum=0;
        for(i=0;i<20;i++)
        {
            // initializing elements randomly using Math.random
            a[i]=((int)(Math.random()*80))+10;
            //calculating sum
            sum=sum+a[i];
      
        }
        //calculating average
        float avrg=sum/20;
       ArrayList <Integer> list1=new ArrayList <Integer>();
       ArrayList <Integer> list2= new ArrayList <Integer>();
        
       for(i=0;i<20;i++)
       {
           if(a[i]>avrg)
           {
               list1.add(a[i]);
      
           }
           else if(a[i]<avrg)
           {
               list2.add(a[i]);
               
           }
       }
       //printing the elements below average and above average
       
       //elements above average are stored in list1
       System.out.println("below average"+list1);
       
       //elements below average are stored in list2
       System.out.println("above average"+list2);
       
    }
      
      
    }
