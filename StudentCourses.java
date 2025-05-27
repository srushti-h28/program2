class StudentCourses {
    String semester;
    String course;
    int marks;

    public StudentCourses(String semester, String course, int marks) {
        this.semester = semester;
        this.course = course;
        this.marks = marks;
    }

    public void displayCourseInfo() {
        System.out.println("\nSemester: " + semester);
        System.out.println("Course: " + course);
        System.out.println("Marks Obtained: " + marks);
    }

    public static void main(String[] args) {
        StudentCourses sc1 = new StudentCourses("1st Semester", "C-Programming", 85);
        StudentCourses sc2 = new StudentCourses("3rd Semester", "FSWD", 90);
        StudentCourses sc3 = new StudentCourses("4th Semester", "JAVA", 88);

        sc1.displayCourseInfo();
        sc2.displayCourseInfo();
        sc3.displayCourseInfo();
    }
}

