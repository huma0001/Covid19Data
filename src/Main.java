import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
            //load data covid19
            ArrayList<Covid19Data> covid19data1 = fh.loadAllCovidData();

            // display covid 19 data
            for (Covid19Data covid19Data : covid19data1) {
                System.out.println(covid19Data);
            }

        System.out.println(covid19data1.size());
    }
}