public class ObjectDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("欧弟", "比格犬");
        dog1.introduction();
        dog1.eat();
        dog1.sleep();

        System.out.println("===========");

        Cat cat1 = new Cat("加菲", "短毛猫");
        cat1.introduction();
        cat1.eat();
        cat1.sleep();
    }
}

class Dog {
    private String name;
    private String breed;
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void eat() {
        System.out.println(name + "正在喝牛奶");
    }
    public void sleep() {
        System.out.println(name + "正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是" + breed + "品种的" + name + ".");
    }
}

class Cat {
    private String name;
    private String breed;
    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void eat() {
        System.out.println(name + "正在喝牛");
    }
    public void sleep() {
        System.out.println(name + "正在午");
    }
    public void introduction() {
        System.out.println("大家好！我是" + breed + "品种的" + name + ".");
    }
}