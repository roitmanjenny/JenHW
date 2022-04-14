public class JenCW1 {
    public static void main(String[] args) {
        //my first java program
        System.out.println("Jenny");
        boolean b = false;
        byte by = 125;
        short sh = 32000;
        sh++;
        char ch = 'J';
        int i = 2500000;
        long l = 5000000L;
        float f = 15.5f;
        double d = 150.5;

        //implicit casting
        double ff = f;
        //explicit casting
        int y = (int) d;

        String first = "name";
        String last = "last name";
        System.out.println(ff);
        System.out.println(y);
        //append
        System.out.println(first + " " + last);
        System.out.println(b);
        b = i<l;
        System.out.println(b);
        System.out.println(by>0);
        System.out.println(by + 1);
        System.out.println(sh);
        System.out.println(++sh);
        System.out.println(ch);
        System.out.println(i * l);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d - f);
        //compare strings
        System.out.println(first.equals(last));
    }
}
