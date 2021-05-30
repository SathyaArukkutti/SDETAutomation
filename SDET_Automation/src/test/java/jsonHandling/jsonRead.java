package jsonHandling;

import java.io.FileReader;
import java.util.HashMap;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class jsonRead {
	
	public static void main(String[] args){
		
		try {
			FileReader fr= new FileReader("src/main/resources/TestJason.json");
			JsonParser jsonParser = new JsonParser();
			
			JsonObject obj=jsonParser.parse(fr).getAsJsonObject();
			
			if(obj.get("users").isJsonArray()){
				System.out.println("Json is Array type");
				
				JsonArray arr= obj.get("users").getAsJsonArray();
				
				HashMap<String,String> hm = new HashMap<String, String>();
				for(int i=0;i<arr.size();i++) {
					JsonObject obj1=arr.get(i).getAsJsonObject();
					System.out.println(obj1.get("Name"));
					System.out.println(obj1.get("id"));
					System.out.println(obj1.get("Age"));
					hm.put("Name",obj.get("Name").toString());
					hm.put("Age",obj.get("Age").toString());
					hm.put("id",obj.get("id").toString());
										
		
				}
				
			}else if( obj.get("users").isJsonObject()){
				System.out.println("Json is Objetc type");
			}else if (obj.get("users").isJsonNull()) {
			System.out.println("Null");}
		
		}
		catch(Exception e) {e.printStackTrace();}
	}

}
