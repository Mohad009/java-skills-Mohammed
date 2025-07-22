// import java.util.Scanner;
public class PayrollCalculator {
     public static double calculateWeeklyPay(String employeeType, double 
hoursWorked, double hourlyRate) { 
    double weeklyPay=0;
    double discount;
        switch (employeeType) {
            case "FULL_TIME":
            // check for negative values
            if(hoursWorked>=0 && hourlyRate>=0){
                
                if (hoursWorked<=40)weeklyPay=hoursWorked*hourlyRate;
                else weeklyPay=(40*hourlyRate)+(hoursWorked-40)* hourlyRate*1.5;
            }else System.out.println("negative values is not accepted");
            break;
            case "PART_TIME":
            if(hoursWorked>=0 && hourlyRate>= 0){
                if(hoursWorked<=25){

                    weeklyPay=hoursWorked*hourlyRate;}else System.out.println("negative values is not accepted");
                }
                break;
            case "CONTRACTOR":
            if(hoursWorked>=0 && hourlyRate>= 0){
                weeklyPay=hourlyRate*hoursWorked;}else System.out.println("negative values is not accepted");
                break;
            case "INTERN":
            if(hoursWorked>=0 && hourlyRate>= 0){
                discount=0.2*hourlyRate;
                weeklyPay=(hourlyRate-discount)*hoursWorked;
            }else System.out.println("negative values is not accepted");
                break;
            default:
            System.out.println("Enter valid employee type");
            System.out.println(employeeType);
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
    
       // Method to process multiple employees and find statistics 
    public static void processPayroll(String[] employeeTypes, double[] hours, double[] rates, String[] names) { 
        double []pay={};
        double countOfOvertime=0;
    for(int i=0;i<employeeTypes.length;i++){
        pay[i]=hours[i]*rates[i];
        if (hours[i]>40) countOfOvertime+=1;
    }

    //highest paid
    //minimum paid 
    //average paid
          double max = pay[0];
          double min=pay[0];
          double total=0;
      for (int i = 1; i < pay.length; i++) {
         if (pay[i] > max) max = pay[i];
         if (pay[i] < min) min = pay[i];
         total+=pay[i];
      }
      double average=total/pay.length;

        // Display results in a formatted table 

        System.out.println("Name"+"  "+"Type"+"   "+"Payment"+"   "+"OverTime"+"   "+"Hours");
        for(int x=0;x<employeeTypes.length;x++){
            System.out.println(names[x]+"  "+employeeTypes[x]+"   "+pay[x]+"   "+rates[x]+"   "+hours[x]);
        }
        System.out.println();
        System.out.println("Maximum Paid : "+max);
        System.out.println("Minimum Paid : "+min);
        System.out.println("Average Paid : "+average);
        System.out.println("Number of employee workded over time : "+countOfOvertime);

    } 

        public static void main(String[] args) { 
        // Test data: 
        String[] types = {"FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN", }; 
        double[] hours = {45, 20, 35, 15, 50}; 
        double[] rates = {25.0, 18.0, 40.0, 12.0, 30.0}; 
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"}; 
        
        double weekPayment=PayrollCalculator.calculateWeeklyPay(types[0], hours[0], rates[0]); 
        System.out.println(weekPayment);
        // PayrollCalculator.calculateTaxDeduction(1000, true);
        // PayrollCalculator.processPayroll(types, hours, rates, names);

        // Test individual calculations first
        // Then process the entire payroll
        // Show all results clearly
        }

}
