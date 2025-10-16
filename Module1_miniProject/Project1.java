class Project1 {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Please enter employee id as command line argument.");
            return;
        }

        int empId = Integer.parseInt(args[0]);

        int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "01/01/2000", "12/06/2006"};
        char[] designationCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        boolean found = false;

        for (int i = 0; i < empNo.length; i++) {
            if (empNo[i] == empId) {
                found = true;
                char code = designationCode[i];
                String desig = "";
                int daValue = 0;

                switch (code) {
                    case 'e': desig = "Engineer"; daValue = 20000; break;
                    case 'c': desig = "Consultant"; daValue = 32000; break;
                    case 'k': desig = "Clerk"; daValue = 12000; break;
                    case 'r': desig = "Receptionist"; daValue = 15000; break;
                    case 'm': desig = "Manager"; daValue = 40000; break;
                }

                int salary = basic[i] + hra[i] + daValue - it[i];

                System.out.printf("%-8s %-10s %-15s %-15s %s\n", "EmpNo", "EmpName", "Department", "Designation", "Salary");
                System.out.printf("%-8d %-10s %-15s %-15s %d\n", empNo[i], empName[i], department[i], desig, salary);
                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + empId);
        }
    }
}
