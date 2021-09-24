import java.io.IOException;

public class MainProgram {
    public static void main(String[] args) throws IOException {
        BillReaderClass brc =new BillReaderClass();

        BillFunctions billFunctions = new BillFunctions();
        billFunctions.planDetailsReader();
        brc.listOfPeople();
        System.out.println("");
        //billFunctions.planDetailsReader();


        for (int i=1; i<=6; i++){
            System.out.print("    " +billFunctions.planChargesOnly()+ "          ");

        }
        System.out.println("");

       brc.addLateFees();

    }
}
