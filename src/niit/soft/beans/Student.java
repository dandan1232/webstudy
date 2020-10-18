package niit.soft.beans;

public class Student {
    private String name="µ°±¦";
    private String grade="Èí¼þ1921";
    private int age=3;
    private boolean isBoy=false;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                ", isBoy=" + isBoy +
                '}';
    }


    public Student(String name, String grade, int age, boolean isBoy) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.isBoy = isBoy;
    }
    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoy() {
        return isBoy;
    }

    public void setBoy(boolean boy) {
        isBoy = boy;
    }
}
