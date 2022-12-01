import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Service {
    public static void getListEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void getSumSalaryPrint(Employee[] employees) {
        System.out.println("Сумму заработной платы за месяц " + getSumSalary(employees) + " руб.");
    }

    public static void getSumAverageSalaryPrint(Employee[] employees) {
        System.out.println("Средняя сумма заработной платы за месяц " + getAverageSalary(employees) + " руб.");
    }


    public static int getSumSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public static int getAverageSalary(Employee[] employees) {
        int number = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                number++;
            }
        }
        return getSumSalary(employees) / number;
    }

    public static void findMinSalary(Employee[] employee) {
        int min = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < min) {
                min = employee[i].getSalary();
            }
        }
        System.out.println("Минимальная сумма заработной платы сотрудника " + min + " руб.");
    }

    public static void findMaxSalary(Employee[] employee) {
        int max = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > max) {
                max = employee[i].getSalary();
            }
        }
        System.out.println("Максимальная сумма заработной платы сотрудника " + max + " руб.");
    }

    public static void getNameEmployee(Employee[] employees) {
        for (Employee index : employees) {
            System.out.println(index.id+" "+index.lastName+" " +index.name + " " +index.middleName);
        }


    }


}

