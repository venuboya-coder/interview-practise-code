//package practise101to200;
//
//public class AllPrograms101to200 {
//    Absolutely — here are another 100 harder QA-focused Java coding questions with solutions, ordered from upper-easy / medium → stronger interview level.
//
//    These are still QA/SDET relevant, not pure LeetCode-style developer DSA.
//    They focus on:
//            •	API/data validation
//	•	lists/maps/strings
//	•	pricing/business rules
//	•	retries
//	•	batching
//	•	comparisons
//	•	framework utility logic
//	•	test-result analysis
//	•	data transformation
//
//    I’ll keep the same format:
//
//    Question
//    Java solution
//
//⸻
//
//        101–120: Stronger string / collection / map problems
//
//101. Find first repeated character in a string
//import java.util.*;
//
//String input = "automation";
//Set<Character> seen = new HashSet<>();
//
//for (char c : input.toCharArray()) {
//        if (!seen.add(c)) {
//        System.out.println(c);
//        break;
//                }
//                }

//102. Count uppercase, lowercase, digits, special characters
//String input = "QaTest@123";
//        int upper = 0, lower = 0, digits = 0, special = 0;
//
//for (char c : input.toCharArray()) {
//        if (Character.isUpperCase(c)) upper++;
//        else if (Character.isLowerCase(c)) lower++;
//        else if (Character.isDigit(c)) digits++;
//        else special++;
//        }
//
//        System.out.println("Upper=" + upper + ", Lower=" + lower + ", Digits=" + digits + ", Special=" + special);

//103. Find all non-repeated characters
//import java.util.*;
//
//String input = "aabbcddefg";
//Map<Character, Integer> map = new LinkedHashMap<>();
//
//for (char c : input.toCharArray()) {
//        map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//        if (entry.getValue() == 1) {
//        System.out.println(entry.getKey());
//        }
//        }

//104. Check if two arrays contain same elements in different order
//import java.util.*;
//
//int[] a = {1, 2, 3, 4};
//int[] b = {4, 3, 2, 1};
//
//Arrays.sort(a);
//Arrays.sort(b);
//
//System.out.println(Arrays.equals(a, b));

//105. Find element with highest frequency in array
//import java.util.*;
//
//int[] arr = {1, 2, 2, 3, 3, 3, 4};
//Map<Integer, Integer> map = new HashMap<>();
//
//for (int n : arr) {
//        map.put(n, map.getOrDefault(n, 0) + 1);
//        }
//
//        int maxKey = -1, maxCount = 0;
//for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//        if (entry.getValue() > maxCount) {
//maxCount = entry.getValue();
//maxKey = entry.getKey();
//    }
//            }
//
//            System.out.println(maxKey);

//106. Find second most frequent element
//import java.util.*;
//
//int[] arr = {1, 2, 2, 3, 3, 3, 4, 4};
//Map<Integer, Integer> map = new HashMap<>();
//
//for (int n : arr) {
//        map.put(n, map.getOrDefault(n, 0) + 1);
//        }
//
//        int firstKey = -1, secondKey = -1;
//        int first = 0, second = 0;
//
//for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//int count = entry.getValue();
//    if (count > first) {
//second = first;
//secondKey = firstKey;
//first = count;
//firstKey = entry.getKey();
//    } else if (count > second) {
//second = count;
//secondKey = entry.getKey();
//    }
//            }
//
//            System.out.println(secondKey);

//107. Rotate array right by 2
//import java.util.*;
//
//int[] arr = {1, 2, 3, 4, 5};
//int k = 2;
//int n = arr.length;
//int[] result = new int[n];
//
//for (int i = 0; i < n; i++) {
//result[(i + k) % n] = arr[i];
//        }
//
//        System.out.println(Arrays.toString(result));

//108. Find all pairs with given sum
//int[] arr = {1, 2, 3, 4, 5, 6};
//int target = 7;
//
//for (int i = 0; i < arr.length; i++) {
//        for (int j = i + 1; j < arr.length; j++) {
//        if (arr[i] + arr[j] == target) {
//        System.out.println(arr[i] + ", " + arr[j]);
//        }
//                }
//                }

