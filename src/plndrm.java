public class plndrm {
    public static void main(String[] args) {
        int a=1121;
        int original=a;
       int rev=0;
       while(a!=0){
           int digit=a%10;
           rev=rev*10+digit;
           a=a/10;
       }
       if (original==rev){
           System.out.println("pallindrome");
       }
       else{
           System.out.println("not pallindrime");
       }

    }
}
