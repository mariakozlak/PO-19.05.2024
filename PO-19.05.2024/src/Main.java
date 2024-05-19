import java.util.Date;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student s=new Student("John", "Doe", "doe@wp.pl", "Warsaw",
                "Zlota 12", "333-322-222", new Date(1980, 1, 1));

                StudyProgramme it=new StudyProgramme("IT", "AAA", 7, 5);


        s.enrollStudent(it);
        //semester by default
        s.addGrade(5, "PGO");
        s.addGrade(2, "APBD");

        Student.promoteAllStudents();

        Student.displayInfoAboutAllStudents();
        }
    }