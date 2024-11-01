public class Covid19Data {
    private String region;
    private String aldersGruppe;
    private int bekræftedeTilfælde;
    private int døde;
    private int indlagt;
    private int indlagtIntensivt;
    private String dato;


    public Covid19Data(String region, String aldersGruppe, int bekræftedeTilfælde, int døde, int indlagt, int indlagtIntensivt, String dato){
        this.region = region;
        this.aldersGruppe = aldersGruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.døde = døde;
        this.indlagt = indlagt;
        this.indlagtIntensivt = indlagtIntensivt;
        this.dato = dato;
    }



    public String toString(){
        return  "Region: " + region + ", Alders Gruppe: " + aldersGruppe + ", Bekræftede tilfælde i alt: " + bekræftedeTilfælde
                + ", Døde: " + døde + ", Indlagt: " + indlagt + ", Intensivt indlagt " + indlagtIntensivt + ", Dato: " + dato;
    }


}
