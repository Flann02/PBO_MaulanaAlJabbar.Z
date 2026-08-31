package P1;

public class HPGaming extends Handphone {
    private String cooler;
    private int refreshRate;

    public void setCooler(String coolerType){
        cooler = coolerType;
    }

    public void setGamingMode(boolean isAktif){
        if (isAktif) {
            cooler = "ON";
            refreshRate = 60;
            System.out.println("Gaming mode ON :" + refreshRate + "Hz");
        }else {
            cooler = "OFF";
            refreshRate = 30;
            System.out.println("Gaming mode OFF :" + refreshRate + "Hz");
        }
    }

    @Override
    public void setInfo(){
        super.setInfo();
        System.out.println("Cooler : " + cooler);
        System.out.println("Refresh Rate : " + refreshRate + "Hz");
    }
}
