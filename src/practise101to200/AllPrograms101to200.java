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

//141–160: Business logic / pricing / retry / batching
//
//141. Apply percentage discount
//double price = 200.0;
//double discount = 10.0;
//
//double finalPrice = price - (price * discount / 100);
//System.out.println(finalPrice);

//142. Apply fixed discount with floor at zero
//double price = 20.0;
//double discount = 30.0;
//
//double finalPrice = Math.max(0, price - discount);
//System.out.println(finalPrice);

//143. Calculate cart total with tax
//double subtotal = 100.0;
//double taxPercent = 20.0;
//
//double total = subtotal + (subtotal * taxPercent / 100);
//System.out.println(total);

//144. Apply BOGO only to eligible product
//String productId = "SKU-1";
//int quantity = 3;
//double price = 10.0;
//boolean eligible = productId.equals("SKU-1");
//
//double total;
//if (eligible) {
//int payable = (quantity / 2) + (quantity % 2);
//total = payable * price;
//} else {
//total = quantity * price;
//}
//
//        System.out.println(total);

//145. Apply buy 2 get 1 free
//int quantity = 7;
//double price = 10.0;
//
//int free = quantity / 3;
//int payable = quantity - free;
//double total = payable * price;
//
//System.out.println(total);

//146. Cap maximum order quantity
//int quantity = 120;
//int maxAllowed = 100;
//
//if (quantity > maxAllowed) {
//        System.out.println("Invalid quantity");
//} else {
//        System.out.println("Valid");
//}

//147. Batch records into chunks of size 3
//import java.util.*;
//
//List<String> records = Arrays.asList("A", "B", "C", "D", "E", "F", "G");
//int batchSize = 3;
//
//for (int i = 0; i < records.size(); i += batchSize) {
//List<String> batch = records.subList(i, Math.min(i + batchSize, records.size()));
//    System.out.println(batch);
//}

//148. Retry until success or max attempts
//int maxAttempts = 3;
//boolean success = false;
//
//for (int i = 1; i <= maxAttempts; i++) {
//        System.out.println("Attempt " + i);
//    if (i == 3) { // simulate success
//success = true;
//        break;
//        }
//        }
//
//        System.out.println(success);

//149. Exponential backoff values
//int baseDelay = 1000;
//for (int attempt = 1; attempt <= 5; attempt++) {
//int delay = (int) Math.pow(2, attempt - 1) * baseDelay;
//    System.out.println(delay);
//}

//150. Calculate failure percentage
//int total = 50;
//int failed = 7;
//
//double percentage = (failed * 100.0) / total;
//System.out.println(percentage);

//151. Identify flaky test cases (pass-fail-pass)
//import java.util.*;
//
//Map<String, List<String>> history = new HashMap<>();
//history.put("TC1", Arrays.asList("PASS", "FAIL", "PASS"));
//        history.put("TC2", Arrays.asList("PASS", "PASS", "PASS"));
//
//        for (Map.Entry<String, List<String>> e : history.entrySet()) {
//List<String> h = e.getValue();
//    if (h.contains("FAIL") && h.contains("PASS")) {
//        System.out.println("Potential flaky: " + e.getKey());
//        }
//        }

//152. Find latest failed build number
//int[] builds = {101, 102, 103, 104};
//String[] statuses = {"PASS", "FAIL", "PASS", "FAIL"};
//
//for (int i = builds.length - 1; i >= 0; i--) {
//        if (statuses[i].equals("FAIL")) {
//        System.out.println(builds[i]);
//        break;
//                }
//                }

//153. Count API failures by endpoint
//import java.util.*;
//
//class Log {
//    String endpoint;
//    int status;
//    Log(String endpoint, int status) {
//        this.endpoint = endpoint;
//        this.status = status;
//    }
//}
//
//List<Log> logs = Arrays.asList(
//        new Log("/cart", 500),
//        new Log("/cart", 200),
//        new Log("/login", 500)
//);
//
//Map<String, Integer> failures = new HashMap<>();
//
//for (Log log : logs) {
//        if (log.status >= 400) {
//        failures.put(log.endpoint, failures.getOrDefault(log.endpoint, 0) + 1);
//        }
//        }
//
//        System.out.println(failures);

