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
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GiaoVien GVCN=new GiaoVien("Nguyen Van A",45,"Nha Trang ","123456","Cong Nghe Phan Mem","CNPM");
        LopHoc lop59CNTT3=new LopHoc(GVCN);
        //
        HocSinh  hs=new HocSinh("Do ThuyQuynh",21,"Tuy Hoa","0346056290","59CNTT3","aaa");
        HocSinh  hs1=new HocSinh("Nguyen Bao Minh",21,"Thac Ba","034777779","59CNTT3","abc");
        HocSinh  hs2=new HocSinh("Tran Van A",21,"Cam Ranh","034667456","59CNTT3","bba");
        HocSinh  hs3=new HocSinh("Nguyen Trong Duy",21,"Dien Khanh","034687650","59CNTT3","aba");
        lop59CNTT3.themHocSinh(hs);
        lop59CNTT3.themHocSinh(hs1);
        lop59CNTT3.themHocSinh(hs2);
        lop59CNTT3.themHocSinh(hs3);
        
        GiaoVien GVDD0=new GiaoVien("Huynh Tuan Anh",45,"Binh Dinh","090022222","Mau Thiet Ke","HTTT");
        GiaoVien GVDD1=new GiaoVien("Nguyen Dinh Cuong",42,"Nha Trang","0987654321","Ky Thuat Do Hoa","CNPM");
        lop59CNTT3.themGVGD(GVDD0);
        lop59CNTT3.themGVGD(GVDD1);
        
        System.out.println("Danh Sach Hoc Sinh");
        lop59CNTT3.inDSHS();
        System.out.println("Danh Sach Giao Vien Giang Day");
        lop59CNTT3.inDSGVGD();
    } 
}
         

