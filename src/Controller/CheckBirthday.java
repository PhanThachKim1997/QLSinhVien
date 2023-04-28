package Controller;

import Model.Student;

import java.time.LocalDate;

public class CheckBirthday {
    public static boolean checkBirthday(Student student, LocalDate birthday){
        return student.getBirthday().equals(birthday);
    }
}
