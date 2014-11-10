package Pertemuan5.Tugas3;
import java.util.Date;
public class Employee1 {
    private static final double BASE_SALARY = 15000.00;
    private String name;
    private double salary;
    private Date birthDate;
    public Employee1(String name, double salary, Date DoB){
        this.name = name;
        this.salary = salary;
        this.birthDate = DoB;
    }
    public Employee1(String name, double salary){
        this(name, salary, null);
    }
    public Employee1(String name, Date DoB){
        this(name, BASE_SALARY, DoB);
    }
    public Employee1(String name){
        this(name, BASE_SALARY);
    }
    
    class Manager extends Employee1{
        private String department;
        public Manager(String name, double salary, String dept){
            super(name, salary);
            department = dept;
        }
        public Manager(String n, String dept){
            super(n);
            department = dept;
        }
        public Manager(String dept){
           // super(dept);// harus memiliki super <<==============
            department = dept;
        }
    }
}
