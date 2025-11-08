public class CompositeExecution {
    public static void main(String[] args) {
        Department company = new Department("Company", "");
        Department finance = new Department("Finance", "Money");
        Department it = new Department("IT", "Technology");
        Department hr = new Department("HR", "HR");
        Department security = new Department("Security", "Protection");

        Employee user1 = new Employee("user1", "CEO", 1052114);
        Employee user2 = new Employee("user2", "position1", 134114);
        Employee user3 = new Employee("user3", "position1", 166114);
        Employee user4 = new Employee("user4", "position2", 252114);
        Employee user5 = new Employee("user5", "position2", 152114);
        Employee user6 = new Employee("user6", "position3", 152114);
        Employee user7 = new Employee("user7", "position3", 152114);
        Employee user8 = new Employee("user8", "position4", 252114);

        company.add(finance);
        company.add(it);
        company.add(hr);
        company.add(security);

        company.add(user1);
        finance.add(user2);
        finance.add(user3);
        it.add(user4);
        it.add(user5);
        hr.add(user6);
        hr.add(user7);
        security.add(user8);
        company.display(1);
    }
}