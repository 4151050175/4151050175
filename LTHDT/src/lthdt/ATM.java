
package lthdt;


public class ATM {
    private String soTK;
    private double soDu;
    public int TST;
    
    public ATM(String STK,double sd){
        this.soTK=STK;
        this.soDu=sd;
    }
    public String laySTK(){
        return soTK;
    }
    public double laySD(){
        return soDu;
    }
    public String toString(){
        return "soTK la"+soTK+"soDu la"+soDu;
    }
    public void naptien(double st){
        soDu=soDu+st;
    }
    public boolean ruttien(double st){
        if (soDu>st){
            soDu=soDu-st;
            return true;
        }else return false; }
    public boolean chuyentien(ATM tk,double st){
        if(soDu>st){
            soDu=soDu-st;
            tk.soDu=tk.soDu+st;
            return true;}
             else return false;
   
    }
    public static void main(String[] args) {
        ATM tk1=new ATM("tk1",100);
        ATM tk2=new ATM("tk2",100);
        ATM tk3=new ATM("tk3",100);
        ATM tk4=new ATM("tk4",100);
        ATM tk5=new ATM("tk5",100);
        tk1.naptien(1000);
        tk1.chuyentien(tk2,500);
        System.out.println(tk1);
        System.out.println(tk2);
        System.out.println(tk3);
        System.out.println(tk4);
        System.out.println(tk5);
    }
    
}
