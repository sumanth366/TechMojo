package com.techmojo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception 
	  { 
	  //tweets are kept in the file
	  File file = new File("C:\\Users\\Sumanth\\eclipse-workspace\\Twitter\\src\\tweets.txt"); 
	  
	  //Reading tweets from file
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  
	  String st,s=""; 
	  int flag=0;
	  List<String> l = new ArrayList();
	  Map<String, Integer> m = new HashMap<String,Integer>();
	  while ((st = br.readLine()) != null) 
	  	for(int i=0;i<st.length();i++)
	  	{
	  		if(st.charAt(i)=='#')
	  		{
	  			for(int j=i;j<st.length();j++)
	  			{
	  				if(st.charAt(j)==' ')
	  				{
	  					flag=1;
	  					break;
	  				}
	  				s=s+st.charAt(j);
	  				//s.append(st.charAt(j));
	  			}
	  			l.add(s);
	  			s="";
	  		}
	  		if(flag==1)
	  			break;
	  	}
	  for(String s1: l)
	  {
			if(m.containsKey(s1))
				m.put(s1, m.get(s1)+1);
			else
				m.put(s1, 1);
	  }
	  
	  SortMap sm = new SortMap();
	  
	  //sorting map in descending order 
	  Map<String, Integer> fm = sm.sortByValue(m);
	  Set<Map.Entry<String,Integer>> set = fm.entrySet();
	  System.out.println("Top 10 Trending hashtags:");
	  int count = 0;
	  for(Map.Entry<String, Integer> e: set)
	  {
		  if(count>=10)
			  break;
		  count++;
		  System.out.println(e.getKey()+" "+e.getValue());
	  }
	  } 
	
	

}
