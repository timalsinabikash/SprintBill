import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BillReaderClass {

    BillFunctions billFunctions = new BillFunctions();
    Scanner userInout = new Scanner(System.in);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    double[] latefees = new double[6];

    public boolean listChecker(String name) {
        boolean indexOF = false;
        String membersName = "Bikash Timalsina+Bibek Yadav+Sailesh Timilsina+Prerna Kumai+Tanzim Mehedi+Arjun Chaudhary";
        String[] members = membersName.split("\\+");

        for (int i = 0; i < members.length; i++) {

            if (indexOF = members[i].contains(name)) {
                break;
            }


        }

        return indexOF;

    }

    public void listOfPeople() {
        String membersName = "Bikash Timalsina+Bibek Yadav+Sailesh Timilsina+Prerna Kumai+Tanzim Mehedi+Arjun Chaudhary";
        String[] members = membersName.split("\\+");

        for (int i = 0; i < members.length; i++) {
            System.out.print(members[i] + "   ");

        }


    }


    public void addLateFees() throws IOException {
        String checker = "n";
        int counter = 0;

        String membersName = "Bikash Timalsina+Bibek Yadav+Sailesh Timilsina+Prerna Kumai+Tanzim Mehedi+Arjun Chaudhary";
        String[] members = membersName.split("\\+");
        if( billFunctions.lateCharges>0){
            System.out.println("Please enter the number of people to divide the LATE FEES for");
            billFunctions.divider=userInout.nextInt();

        }

        for (int i = 0; i < 6; i++) {


            System.out.println("Does " + members[i] + " needs to be charged LATE FEES? (Y/N)");
            checker = bufferedReader.readLine();

            if (checker.equalsIgnoreCase("y")) {
                this.latefees[i] = billFunctions.lateChargesOnly();
            } else {
                this.latefees[i] = billFunctions.returnOFunction();
            }

        }
        for (int i=0; i< latefees.length;i++){
            System.out.println(latefees[i]);
        }


    }


    public static void main(String[] args) throws IOException {
        BillReaderClass billReaderClass = new BillReaderClass();
        billReaderClass.addLateFees();


    }

}






