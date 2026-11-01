package ComparatorUnderstanding;

import java.util.ArrayList;

class Employee{

     String name;
     int age;
     double salary;

    Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
       return age;
    }

    public double getSalary(){
       return salary;
    }

}

public class SortEmployeeByAge {

    public static void main(String[] args) {
       
         ArrayList<Employee> employeeList = new ArrayList<>();
         employeeList.add(new Employee("Rahul", 12, 1000));
         employeeList.add(new Employee("Kal", 10, 12340));
         employeeList.add(new Employee("Sahil", 23, 12340));

         //Sort By Age
         employeeList.sort((a, b) -> a.getAge() - b.getAge());
         
         for(Employee employee : employeeList){
            System.out.println(employee.getAge());
         }
    }
 
}
