import java.io.IOException;
import java.util.Scanner;

public class JenHW7 {

    public static void main(String[] args) throws IOException {
        //2
        System.out.println("Please enter a name");
        Scanner s1 = new Scanner(System.in);
        String name = s1.next();
        LogSingletone.writetofile(name);
        
        System.out.println("Please enter age");
        Scanner s2 = new Scanner(System.in);
        int age = s2.nextInt();
        LogSingletone.writetofile(String.valueOf(age));

        System.out.println("Please enter an address");
        Scanner s3 = new Scanner(System.in);
        String address = s3.next();
        LogSingletone.writetofile(address);

        System.out.println("Please enter a phone number");
        Scanner s4 = new Scanner(System.in);
        String number = s4.next();
        LogSingletone.writetofile(number);

        //3
        CarFactory carFactory = new CarFactory();
        Drivable car1 = CarFactory.getCar("gyrtryer");
        car1.drive();
    }
}
