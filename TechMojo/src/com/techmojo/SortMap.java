package com.techmojo;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortMap {
	
	  public HashMap<String, Integer> sortByValue(Map<String, Integer> m) 
	    { 
	        List<Map.Entry<String, Integer> > l = new LinkedList<Map.Entry<String, Integer> >(m.entrySet()); 
	  
	        Collections.sort(l, new Comparator<Map.Entry<String, Integer> >() { 
	            public int compare(Map.Entry<String, Integer> o1,  
	                               Map.Entry<String, Integer> o2) 
	            { 
	                return (o2.getValue()).compareTo(o1.getValue()); 
	            } 
	        }); 
	          
	        // put data from sorted list to hashmap  
	        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
	        for (Map.Entry<String, Integer> aa : l) { 
	            temp.put(aa.getKey(), aa.getValue()); 
	        } 
	        return temp; 
	    } 
		

}
