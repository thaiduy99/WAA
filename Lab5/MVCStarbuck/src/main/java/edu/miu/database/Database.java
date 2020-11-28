package edu.miu.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
	private static HashMap<String, String> users = new HashMap<String, String>();
	private static HashMap<String, List<String>> advice = new HashMap<String, List<String>>();
	static {
		users.put("Dave", "111");
		users.put("Steve", "222");
		users.put("Ralph", "333");
		ArrayList<String> darkList = new ArrayList<String>();
		darkList.add("Sumatra");
		darkList.add("Verona");
		darkList.add("French Roast");
		advice.put("dark", darkList);
		ArrayList<String> medList = new ArrayList<String>();
		medList.add("Breakfast Blend");
		medList.add("Colombia");
		medList.add("Yukon");
		medList.add("Pike Place");
		medList.add("House Blend");
		advice.put("medium", medList);
		ArrayList<String> lightList = new ArrayList<String>();
		lightList.add("Willow");
		lightList.add("Aria");
		lightList.add("Bright Sky");
		lightList.add("Veranda");
		advice.put("light", lightList);
	}

	static public Map<Integer, String> roasts =  new HashMap<Integer, String>();
	static {


		roasts.put(1, "light");
		roasts.put(2, "medium");
		roasts.put(3, "dark");
	}

	
	public String getPassword(String name) {
		return users.get(name);
	}
	public List<String> getAdvice(String roast) {
		return advice.get(roast);
	}
	
	public static void main(String[] args){
		Database data = new Database();
		System.out.print(data.getPassword("michelle"));
	}
}