//154. Keep only latest result per test case
//import java.util.*;
//
//class Result {
//    String testName;
//    String status;
//    int runId;
//    Result(String testName, String status, int runId) {
//        this.testName = testName;
//        this.status = status;
//        this.runId = runId;
//    }
//}
//
//List<Result> results = Arrays.asList(
//        new Result("TC1", "FAIL", 1),
//        new Result("TC1", "PASS", 2),
//        new Result("TC2", "PASS", 1)
//);
//
//Map<String, Result> latest = new HashMap<>();
//
//for (Result r : results) {
//        if (!latest.containsKey(r.testName) || r.runId > latest.get(r.testName).runId) {
//        latest.put(r.testName, r);
//    }
//            }
//
//            for (Result r : latest.values()) {
//        System.out.println(r.testName + " -> " + r.status);
//}

//155. Find test cases that always failed
//import java.util.*;
//
//Map<String, List<String>> history = new HashMap<>();
//history.put("TC1", Arrays.asList("FAIL", "FAIL", "FAIL"));
//        history.put("TC2", Arrays.asList("FAIL", "PASS", "FAIL"));
//
//        for (Map.Entry<String, List<String>> e : history.entrySet()) {
//boolean alwaysFail = true;
//    for (String s : e.getValue()) {
//        if (!s.equals("FAIL")) {
//alwaysFail = false;
//        break;
//        }
//        }
//        if (alwaysFail) {
//        System.out.println(e.getKey());
//        }
//        }

//156. Split payload IDs into success and failure groups
//import java.util.*;
//
//Map<String, Integer> result = new HashMap<>();
//result.put("id1", 200);
//result.put("id2", 500);
//result.put("id3", 201);
//
//List<String> success = new ArrayList<>();
//List<String> failure = new ArrayList<>();
//
//for (Map.Entry<String, Integer> e : result.entrySet()) {
//        if (e.getValue() >= 200 && e.getValue() < 300) success.add(e.getKey());
//        else failure.add(e.getKey());
//        }
//
//        System.out.println(success);
//System.out.println(failure);

//157. Validate no duplicate product IDs in cart
//import java.util.*;
//
//String[] productIds = {"SKU1", "SKU2", "SKU3", "SKU2"};
//Set<String> set = new HashSet<>();
//boolean hasDuplicates = false;
//
//for (String id : productIds) {
//        if (!set.add(id)) {
//hasDuplicates = true;
//        break;
//        }
//        }
//
//        System.out.println(hasDuplicates);

//158. Find highest revenue product
//class Item {
//    String name;
//    int quantity;
//    double price;
//
//    Item(String name, int quantity, double price) {
//        this.name = name;
//        this.quantity = quantity;
//        this.price = price;
//    }
//}
//
//Item[] items = {
//        new Item("Mouse", 2, 15.99),
//        new Item("Keyboard", 1, 49.99),
//        new Item("Headset", 3, 20.0)
//};
//
//String maxName = "";
//double maxRevenue = 0;
//
//for (Item item : items) {
//double revenue = item.quantity * item.price;
//    if (revenue > maxRevenue) {
//maxRevenue = revenue;
//maxName = item.name;
//    }
//            }
//
//            System.out.println(maxName);

//159. Validate grand total matches sum of line totals
//double[] lineTotals = {31.98, 49.99};
//double grandTotal = 81.97;
//double sum = 0.0;
//
//for (double line : lineTotals) sum += line;
//
//System.out.println(Math.abs(sum - grandTotal) < 0.001);

//160. Find missing batch numbers
//import java.util.*;
//
//int[] batches = {1, 2, 4, 5, 7};
//Set<Integer> set = new HashSet<>();
//for (int b : batches) set.add(b);
//
//for (int i = 1; i <= 7; i++) {
//        if (!set.contains(i)) {
//        System.out.println("Missing batch: " + i);
//    }
//            }

//161–180: Framework-style utilities and validation helpers
//
//161. Write a utility to check if string is blank
//public class Main {
//    public static boolean isBlank(String value) {
//        return value == null || value.trim().isEmpty();
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isBlank(" "));
//    }
//}

//162. Write utility to safely parse integer
//public class Main {
//    public static Integer safeParse(String value) {
//        try {
//            return Integer.parseInt(value);
//        } catch (Exception e) {
//            return null;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(safeParse("123"));
//        System.out.println(safeParse("abc"));
//    }
//}

