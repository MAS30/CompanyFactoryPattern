import java.util.ArrayList;
import java.util.List;

public class OutsourcingCompany extends Company {
    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Programmer());
        employees.add(new Tester());
        return employees;
    }
}
