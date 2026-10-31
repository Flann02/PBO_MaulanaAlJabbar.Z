package P10.Jobsheet;

public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee pEMP = new PermanentEmployee("Dedik", 500);
        Employee e;
        e = pEMP;

        System.out.println("" + e.getEmployeeInfo());
        System.out.println("-----------------------");
        System.out.println("" + pEMP.getEmployeeInfo());

    }
}
