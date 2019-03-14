package com.transformation.util;

import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.XML;

public class JsonToXML {

	public static void main(String... s) throws FileNotFoundException {

		String json_data = "{\"student\":[{\"name\":\"Debu Paul\", \"age\":\"27\"},"
				+ "{\"name\":\"Subhomoy Dey\", \"age\":\"28\"}]}";

		JSONObject obj = new JSONObject(json_data);
		// converting json to xml
		String xml_data = XML.toString(obj);
		System.out.println(xml_data);
	}

}
