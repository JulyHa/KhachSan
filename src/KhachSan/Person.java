package KhachSan;

public class Person {
    private String name;
    private int age;
    private String cardID;

    public Person() {
    }

    public Person(String name, int age, String cardID) {
        this.name = name;
        this.age = age;
        this.cardID = cardID;
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

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cardID=" + cardID +
                '}';
    }
}
