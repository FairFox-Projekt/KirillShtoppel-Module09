import java.util.*;
abstract class OrganizationComponent {
    protected String name;
    protected String description;
    public OrganizationComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public abstract void display(int indentLevel);
    public abstract double calculateBudget();
    public abstract int getEmployeeCount();
    public void add(OrganizationComponent component) {
    }
    public void remove(OrganizationComponent component) {
    }
    public OrganizationComponent getChild(int index) {
        return null;
    }
}

class Employee extends OrganizationComponent {
    private double salary;
    public Employee(String name, String position, double salary) {
        super(name, position);
        this.salary = salary;
    }
    public void display(int indentLevel) {
        System.out.println("-".repeat(indentLevel) + name + " (" + description + ") | Salary: " + salary);
    }
    public double calculateBudget() {
        return salary;
    }
    public int getEmployeeCount() {
        return 1;
    }
}
class Department extends OrganizationComponent {
    private List<OrganizationComponent> children = new ArrayList<>();
    public Department(String name, String description) {
        super(name, description);
    }
    public void add(OrganizationComponent component) {
        children.add(component);
    }
    public void remove(OrganizationComponent component) {
        children.remove(component);
    }
    public OrganizationComponent getChild(int index) {
        return children.get(index);
    }
    public void display(int indentLevel) {
        System.out.println("-".repeat(indentLevel) + name + " (" + description + ") | Budget: " + calculateBudget() + " | Employees: " + getEmployeeCount());
        for (OrganizationComponent component : children) {
            component.display(indentLevel + 2);
        }
    }
    public double calculateBudget() {
        double total = 0;
        for (OrganizationComponent component : children) {
            total += component.calculateBudget();
        }
        return total;
    }
    public int getEmployeeCount() {
        int total = 0;
        for (OrganizationComponent component : children) {
            total += component.getEmployeeCount();
        }
        return total;
    }
}