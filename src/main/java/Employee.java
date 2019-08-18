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