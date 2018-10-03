// https://leetcode.com/problems/top-k-frequent-elements/description/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TopKFrequentElements {

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		List<Integer> result = topKFrequent(nums, 2);
		
		for(Integer integer:result)
			System.out.println(integer);
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
        
        TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>();
        
        for(Integer integer:set) {
        	int freq = map.get(integer);
        	
        	if(treeMap.containsKey(freq)) {
        		List<Integer> temp = treeMap.get(freq);
        		temp.add(integer);
        		treeMap.put(freq, temp);
        	}
        	else {
        		List<Integer>temp = new ArrayList<>();
        		temp.add(integer);
        		treeMap.put(freq, temp);
        	}
        	
        }
        
        set = treeMap.keySet();
        
        List<Integer> result = new ArrayList<>();
        while(result.size() < k) {
        	result.addAll(treeMap.pollLastEntry().getValue());
        }
        
        return result;
    }

}
