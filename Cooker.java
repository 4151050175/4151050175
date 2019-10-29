
package tran.quoc.viet;


public class Cooker extends ElectricalDevice {
    protected boolean cooking;
    
    public Cooker (String manuFacture, int price, String id, boolean switcher, boolean cooking){
        super(manuFacture, price, id, switcher);
        this.cooking = cooking;
    }
    public boolean getCooking(){
        return cooking;
    }
    public void setCooking(boolean cooking){
        this.cooking = cooking;
    }
    public void cook(){
        System.out.println("");
    }
    public void warm(){
        System.out.println("");
    }
    public void update(){
        
    }
}
    

