package com.readwritejsondemo.main;

import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReadJsonMain {

	public static void main(String[] args) {
	
		try(FileReader reader = new FileReader("/home/"
		+ "administrator/19thFeb24AdvJava/mydata.txt")) {
			
			String jsonData = "";
			int x = 0;
			
			while((x = reader.read()) != -1) {
				jsonData = jsonData + (char)x;
			}
			
			JSONArray arr = new JSONArray(jsonData);
			
			for(int i = 0 ; i < arr.length(); i++) {
				JSONObject carObj = arr.getJSONObject(i);
				String carModel = carObj.getString("model");
				int carPrice = carObj.getInt("price");
				
				JSONObject engObj = 
							carObj.getJSONObject("engine");
				int carCapacity =
							engObj.getInt("capacity");
				String carCode = 
							engObj.getString("code");
				
				System.out.println("model : " + carModel
				+ " , price : " + carPrice + " , capacity : "
				+ carCapacity + " , code : " + carCode);
			}
		} catch (IOException | JSONException exc) {
			exc.printStackTrace();
		}
	}
}





