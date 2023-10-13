package test;
public class Employee {
    private String name;
    private String department;
    private String group;
    private String office;

    public Employee(String name, String department, String group, String office) {
        this.name = name;
        this.department = department;
        this.group = group;
        this.office = office;
    }

    public String getDepartment() {
        return department;
    }

    public String getGroup() {
        return group;
    }

    public String getOffice() {
        return office;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', group='" + group + "', office='" + office + "'}";
    } 
}
