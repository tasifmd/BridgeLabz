package com.bridgelabz.opps;
import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class OOPSUtil {
	//JSON parser object to parse read file
	static JSONParser jsonParser = new JSONParser();
	
	public static JSONArray readJson(String path) {
		
		JSONArray array = null;
		try (FileReader reader = new FileReader(path)){
			Object obj = jsonParser.parse(reader);
            array = (JSONArray) obj;
		}catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }  catch (ParseException e) {
            e.printStackTrace();
        }
		 return array;
		 
	}
	 
}
