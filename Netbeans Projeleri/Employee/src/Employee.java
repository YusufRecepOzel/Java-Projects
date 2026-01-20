
public class Employee {
    public String name;
    public int salary;
    public int workhours;
    public int hireyear;
    public Employee(String name , int salary , int workhours , int hireyear){
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.hireyear = hireyear;
    }
    public int Tax(){
        int tax = 0;
        if(this.salary <= 1000){
            return tax;
        }
        else{
            tax = ((this.salary*3) / 100);
        }
        return tax;
    }
    public int Bonus(){
        int totalhours = 40;
        int bonus = (this.workhours - totalhours) * 30;
        return bonus;
    }
    public int RaiseSalary(){
        int raise = 0;
        int year = 2015 - this.hireyear;
        if(year<10){
            raise = (this.salary*5)/100;
        }
        else if(year<20 && year>9){
            raise = (this.salary * 10) / 100;
        }
        else if(year>19){
            raise = (this.salary*15) / 100;
        }
        return raise;
    }
    @Override
    public String toString(){
   return "Name: " + name + "\n" +
               "Salary: " + salary + "\n" +
               "Work Hours: " + workhours + "\n" +
               "Hire Date: " + hireyear + "\n" +
               "Tax: " + Tax() + "\n" +
               "Bonus: " + Bonus() + "\n" +
               "Raise of Salary: " + RaiseSalary();
    }
}
