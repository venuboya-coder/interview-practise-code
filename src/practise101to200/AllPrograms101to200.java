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

//121–140: Harder QA-style data and validation problems
//
//121. Validate all response codes are in allowed set
//import java.util.*;
//
//int[] codes = {200, 201, 204, 200};
//Set<Integer> allowed = Set.of(200, 201, 204);
//boolean valid = true;
//
//for (int code : codes) {
//        if (!allowed.contains(code)) {
//valid = false;
//        break;
//        }
//        }
//
//        System.out.println(valid);

//122. Find duplicate emails ignoring case
//import java.util.*;
//
//String[] emails = {"A@test.com", "b@test.com", "a@test.com"};
//Set<String> seen = new HashSet<>();
//Set<String> duplicates = new HashSet<>();
//
//for (String email : emails) {
//String lower = email.toLowerCase();
//    if (!seen.add(lower)) {
//        duplicates.add(lower);
//    }
//            }
//
//            System.out.println(duplicates);

//123. Validate all mandatory API fields are non-null and non-blank
//import java.util.*;
//
//Map<String, String> response = new HashMap<>();
//response.put("id", "101");
//response.put("name", " ");
//response.put("status", "active");
//
//String[] required = {"id", "name", "status"};
//boolean valid = true;
//
//for (String field : required) {
//String value = response.get(field);
//    if (value == null || value.trim().isEmpty()) {
//valid = false;
//        System.out.println("Invalid field: " + field);
//    }
//            }
//
//            System.out.println(valid);

//124. Compare expected list with actual list regardless of order
//import java.util.*;
//
//List<String> expected = Arrays.asList("A", "B", "C");
//List<String> actual = Arrays.asList("C", "A", "B");
//
//List<String> e = new ArrayList<>(expected);
//List<String> a = new ArrayList<>(actual);
//Collections.sort(e);
//Collections.sort(a);
//
//System.out.println(e.equals(a));

//125. Find records missing from actual list
//import java.util.*;
//
//List<String> expected = Arrays.asList("TC1", "TC2", "TC3");
//List<String> actual = Arrays.asList("TC1", "TC3");
//
//for (String tc : expected) {
//        if (!actual.contains(tc)) {
//        System.out.println("Missing: " + tc);
//    }
//            }

//126. Validate all response times under threshold and print offenders
//int[] times = {120, 450, 330, 90};
//int threshold = 300;
//boolean pass = true;
//
//for (int time : times) {
//        if (time > threshold) {
//pass = false;
//        System.out.println("Exceeded: " + time);
//    }
//            }
//
//            System.out.println(pass);

//127. Group API calls by status code
//import java.util.*;
//
//int[] statusCodes = {200, 500, 200, 404, 500, 200};
//Map<Integer, Integer> map = new HashMap<>();
//
//for (int code : statusCodes) {
//        map.put(code, map.getOrDefault(code, 0) + 1);
//        }
//
//        System.out.println(map);

//128. Find average response time per endpoint
//import java.util.*;
//
//class Call {
//    String endpoint;
//    int time;
//    Call(String endpoint, int time) {
//        this.endpoint = endpoint;
//        this.time = time;
//    }
//}
//
//List<Call> calls = Arrays.asList(
//        new Call("/cart", 100),
//        new Call("/cart", 200),
//        new Call("/login", 150)
//);
//
//Map<String, Integer> sum = new HashMap<>();
//Map<String, Integer> count = new HashMap<>();
//
//for (Call call : calls) {
//        sum.put(call.endpoint, sum.getOrDefault(call.endpoint, 0) + call.time);
//        count.put(call.endpoint, count.getOrDefault(call.endpoint, 0) + 1);
//        }
//
//        for (String ep : sum.keySet()) {
//        System.out.println(ep + " avg = " + (sum.get(ep) / count.get(ep)));
//        }

//129. Find endpoint with highest average response time
//import java.util.*;
//
//class Call {
//    String endpoint;
//    int time;
//    Call(String endpoint, int time) {
//        this.endpoint = endpoint;
//        this.time = time;
//    }
//}
//
//List<Call> calls = Arrays.asList(
//        new Call("/cart", 100),
//        new Call("/cart", 300),
//        new Call("/login", 500),
//        new Call("/login", 700)
//);
//
//Map<String, Integer> sum = new HashMap<>();
//Map<String, Integer> count = new HashMap<>();
//
//for (Call c : calls) {
//        sum.put(c.endpoint, sum.getOrDefault(c.endpoint, 0) + c.time);
//        count.put(c.endpoint, count.getOrDefault(c.endpoint, 0) + 1);
//        }
//
//String maxEndpoint = null;
//double maxAvg = 0;
//
//for (String ep : sum.keySet()) {
//double avg = (double) sum.get(ep) / count.get(ep);
//    if (avg > maxAvg) {
//maxAvg = avg;
//maxEndpoint = ep;
//    }
//            }
//
//            System.out.println(maxEndpoint);


