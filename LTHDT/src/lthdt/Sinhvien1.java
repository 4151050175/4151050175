
package lthdt;

import java.util.Date;
import java.util.StringTokenizer;


public class Sinhvien1 {
    
    private String hoTen;
    private Date ngaySinh;
    private double dtb;
    public Sinhvien1(String hoTen,Date ngaySinh,double dtb){
        this.hoTen=hoTen;
        this.dtb=dtb;
        this.ngaySinh=ngaySinh;
    }
    public String layHoTen(){
        return hoTen;
    }
    public void ganHoTen(String hoTen){
        this.hoTen=hoTen;
    }
    public Date LayNgaySinh(){
        return ngaySinh;
    }
    public void ganNgaySinh(Date ngaySinh){
        this.ngaySinh=ngaySinh;
    }
    public double LayDTB(){
        return dtb;
    }
    public void ganDTB (double dtb){
        this.dtb=dtb;
    }
    
    
    
    public String layHo(){
        String a=hoTen;
        return a.split(" ")[0];
    }
    public String LayTen(){
        String[] tokens=hoTen.split(" ");
        return tokens[tokens.length -1];
        
    }
    public String layDem() {
        String dem;
        this.hoTen = hoTen.trim();
       // ho = hoTen.substring(0, hoTen.indexOf(" "));
        int i = hoTen.indexOf(' ');
        int j = i+1;
        int k = hoTen.lastIndexOf(' ');
        dem = hoTen.substring(j,k);
        return dem;
    }
    public void LayTuoi(){
        
    }
    public void LayXepLoai(){
        if(dtb>=8){
            System.out.println("Gioi");
        }
        else if((dtb>=7)&&(dtb<8)){
            System.out.println("Kha");
        }
        else if((dtb>=5)&&(dtb<7)){
            System.out.println("Trung Binh");
        }
    
    else 
    
            System.out.println("Yeu");
    }
    
    public void hienThi(){
        System.out.println("ho Ten: "+hoTen+"\n ngay sinh: "+ngaySinh+"\ndtb la: "+dtb + "\nlay ho: "+ layHo() 
        + "\nlay ten dem: " + layDem() + "\nlay ten: " + LayTen());
    }
   
    
    

    public static void main(String[] args) {
        Sinhvien1 sv = new Sinhvien1("Tran Quoc Viet", new Date(1999,11,24),9);
        sv.hienThi();
        
    
    }
    
}