//163. Utility to compare doubles with tolerance
//public class Main {
//    public static boolean nearlyEqual(double a, double b, double tolerance) {
//        return Math.abs(a - b) <= tolerance;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(nearlyEqual(81.97, 81.9701, 0.01));
//    }
//}

//164. Utility to check if list contains duplicates
//import java.util.*;
//
//public class Main {
//    public static <T> boolean hasDuplicates(List<T> list) {
//        return list.size() != new HashSet<>(list).size();
//    }
//
//    public static void main(String[] args) {
//        System.out.println(hasDuplicates(Arrays.asList(1, 2, 2, 3)));
//    }
//}

//165. Utility to return failed test names only
//import java.util.*;
//
//class TestResult {
//    String testName;
//    String status;
//    TestResult(String testName, String status) {
//        this.testName = testName;
//        this.status = status;
//    }
//}
//
//public class Main {
//    public static List<String> getFailedTests(List<TestResult> results) {
//        List<String> failed = new ArrayList<>();
//        for (TestResult r : results) {
//            if ("FAIL".equals(r.status)) {
//                failed.add(r.testName);
//            }
//        }
//        return failed;
//    }
//}

//166. Utility to count status groups
//import java.util.*;
//
//public class Main {
//    public static Map<String, Integer> countStatuses(List<String> statuses) {
//        Map<String, Integer> map = new HashMap<>();
//        for (String status : statuses) {
//            map.put(status, map.getOrDefault(status, 0) + 1);
//        }
//        return map;
//    }
//}

//167. Utility to validate all values in map are non-null
//import java.util.*;
//
//public class Main {
//    public static boolean allValuesPresent(Map<String, String> map) {
//        for (String value : map.values()) {
//            if (value == null) return false;
//        }
//        return true;
//    }
//}

//168. Utility to return missing keys between expected and actual maps
//import java.util.*;
//
//public class Main {
//    public static List<String> missingKeys(Set<String> expected, Map<String, String> actual) {
//        List<String> result = new ArrayList<>();
//        for (String key : expected) {
//            if (!actual.containsKey(key)) {
//                result.add(key);
//            }
//        }
//        return result;
//    }
//}

//169. Utility to group strings by first letter
//import java.util.*;
//
//public class Main {
//    public static Map<Character, List<String>> groupByFirstLetter(List<String> words) {
//        Map<Character, List<String>> map = new HashMap<>();
//        for (String word : words) {
//            char first = word.charAt(0);
//            map.computeIfAbsent(first, k -> new ArrayList<>()).add(word);
//        }
//        return map;
//    }
//}

//170. Utility to flatten nested lists
//import java.util.*;
//
//public class Main {
//    public static List<Integer> flatten(List<List<Integer>> nested) {
//        List<Integer> result = new ArrayList<>();
//        for (List<Integer> list : nested) {
//            result.addAll(list);
//        }
//        return result;
//    }
//}

//171. Utility to chunk list into batches
//import java.util.*;
//
//public class Main {
//    public static <T> List<List<T>> chunk(List<T> input, int size) {
//        List<List<T>> result = new ArrayList<>();
//        for (int i = 0; i < input.size(); i += size) {
//            result.add(input.subList(i, Math.min(i + size, input.size())));
//        }
//        return result;
//    }
//}

//172. Utility to return latest item by timestamp string
//import java.util.*;
//
//class Event {
//    String name;
//    String timestamp;
//    Event(String name, String timestamp) {
//        this.name = name;
//        this.timestamp = timestamp;
//    }
//}
//
//public class Main {
//    public static Event latest(List<Event> events) {
//        Event latest = events.get(0);
//        for (Event e : events) {
//            if (e.timestamp.compareTo(latest.timestamp) > 0) {
//                latest = e;
//            }
//        }
//        return latest;
//    }
//}

//173. Utility to remove nulls from list
//import java.util.*;
//
//public class Main {
//    public static List<String> removeNulls(List<String> input) {
//        List<String> result = new ArrayList<>();
//        for (String s : input) {
//            if (s != null) result.add(s);
//        }
//        return result;
//    }
//}

