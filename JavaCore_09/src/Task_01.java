public class Task_01 {
    public static void main(String[] args) {
        Student student = new Student("Василий","ИВТ-101");
        Teacher teacher = new Teacher("Петр Иванович Пупкин", "Вычислительные автоматы");
        System.out.println(student.getStudentGroup());
        System.out.println(teacher.getSubject());
        System.out.println();
        student.printInfo();
        System.out.println();
        teacher.printInfo();
    }
}
