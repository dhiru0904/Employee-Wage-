package LineComparision;

import java.util.Scanner;

public class TwoLineAreEqual {
    public static void main(String [] args){
        int x1,y1,x2,y2;
        System.out.println("enter the value of starting and ending");
        Scanner sc = new Scanner(System.in);
        x1= sc. nextInt();
        y1= sc. nextInt();
        x2= sc. nextInt();
        y2= sc. nextInt();
        Double d1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println(d1);
        int a1,b1,a2,b2;
        System.out.println("enter the value of starting and ending");
        Scanner sc1 = new Scanner(System.in);
        a1 = sc1.nextInt();
        b1 = sc1.nextInt();
        a2 = sc1.nextInt();
        b2 = sc1.nextInt();
        Double d2 =Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
        System.out.println(d2);
        if ((d1.equals(d2))) {
            System.out.println("BOTH LINES ARE EQUAL");
        }
        else{
            System.out.println("BOTH LINES ARE NOT EQUAL");
        }

    }
}
