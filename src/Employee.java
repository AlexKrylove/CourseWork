import java.util.Objects;

public class Employee {
    public int id;
    public static int count = 1;
    public String lastName;
    public String name;
    public String middleName;
    public String office;
    public int salary;

    public Employee(String lastName, String name, String middleName, String office, int salary) {
        this.id = count++;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.office = office;
        this.salary = salary;
    }
    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", " + lastName + " " + name + " " + middleName +
                ", отдел:" + office + '\'' +
                ", зарплата:" + salary + " руб.";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Integer.compare(employee.salary, salary) == 0 && Objects.equals(lastName, employee.lastName) && Objects.equals(name, employee.name) && Objects.equals(middleName, employee.middleName) && Objects.equals(office, employee.office);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, name, middleName, office, salary);
    }

}
