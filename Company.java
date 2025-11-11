import java.util.List;

public abstract class Company {

    // Factory Method: implemented by subclasses
    public abstract List<Employee> getEmployees();

    // Template Method: shared behavior for all companies
    public void createSoftware() {
        List<Employee> employees = getEmployees();
        System.out.println("Creating software with team:");
        for (Employee e : employees) {
            e.doWork();
        }
        System.out.println("Software creation completed.\n");
    }
}
