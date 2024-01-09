
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        AFD afd = new AFD();
        afd.citire();
        afd.afisare();

        if (afd.verificaDeterminism()) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceti cuvantul de verificat: ");
            String cuvant = scanner.nextLine();

            afd.verificare(cuvant);
        }
    }
}
