package javaImportentPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTheWordsInSentence {

	public static void main(String[] args) {
		/*
		 * String str="I am the Lazy Lazy fellow"; Map <String,Integer> map=new
		 * HashMap<String, Integer>(); Integer coun=1; String[] arr=str.split(" ");
		 * for(int i=0;i<arr.length;i++) { if(!map.containsKey(arr[i])) {
		 * map.put(arr[i], coun);
		 * 
		 * }else { map.put(arr[i],map.get(arr[i])+1); } } for(String x:map.keySet()) {
		 * System.out.println("The count of words \t"+x+"="+map.get(x)); }
		 */
		// much easy to make it using stream and Collectors.groupingBy method
		String str = "I am the Lazy Lazy fellow";
        List<String> stringList = Arrays.asList(str.split(" "));
        //using stream and Collectors.groupingBy method
        Map<String, Long> map = stringList.stream()
            .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(map);
	}

}
