public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jim","Mason");
        System.out.println(employee1.employeeInfo());
        System.out.println(Employee.classInfo());
        System.out.println(Employee.getMostRecentID());
        System.out.println(Employee.getEmployeesHired());

        System.out.println("-----------------------------------------");

        Employee employee2 = new Employee("Amy","Adams");
        System.out.println(employee2.employeeInfo());
        System.out.println(Employee.classInfo());

        System.out.println("-----------------------------------------");

        Employee employee3 = new Employee("Bob","Ross");
        System.out.println(employee3.employeeInfo());
        System.out.println(Employee.classInfo());

        System.out.println("-----------------------------------------");

        Employee employee4 = new Employee("Cindy","Nox");
        System.out.println(employee4.employeeInfo());
        System.out.println(Employee.classInfo());

        System.out.println("-----------------------------------------");

        System.out.println(employee1.employeeInfo());
        System.out.println(employee2.employeeInfo());
        System.out.println(Employee.getMostRecentID());
        System.out.println(Employee.getEmployeesHired());

        System.out.println("-----------------------------------------");
    }
}
