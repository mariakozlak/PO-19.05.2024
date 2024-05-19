import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class Student {
    private static int nextIndexNumber = 1;
    private String firstName, lastName, email, city, street, phoneNumber;
    private Date birthDate;
    private String indexNumber;
    private StudyProgramme programme;
    private int currentSem;
    private String status;
    private Map<String, Integer> grades;


    public Student(String firstName, String lastName, String email, String city, String street, String phoneNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.street = street;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.indexNumber = "s" + nextIndexNumber++;
        this.status = "Candidate";
        this.grades = new HashMap<>();
    }

    //getters and setter - command + n - wpisuja sie automatycznie klasa B))
    public static int getNextIndexNumber() {
        return nextIndexNumber;
    }

    public static void promoteAllStudents() {
    }

    public static void displayInfoAboutAllStudents() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public StudyProgramme getProgramme() {
        return programme;
    }

    public int getCurrentSem() {
        return currentSem;
    }

    public String getStatus() {
        return status;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public static void setNextIndexNumber(int nextIndexNumber) {
        Student.nextIndexNumber = nextIndexNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void setProgramme(StudyProgramme programme) {
        this.programme = programme;
    }

    public void setCurrentSem(int currentSem) {
        this.currentSem = currentSem;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    public void enrollStudent(StudyProgramme programme) {
        this.programme = programme;
        this.currentSem = 1;
        this.status = "Student";
    }

    public void addGrade(int grade, String subject) {
        grades.put(subject, grade);
    }

    public void promoteToNextSem() {
        int failedSubjects = (int) grades.values().stream().filter(grade -> grade < 3).count();
        if (failedSubjects > programme.getMaxFailedSub()) {
            System.out.println("Student " + indexNumber + " cannot be promoted due to too many failed subjects.");
            return;
        }
        if (currentSem < programme.getTotalSem()) {
            currentSem++;
        } else {
            status = "Graduate";
        }
    }

    public static void promoteAllStudents(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            students.get(i).promoteToNextSem();
        }
    }

    public static void displayInfoAboutAllStudents(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("Index: " + student.getIndexNumber() +
                    ", Name: " + student.getFirstName() + " " + student.getLastName() +
                    ", Semester: " + student.getCurrentSem() +
                    ", Status: " + student.getStatus());
        }
    }
}

