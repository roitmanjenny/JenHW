public class CarFactory {
    public static Drivable getCar(String carType){
        if (carType==null){
            return null;
        }
        if (carType.equalsIgnoreCase("Fiat")){
            return new Fiat();
        }
        else if (carType.equalsIgnoreCase("BMW")){
            return new BMW();
        }
        else if (carType.equalsIgnoreCase("Porsche")){
            return new Porsche();
        }
        else {
            throw new RuntimeException("Wrong input");
        }
    }
}
