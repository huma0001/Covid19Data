import javax.imageio.ImageReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Marsvin {
    private String name;
    private String race;
    private double foodPerDayGrams;
    private ArrayList<Marsvin> marsvinArrayList;


    public Marsvin(String name, String race, double foodPerDayGrams){
        this.name = name;
        this.race = race;
        this.foodPerDayGrams = foodPerDayGrams;
    }

    public String toString(){
        return "Marsvin's navn: " + name + ", Marsvins race: " + race + ", Marsvins mad per dag i gram: " + foodPerDayGrams;
    }

    private final File file = new File("Putte.txt");

    public ArrayList<Marsvin> loadMarsvinData() {
        ArrayList<Marsvin> marsvinListe = new ArrayList<>();
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("An error has occured: " + e.getMessage());
        }

        Marsvin marsvin = null;

        while (scan.hasNext()) {
            String everyLine = scan.nextLine();
            String[] attributesOfMarsvin = everyLine.split(",");
            marsvin = new Marsvin(
                    attributesOfMarsvin[0],
                    attributesOfMarsvin[1],
                    Double.parseDouble(attributesOfMarsvin[2])
            );
            marsvinListe.add(marsvin);
        }
        scan.close();
        return marsvinListe;
    }


    public static void main(String[] args) {
        MarsvinFileHandler marsvinFileHandler = new MarsvinFileHandler();
        ArrayList<Marsvin> marsvinArrayList1 = new ArrayList<>();

        marsvinFileHandler.læsMarsvinFraFil("Putte.txt");
        marsvinFileHandler.printMarsvinListe();

        double samletFoder = marsvinFileHandler.totalFood();
        System.out.println(samletFoder);



    }



    public double getFoodPerDayGrams(){
        return foodPerDayGrams;
    }
}
