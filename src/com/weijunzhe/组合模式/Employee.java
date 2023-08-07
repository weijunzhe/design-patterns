package com.weijunzhe.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>design-patterns</h3>
 * <p>员工类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-14 20:31
 **/

public class Employee {
    /**
     * 姓名
     */
    private String name;
    /**
     * 部门
     */
    private String dept;
    /**
     * 工资
     */
    private int salary;
    /**
     * 下属
     */
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }
}
