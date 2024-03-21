//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Anjing anjing1 = new Anjing("Danger", 4, "Cane Corso", "Hitam", "Jantan", "Daging");
        Anjing anjing2 = new Anjing("Destroy", 6, "Pitbull", "Cokelat", "Jantan", "Salmon");
        Anjing anjing3 = new Anjing("Black", 7, "Herder", "Cokelat", "Jantan", "Tulang");

        anjing1.info();
        anjing1.gonggong();
        anjing1.makan();
        anjing1.bermain();

        System.out.println();

        anjing2.info();
        anjing2.gonggong();
        anjing2.makan();
        anjing2.bermain();

        System.out.println();

        anjing3.info();
        anjing3.gonggong();
        anjing3.makan();
        anjing3.bermain();

    }
}