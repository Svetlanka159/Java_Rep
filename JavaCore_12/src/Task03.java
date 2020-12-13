import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Task03 {
    public static void main(String[] args) {
        ArrayList<MusicBand> myMusicBands = new ArrayList<>();
        myMusicBands.add (new MusicBand("The Rolling Stones", 1962));
        myMusicBands.add (new MusicBand("Beatles", 1960));
        myMusicBands.add (new MusicBand("Pink Floyd", 1965));
        myMusicBands.add (new MusicBand("Morcheeba", 1995));
        myMusicBands.add (new MusicBand("The Black Eyed Peace", 1992));
        myMusicBands.add (new MusicBand("The Little Big", 2013));
        myMusicBands.add (new MusicBand("Arctic Monkeys", 2002));
        myMusicBands.add (new MusicBand("Muse", 1994));
        myMusicBands.add (new MusicBand("London Grammar", 2009));
        myMusicBands.add (new MusicBand("Guns N' Roses", 1985));
        myMusicBands.add (new MusicBand("Disclosure", 2010));
        myMusicBands.add (new MusicBand("Rudimental", 2010));

        System.out.println(myMusicBands);

        Collections.shuffle(myMusicBands);
        System.out.println(myMusicBands);

        System.out.println(groupsAfter2000(myMusicBands));


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        ArrayList<MusicBand> musicBands = new ArrayList<>();
        for(MusicBand musBand : bands){
            if(musBand.getYear()>2000)
                musicBands.add(musBand);
        }
        return musicBands;
    }
}