//174. Utility to normalize strings to lower-case trimmed list
//import java.util.*;
//
//public class Main {
//    public static List<String> normalize(List<String> input) {
//        List<String> result = new ArrayList<>();
//        for (String s : input) {
//            result.add(s.trim().toLowerCase());
//        }
//        return result;
//    }
//}

//175. Utility to build mismatch count between two lists
//import java.util.*;
//
//public class Main {
//    public static int mismatchCount(List<String> a, List<String> b) {
//        int count = 0;
//        for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
//            if (!a.get(i).equals(b.get(i))) count++;
//        }
//        return count;
//    }
//}

//176. Utility to find first failing assertion name
//import java.util.*;
//
//class AssertionResult {
//    String name;
//    boolean pass;
//    AssertionResult(String name, boolean pass) {
//        this.name = name;
//        this.pass = pass;
//    }
//}
//
//public class Main {
//    public static String firstFailure(List<AssertionResult> results) {
//        for (AssertionResult r : results) {
//            if (!r.pass) return r.name;
//        }
//        return null;
//    }
//}


//177. Utility to merge two maps with second overriding first
//import java.util.*;
//
//public class Main {
//    public static Map<String, String> merge(Map<String, String> first, Map<String, String> second) {
//        Map<String, String> merged = new HashMap<>(first);
//        merged.putAll(second);
//        return merged;
//    }
//}

//178. Utility to calculate median response time
//import java.util.*;
//
//public class Main {
//    public static double median(int[] arr) {
//        Arrays.sort(arr);
//        int n = arr.length;
//        if (n % 2 == 0) {
//            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
//        }
//        return arr[n / 2];
//    }
//}

//179. Utility to find top N slowest times
//import java.util.*;
//
//public class Main {
//    public static List<Integer> topNSlowest(List<Integer> times, int n) {
//        times.sort(Collections.reverseOrder());
//        return times.subList(0, Math.min(n, times.size()));
//    }
//}

//180. Utility to check whether all expected substrings are present
//public class Main {
//    public static boolean containsAll(String value, String[] required) {
//        for (String r : required) {
//            if (!value.contains(r)) return false;
//        }
//        return true;
//    }
//}

//181–200: Stronger interview-level QA scenarios
//
//181. Calculate cart total with mixed offer types
//enum OfferType { NONE, BOGO }
//
//class Item {
//    int quantity;
//    double price;
//    OfferType offerType;
//
//    Item(int quantity, double price, OfferType offerType) {
//        this.quantity = quantity;
//        this.price = price;
//        this.offerType = offerType;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Item[] items = {
//                new Item(2, 15.99, OfferType.BOGO),
//                new Item(1, 49.99, OfferType.NONE)
//        };
//
//        double total = 0.0;
//
//        for (Item item : items) {
//            if (item.offerType == OfferType.BOGO) {
//                int payable = (item.quantity / 2) + (item.quantity % 2);
//                total += payable * item.price;
//            } else {
//                total += item.quantity * item.price;
//            }
//        }
//
//        System.out.println(String.format("%.2f", total));
//    }
//}

//182. Find API contracts missing in actual deployment
//import java.util.*;
//
//List<String> expected = Arrays.asList("getCart", "createCart", "deleteCart");
//List<String> actual = Arrays.asList("getCart", "createCart");
//
//for (String contract : expected) {
//        if (!actual.contains(contract)) {
//        System.out.println(contract);
//    }
//            }

//183. Compare two result sets and print unexpected rows
//import java.util.*;
//
//List<String> expected = Arrays.asList("row1", "row2");
//List<String> actual = Arrays.asList("row1", "row2", "row3");
//
//for (String row : actual) {
//        if (!expected.contains(row)) {
//        System.out.println("Unexpected: " + row);
//    }
//            }

//184. Validate retries stop after success
//int maxAttempts = 5;
//boolean success = false;
//int attemptsUsed = 0;
//
//for (int i = 1; i <= maxAttempts; i++) {
//attemptsUsed++;
//        if (i == 3) { // simulate success on 3rd
//success = true;
//        break;
//        }
//        }
//
//        System.out.println("Success=" + success + ", attempts=" + attemptsUsed);

//185. Find common failed tests across two runs
//import java.util.*;
//
//Set<String> run1 = new HashSet<>(Arrays.asList("TC1", "TC2", "TC3"));
//Set<String> run2 = new HashSet<>(Arrays.asList("TC2", "TC3", "TC4"));
//
//run1.retainAll(run2);
//System.out.println(run1);

