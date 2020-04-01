package com.example.vollayadorid;



public class Sinhvien {

private String masv;
private String tensv;
private String ngaysinh;
private String gioitinh;
private String malop;

    public Sinhvien(String masv, String tensv, String ngaysinh, String gioitinh, String malop) {
        this.masv = masv;
        this.tensv = tensv;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.malop = malop;
    }

    public String getMasv() {
return masv;
}

public void setMasv(String masv) {
this.masv = masv;
}

public String getTensv() {
return tensv;
}

public void setTensv(String tensv) {
this.tensv = tensv;
}

public String getNgaysinh() {
return ngaysinh;
}

public void setNgaysinh(String ngaysinh) {
this.ngaysinh = ngaysinh;
}

public String getGioitinh() {
return gioitinh;
}

public void setGioitinh(String gioitinh) {
this.gioitinh = gioitinh;
}

public String getMalop() {
return malop;
}

public void setMalop(String malop) {
this.malop = malop;
}

}