//109. Find unique elements only
//import java.util.*;
//
//int[] arr = {1, 2, 2, 3, 4, 4, 5};
//Map<Integer, Integer> map = new LinkedHashMap<>();
//
//for (int n : arr) {
//        map.put(n, map.getOrDefault(n, 0) + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//        if (entry.getValue() == 1) {
//        System.out.println(entry.getKey());
//        }
//        }

//110. Reverse array in place
//import java.util.*;
//
//int[] arr = {1, 2, 3, 4, 5};
//        int left = 0, right = arr.length - 1;
//
//while (left < right) {
//int temp = arr[left];
//arr[left] = arr[right];
//arr[right] = temp;
//left++;
//right--;
//        }
//
//        System.out.println(Arrays.toString(arr));

//111. Check if string has all unique characters
//import java.util.*;
//
//String input = "abcdefga";
//Set<Character> set = new HashSet<>();
//boolean unique = true;
//
//for (char c : input.toCharArray()) {
//        if (!set.add(c)) {
//unique = false;
//        break;
//        }
//        }
//
//        System.out.println(unique);

//112. Count substrings occurrence
//String input = "api test api automation api";
//String target = "api";
//int count = 0;
//int index = 0;
//
//while ((index = input.indexOf(target, index)) != -1) {
//count++;
//index += target.length();
//}
//
//        System.out.println(count);

//113. Find longest repeated prefix between two strings
//String a = "automation";
//String b = "autoheal";
//StringBuilder result = new StringBuilder();
//
//for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
//        if (a.charAt(i) == b.charAt(i)) {
//        result.append(a.charAt(i));
//        } else {
//        break;
//        }
//        }
//
//        System.out.println(result);

//114. Remove all duplicate words from sentence
//import java.util.*;
//
//String input = "api test api ui api";
//String[] words = input.split(" ");
//Set<String> set = new LinkedHashSet<>(Arrays.asList(words));
//
//System.out.println(String.join(" ", set));

//115. Sort strings by length
//import java.util.*;
//
//List<String> list = Arrays.asList("java", "api", "automation", "qa");
//list.sort(Comparator.comparingInt(String::length));
//
//        System.out.println(list);

//116. Find all indices of a character
//String input = "banana";
//char target = 'a';
//
//for (int i = 0; i < input.length(); i++) {
//        if (input.charAt(i) == target) {
//        System.out.println(i);
//    }
//            }

//117. Compare two maps deeply
//import java.util.*;
//
//Map<String, String> map1 = new HashMap<>();
//map1.put("name", "John");
//map1.put("status", "active");
//
//Map<String, String> map2 = new HashMap<>();
//map2.put("status", "active");
//map2.put("name", "John");
//
//System.out.println(map1.equals(map2));

//118. Find all duplicate words in sentence
//import java.util.*;
//
//String input = "api ui api db ui";
//Map<String, Integer> map = new HashMap<>();
//
//for (String word : input.split(" ")) {
//        map.put(word, map.getOrDefault(word, 0) + 1);
//        }
//
//        for (Map.Entry<String, Integer> e : map.entrySet()) {
//        if (e.getValue() > 1) {
//        System.out.println(e.getKey());
//        }
//        }

//119. Merge two sorted arrays
//import java.util.*;
//
//int[] a = {1, 3, 5};
//int[] b = {2, 4, 6};
//int[] merged = new int[a.length + b.length];
//        int i = 0, j = 0, k = 0;
//
//while (i < a.length && j < b.length) {
//        if (a[i] < b[j]) merged[k++] = a[i++];
//        else merged[k++] = b[j++];
//        }
//        while (i < a.length) merged[k++] = a[i++];
//        while (j < b.length) merged[k++] = b[j++];
//
//        System.out.println(Arrays.toString(merged));

//120. Find all elements greater than average
//import java.util.*;
//
//int[] arr = {10, 20, 30, 40, 50};
//double sum = 0;
//
//for (int n : arr) sum += n;
//double avg = sum / arr.length;
//
//for (int n : arr) {
//        if (n > avg) {
//        System.out.println(n);
//    }
//            }



//}
