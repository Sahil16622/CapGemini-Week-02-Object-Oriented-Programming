package interfaceabstractpoly.employeemanagement;
 class FullTimeEmployee extends Employee implements Department {

     //Additional data members for this class
     private double monthlyBonus;
     private String departmentName;

     public FullTimeEmployee(int employeeID, String name, double baseSalary, double monthlyBonus){
         super(employeeID, name, baseSalary);
         this.monthlyBonus = monthlyBonus;
     }


     //Calculating salary for the Fulltime-employee
     @Override
     public double calculateSalary() {
         return getBaseSalary() + monthlyBonus;
     }


     //setting the department name
     @Override
     public void assignDepartment(String departmentName) {
         this.departmentName = departmentName;
     }

     //getting the department name
     @Override
     public String getDepartmentDetails() {
         return "Department: " + departmentName;
     }

}
