import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Фролов", "Евгений", "Евгеньевич", "№1", 60000);
        employee[1] = new Employee("Петров", "Иван", "Семенович","№2", 40000);
        employee[2] = new Employee("Иванов", "Андрей", "Алексеевич","№3", 1000);
        employee[3] = new Employee("Сидоров", "Дмитрий", "Андреевич","№1", 50000);
        employee[4] = new Employee("Ефремов", "Василий", "Петрович","№5", 50000);
        employee[5] = new Employee("Песоков", "Олег", "Иванович","№4", 50000);
        employee[6] = new Employee("Чернышев", "Илья", "Семенович","№5", 50000);
        employee[7] = new Employee("Михалков", "Петр", "Григорьевич","№1", 50000);
        employee[8] = new Employee("Грибонов", "Алексей", "Васильевич","№3", 50000);
        employee[9] = new Employee("Мешков", "Сергей", "Евгеньевич","№2", 50000);

        System.out.println(Arrays.toString(employee));
        Service.getListEmployee(employee);
        Service.getSumSalaryPrint(employee);
        Service.getSumAverageSalaryPrint(employee);
        Service.findMinSalary(employee);
        Service.findMaxSalary(employee);
        Service.getNameEmployee(employee);



    }
}