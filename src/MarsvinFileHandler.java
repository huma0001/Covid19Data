import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MarsvinFileHandler {

        private ArrayList<Marsvin> marsvinListe = new ArrayList<>();

        public void læsMarsvinFraFil(String filNavn) {
            try (BufferedReader br = new BufferedReader(new FileReader(filNavn))) {
                String linje;
                while ((linje = br.readLine()) != null) {
                    String[] data = linje.split(",");
                    String navn = data[0];
                    String race = data[1];
                    int fodermængde = Integer.parseInt(data[2]);

                    Marsvin marsvin = new Marsvin(navn, race, fodermængde);
                    marsvinListe.add(marsvin);
                }
            } catch (IOException e) {
                System.out.println("Fejl ved læsning af fil: " + e.getMessage());
            }
        }


    public double totalFood(){
        double totalFood = 0;

        for (Marsvin marsvin : marsvinListe){
            totalFood += marsvin.getFoodPerDayGrams();
        }
        return totalFood;
    }

        public void printMarsvinListe() {
            for (Marsvin marsvin : marsvinListe) {
                System.out.println(marsvin);
            }
        }
}
