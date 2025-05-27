import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private LocalDate dob;

    public Student(String name, String dobStr) {
        this.name = name;
        DateTimeFormatter formatter;
        if (dobStr.contains("-") && dobStr.indexOf('-') == 4) {
            formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        } else {
            formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        }
        this.dob = LocalDate.parse(dobStr, formatter);
    }

    public void displayInfo() {
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
