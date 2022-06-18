package polimo;

public class Sales extends Pegawai{
    private int penjualan ;
    private double komisi ;
    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi ;
    }
    public int getPenjualan() {
        return penjualan;
    }
    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }
    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji(){
        double gaji = this.penjualan * this.komisi;
        return gaji ;
    }
    @Override
    public String toString() {
        System.out.printf("|%-30s|%-30s|%15d|%15g|%15g|",this.getNama(),super.toString(),this.penjualan,this.komisi, gaji());
        return "";
    }

}
