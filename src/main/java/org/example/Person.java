package org.example;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String editName(String name ){

      this.setName(name);
      return this.name;
    }

    public static void main(String[] args) {
     Person person = new Person("John Doe", 20, "Male");
     System.out.println(person.getName());
      String N= (person.editName("Ahmad Musleh"));
        System.out.println("Name: " + N);
    }
}

