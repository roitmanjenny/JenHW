public class Horse {
    private String name;
    private int age;

    public Horse(String name) {
        this.name = name;
    }
    public Horse(int age) {

        this.age = age;
    }
    public Horse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        System.out.println("The name is:" + " " + name + " "  + ",the age is:" + " " + age);
    }
}
