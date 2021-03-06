package by.it.sc04_evening_tue_thu.rumiantsau.lesson08;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private double power;

    String getName(){
        return this.name;
    }
    void setName(String name) {
        this.name = name;
    }

    int getAge(){
        return this.age;
    }
    void setAge(int age) {
        this.age = age;
    }

    int getWeight() {
        return this.weight;
    }
    void setWeight(int weight) {
        this.weight = weight;
    };

    double getPower() {
        return this.power;
    }
    void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString(){
        return String.format("Кличка: %s. Возраст: %d", this.name, this.age);
    }

    double dogStrength(){
        return 0.2 * this.age + 0.3 * this.weight + 0.5 * this.power;
    }

    boolean win(Dog otherDog) {
        return (this.dogStrength() > otherDog.dogStrength()) ? true : false;
    }
}
