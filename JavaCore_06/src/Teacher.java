import java.util.Random;

public class Teacher {
    private String name;
    private String course;

    public Teacher(String name, String course){
        this.name = name;
        this.course = course;
    }

    public void evaluate(Student student){
        Random random = new Random();
        int score = random.nextInt(4)+2;
        String scoreStr = "";
        switch(score){
            case 2:
                scoreStr = "неудовлетворительно";
                break;
            case 3:
                scoreStr = "удовлетворительно";
                break;
            case 4:
                scoreStr = "хорошо";
                break;
            case 5:
                scoreStr = "отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + course + " на оценку " + scoreStr);
    }

}
