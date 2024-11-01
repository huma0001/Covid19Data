import java.util.ArrayList;

public class Studiegruppe {
    ArrayList<Studerende> studieGruppe = new ArrayList<>();




    public void addStudentToGroup(Studerende studerende){
        studieGruppe.add(studerende);
    }
}
