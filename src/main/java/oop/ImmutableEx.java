package oop;

public class ImmutableEx {
    public static void main(String[] args) {
        Company company = new Company("softServe", 8000);
        Employee employee = new Employee("Yurii", 1, company);

        System.out.println("Employee name: " + employee.getName()
                + "\nEmployee id: " + employee.getEmpId()
        + "\nEmployee company name: " + employee.getCompany().getCompanyName());
    }
}

final class Employee {
    private String name;
    private int empId;
    private Company company;

    public Employee(String name, int empId, Company company) {
        this.name = name;
        this.empId = empId;
        this.company = new Company(company.getCompanyName(),company.getCompanySize());
    }


    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public Company getCompany() {

        return company;
    }
}

class Company {
    private String companyName;
    private int companySize;

    public Company(String companyName, int companySize) {
        this.companyName = companyName;
        this.companySize = companySize;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCompanySize() {
        return companySize;
    }

    public void setCompanySize(int companySize) {
        this.companySize = companySize;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", companySize=" + companySize +
                '}';
    }
}
