package Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

import Model.Class;
import Model.Student;

public class InputStudent {
    public static Student inputStudent(){
        Scanner sc = new Scanner(System.in);

        //Nhập thông tin lớp muốn thêm sinh viên
        System.out.println("Nhập tên lớp muốn thêm sinh viên: ");
        String nameClass = sc.nextLine();
        System.out.println("Nhập khoa: ");
        String nameMajor = sc.nextLine();
        Class aClass = new Class(nameClass,nameMajor);

        //Nhập thông tin sinh viên
        System.out.println("Nhập ID sinh viên: ");
        String ID = sc.nextLine();
        System.out.println("Nhập họ tên sinh viên: ");
        String nameStudent = sc.nextLine();
        LocalDate birthday;
        while (true){
            try{
                System.out.println("Nhập ngày sinh sinh viên(dd/MM/yyyy): ");
                String inputDate = sc.nextLine();
                birthday = LocalDate.parse(inputDate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                break;
            }catch (PatternSyntaxException e){
                System.out.println("Nhập sai định dạng ngày. Vui lòng nhập lại !!!");
            }
        }
        System.out.println("Nhập điểm trung bình: ");
        Double Average = Double.parseDouble(sc.nextLine());

        Student student = new Student(ID,nameStudent,Average,birthday,aClass);

        return student;
    }
    public static boolean stopInputStudent(String check){
        return check.equalsIgnoreCase("N");
    }
}
