public class Course {
    static int maxCapacityOfStudents;
    static int TotalStudents;
    String courseName;
    String EnrolledStudents;
    boolean isEnrolled;

    {
        TotalStudents++;
    }

    Course(String course, String EnrollStud) {
        this.courseName = course;
        this.EnrolledStudents = EnrollStud;
    }

    static void setMaxCapacity(int capacity){
        maxCapacityOfStudents = capacity;

    }

    void enrollStudent(String name){
        this.EnrolledStudents = name;
        if(isEnrolled){
            System.out.println(name + " is already enrolled");
        } else{
            System.out.println(name+ " is enrolled");
            maxCapacityOfStudents--;
            isEnrolled=true;
            System.out.println("Max Capacity of students left : " + maxCapacityOfStudents);
        }

    }

    void unenrollStudent(String name){
        if(isEnrolled){
            System.out.println(name+" is unenrolled from the course");
            maxCapacityOfStudents++;
            isEnrolled=false;
            System.out.println("Max Capacity of students left : " + maxCapacityOfStudents);
        } else{
            System.out.println(name+ " is already unenrolled!");
            System.out.println("Max Capacity of students left : " + maxCapacityOfStudents);
        }
    }

    public static void main(String[] args) {
        Course stud1 = new Course("Science", "Saakshi");
        Course stud2 = new Course("Arts", "William Adam");
        Course.setMaxCapacity(5);
        stud1.enrollStudent("Saakshi");
        stud2.enrollStudent("William Adam");




    }
}