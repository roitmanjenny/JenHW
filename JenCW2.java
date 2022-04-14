public class JenCW2 {
        //global var
    static int i= 1;
    public static void main(String[] args) {
        //local var
    int j= 2;
    getNum(5);
    boolean b = returnBoolean();
        System.out.println(b);
        System.out.println(i);
        System.out.println(j);

        int y = getAndReturn(0);
        System.out.println(y);
    }
//get a number and print it
    static void getNum(int n){
        System.out.println(n);
        System.out.println(i);
//        System.out.println(j);
    }
//not get a value return boolean
    static boolean returnBoolean(){
        return true;
    }
//get value and return value
    static int getAndReturn(int x){
        return ++x;
    }

}
