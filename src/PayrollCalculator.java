// import java.util.Scanner;
public class PayrollCalculator {
     public static double calculateWeeklyPay(String employeeType, double 
hoursWorked, double hourlyRate) { 
    double weeklyPay=0;
    double discount;
        switch (employeeType) {
            case "Full_Time":
            // check for negative values
            if(hoursWorked<0 && hourlyRate< 0){
                
                if (hoursWorked==40)weeklyPay=hoursWorked*hourlyRate;
                else if (hoursWorked>40) weeklyPay=hoursWorked*hourlyRate;
            }
            break;
            case "Part_Time":
            if(hoursWorked<0 && hourlyRate< 0){
                weeklyPay=hoursWorked*hourlyRate;}
                break;
            case "CONTRACTOR":
            if(hoursWorked<0 && hourlyRate< 0){
                weeklyPay=hourlyRate;}
                break;
            case "INTERN":
            if(hoursWorked<0 && hourlyRate< 0){
                discount=0.2*hourlyRate;
                weeklyPay=(hourlyRate-discount)*hoursWorked;
            }
                break;
            default:
            System.out.println("Enter valid employee type");
                break;
        }
   return weeklyPay;
    } 


}
