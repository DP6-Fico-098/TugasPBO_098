//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Menggunakan parseInt(String s)
        String str = "123";
        int numFromString = parseIntExample(str);
        System.out.println("Hasil konversi string ke integer: " + numFromString);

        // Menggunakan intValue()
        Integer myInteger = 456;
        int intValueOfInteger = intValueExample(myInteger);
        System.out.println("Hasil pengambilan nilai primitif dari objek Integer: " + intValueOfInteger);
    }

    // Metode untuk mengonversi string menjadi integer menggunakan parseInt(String s)
    public static int parseIntExample(String s) {
        int num = Integer.parseInt(s);
        return num;
    }

    // Metode untuk mengambil nilai primitif dari objek Integer menggunakan intValue()
    public static int intValueExample(Integer integer) {
        int num = integer.intValue();
        return num;
    }
}