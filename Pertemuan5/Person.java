package Pertemuan5;
public class Person {
    public void printinfo(){
        System.out.println("Ini adalah orang ");
    }

    public static void main(String[] args) {
        Person person;
        Employee employee = new Employee();
        Student student = new Student();
        //reference merujuk ke employee
        person = employee;
        person.printinfo();
        //reference merujuk ke student
        person = student;
        person.printinfo();

    }
}
