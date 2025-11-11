import java.util.ArrayList;
import java.util.List;

public class GameDevCompany extends Company {
    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Designer());
        employees.add(new Artist());
        return employees;
    }
}
