import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BillFunctions {
    private String billMonth;
    private double  govCharges;
    private double  surCharges;
    double  lateCharges=0;
     double divider;
    public String getExtraCharges;
    double returnValue=0;



public void planDetailsReader() throws IOException {
    BillReaderClass billReaderClass=new BillReaderClass();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Scanner userInout = new Scanner(System.in);
    System.out.println("Please enter the month of this bill!!!");
    this.billMonth = bufferedReader.readLine();
    System.out.println("Please enter the GOVERNMENT CHARGES AND FEES!!!");
    this.govCharges = userInout.nextDouble();
    System.out.println("Please enter the SURCHARGES!!!");
    this.surCharges = userInout.nextDouble();
    System.out.println("Please enter the LATE FEES!!!");
    this.lateCharges = userInout.nextDouble();

    System.out.println("Please enter any EXTRA FEES!!!");
    double extraCharges = userInout.nextDouble();

    if(extraCharges >0){
        System.out.println("Please enter the name of person to add extra charges for");
        getExtraCharges=bufferedReader.readLine();
        System.out.println("Please enter the reason to add extra charges for");
        String getExtraChargesReason = bufferedReader.readLine();
        if (billReaderClass.listChecker(getExtraCharges)){
            System.out.println(getExtraCharges+ " pays $" + extraCharges +" for "+ getExtraChargesReason);
        } else {
            System.out.println("!!! INVALID NAME !!!");
            System.out.println("Please enter the CORRECT name of person to add extra charges for");
            getExtraCharges=bufferedReader.readLine();
        }


    }

}
public double planChargesOnly(){
    double totalCharges = 180;
    totalCharges = ((totalCharges +this.govCharges+this.surCharges)/7);
    return (totalCharges);
}
public double lateChargesOnly(){
    returnValue=this.lateCharges/this.divider;
    return returnValue;
}



/*    public static void main(String[] args) throws IOException {
        BillReaderClass brc =new BillReaderClass();
        brc.listOfPeople();
        BillFunctions billFunctions = new BillFunctions();
        System.out.println("");
        billFunctions.planDetailsReader();


        for (int i=1; i<=6; i++){
            System.out.print("    " +billFunctions.planChargesOnly()+ "          ");


        }
        billFunctions.lateChargesOnly();


    }*/
    public double returnOFunction(){
        return 0;     }






}
