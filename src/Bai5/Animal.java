package Bai5;

public class Animal {
    private int cao, nang;
    private String loai, mau;

    public Animal() {
    }

    public Animal(int cao, int nang, String loai, String mau) {
        this.cao = cao;
        this.nang = nang;
        this.loai = loai;
        this.mau = mau;
    }

    public int getCao() {
        return cao;
    }

    public void setCao(int cao) {
        this.cao = cao;
    }

    public int getNang() {
        return nang;
    }

    public void setNang(int nang) {
        this.nang = nang;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

}
