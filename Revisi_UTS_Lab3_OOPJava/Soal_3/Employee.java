package Soal_3;

public class Employee {
    private int id, salary;
    private String firstName, lastName;

    public Employee(int id, String firstName, String lastName, int salary) {
        if (id < 0) {
            System.out.println("Invalid input for employee id. Employee id cannot be less than 0.");
            this.id = 0;
        } else {
            this.id = id;
        }
        if (salary < 0) {
            System.out.println("Invalid input for employee salary. Employee salary cannot be less than 0.");
            this.salary = 0;
        } else {
            this.salary = salary;
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        if (percent <= 0) {
            System.out.println("Invalid input for salary raise percentage. Percentage cannot be less than or equal to 0.");
            return salary;
        } else {
            salary += (salary * percent) / 100;
            return salary;
        }
    }

    public String toString() {
        return "Employee[id=" +id + ",name=" +getName() + ",salary=" +salary + "]";
    }
}