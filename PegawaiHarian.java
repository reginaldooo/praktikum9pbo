package polimo;

public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }
    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }
    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        double gaji = 0;
        if (totalJam > 40) {
            gaji = (this.upahPerJam * 40) + (this.totalJam - 40) * (this.upahPerJam * 1.5);

        } else {
            gaji = upahPerJam * totalJam;
        }
        return gaji;
    }

    @Override
    public String toString() {
        System.out.printf("|%-30s|%-30s|%15g|%15d|%15g|",this.getNama(),super.toString(),this.upahPerJam,this.totalJam, gaji());
        return "";
//        return "Nama\t\t\t\t: " + this.getNama() + "\n" + super.toString() + "\n" +
//                "Upah/jam\t\t\t: " + this.upahPerJam + "\n" +
//                "Total jam kerja\t\t: " + this.totalJam + "\n" +
//                "Pendapatan\t\t\t: Rp" + gaji() + "\n";
    }
}
