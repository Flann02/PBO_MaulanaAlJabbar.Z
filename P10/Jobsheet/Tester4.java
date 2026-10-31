package P10.Jobsheet;

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-2");
        ow.pay(eBill);
        System.out.println("-----------------------------------------");

        PermanentEmployee pEMP = new PermanentEmployee("Dedik", 500);
        ow.pay(pEMP);
        System.out.println("------------------------------------------");

        IntershipEmployee iEMP =  new IntershipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEMP);
        System.out.println("--------------------------------------------");
        ow.showMyEmployee(iEMP);

        
    }
}
