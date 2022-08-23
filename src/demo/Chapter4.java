package demo;

import java.util.IntSummaryStatistics;

/**
 * @author BaiJY
 * @date 2022/08/22
 **/
public class Chapter4 {

    // stream中有一些方便的操作方法，避免重复编写

    // BEGIN printTrackLengthStatistics
    public static void printTrackLengthStatistics(Album album) {
        IntSummaryStatistics trackLengthStats
                = album.getTracks()
                .mapToInt(track -> track.getLength())
                .summaryStatistics();

        System.out.printf("Max: %d, Min: %d, Ave: %f, Sum: %d",
                trackLengthStats.getMax(),
                trackLengthStats.getMin(),
                trackLengthStats.getAverage(),
                trackLengthStats.getSum());
    }
// END printTrackLengthStatistics

    // 默认方法
}
