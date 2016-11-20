package com.amazon.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class MicroAndMini {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTestCases = Integer.parseInt(br.readLine());

		for (int i = 0; i < numberOfTestCases; i++) {
			String word = br.readLine();
			int price = getPrice(word);
			System.out.println(price);
		}
	}

	private static int getPrice(String word) {
		int lengthOfWord = word.length();
		StringBuffer sb = new StringBuffer(word);
		Set<String> stringSet = new HashSet<>();

		for (int i = 0; i < lengthOfWord; i++) {
			char lastChar = sb.charAt(lengthOfWord - 1);
			String localSb = sb.substring(0, lengthOfWord - 1);
			sb.setLength(0);
			sb.append(lastChar).append(localSb);
			stringSet.add(sb.toString());
		}
		return stringSet.size();
	}
}
