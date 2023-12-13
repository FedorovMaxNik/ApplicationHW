package lesson_6.hw;

public class Solution {


    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            setName(name);
            setAge(age);
            setAddress(address);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }

    }
public static class Women {
    private String name;
    private int age;
    private String address;

    public Women(String name, int age, String address) {
        setName(name);
        setAge(age);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + address;
    }
}

}
