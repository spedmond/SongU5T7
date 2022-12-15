public class Employee {
    private String firstName;
    private String lastName;
    private int idNumber;
    private static int mostRecentID = 100;
    private static int employeesHired = 0;

    public Employee(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        mostRecentID++;
        idNumber = mostRecentID;
        employeesHired++;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static int getMostRecentID() {
        return mostRecentID;
    }

    public static int getEmployeesHired() {
        return employeesHired;
    }

    public String employeeInfo() {
        return "Employee's full name: " + getFullName() + "\nEmployee's ID: " + getIdNumber();
    }

    public static String classInfo() {
        return "Most recent ID assigned: " + getMostRecentID() + "\nTotal employees hired: " + getEmployeesHired();
    }
}
