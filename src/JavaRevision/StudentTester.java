package JavaRevision;

public class StudentTester {
    public static void main(String[] args) {
        //Create an object of Student class
        Student st = new Student();
        //Use setter methods to set the values
        st.setStudentId(1001);
        st.setStudentName("Jacob");
        st.setQualifyingExamMarks(80);
        st.setResidentialStatus('H');
        st.setYearOfEgg(3);
        //Use getter methods with proper escape sequences to display values
        System.out.println("Student Name : " + st.getStudentName());
        System.out.println("Student Id : " + st.getStudentId());
        System.out.println("Qualifying marks : " + st.getQualifyingExamMarks());
        System.out.println("Year of Engineering : " + st.getYearOfEgg());
        System.out.println("Residential status : " + st.getResidentialStatus());


    }
}
