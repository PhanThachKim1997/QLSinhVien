package Model;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    String ID;
    String nameStudent;
    double Average;
    LocalDate birthday;
    Class aClass;

    public Student(String ID, String nameStudent, double average,LocalDate birthday, Class aClass) {
        this.ID = ID;
        this.nameStudent = nameStudent;
        this.Average = average;
        this.birthday = birthday;
        this.aClass = aClass;
    }

    public Student() {

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public double getAverage() {
        return Average;
    }

    public void setAverage(double average) {
        Average = average;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(ID, student.ID) && Objects.equals(nameStudent, student.nameStudent) && Objects.equals(Average, student.Average) && Objects.equals(birthday, student.birthday) && Objects.equals(aClass, student.aClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, nameStudent, Average, birthday, aClass);
    }

    @Override
    public String toString() {
        return  "ID: " + ID +
                "\nTên sinh viên: " + nameStudent +
                "\nĐiểm trung bình: " + Average +
                "\nNgày sinh: " + birthday +
                "\nLớp" + aClass.nameClass;
    }

}
