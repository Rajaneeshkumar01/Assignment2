package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicate_Values {
	public static void findingDuplicateInList(List<List<Integer>> mainList) {
		List<Map<Integer, Integer>> hashMapList = new ArrayList<Map<Integer, Integer>>();
		int count = 0;
		for (int i = 0; i < mainList.size(); i++) {
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (Integer arrayList : mainList.get(i)) {

				if (map.containsKey(arrayList)) {
					count = map.get(arrayList.intValue());
					count++;
					map.put(arrayList, count);
				} else {
					map.put(arrayList, 1);
				}
			}
			hashMapList.add(map);
		}
		for (int i = 0; i < hashMapList.size(); i++) {
			Map<Integer, Integer> map = hashMapList.get(i);
			for (Integer key : map.keySet()) {
				if (map.get(key) > 1) {
					System.out.println(key + " -> " + map.get(key));
				}
			}
		}
	}

	public static void main(String[] args) {
		List<List<Integer>> mainList = new ArrayList<List<Integer>>();
		List<Integer> firstList = new ArrayList<Integer>();
		firstList.add(1);
		firstList.add(1);
		firstList.add(3);
		firstList.add(2);

		List<Integer> secondList = new ArrayList<Integer>();
		secondList.add(9);
		secondList.add(8);
		secondList.add(8);
		secondList.add(1);

		List<Integer> thirdList = new ArrayList<Integer>();
		thirdList.add(0);
		thirdList.add(4);
		thirdList.add(5);
		thirdList.add(0);
		thirdList.add(0);
		thirdList.add(1);
		thirdList.add(4);
		mainList.add(firstList);
		mainList.add(secondList);
		mainList.add(thirdList);

		findingDuplicateInList(mainList);
	}	

}
