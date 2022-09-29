import java.util.HashMap;
import java.util.Set;

public class BandSongs {
    public static void main(String[] args) {
        HashMap<String, String> songTracks = new HashMap<String, String>();
        songTracks.put("Sad Song", "this is a sad song, it doesn't get better.");
        songTracks.put("Happy Song", "this is a happy song, it is better than our last song.");
        songTracks.put("It's a Song", "it's a song, that you sing, it never ends.");
        songTracks.put("Song", "this is just a song, it doesn't have great lyrics.");
        
        String song1 = songTracks.get("Sad Song");

        System.out.println(song1);

        Set<String> keys = songTracks.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + songTracks.get(key));
        }
    } 
}