import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// https://leetcode.com/problems/top-k-frequent-elements/description/
public class TopKFrequentElements {

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		topKFrequent(nums, 2);
	}
	
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
    	
        for(Integer integer:nums) {
        	if(map.containsKey(integer))
        		map.put(integer, map.get(integer)+1);
        	else 
        		map.put(integer, 1);
    	}
        Set<Integer> set = map.keySet();
        
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        
        for(Integer integer:set) {
        	int freq = map.get(integer);
        	treeMap.put(integer, freq);
        }
        
        set = treeMap.keySet();
        
        for(int i =0; i <set.size()-k; i++) {
        	System.out.println(treeMap.pollFirstEntry());
        }
        List<Integer> result = new ArrayList<>();
        
		return result.addAll(treeMap.values());
    }

}
