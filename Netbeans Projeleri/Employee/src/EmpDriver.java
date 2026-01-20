
public class EmpDriver {   
    public static void main(String [] args){
        Employee employee = new Employee("kemal" , 2000 , 45 , 1985);        
        System.out.println(employee.toString());
        int tax = employee.Tax();
        int bonus = employee.Bonus();
        int raise = employee.RaiseSalary();
        int totalSalary = (2000 + bonus) - tax;
        int raiseSalary = 2000 + raise; 
        System.out.println("Salary with tax and bonus: " + totalSalary);
        System.out.println("Total Salary with raise of salary: " + raiseSalary);
    }
}
