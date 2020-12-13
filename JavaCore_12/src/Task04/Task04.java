package Task04;

import java.util.ArrayList;

public class Task04 {
    public static void main(String[] args) {
        ArrayList<String> members1 = new ArrayList<>();
        members1.add("Paul McCartney");
        members1.add("George Harrison");
        members1.add("Ringo Starr");
        members1.add("John Lennon");

        MusicBand band1 = new MusicBand("Beatles", 1960, members1);

        ArrayList<String> members2 = new ArrayList<>();
        members2.add("Mick Jagger");
        members2.add("Charles Watts");
        members2.add("Ronnie Wood");
        members2.add("Keith Richards");

        MusicBand band2 = new MusicBand("The Rolling Stones", 1962, members2);

        band1.printMembersBand();
        band2.printMembersBand();

        //System.out.println(band1.getMembers());
        System.out.println();

        MusicBand.transferMembers(band1, band2);

       band1.printMembersBand();
       band2.printMembersBand();
    }
}
