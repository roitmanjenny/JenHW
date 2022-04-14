import java.util.Scanner;

public class JenHW2bonus {
    public static void main(String[] args) {
        loop1(5);
        int s1=scan();
        int sum = scanandcompute(s1);
        System.out.println(sum);
        //17
        Dog Bonny = new Dog();
        //switch1(1);
    }

    //14
    static void loop1(int n){
        int i, j;
        for (i=0;i<=n;i++){
            for (j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //16
    static int scan(){
        System.out.println("Please enter a number");
        Scanner s1 = new Scanner(System.in);
        String num1 = s1.next();
        return Integer.parseInt(num1);
    }
    static int scanandcompute(int num){
        int sum = 0, digit = 0;
        while (num>0){
            digit = num % 10;
            sum=sum+digit;
            num=num/10;

        }
        return sum;
    }
    //18 - java 11 not support multi-switch
//    static void switch1 (int s){
//        switch(s){
//            case 1,2,3:
//                System.out.println("A");
//            case 4,5,6:
//                System.out.println("B");
//            case 7,8,9,10:
//                System.out.println("C");
//            default:
//                System.out.println("S is not 1-10");
//        }
//    }

}
