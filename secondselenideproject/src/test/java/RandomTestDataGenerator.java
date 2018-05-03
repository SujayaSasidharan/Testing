import java.util.Random;

public class RandomTestDataGenerator {
    public static void main(String[] args){
        Random r= new Random();
        //System.out.println("Random Value is"+r.nextInt());

        String firstName="Firstname"+r.nextInt();
        String lastName="Lastname"+r.nextInt();
        String address="Address"+r.nextInt();
        //long phoneNumber=(Long(Math.random()* 100000 + 3333000000L);
        String email="Email Address"+r.nextInt();

        System.out.println("The Firstname is :"+firstName);
        System.out.println("The Lastname is :"+lastName);
        System.out.println("The Address is :"+address);
        System.out.println("The Email Address is"+email);




    }
}
