public class Dog2 {
        private int age;
        String name;
        Boolean happy;

        public Dog2(int age,String name,boolean happy) {
            this.age=age;
            this.name=name;
            this.happy=true;
        }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHappy(Boolean happy) {
        this.happy = happy;
    }

    public String getName() {
        return name;
    }

    public Boolean getHappy() {
        return happy;
    }

    public int getAge() {
        return age;
    }

}