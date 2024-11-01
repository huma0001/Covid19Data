public class StuderendeMain {
    public static void main(String[] args) throws ForMangeStuderendeException {

        Studerende peter = new Studerende("Peter", "3219382");
        Studerende jørgen = new Studerende("Jørgen", "3995953");
        Studerende egon = new Studerende("Egon", "324124");
        Studerende lars = new Studerende("Lars", "354353");
        Studerende morten = new Studerende("Morten", "324314");


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


        System.out.println("Adding fifth student to group - expecting Error");
        studiegruppe.addStudentToGroup(morten);
        System.out.println(studiegruppe);

    }
}
