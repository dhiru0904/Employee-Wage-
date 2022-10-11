package EmpWage;

    import java.util.Random;

    public class  WorkingHourDayMonth{
        public static void main(String[] args) {
            Random random = new Random();
            int randomCheck;
            int empHour = 0;
            int wagePerHour = 10;
            int salary = 0;
            int numWorkingDays = 20;
            int monthlySalary = 0;
            int maxHours = 100;
            int totalWorkingHours = 0;
            int totalWorkingDays = 0;

            while (totalWorkingDays < numWorkingDays && totalWorkingHours < maxHours)
            {
                totalWorkingDays++;
                randomCheck = random.nextInt(3);
                switch (randomCheck) {
                    case 0 :
                        System.out.println("Employee is absent");
                        empHour=0;
                        salary = empHour * wagePerHour;
                        break;
                    case 1 :
                        System.out.println("Employee is working part-time");
                        int partTimeHour = 8;
                        empHour = partTimeHour;
                        salary = empHour * wagePerHour;
                        break;
                    case 2 :
                        System.out.println("Employee is working full-time");
                        int fullTimeHour = 16;
                        empHour = fullTimeHour;
                        salary = empHour * wagePerHour;
                        break;
                }
                monthlySalary += salary;
                totalWorkingHours += empHour;
            }
            System.out.println();
            System.out.println("Total working days of an Employee is: "+totalWorkingDays+"\n");
            System.out.println("Total working hour of an Employee is: "+totalWorkingHours+"\n");
            System.out.println("Salary of an Employee in a month is: $"+monthlySalary);
        }

}
