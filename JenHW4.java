public class JenHW4 {
    public static void main(String[] args) {
      //1
        Inter car1 = new Car();
        car1.drive();
      //2
        Employee hr1 = new HR();
        hr1.work();

        //3
        //Abstract class can not be used directly, only it's children

        //4
        //Abstract class can not be decalared final

        //5
        Ball ball1 = new Ball("blue");
        System.out.println(ball1.isRound);
        //ball1.isRound = false; - can't change the value of final var

        //6
        //Can't use static inside method

        //7, 8
        Pony horse2 = new WhitePony("Pony1",8);
        horse2.bite();
        horse2.printColor();

        //9
        //class can only extends one class

        //10
        //Apple and Dog not in the same package
        //can import animal.Dog inside Apple

        //11
        //bark method protected
        //change to public

        //12
        //"Whaf - Puppy"

        //13 we shouldn't

        //14 -  D

        //15 and 16 - don't see those in class summary of class 4, i think we didn't talk about it







    }
}
