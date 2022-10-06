package EmpWage;

public class UC2 {
    public static void main(String[] args) {
        //Declaring the variables.
        double isPresent = 1;
        double randomCheck = (double) Math.floor((Math.random() * 10) % 2);
        int fullDayHour = 8;
        int wagePerHour = 20;
        int salary = 0;

        if (randomCheck == isPresent) {
            System.out.println("Employee is present");
            salary = fullDayHour * wagePerHour;
            System.out.println("Salary is: $" + salary);
        } else {
            System.out.println("Employee is absent");
            System.out.println("Salary is: $" + salary);
        }
    }
}
