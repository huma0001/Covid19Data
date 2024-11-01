import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    private final File file = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");

    public ArrayList<Covid19Data> loadAllCovidData() {
        ArrayList<Covid19Data> covid19Data = new ArrayList();
        Scanner scan = null;
        try {
            scan = new Scanner(file);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (Exception e) {
            System.out.println("An error has occurred: " + e.getMessage());
        }

        Covid19Data covid19Data1 = null;
        while (scan.hasNext()) {
            String line = scan.nextLine();    // Split linje og læg tokens i attributter
            String[] attributes = line.split(";");
            covid19Data1 = new Covid19Data(
                    attributes[0], // Region
                    attributes[1], // Aldersgruppe
                    (Integer.parseInt(attributes[2])), // bekræftede tilfælde
                    (Integer.parseInt(attributes[3])), //Døde
                    (Integer.parseInt(attributes[4])), // intensivt indlagt
                    (Integer.parseInt(attributes[5])), // indlagt
                    attributes[6] // dato
            );

            covid19Data.add(covid19Data1);

        }
        scan.close();
        return covid19Data;
    }

}
