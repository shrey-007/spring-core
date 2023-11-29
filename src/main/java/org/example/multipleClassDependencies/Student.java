package org.example.multipleClassDependencies;

public class Student {
    String name;
    String roll_num;
    int age;
    City city;
    State state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll_num() {
        return roll_num;
    }

    public void setRoll_num(String roll_num) {
        this.roll_num = roll_num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_num='" + roll_num + '\'' +
                ", age=" + age +
                ", city=" + city +
                ", state=" + state +
                '}';
    }

    public Student() {
    }
}
