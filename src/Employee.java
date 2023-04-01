// Casey Hsu - 101376814
public class Employee {
    private int empId;
    private String empFirstName;
    private String empLastName;
    private int empAnnualSalary;
    private Residence empResidence;
    private Residence [] emp;
    
    public Employee(int empId, String empFirstName, String empLastName, int empAnnualSalary, Residence empResidence) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empAnnualSalary = empAnnualSalary;
        this.empResidence = empResidence;
    }

    public Employee() {
    }

    public Residence[] getEmp() {
        return emp;
    }

    public void setEmp(Residence[] emp) {
        this.emp = emp;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }
    public int getEmpAnnualSalary() {
        return empAnnualSalary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public void setEmpAnnualSalary(int empAnnualSalary)
    {
        this.empAnnualSalary = empAnnualSalary;
    }

    @Override
    public String toString() {
        return "\nEmployee ID: " + empId +
                "\nEmployee First Name: " + empFirstName +
                "\nEmployee Last Name: " + empLastName +
                "\nEmployee Salary: " + empAnnualSalary +
                "\nAddress: " + empResidence;
    }
}
// Casey Hsu - 101376814