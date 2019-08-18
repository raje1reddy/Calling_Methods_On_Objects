import java.util.Scanner;
class Employee {
   private String name;
    int age;      //object fields
    Employee() {
        age = 22; //assign value to age
    }
    public void setName(String val){
        name = val; //assign value to name
    }
    public void printEmp(){
        System.out.println("name " + name + "age" +  "" +age );
    }
}

    //This code won't compile because avg is inaccessible outside te method  getAverage
//    public void setAverage(double val) {
//        avg = val;
//    }

