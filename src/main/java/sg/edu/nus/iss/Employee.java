package sg.edu.nus.iss;

public class Employee {

        private String staffNo;
        private String fullName;
        private String department;
        private String role;
        private String emailAddress;
        private Integer salary;
        
        public Employee() {
        }

        public Employee(String staffNo, String fullName, String department, String role, String emailAddress,
                Integer salary) {
            this.staffNo = staffNo;
            this.fullName = fullName;
            this.department = department;
            this.role = role;
            this.emailAddress = emailAddress;
            this.salary = salary;
        }

        public String getStaffNo() {
            return staffNo;
        }

        public void setStaffNo(String staffNo) {
            this.staffNo = staffNo;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public Integer getSalary() {
            return salary;
        }

        public void setSalary(Integer salary) {
            this.salary = salary;
        }        

        
    
}
