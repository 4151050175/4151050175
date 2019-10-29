package tran.quoc.viet;



   public class Fan extends ElectricalDevice {
    protected String speed;
    protected boolean swing;

    public Fan(String manuFacture, int price, String id, boolean switcher) {
        super(manuFacture, price, id, switcher);
    }

    public String getSpeed() {
        return speed;
    }

    public boolean isSwing() {
        return swing;
    }

    public void setSwing(boolean swing) {
        this.swing = swing;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void incSpeed() {
        System.out.println("toc do quay cua quat la 1000 vong/phut");
    }

    public void upDate() {

    }

    public void turnOn() {
        throw new UnsupportedOperationException(); 
    }

    public void turnOff() {
        throw new UnsupportedOperationException(); 
    }
}
