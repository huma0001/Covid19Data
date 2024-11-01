import java.util.ArrayList;

public class Studiegruppe {
    ArrayList<Studerende> studieGruppe = new ArrayList<>();



    public void addStudentToGroup(Studerende studerende) throws ForMangeStuderendeException {
        if (studieGruppe.size() < 4) {
            studieGruppe.add(studerende);
        } else {
            throw new ForMangeStuderendeException("Only 4 students are allowed in a student group");
        }
    }


    public String toString(){
        return studieGruppe + "";
    }
}
