package interfaceabstractpoly.employeemanagement;

public class PartTimeEmployee extends Employee implements Department{

    //Initializing the data members
        private int workHours;
        private double hourlyRate;
        private String department;

        public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
            super(employeeId, name, baseSalary);
            this.workHours = workHours;
            this.hourlyRate = hourlyRate;
        }

        @Override
        public double calculateSalary() {
            return getBaseSalary() + (workHours * hourlyRate);
        }

        @Override
        public void assignDepartment(String departmentName) {
            this.department = departmentName;
        }

        @Override
        public String getDepartmentDetails() {
            return "Department: " + department;
        }
}
