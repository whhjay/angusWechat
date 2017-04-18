package org.angus.test;

import java.util.HashMap;
import java.util.Map;

import org.angus.utils.HttpUtil;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Test {
	public static void main(String[] args) {
		Map<String,String> params = new HashMap<String,String>();
//		params.put("address", "盐亭县富驿镇复明桥沟头");
//		params.put("city", "绵阳市");
		params.put("location", "31.309960781662267,105.5485593487033");
		params.put("ak", "nP6k1SPsdjH8hc5CNAGKvxMLShb3NHGA");
		params.put("output", "json");
		params.put("ret_coordtype", "wgs84ll");
		params.put("pois", "0");
		String result = HttpUtil.http("https://api.map.baidu.com/geocoder/v2/", params);
		System.out.println(result);
		
	}
	public static String decodeUnicode(final String dataStr) {     
        int start = 0;     
        int end = 0;     
        final StringBuffer buffer = new StringBuffer();     
        while (start > -1) {     
            end = dataStr.indexOf("\\u", start + 2);     
            String charStr = "";     
            if (end == -1) {     
                charStr = dataStr.substring(start + 2, dataStr.length());     
            } else {     
                charStr = dataStr.substring(start + 2, end);     
            }     
            char letter = (char) Integer.parseInt(charStr, 16); // 16进制parse整形字符串。     
            buffer.append(new Character(letter).toString());     
            start = end;     
        }     
        return buffer.toString();     
     }  
}
