package polimo;

public class Main {
    public static void main(String[] args) {
        PegawaiTetap pt1 = new PegawaiTetap("Farrel Reginaldo", "3573032810030001", 150000);
        PegawaiTetap pt2 = new PegawaiTetap("Dimas Sunu", "3573032810030002", 155000);
        PegawaiTetap pt3 = new PegawaiTetap("Dimas Kenzie", "3573032810030003", 160000);
        PegawaiTetap pt4 = new PegawaiTetap("Lanang Rizky", "3573032810030033", 165000);
        System.out.println("DAFTAR PEGAWAI TETAP");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("|%-30s|%-30s|%15s|%15s|\n","Nama", "No. KTP", "Upah","Pendapatan");
        System.out.println("===============================================================================================");
        System.out.println(pt1.toString());
        System.out.println(pt2.toString());
        System.out.println(pt3.toString());
        System.out.println(pt4.toString());
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("");
        
        PegawaiHarian ph1 = new PegawaiHarian("Muhammad Falah", "3573032810030004", 10000, 35);
        PegawaiHarian ph2 = new PegawaiHarian("Rakha Adhitama", "3573032810030005", 15000, 36);
        PegawaiHarian ph3 = new PegawaiHarian("Naufal Ihza", "3573032810030006", 20000, 37);
        PegawaiHarian ph4 = new PegawaiHarian("Adam Hadian", "3573032810030066", 25000, 38);
        System.out.println("DAFTAR PEGAWAI HARIAN");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-30s|%-30s|%15s|%15s|%15s|\n","Nama", "No. KTP", "Upah/Jam", "Total jam kerja", "Pendapatan");
        System.out.println("===============================================================================================================");
        System.out.println(ph1.toString());
        System.out.println(ph2.toString());
        System.out.println(ph3.toString());
        System.out.println(ph4.toString());
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        
        System.out.println("");
        
        Sales s1 = new Sales("Muhammad Radhana", "3573032810030007", 20, 20000);
        Sales s2 = new Sales("Nabila Maheswari", "3573032810030008", 21, 21000);
        Sales s3 = new Sales("Aulia Cahya", "3573032810030009", 22, 22000);
        Sales s4 = new Sales("Amelinda Ivana", "3573032810030099", 23, 23000);
        System.out.println("DAFTAR SALES");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-30s|%-30s|%15s|%15s|%15s|\n","Nama", " No. KTP", "Total Penjualan", "Besar Komisi", "Pendapatan");
        System.out.println("===============================================================================================================");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println("---------------------------------------------------------------------------------------------------------------");
    }
}
