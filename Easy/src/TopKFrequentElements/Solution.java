package TopKFrequentElements;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by dingpeng on 16/8/10.
 */
public class Solution {

    // java 8, though time complexity is too high
    public List<Integer> topKFrequent(int[] nums, int k) {
        return Arrays
            .stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
            .entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
            .limit(k)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }
}
