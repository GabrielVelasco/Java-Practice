package colSatart;

public class Employee implements Comparable<Employee>{
    private final String cpf;
    private int age;
    private double salary;

    public Employee(int age, String cpf, double salary){
        this.setSalary(salary);
        this.cpf = cpf;
        this.age = age;
    }

    @Override
    public int compareTo(Employee compareTo){
//        return compareTo.getAge() - this.getAge(); // descending order by age!
        return (int)(this.getSalary() - compareTo.getSalary()); // ascending order of salary
    }

    public String getCpf() {
        return cpf;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printInfos(){
        System.out.println(this.getAge() + " " + this.getCpf() + " " + this.getSalary());
    }
}
