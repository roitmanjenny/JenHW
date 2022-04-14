import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JenHW5 {
    public static void main(String[] args) {
        //1
        try {
            int a = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("bad math");
        } finally {
            System.out.println("Will always run...");
        }
        System.out.println("This will be printed, because we handled the exception!");
        //2
        String[] Array = {"First", "Second", "Third"};
        Array[1] = "Second2";
        System.out.println(Array[2]);
        //3
        Dog2 NewDog1 = new Dog2(5, "Dog1", true);
        Dog2 NewDog2 = new Dog2(10, "Dog2", false);
        ArrayList<Dog2> dogsList = new ArrayList<>();
        dogsList.add(NewDog1);
        dogsList.add(NewDog2);
        System.out.println(dogsList.size());
        for (int i = 0; i < dogsList.size(); i++) {
            System.out.print(dogsList.get(i).getAge() + " ");
            System.out.print(dogsList.get(i).getName() + " ");
            System.out.println(dogsList.get(i).getHappy());
        }
        dogsList.clear();
        System.out.println(dogsList.size());

        //4
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        for (int j = 0; j < strings.size(); j++) {
            if (j == 1) {
                System.out.println(strings.get(j));
            }
        }
        //5
        int[] Array2 = {1, 2, 3, 4, 5, 6};
        float avg = 0;
        for (int k = 0; k < Array2.length; k++) {
            avg += Array2[k];
        }
        System.out.println(avg/6);

        //6
        Map<String, String> users = new HashMap<>();
        users.put("admin", "Aa123456");
        users.put("admin2", "Aa123456");
        users.put("admin3", "Aa123456");

        System.out.println(users.get("admin"));
        System.out.println(users.get("admin2"));
        System.out.println(users.get("admin3"));

        //7
        System.out.println("Please choose season");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(Seasons.WINTER);
                    break;
                case 2:
                    System.out.println(Seasons.AUTUMN);
                    break;
                case 3:
                    System.out.println(Seasons.SUMMER);
                    break;
                case 4:
                    System.out.println(Seasons.SPRING);
                    break;
            }

        }
    }


