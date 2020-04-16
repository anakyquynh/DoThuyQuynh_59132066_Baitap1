/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Quynh
 */
public abstract class CaNhan {
    String hoTen;
    String diaChi;
    String Sdt;
    int tuoi;
    public CaNhan(){
        this.hoTen="";
        this.tuoi=0;
        this.Sdt="";
        this.diaChi="";
        
        
    }
    public CaNhan(String hoTen,int tuoi,String diaChi,String Sdt){
        this.hoTen=hoTen;
        this.tuoi=tuoi;
        this.Sdt=Sdt;
        this.diaChi=diaChi;
    }
    public String getHoTen(){
        return hoTen;
    }
    public String getdiaChi(){
        return diaChi;
    }
    public String getSdt(){
        return Sdt;
    }
    public int getTuoi(){
        return tuoi;
    }
    public void sethoTen(String hoTen){
        this.hoTen=hoTen;
    }
    public void setdiaChi(String diaChi){
        this.diaChi=diaChi;
    }    
    public void setSdt(String Sdt){
        this.Sdt=Sdt;
    }
    public void setTuoi(int tuoi){
        this.tuoi=tuoi;
    }
    public abstract  String HienThiTT();
    
    
    
    
}