//130. Validate numeric strings before parsing
//String[] values = {"10", "20", "abc", "40"};
//
//for (String val : values) {
//        if (val.matches("\\d+")) {
//        System.out.println(Integer.parseInt(val));
//        } else {
//        System.out.println("Invalid number: " + val);
//    }
//            }

//131. Compare two JSON-like strings ignoring spaces
//String expected = "{ \"id\":101, \"name\":\"John\" }";
//String actual = "{\"id\":101,\"name\":\"John\"}";
//
//System.out.println(expected.replaceAll("\\s+", "").equals(actual.replaceAll("\\s+", "")));

//132. Find duplicate test case names across suites
//import java.util.*;
//
//List<String> suite1 = Arrays.asList("login", "cart", "checkout");
//List<String> suite2 = Arrays.asList("cart", "payment", "login");
//
//Set<String> set = new HashSet<>(suite1);
//for (String test : suite2) {
//        if (set.contains(test)) {
//        System.out.println(test);
//    }
//            }

//133. Validate ordered API workflow
//import java.util.*;
//
//List<String> actual = Arrays.asList("login", "cart", "checkout");
//List<String> expected = Arrays.asList("login", "cart", "checkout");
//
//System.out.println(actual.equals(expected));

//134. Find broken sequence in ordered workflow
//import java.util.*;
//
//List<String> actual = Arrays.asList("login", "checkout", "cart");
//List<String> expected = Arrays.asList("login", "cart", "checkout");
//
//for (int i = 0; i < expected.size(); i++) {
//        if (!expected.get(i).equals(actual.get(i))) {
//        System.out.println("Mismatch at position " + i);
//        break;
//                }
//                }

//135. Validate item quantities sum to expected total count
//int[] quantities = {2, 3, 1};
//int expectedCount = 6;
//int sum = 0;
//
//for (int q : quantities) sum += q;
//
//System.out.println(sum == expectedCount);

//136. Count how many payloads are invalid
//class Payload {
//    String id;
//    int quantity;
//
//    Payload(String id, int quantity) {
//        this.id = id;
//        this.quantity = quantity;
//    }
//}
//
//Payload[] payloads = {
//        new Payload("1", 2),
//        new Payload(null, 3),
//        new Payload("3", 0)
//};
//
//int invalid = 0;
//
//for (Payload p : payloads) {
//        if (p.id == null || p.quantity <= 0) {
//invalid++;
//        }
//        }
//
//        System.out.println(invalid);

//137. Find max consecutive passing tests
//String[] results = {"PASS", "PASS", "FAIL", "PASS", "PASS", "PASS"};
//        int max = 0, current = 0;
//
//for (String r : results) {
//        if (r.equals("PASS")) {
//current++;
//max = Math.max(max, current);
//    } else {
//current = 0;
//        }
//        }
//
//        System.out.println(max);

//138. Find max consecutive failures
//String[] results = {"FAIL", "FAIL", "PASS", "FAIL", "FAIL", "FAIL"};
//        int max = 0, current = 0;
//
//for (String r : results) {
//        if (r.equals("FAIL")) {
//current++;
//max = Math.max(max, current);
//    } else {
//current = 0;
//        }
//        }
//
//        System.out.println(max);

//139. Validate date list is ascending.
//        String[] dates = {"2026-01-01", "2026-01-05", "2026-01-10"};
//boolean ascending = true;
//
//for (int i = 0; i < dates.length - 1; i++) {
//        if (dates[i].compareTo(dates[i + 1]) > 0) {
//ascending = false;
//        break;
//        }
//        }
//
//        System.out.println(ascending);

//140. Build simple field mismatch report
//import java.util.*;
//
//Map<String, String> expected = Map.of("id", "101", "status", "active", "name", "John");
//Map<String, String> actual = Map.of("id", "101", "status", "inactive", "name", "Johnny");
//
//for (String key : expected.keySet()) {
//        if (!expected.get(key).equals(actual.get(key))) {
//        System.out.println(key + " expected=" + expected.get(key) + ", actual=" + actual.get(key));
//        }
//        }



//}
