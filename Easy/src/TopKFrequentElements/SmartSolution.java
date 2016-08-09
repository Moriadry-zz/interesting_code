package TopKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dingpeng on 16/8/10.
 * use hashmap to count frequency and use quick select to get top k elements.
 */

public class SmartSolution {
    Map<Integer,Integer> hm2323 = new HashMap<>();
    public List<Integer> topKFrequent(int[] nums, int k) {
        for(int i=0;i<nums.length;i++) {
            if(!hm2323.containsKey(nums[i])) {
                hm2323.put(nums[i],0);
            }
            hm2323.put(nums[i],hm2323.get(nums[i])+1);
        }
        List<Integer> l = new ArrayList<>(hm2323.keySet());
        return helper(l,k);
    }
    public List<Integer> helper(List<Integer> l, int k) {
        int pivot = l.get((int)Math.random()*l.size());
        int low = 0;
        int mid = low+1;
        int high = l.size()-1;
        while(mid<=high) {
            if(hm2323.get(l.get(mid))<hm2323.get(pivot)) {
                swap(l,mid++,low++);
            } else if(hm2323.get(l.get(mid))>hm2323.get(pivot)) {
                swap(l, mid, high--);
            } else {
                mid++;
            }
        }
        if(mid<l.size()-k) {
            return helper(new ArrayList<>(l.subList(mid,l.size())),k);
        } else if(mid >= l.size()-k&&low<=l.size()-k) return new ArrayList<>(l.subList(l.size()-k,l.size()));
        else {
            List<Integer> tmp = helper(new ArrayList<>(l.subList(0,low)),k-(l.size()-low));
            tmp.addAll(l.subList(low,l.size()));
            return tmp;
        }
    }
    public void swap(List<Integer> l, int i, int j) {
        int tmp = l.get(i);
        l.set(i,l.get(j));
        l.set(j, tmp);
    }
}
