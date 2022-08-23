
import demo.Artist;

import java.util.stream.Stream;

/** A Performance by some musicians - e.g., an Album or Gig. */
public interface PerformanceFixed {

    public String getName();

    public Stream<Artist> getMusicians();

    public default Stream<Artist> getAllMusicians() {
        return getMusicians().flatMap(artist -> Stream.concat(Stream.of(artist), artist.getMembers()));
    }

}