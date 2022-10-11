package EmpWage;

public class PresentAbsent {
    public static void main(String[] args) {
        double isPresent = 1;
        double randomCheck = (double) Math.floor((Math.random() * 10) % 2);

        //Check the Employee is present
        if (randomCheck == isPresent) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}

