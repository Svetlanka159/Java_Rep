package Task05;

import java.util.ArrayList;

public class Task05 {
    public static void main(String[] args) {
        ArrayList<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Paul McCartney", 25));
        members1.add(new MusicArtist("George Harrison", 27));
        members1.add(new MusicArtist("Ringo Starr", 21));
        members1.add(new MusicArtist("John Lennon", 32));

        MusicBand band1 = new MusicBand("Beatles", 1960, members1);

        ArrayList<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Mick Jagger", 34));
        members2.add(new MusicArtist("Charles Watts", 28));
        members2.add(new MusicArtist("Ronnie Wood", 30));
        members2.add(new MusicArtist("Keith Richards", 32));

        MusicBand band2 = new MusicBand("The Rolling Stones", 1962, members2);

        band1.printMembersBand();
        band2.printMembersBand();

        System.out.println();
        MusicBand.transferMembers(band1, band2);

        band1.printMembersBand();
        band2.printMembersBand();
    }
}
