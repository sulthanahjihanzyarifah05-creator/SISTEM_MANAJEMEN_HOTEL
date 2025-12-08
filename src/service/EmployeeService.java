
package service;

import java.util.ArrayList;
import model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        
        //Daftar pegawai
        employees.add(new Employee("L0324026", "Rafi", "rafi", "rafi123"));
        employees.add(new Employee("L0324030", "Risma", "risma", "risma456"));
        employees.add(new Employee("L0324034", "Jihan", "jihan", "jihan789"));
    }

    public Employee login(String username, String password) {
        for (Employee emp : employees) {
            if (emp.getUsername().equals(username) &&
                emp.getPassword().equals(password)) {
                return emp;
            }
        }
        return null;
    }
}
