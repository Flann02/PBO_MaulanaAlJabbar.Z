package P10.Jobsheet;

public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEMP = new PermanentEmployee("Dedik", 500);
        IntershipEmployee iEMP =  new IntershipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");

        Employee e[] = {pEMP, iEMP};
        Payable p[] = {pEMP, eBill};
        //Employee e2[] = {pEMP, iEMP, eBill};

    }
}