//186. Find newly failing tests in latest run
//import java.util.*;
//
//Set<String> oldFails = new HashSet<>(Arrays.asList("TC1", "TC2"));
//Set<String> newFails = new HashSet<>(Arrays.asList("TC2", "TC3"));
//
//for (String tc : newFails) {
//        if (!oldFails.contains(tc)) {
//        System.out.println(tc);
//    }
//            }

//187. Find recovered tests (failed before, passed now)
//import java.util.*;
//
//Set<String> oldFails = new HashSet<>(Arrays.asList("TC1", "TC2", "TC3"));
//Set<String> newFails = new HashSet<>(Arrays.asList("TC2"));
//
//for (String tc : oldFails) {
//        if (!newFails.contains(tc)) {
//        System.out.println(tc);
//    }
//            }

//188. Validate all line totals equal quantity * price
//class LineItem {
//    int quantity;
//    double price;
//    double lineTotal;
//
//    LineItem(int quantity, double price, double lineTotal) {
//        this.quantity = quantity;
//        this.price = price;
//        this.lineTotal = lineTotal;
//    }
//}
//
//LineItem[] items = {
//        new LineItem(2, 10.0, 20.0),
//        new LineItem(3, 5.0, 15.0)
//};
//
//boolean valid = true;
//for (LineItem item : items) {
//        if (Math.abs((item.quantity * item.price) - item.lineTotal) > 0.001) {
//valid = false;
//        break;
//        }
//        }
//
//        System.out.println(valid);

//189. Find invalid response schema fields
//import java.util.*;
//
//Set<String> expectedFields = Set.of("id", "name", "status");
//Set<String> actualFields = Set.of("id", "name", "state");
//
//for (String field : expectedFields) {
//        if (!actualFields.contains(field)) {
//        System.out.println("Missing field: " + field);
//    }
//            }
//            for (String field : actualFields) {
//        if (!expectedFields.contains(field)) {
//        System.out.println("Unexpected field: " + field);
//    }
//            }

//190. Validate no duplicate cart IDs in a list of carts
//import java.util.*;
//
//String[] cartIds = {"C1", "C2", "C3", "C2"};
//Set<String> seen = new HashSet<>();
//boolean duplicateFound = false;
//
//for (String id : cartIds) {
//        if (!seen.add(id)) {
//duplicateFound = true;
//        break;
//        }
//        }
//
//        System.out.println(duplicateFound);

//191. Build endpoint pass rate summary
//import java.util.*;
//
//class Result {
//    String endpoint;
//    boolean pass;
//    Result(String endpoint, boolean pass) {
//        this.endpoint = endpoint;
//        this.pass = pass;
//    }
//}
//
//List<Result> results = Arrays.asList(
//        new Result("/cart", true),
//        new Result("/cart", false),
//        new Result("/login", true)
//);
//
//Map<String, Integer> total = new HashMap<>();
//Map<String, Integer> passed = new HashMap<>();
//
//for (Result r : results) {
//        total.put(r.endpoint, total.getOrDefault(r.endpoint, 0) + 1);
//        if (r.pass) {
//        passed.put(r.endpoint, passed.getOrDefault(r.endpoint, 0) + 1);
//        }
//        }
//
//        for (String ep : total.keySet()) {
//double rate = (passed.getOrDefault(ep, 0) * 100.0) / total.get(ep);
//    System.out.println(ep + " = " + rate + "%");
//}

//192. Find endpoints with failure rate above threshold
//import java.util.*;
//
//Map<String, Integer> total = Map.of("/cart", 10, "/login", 20);
//Map<String, Integer> failures = Map.of("/cart", 3, "/login", 1);
//
//for (String ep : total.keySet()) {
//double failureRate = (failures.getOrDefault(ep, 0) * 100.0) / total.get(ep);
//    if (failureRate > 20) {
//        System.out.println(ep);
//    }
//            }

