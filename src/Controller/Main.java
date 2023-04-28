package Controller;

import Model.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        //Nhập sinh viên
        ArrayList<Student> students = new ArrayList<>();
        while (true){
            System.out.println("Nhập thông tin sinh viên ~~~~");
            students.add(InputStudent.inputStudent());
            System.out.println("Bạn có muốn nhập thêm sinh viên (Y/N): ");
            String check = sc.nextLine();
            if(InputStudent.stopInputStudent(check)) break;
        }
        for(Student student: students){
            System.out.println(student);
            System.out.println("----------");
        }
//        Chọn sinh viên muốn kiểm tra:
        System.out.println("Nhập vào keyword để tìm sinh viên: ");
        String keyword = sc.nextLine();
        int i=0;
        int temp[]= new int[students.size()];
        for (Student student:students){
            if(FindStudent.findStudent(student,keyword)){
                System.out.println(i+1+"/ "+student.getID()+"_"+student.getNameStudent());
                temp[i]= students.indexOf(student);
                i++;
            }
        }
        if (i == 0) {
            System.out.println("Không tìm thấy sinh viên");
        }
        System.out.println("Nhập vào số stt sinh viên muốn chọn: ");
        int stt = Integer.parseInt(sc.nextLine());
        Student dataStudent = students.get(temp[stt-1]);

        //In khoa mà sinh viên đang học
        System.out.println("Khoa mà sinh viên đang theo học là: "+dataStudent.getaClass().getNameMajor());
        //Sinh viên có đậu hay không
        if(dataStudent.getAverage()>=5) System.out.println("Sinh viên đậu");
        else System.out.println("Sinh viên rớt");
        //Check ngày sinh
        System.out.println("Nhập ngày sinh muốn kiểm tra: ");
        String inputDate = sc.nextLine();
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        if(CheckBirthday.checkBirthday(dataStudent,date)){
            System.out.println("2 người có cùng ngày sinh.");
        }else
            System.out.println("2 người khác ngày sinh");
    }
}
