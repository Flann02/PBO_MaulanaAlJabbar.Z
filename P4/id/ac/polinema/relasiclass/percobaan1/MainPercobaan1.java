package id.ac.polinema.relasiclass.percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {
        System.out.println();
        Processor p = new Processor("Intel 15", 3);
        Laptop l = new Laptop("Thinkpad", p);
        l.info();

        System.out.println();

        Processor p1 = new Processor();
         p1.setMerk("Intel i5");
         p1.setCache(4);
         Laptop l1 = new Laptop();
         l1.setMerk("Thinkpad");
         l1.setProc(p1);
         l1.info();

         System.out.println();

         Laptop l2 = new Laptop("Thinkpad",
         new Processor("Intel i5", 3));
         l2.info();
    }
}
