
public class ThoiGian extends Unit {
    private double phut,miliGiay;

    public ThoiGian(double phut, double miliGiay) {
        this.phut = phut;
        this.miliGiay = miliGiay;
    }

    public double getPhut() {
        return phut;
    }

    public double getMiliGiay() {
        return miliGiay;
    }

    public void setPhut(double phut) {
        this.phut = phut;
    }

    public void setMiliGiay(double miliGiay) {
        this.miliGiay = miliGiay;
    }

    @Override
    public double chuyenDoi() {
        return this.phut *60000;
    }

    @Override
    public double chuyenDoiNguocLai() {
       return this.miliGiay/60000;
    }
    
}
