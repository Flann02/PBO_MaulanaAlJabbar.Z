package Quiz2;

public abstract class Karakter{
    public String nama;

    public Karakter(){

    }

    public void hancurkan(DestroyAble da){
       da.hancur();
    }
}
