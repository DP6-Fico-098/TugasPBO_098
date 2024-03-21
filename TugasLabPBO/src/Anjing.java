public class Anjing {
    String nama;
    int umur;
    String ras;
    String warna;
    String gender;
    String makanan;

    Anjing (String nama, int umur, String ras, String warna, String gender, String makanan){
        this.nama = nama;
        this.umur = umur;
        this.ras = ras;
        this.warna = warna;
        this.gender = gender;
        this.makanan = makanan;
    }

        void printData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Ras: " + ras);
        System.out.println("Warna Kulit: " + warna);
        System.out.println("Gender: " + gender);
    }
        void gonggong() {
        System.out.println(nama + " Sedang menggonggong");
        }

        void makan() {
        System.out.println(nama + " Sedang makan " + makanan);
        }

        void bermain() {
        System.out.println(nama + " Sedang bermain di halaman rumah");
        }

        void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + "tahun");
        System.out.println("Ras: " +ras);
        System.out.println("Warna Kulit: " + warna);
        System.out.println("Gender: " + gender);
        }
}
