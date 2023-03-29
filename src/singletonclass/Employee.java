package singletonclass;

public class Employee {
    private int empId;
    private String empname;
    private int empAge;
    private Double empSalary;
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpname() {
        return empname;
    }
    public void setEmpname(String empname) {
        this.empname = empname;
    }
    public int getEmpAge() {
        return empAge;
    }
    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
    public Double getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empname=" + empname + ", empAge=" + empAge + ", empSalary=" + empSalary
                + "]";
    }
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Employee(int empId, String empname, int empAge, Double empSalary) {
        super();
        this.empId = empId;
        this.empname = empname;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }




}
