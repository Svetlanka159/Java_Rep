public class Student extends Human {
    private String studentGroup;

    public Student(String name, String studentGroup){
        super(name);
        this.studentGroup = studentGroup;
    }

    public void setStudentGroup(String studentGroup){
        this.studentGroup = studentGroup;
    }

    public String getStudentGroup(){
        return studentGroup;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем "+super.getName());
    }
}
