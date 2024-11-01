public class Studerende {
    private String name;
    private String studieId;


    public Studerende(String name, String studieId){
        this.name = name;
        try {
            this.studieId = studieId;
            if (studieId.length() > 8){
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Studie ID must be less than 8 characters");
        }
    }


    public static void main(String[] args) {

        Studerende peter = new Studerende("Nigel", "204042522");

        // System.out.println(peter);
    }
}
