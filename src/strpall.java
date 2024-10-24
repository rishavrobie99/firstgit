public class strpall {
    public static void main(String[] args) {
        String s="aba";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
        if(s.equals(rev)){
            System.out.println("pallindrome");
        }
        else {
            System.out.println("not pallindrome");
        }
    }
}
