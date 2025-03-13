package SingletonPattern.src;

public class User {
    private static User instance;
    private String name;
    private int age;

    private User() {
        this.name = "Mario";
        this.age = 25;
    }

    public static User getInstance(String name, int age) {
        if (instance == null) {
            instance = new User();
        }
        return instance;
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

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }
}
