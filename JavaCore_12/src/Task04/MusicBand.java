package Task04;

import java.util.ArrayList;

public class MusicBand{
    private String name;
    private int year;
    ArrayList<String> members;

    public MusicBand(String name, int year, ArrayList<String> members){
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear(){
        return year;
    }

    public ArrayList<String> getMembers(){
        return members;
    }

    public static void transferMembers(MusicBand band_A, MusicBand band_B){
        for (String member : band_A.getMembers()){
            band_B.getMembers().add(member); //добавляем участников из группы band_A в группу band_B
        }
        band_A.getMembers().clear();
    }

    public void printMembersBand (){
        System.out.println(members);
    }

    public String toString(){
        return name+" год основания " + year;
    }

}