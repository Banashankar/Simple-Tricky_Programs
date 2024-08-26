package com.bana.working;

import java.util.HashMap;
import java.util.Map;

public class VowelsLengthMap {

	public static void main(String[] args) {
		String a = "Olympic is tougest sport in arena".toLowerCase();
      char[] ch = a.toCharArray();

      Map<Character, Integer> mapLength = new HashMap<>();

      for(char c:ch){
          if("aeiou".indexOf(c) != -1){
              mapLength.put(c, mapLength.getOrDefault(c,0)+1);
          }
      }
      System.out.println(mapLength);

	}

}
