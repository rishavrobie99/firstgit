import java.util.*;
public class leapornot{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();
        if((yr%4==0 && yr%100!=0 )||(yr%400==0)){
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is not a LEAP YAER");

        }
    }


}