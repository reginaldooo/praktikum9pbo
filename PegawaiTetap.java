package polimo;

public class PegawaiTetap extends Pegawai{
    private double upah ;
    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }
    public double getUpah() {
        return upah;
    }
    public void setUpah(double upah) {
        this.upah = upah;
    }
    @Override
    public double gaji(){
        return this.upah ;
    }
    
    @Override
    public String toString() {
        System.out.printf("|%-30s|%-30s|%15g|%15g|",this.getNama(), super.toString(), this.upah,gaji());
        return "";
    }
}
