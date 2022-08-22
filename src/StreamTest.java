import demo.Album;
import demo.Artist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author BaiJY
 * @date 2022/08/22
 **/
public class StreamTest {

    public static List<String> getNamesAndOrigins(List<Artist> artists) {
        // 这里的flatmap把多个stream.of 流合并成了一个流
        return artists.stream().flatMap(artist -> Stream.of(artist.getName(), artist.getNationality())).collect(Collectors.toList());
    }

    public static List<Album> getAlbumWithAtMostThreeTracks(List<Album> albums) {
        return albums.stream().filter(album -> album.getTrackList().size() <= 3).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Artist> artists = new ArrayList<>();
        Artist artist1 = new Artist("周杰伦", "中国台湾");
        Artist artist2 = new Artist("孙燕姿", "新加坡");

        artists.add(artist1);
        artists.add(artist2);

        List<String> namesAndOrigins = getNamesAndOrigins(artists);

        namesAndOrigins.stream().forEach(s -> System.out.print(s));
    }
}
