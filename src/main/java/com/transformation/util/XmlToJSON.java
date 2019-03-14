package com.transformation.util;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class XmlToJSON {
	
	public static int PRETTY_PRINT_INDENT_FACTOR = 4;
    public static String TEST_XML_STRING =
        "<?xml version=\"1.0\" ?><student><name>Debu Paul</name><age>27</age></student><student><name>Subhomoy Dey</name><age>28</age></student>";

    public static void main(String[] args) {
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            System.out.println(jsonPrettyPrintString);
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
    }

}
