import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int rating;
    private String name;

    private static List<Student> students = new ArrayList<>();


    public Student(String name) {
        this.name = name;   //TODO initialize name
        this.rating = 0; //default rating
        students.add(this);
    }//DONE

    public Student(int rating) {
        this.rating = rating;   //TODO initialize rating;
    }//DONE but how we can crate Student without name only with rating? No student - No rating))

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        setRating(rating);//could use (this.rating = rating) but we should validate exceptions
        students.add(this);
    }//Constructor for both parameters

    public Student() {
    }//Constructor without parameters for student which not undefined yet, and can be initialized via setter


//Getter & Setter for NAME

    public String getName() {
        return name;
    } //DONE

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        } else {
            this.name = name;
            students.add(this);
        }// TODO set student's name
    }//DONE


//Getter&Setter for RATING

    public int getRating() {
        return rating;
    }  //DONE

    public void setRating(int rating) {
        if (rating < 0) {
            throw new IllegalArgumentException("Rating cannot be negative");
        } else {
            this.rating = rating;
            students.add(this);
        }
    }//DONE


    public static double getAvgRating() {        // TODO return average rating of all students
        if (students.isEmpty()) {//exception for 0
            return 0.0;
        }
        double sum = 0.0;
        for (Student student : students) {
            sum += student.getRating();
        }
        return sum / students.size();
    }//Something wrong with this method, but I can't identify root cause((

    public boolean betterStudent(Student student) {
        // TODO return the result of comparing this.student's rating with the student's rating
        return this.rating > student.getRating();
    }

    public void changeRating(int rating) {

        setRating(rating);                                                 // TODO change this student's rating and average rating of all students

    }

    public static void removeStudent(Student student) {
        students.remove(student);                                                  // TODO remove student
    }


    @Override
    public String toString() {
        // TODO return String with name and rating of this student
        return "Student " + name + " has a rating of " + rating;
    }


    public static void main(String[] args) {
        Student student1 = new Student("Pavlo", 15);
        Student student2 = new Student("Andriy", 30);
        Student student3 = new Student("Mary", 5);
        System.out.println(student1.betterStudent(student2));
        System.out.println("Середнє" + Student.getAvgRating());
        System.out.println(student2.toString());
        student2.changeRating(51);
        System.out.println(student1.getRating());
        System.out.println(student2.getRating());
    }
}