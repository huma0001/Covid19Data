import java.util.ArrayList;

public class StuderendeMain {

    public static void main(String[] args) throws ForMangeStuderendeException {

        Studerende peter = new Studerende("Peter", "0001");
        Studerende jørgen = new Studerende("Jørgen", "0002");
        Studerende egon = new Studerende("Egon", "0003");
        Studerende lars = new Studerende("Lars", "0004");
        Studerende morten = new Studerende("Morten", "0005");


        Studiegruppe studiegruppe = new Studiegruppe();

        System.out.println("Adding first student to group");
        studiegruppe.addStudentToGroup(peter);
        System.out.println(studiegruppe);

        System.out.println("Adding second student to group");
        studiegruppe.addStudentToGroup(jørgen);
        System.out.println(studiegruppe);

        System.out.println("Adding third student to group");
        studiegruppe.addStudentToGroup(egon);
        System.out.println(studiegruppe);

        System.out.println("Adding fourth student to group");
        studiegruppe.addStudentToGroup(lars);
        System.out.println(studiegruppe);


        // Error handling her
        System.out.println("Adding fifth student to group - expecting Error");
        try {
            studiegruppe.addStudentToGroup(morten);
        }
        catch(ForMangeStuderendeException e){
            System.out.println("An error has occured: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("A new error has occured: " + e.getMessage());
        }
        System.out.println();
        System.out.println(studiegruppe);

        Studiegruppe studiegruppe2 = new Studiegruppe();

        System.out.println("Adding student to different group");
        studiegruppe2.addStudentToGroup(morten);
        System.out.println(studiegruppe2);


        System.out.println("Final size of group 1: " + studiegruppe.studieGruppe.size());
        System.out.println("Final size of group 2: " + studiegruppe2.studieGruppe.size());

    }
}
