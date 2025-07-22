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


// Method to calculate tax deduction based on pay brackets 
    public static double calculateTaxDeduction(double grossPay, boolean 
hasHealthInsurance) { 
    double taxAmount=0;
    double total=0;
    if(hasHealthInsurance){
        if(grossPay>0 && grossPay <=500){
            taxAmount=(0.1*grossPay)-50;
            total=grossPay+taxAmount;
        }
        else if(grossPay>501 && grossPay <=1000){
            taxAmount=(0.15*grossPay)-50;
            total=grossPay+taxAmount;
        }
                else if(grossPay>1001 && grossPay <=2000){
            taxAmount=(0.2*grossPay)-50;
            total=grossPay+taxAmount;
        }
                else if(grossPay >2000){
            taxAmount=(0.25*grossPay)-50;
            total=grossPay+taxAmount;
        }
    }else{
        if(grossPay>0 && grossPay <=500){
            taxAmount=0.1*grossPay;
            total=grossPay+taxAmount;
        }
        else if(grossPay>501 && grossPay <=1000){
            taxAmount=0.15*grossPay;
            total=grossPay+taxAmount;
        }
                else if(grossPay>1001 && grossPay <=2000){
            taxAmount=0.2*grossPay;
            total=grossPay+taxAmount;
        }
                else if(grossPay >2000){
            taxAmount=0.25*grossPay;
            total=grossPay+taxAmount;
        }

    }
        return total; 
    }
    
    

}
