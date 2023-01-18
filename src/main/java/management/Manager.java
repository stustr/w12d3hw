package management;

import staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name, Integer NI,
                   Integer salary, String deptName) {
        super(name, NI, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
