public class User {
    private String name;
    private int age;

    public void display() {
        var logger = java.util.logging.Logger.getLogger("User");
        logger.info("Name: " + getName() + ", Age: " + getAge());
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
}