//193. Validate test data rows have unique composite key
//import java.util.*;
//
//class Row {
//    String userId;
//    String productId;
//
//    Row(String userId, String productId) {
//        this.userId = userId;
//        this.productId = productId;
//    }
//}
//
//Row[] rows = {
//        new Row("U1", "P1"),
//        new Row("U1", "P2"),
//        new Row("U1", "P1")
//};
//
//Set<String> keys = new HashSet<>();
//for (Row row : rows) {
//String key = row.userId + "-" + row.productId;
//    if (!keys.add(key)) {
//        System.out.println("Duplicate composite key: " + key);
//    }
//            }

//194. Compare API versions and find removed endpoints
//import java.util.*;
//
//Set<String> oldVersion = Set.of("getCart", "createCart", "deleteCart");
//Set<String> newVersion = Set.of("getCart", "createCart");
//
//for (String ep : oldVersion) {
//        if (!newVersion.contains(ep)) {
//        System.out.println("Removed: " + ep);
//    }
//            }

//195. Validate all currencies belong to allowed list
//import java.util.*;
//
//String[] currencies = {"GBP", "USD", "INR"};
//Set<String> allowed = Set.of("GBP", "USD", "EUR");
//
//for (String c : currencies) {
//        if (!allowed.contains(c)) {
//        System.out.println("Invalid currency: " + c);
//    }
//            }

//196. Calculate p95 approximately from sorted response times
//import java.util.*;
//
//int[] times = {100, 120, 130, 150, 180, 200, 220, 250, 300, 500};
//Arrays.sort(times);
//
//int index = (int) Math.ceil(0.95 * times.length) - 1;
//System.out.println(times[index]);

//197. Validate request IDs are sequential
//int[] ids = {101, 102, 103, 104};
//boolean sequential = true;
//
//for (int i = 0; i < ids.length - 1; i++) {
//        if (ids[i + 1] != ids[i] + 1) {
//sequential = false;
//        break;
//        }
//        }
//
//        System.out.println(sequential);

//198. Find gaps in sequential order IDs
//int[] ids = {101, 102, 104, 107};
//
//for (int i = 0; i < ids.length - 1; i++) {
//        for (int expected = ids[i] + 1; expected < ids[i + 1]; expected++) {
//        System.out.println("Missing: " + expected);
//    }
//            }

//199. Build simple soft assertion collector
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        List<String> errors = new ArrayList<>();
//
//        if (!"PASS".equals("FAIL")) {
//            errors.add("Status mismatch");
//        }
//
//        if (100 != 101) {
//            errors.add("Code mismatch");
//        }
//
//        if (errors.isEmpty()) {
//            System.out.println("All assertions passed");
//        } else {
//            System.out.println(errors);
//        }
//    }
//}

//200. Validate cart update preserves cartId and recalculates total
//class Item {
//    int quantity;
//    double price;
//
//    Item(int quantity, double price) {
//        this.quantity = quantity;
//        this.price = price;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        String existingCartId = "CART-123";
//        Item[] newItems = {
//                new Item(2, 20.0),
//                new Item(1, 15.0)
//        };
//
//        double total = 0.0;
//        for (Item item : newItems) {
//            total += item.quantity * item.price;
//        }
//
//        System.out.println("CartId=" + existingCartId);
//        System.out.println("Total=" + total);
//    }
//}
//*******************************************************************************************
//*******************************************************************************************
//*******************************IMPORTANT INSTRUCTIONS************************************************************
//*******************************************************************************************
//*******************************************************************************************
//How to practice these 100 harder questions
//
//Best 7-day plan
//
//Day 1
//
//        101–120
//
//Day 2
//
//        121–140
//
//Day 3
//
//        141–160
//
//Day 4
//
//        161–180
//
//Day 5
//
//        181–200
//
//Day 6
//
//Repeat the ones you could not solve alone
//
//Day 7
//
//Randomly pick 20 and solve without looking
//
//⸻
//
//The 15 most valuable from this set
//
//Start with these first:
//        •	105
//        •	108
//        •	123
//        •	126
//        •	128
//        •	129
//        •	141
//        •	144
//        •	145
//        •	147
//        •	151
//        •	154
//        •	158
//        •	181
//        •	199
//
//These are very close to what QA/SDET interviews actually test.
//
//        ⸻
//
//Most important interview rule while solving
//
//Always say this first:
//
//        “I’ll start with a simple working solution, then improve if needed.”
//
//That alone reduces pressure and makes you sound strong.

//}
