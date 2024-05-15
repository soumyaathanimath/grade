/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grade;
import java.util.Scanner;

/**
 *
 * @author dell1
 */
public class Grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of three subjects");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        float avg=(float)(m1+m2+m3)/3;
        if(avg>=70)
        {
            System.out.println("Grade A");
        }
        else if(avg>=60 && avg<70)
        {
            System.out.println("Grade B");
        }
        else if(avg>=50 && avg<60)
        {
            System.out.println("Grade C");
        }
        else if(avg>=40 && avg<50)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Grade E");
        }
    }
            
        }
        
        
        
    }
    
}
