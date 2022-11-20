import java.util.ArrayList;
class Mahasiswa {
    private String nama;
    private String kelas;
    private int npm;
    private int angkatan;

    public Mahasiswa(String nama, String kelas, int npm, int angkatan) {
        this.npm = npm;
        this.nama = nama;
        this.kelas = kelas;
        this.angkatan = angkatan;
    }

    public String getName() {
        return nama;
    }

    public void setName(String nameNew) {
        this.nama = nameNew;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelasNew) {
        this.kelas = kelasNew;
    }

    public int getId() {
        return npm;
    }

    public void setId(int idNew) {
        this.npm = idNew;
    }

    @Override
    public String toString() {
        return
                "Nama     = " + nama +
                        "\nKelas    = " + kelas +
                        "\nNIM      = " + npm +
                        "\nAngkatan = " + angkatan + "\n";
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();

        System.out.println( "\n________");
        System.out.println( "| By Faldiarsyah Dwiki Permana");
        System.out.println( "------------------\n");

        System.out.println("\n'''''Data Mahasiswa Berprestasi'''''\n");

        //Data Awal
        System.out.println("\n____________");
        System.out.println("Data Awal Mahasiswa Berprestasi");
        System.out.println("===============================");
        mahasiswa.add(new Mahasiswa("Robi Pramuri", "Teknik Industri", 2647583766, 2021));
        mahasiswa.add(new Mahasiswa("Dika Maulana", "Bisnis Digital", 2386942311, 2022));
        mahasiswa.add(new Mahasiswa("Sigit Pratama", "Teknik Informatika", 2197546325, 2019));
        mahasiswa.add(new Mahasiswa("Mahesa Saputra", "Teknik Iformatika", 2087632533, 2020));
        mahasiswa.add(new Mahasiswa("Maulana Alfaridzy", "Teknik Industri", 2299024356, 2021));


        //Print All
        mahasiswa.forEach(System.out::println);

        //Remove Data
        System.out.println("\n\n____________");
        System.out.println("Menghapus Satu Data");
        System.out.println("===============================");
        mahasiswa.remove(1);
        mahasiswa.forEach(System.out::println);

        //Add Data
        System.out.println("\n\n____________");
        System.out.println("Menambahkan Satu Data");
        System.out.println("===============================");
        mahasiswa.add(1, new Mahasiswa("Jefri Rosyidin", "Teknik Industri", 2467243644, 2021));
        mahasiswa.forEach(System.out::println);

        //Jumlah Data
        System.out.println("\n____________");
        System.out.println("Total Mahasiswa Berprestasi: " + mahasiswa.size() + " Orang");
        System.out.println("===============================\n");

    }
}