
public class DoDai extends Unit {
    private double feet, meter;

    public DoDai(double feet, double meter) {
        this.feet = feet;
        this.meter = meter;
    }

    public double getFeet() {
        return feet;
    }

    public double getMeter() {
        return meter;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    @Override
    public double chuyenDoi() {
        return this.feet*12*2.54/100;
    }

    @Override
    public double chuyenDoiNguocLai() {
        return this.meter*100/2.54/12;
    }
    
}
