package jsonHandling;

import java.io.FileWriter;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class jsonWirte {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		JSONObject hm= new JSONObject();
		
		hm.put("Email","abc@gmail.com");
		hm.put("FirstNAme","Sathya");
		hm.put("LastANme","Aru");
		
		HashMap<String,String> h = new HashMap<String, String>();
		
		h.put("Address", "Twoer1");
		h.put("Zip","68393");
		h.put("city", "Chennai");
		
		hm.put("Address", h);
		
		JSONArray arr= new JSONArray();
		
		HashMap<String,String> h1 = new HashMap<String, String>();
		h1.put("empname", "sat");
		h1.put("emp id", "01");
		arr.add(h1);
		h1.put("empname", "mut");
		h1.put("emp id", "02");
		arr.add(h1);
		h1.put("empname", "pra");
		h1.put("emp id", "03");
		arr.add(h1);
		
		hm.put("Employee", arr);
		
		System.out.println(hm);
		
		try {
			FileWriter file = new FileWriter("src/main/resources/TestwriteJason.json");
			file.write(hm.toJSONString());
			file.close();
						
		}catch(Exception e) {e.printStackTrace();}

		
}
	}