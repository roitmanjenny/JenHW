import java.util.Scanner;

public class JenHW2 {
    public static void main(String[] args) {
        String n=Num(3,3);
        System.out.println(n);
        loop5();
        int sw = switching1 (1);
        int sw2 = switching2 (2);
        cast();
        scanandprint();
        printHello("Hello");
        calculate(5,3.2);
        printName("Jenny");
        calculate2(5);
        int sum=calculate3(5,3);
        String sen = sentence("Jenny","Roitman");
        System.out.println(sen);
    }
    //1
    static String Num(int x, int y) {
            if (x>y)
                return "Big";
            else if (x<y)
                return "Small";
            else
                return "Equal";
    }
    //2
    static void loop5(){
        int i;
        for (i=0;i<5;i++){
            System.out.println(i);
        }
    }
    //3.1
    static int switching1 (int j){

        switch (j){
            case 1:
                System.out.println("summer");
                break;
            case 2:
                System.out.println("winter");
                break;
            case 3:
                System.out.println("fall");
                break;
            case 4:
                System.out.println("spring");
                break;
            default:
                System.out.println("default");
                break;
        }
        return 0;
    }
    //3.2
    static int switching2 (int j2) {
        if (j2==1)
        System.out.println("summer");
        else if (j2==2)
        System.out.println("winter");
        else if (j2==3)
        System.out.println("fall");
        else if (j2==4)
        System.out.println("spring");
        else
        System.out.println("default");

        return 0;
    }
    //4 - the loop will run 10 times
    //5
    static void cast(){
        int age = 40;
        char letter = 'R';
        double shekel = 3.5;
        boolean abroad = true;
        String apartment = "100";

        System.out.println(age);
        System.out.println(letter);
        System.out.println((int)shekel);
        System.out.println(abroad);
        System.out.println(Integer.parseInt(apartment));

    }
    //6
    static void scanandprint(){
        System.out.println("Please enter your phone number");
        Scanner s1 = new Scanner(System.in);
        String num = s1.next();
        System.out.println("Your phone number is: " + num);
    }
    //7
    static void printHello(String s){
        System.out.println(s);
    }
    static void calculate(int x,double y){
        System.out.println((double)x+y);
    }
    //8
    static void printName(String s){
        System.out.println(s);
    }
    static void calculate2(int x){
        System.out.println(x/2);
    }
    //9
    static int calculate3(int x,int y){
        return (x+y);
    }
    static String sentence(String s1, String s2){
        return s1+" "+s2;
    }
    //10 - 20 will be printed
    //11 - endless loop since 1 always greater than 0
    //12 - false, the method "equals" is case insensitive
    //13 - option 2 i think

}

