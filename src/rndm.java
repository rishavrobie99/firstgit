import java.util.Random;

public class rndm {
    public static void main(String[] args) {
        Random rm = new Random();
        int number = rm.nextInt(999999);  // Corrected object usage
        System.out.println(number);
    }
}
