package Task05;

public class MusicArtist {
    private String name;
    private int age;

    public MusicArtist(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name+" возраст: " + age;
    }
}
