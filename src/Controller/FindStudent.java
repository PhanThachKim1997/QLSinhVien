package Controller;

import Model.Student;
import Model.Class;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;

public class FindStudent {
    public static boolean findStudent (Student student,String check){
        if(checkNumber(check)){
            double tbc = Double.parseDouble(check);
            if(student.getAverage()==tbc) return true;
        }

        if(checkDate(check)){
            LocalDate date = LocalDate.parse(check,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if(student.getBirthday().equals(date)) return true;
        }

        if(student.getNameStudent().equalsIgnoreCase(check)||
            student.getID().equalsIgnoreCase(check)||
                student.getaClass().getNameClass().equalsIgnoreCase(check)) return true;
        return false;
    }

    public static boolean checkNumber(String check){
        double kiemtra;
        try {
            kiemtra = Double.parseDouble(check);
        }catch (Exception e){
            return false;
        }
        return true;
    }
    public static boolean checkDate(String check){
        LocalDate checkDate;
        try {
            checkDate = LocalDate.parse(check,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
