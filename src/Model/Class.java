package Model;

import java.util.Objects;

public class Class {
    String nameClass;
    String nameMajor;

    public Class(String nameClass, String nameMajor) {
        this.nameClass = nameClass;
        this.nameMajor = nameMajor;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getNameMajor() {
        return nameMajor;
    }

    public void setNameMajor(String nameMajor) {
        this.nameMajor = nameMajor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return Objects.equals(nameClass, aClass.nameClass) && Objects.equals(nameMajor, aClass.nameMajor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameClass, nameMajor);
    }

    @Override
    public String toString() {
        return "Class{" +
                "nameClass='" + nameClass + '\'' +
                ", nameMajor='" + nameMajor + '\'' +
                '}';
    }
}
