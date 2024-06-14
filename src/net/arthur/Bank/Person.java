package net.arthur.Bank;

public class Person {
    String firstName;
    String middleName;
    String lastName;
    int age;
    public Person(String firstName,String middleName,String lastName,int age){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
 public String getFullName() {
        return firstName+" "+lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public boolean isOldderThan(int age2){
        return age<age2;
    }
    public Person(String firstName,String lastName,int age){
        this( firstName, "", lastName, age);
    }
}
