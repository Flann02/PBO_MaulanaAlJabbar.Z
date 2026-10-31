package P10.Jobsheet;

public class Tester1 {
    public static void main(String[] args) {
        PermanentEmployee pEMP = new PermanentEmployee("Dedik", 500);
        IntershipEmployee iEMP =  new IntershipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");

        Employee e;
        Payable p;

        e = pEMP;
        e = iEMP;
        p = pEMP;
        p = eBill;
    }
}
