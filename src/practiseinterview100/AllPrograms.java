//package practiseinterview100;
//
//public class AllPrograms {
//    1. Reverse a string
//    String input = "hello";
//    String reversed = "";
//
//for (int i = input.length() - 1; i >= 0; i--) {
//        reversed += input.charAt(i);
//    }
//System.out.println(reversed);
//
//2. Check if a string is palindrome
//String input = "madam";
//String reversed = "";
//
//for (int i = input.length() - 1; i >= 0; i--) {
//reversed += input.charAt(i);
//}
//
//        System.out.println(input.equals(reversed));

//3. Count vowels in a string
//String input = "automation";
//int count = 0;
//
//for (char c : input.toLowerCase().toCharArray()) {
//        if ("aeiou".indexOf(c) != -1) {
//count++;
//        }
//        }
//
//        System.out.println(count);

//4. Find length of string without using length()
//String input = "testing";
//int count = 0;
//
//for (char c : input.toCharArray()) {
//count++;
//        }
//
//        System.out.println(count);

//5. Sum all numbers in an array
//int[] arr = {10, 20, 30, 40};
//int sum = 0;
//
//for (int n : arr) {
//sum += n;
//}
//
//        System.out.println(sum);

//6. Find maximum number in array
//int[] arr = {4, 9, 1, 7};
//int max = arr[0];
//
//for (int n : arr) {
//        if (n > max) {
//max = n;
//    }
//            }
//
//            System.out.println(max);

//7. Find minimum number in array
//int[] arr = {4, 9, 1, 7};
//int min = arr[0];
//
//for (int n : arr) {
//        if (n < min) {
//min = n;
//    }
//            }
//
//            System.out.println(min);

//8. Print even numbers from array
//int[] arr = {1, 2, 3, 4, 5, 6};
//
//for (int n : arr) {
//        if (n % 2 == 0) {
//        System.out.println(n);
//    }
//            }

//9. Print odd numbers from array
//int[] arr = {1, 2, 3, 4, 5, 6};
//
//for (int n : arr) {
//        if (n % 2 != 0) {
//        System.out.println(n);
//    }
//            }

//10. Swap two numbers
//int a = 5;
//int b = 10;
//
//int temp = a;
//a = b;
//b = temp;
//
//System.out.println(a + " " + b);

//11. Count words in a sentence
//String input = "I love API testing";
//String[] words = input.trim().split("\\s+");
//
//System.out.println(words.length);
//
//12. Remove spaces from a string
//String input = "qa automation engineer";
//String output = input.replace(" ", "");
//
//System.out.println(output);

//13. Convert string to uppercase without built-in logic knowledge
//String input = "java";
//System.out.println(input.toUpperCase());

//14. Count digits in a string
//String input = "abc123x9";
//int count = 0;
//
//for (char c : input.toCharArray()) {
//        if (Character.isDigit(c)) {
//count++;
//        }
//        }
//
//        System.out.println(count);

//15. Check if number is positive, negative, or zero
//int n = -5;
//
//if (n > 0) {
//        System.out.println("Positive");
//} else if (n < 0) {
//        System.out.println("Negative");
//} else {
//        System.out.println("Zero");
//}

//16. Print multiplication table of a number
//int n = 5;
//
//for (int i = 1; i <= 10; i++) {
//        System.out.println(n + " x " + i + " = " + (n * i));
//        }
//
//17. Find factorial of a number
//int n = 5;
//int fact = 1;
//
//for (int i = 1; i <= n; i++) {
//fact *= i;
//}
//
//        System.out.println(fact);
//
//18. Check if string contains a substring
//String input = "playwright automation";
//System.out.println(input.contains("auto"));

//19. Replace all vowels with *
//String input = "automation";
//String output = input.replaceAll("[AEIOUaeiou]", "*");
//
//System.out.println(output);

//20. Count occurrences of a character
//String input = "banana";
//char target = 'a';
//int count = 0;
//
//for (char c : input.toCharArray()) {
//        if (c == target) {
//count++;
//        }
//        }
//
//        System.out.println(count);

//21–40: Easy interview-style problems
//
//21. Remove duplicate characters from a string
//String input = "aabbccdde";
//StringBuilder result = new StringBuilder();
//
//for (char c : input.toCharArray()) {
//        if (result.indexOf(String.valueOf(c)) == -1) {
//        result.append(c);
//    }
//            }
//
//            System.out.println(result);

//22. Count frequency of characters using HashMap
//import java.util.*;
//
//String input = "aabbccc";
//Map<Character, Integer> map = new HashMap<>();
//
//for (char c : input.toCharArray()) {
//        map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        System.out.println(map);

//23. Count frequency of words in sentence
//import java.util.*;
//
//String input = "api test api ui api";
//String[] words = input.split(" ");
//Map<String, Integer> map = new HashMap<>();
//
//for (String word : words) {
//        map.put(word, map.getOrDefault(word, 0) + 1);
//        }
//
//        System.out.println(map);

//24. Find first non-repeated character
//import java.util.*;
//
//String input = "aabbcddee";
//Map<Character, Integer> map = new LinkedHashMap<>();
//
//for (char c : input.toCharArray()) {
//        map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//        if (entry.getValue() == 1) {
//        System.out.println(entry.getKey());
//        break;
//        }
//        }

//25. Find duplicate elements in array
//import java.util.*;
//
//int[] arr = {1, 2, 3, 2, 4, 1};
//Set<Integer> seen = new HashSet<>();
//Set<Integer> duplicates = new HashSet<>();
//
//for (int n : arr) {
//        if (!seen.add(n)) {
//        duplicates.add(n);
//    }
//            }
//
//            System.out.println(duplicates);

//26. Sort an array ascending
//import java.util.*;
//
//int[] arr = {4, 2, 7, 1};
//Arrays.sort(arr);
//
//System.out.println(Arrays.toString(arr));

//27. Sort an array descending
//import java.util.*;
//
//Integer[] arr = {4, 2, 7, 1};
//Arrays.sort(arr, Collections.reverseOrder());
//
//        System.out.println(Arrays.toString(arr));

//28. Check if two strings are anagrams
//import java.util.*;
//
//String a = "listen";
//String b = "silent";
//
//char[] arr1 = a.toCharArray();
//char[] arr2 = b.toCharArray();
//
//Arrays.sort(arr1);
//Arrays.sort(arr2);
//
//System.out.println(Arrays.equals(arr1, arr2));

//29. Find second largest number in array
//int[] arr = {10, 5, 20, 8};
//int first = Integer.MIN_VALUE;
//int second = Integer.MIN_VALUE;
//
//for (int n : arr) {
//        if (n > first) {
//second = first;
//first = n;
//    } else if (n > second && n != first) {
//second = n;
//    }
//            }
//
//            System.out.println(second);

//30. Reverse words in a sentence
//String input = "I love Java";
//String[] words = input.split(" ");
//
//for (int i = words.length - 1; i >= 0; i--) {
//        System.out.print(words[i] + " ");
//}

//31. Remove duplicates from list
//import java.util.*;
//
//List<Integer> list = Arrays.asList(1, 2, 2, 3, 1, 4);
//Set<Integer> set = new LinkedHashSet<>(list);
//
//System.out.println(set);

//32. Check if array contains a value
//int[] arr = {10, 20, 30, 40};
//int target = 20;
//boolean found = false;
//
//for (int n : arr) {
//        if (n == target) {
//found = true;
//        break;
//        }
//        }
//
//        System.out.println(found);

//33. Merge two arrays
//import java.util.*;
//
//int[] a = {1, 2};
//int[] b = {3, 4};
//int[] merged = new int[a.length + b.length];
//
//System.arraycopy(a, 0, merged, 0, a.length);
//System.arraycopy(b, 0, merged, a.length, b.length);
//
//System.out.println(Arrays.toString(merged));

//34. Find common elements in two arrays
//import java.util.*;
//
//int[] a = {1, 2, 3, 4};
//int[] b = {3, 4, 5, 6};
//
//Set<Integer> set = new HashSet<>();
//for (int n : a) set.add(n);
//
//for (int n : b) {
//        if (set.contains(n)) {
//        System.out.println(n);
//    }
//            }

//35. Remove all duplicates from array and print unique values
//import java.util.*;
//
//int[] arr = {1, 2, 2, 3, 4, 4};
//Set<Integer> set = new LinkedHashSet<>();
//
//for (int n : arr) {
//        set.add(n);
//}
//
//        System.out.println(set);

//36. Find sum of digits of a number
//int num = 1234;
//int sum = 0;
//
//while (num > 0) {
//sum += num % 10;
//num /= 10;
//        }
//
//        System.out.println(sum);

//37. Check if number is prime
//int n = 7;
//boolean prime = true;
//
//if (n <= 1) prime = false;
//
//        for (int i = 2; i < n; i++) {
//        if (n % i == 0) {
//prime = false;
//        break;
//        }
//        }
//
//        System.out.println(prime);

//38. Generate Fibonacci series
//        int a = 0, b = 1;
//
//for (int i = 1; i <= 10; i++) {
//        System.out.print(a + " ");
//int next = a + b;
//a = b;
//b = next;
//}

//39. Find largest word in a sentence
//String input = "I love automation testing";
//String[] words = input.split(" ");
//String longest = "";
//
//for (String word : words) {
//        if (word.length() > longest.length()) {
//longest = word;
//    }
//            }
//
//            System.out.println(longest);

//40. Capitalize first letter of each word
//String input = "hello world from java";
//String[] words = input.split(" ");
//StringBuilder result = new StringBuilder();
//
//for (String word : words) {
//        result.append(Character.toUpperCase(word.charAt(0)))
//        .append(word.substring(1))
//        .append(" ");
//}
//
//        System.out.println(result.toString().trim());

//41–60: QA-specific coding problems
//
//41. Count passed and failed API status codes
//int[] statusCodes = {200, 200, 500, 404, 201};
//        int pass = 0, fail = 0;
//
//for (int code : statusCodes) {
//        if (code >= 200 && code < 300) {
//pass++;
//        } else {
//fail++;
//        }
//        }
//
//        System.out.println("Pass: " + pass + ", Fail: " + fail);

//42. Print only failed status codes
//int[] statusCodes = {200, 500, 404, 201, 400};
//
//for (int code : statusCodes) {
//        if (code != 200) {
//        System.out.println(code);
//    }
//            }

//43. Validate response time threshold
//int[] responseTimes = {120, 200, 550, 80};
//int threshold = 300;
//
//for (int time : responseTimes) {
//        if (time > threshold) {
//        System.out.println("Slow response: " + time);
//    }
//            }

//44. Count null or blank strings in list
//import java.util.*;
//
//List<String> values = Arrays.asList("abc", "", null, "test", " ");
//int count = 0;
//
//for (String val : values) {
//        if (val == null || val.trim().isEmpty()) {
//count++;
//        }
//        }
//
//        System.out.println(count);

//45. Validate required API fields are present
//import java.util.*;
//
//Map<String, String> response = new HashMap<>();
//response.put("id", "101");
//response.put("name", "John");
//
//String[] required = {"id", "name", "status"};
//
//for (String field : required) {
//        if (!response.containsKey(field)) {
//        System.out.println("Missing field: " + field);
//    }
//            }

//46. Compare expected and actual strings
//String expected = "success";
//String actual = "success";
//
//System.out.println(expected.equals(actual));

//47. Compare two lists and print missing elements
//import java.util.*;
//
//List<String> expected = Arrays.asList("A", "B", "C");
//List<String> actual = Arrays.asList("A", "C");
//
//for (String item : expected) {
//        if (!actual.contains(item)) {
//        System.out.println("Missing: " + item);
//    }
//            }

//48. Validate all prices are positive
//double[] prices = {10.5, 20.0, -5.0};
//
//for (double price : prices) {
//        if (price <= 0) {
//        System.out.println("Invalid price: " + price);
//    }
//            }

//49. Find duplicate user IDs in test data
//import java.util.*;
//
//String[] userIds = {"u1", "u2", "u3", "u2", "u1"};
//Set<String> seen = new HashSet<>();
//Set<String> duplicates = new HashSet<>();
//
//for (String id : userIds) {
//        if (!seen.add(id)) {
//        duplicates.add(id);
//    }
//            }
//
//            System.out.println(duplicates);

//50. Calculate cart total
//double[] prices = {15.99, 49.99};
//int[] quantities = {2, 1};
//double total = 0.0;
//
//for (int i = 0; i < prices.length; i++) {
//total += prices[i] * quantities[i];
//        }
//
//        System.out.println(total);

//51. Validate all emails contain @
//        String[] emails = {"a@test.com", "wrongemail", "b@test.com"};
//
//        for (String email : emails) {
//        if (!email.contains("@")) {
//        System.out.println("Invalid email: " + email);
//    }
//            }

//52. Count failed test cases
//String[] results = {"PASS", "FAIL", "PASS", "FAIL"};
//int failCount = 0;
//
//for (String result : results) {
//        if (result.equals("FAIL")) {
//failCount++;
//        }
//        }
//
//        System.out.println(failCount);

//53. Find maximum response time from API run
//int[] times = {100, 250, 600, 310};
//int max = times[0];
//
//for (int t : times) {
//        if (t > max) {
//max = t;
//    }
//            }
//
//            System.out.println(max);

//54. Validate sorted list
//int[] arr = {1, 2, 3, 4};
//boolean sorted = true;
//
//for (int i = 0; i < arr.length - 1; i++) {
//        if (arr[i] > arr[i + 1]) {
//sorted = false;
//        break;
//        }
//        }
//
//        System.out.println(sorted);

//55. Check if any test result is FAIL
//String[] results = {"PASS", "PASS", "FAIL"};
//boolean hasFail = false;
//
//for (String result : results) {
//        if (result.equals("FAIL")) {
//hasFail = true;
//        break;
//        }
//        }
//
//        System.out.println(hasFail);

//56. Extract numbers from mixed string
//String input = "Order123Amount500";
//String numbers = input.replaceAll("\\D", "");
//
//System.out.println(numbers);

//57. Sum all numeric strings from list
//import java.util.*;
//
//List<String> values = Arrays.asList("10", "20", "30");
//int sum = 0;
//
//for (String val : values) {
//sum += Integer.parseInt(val);
//}
//
//        System.out.println(sum);

//58. Retry simple operation 3 times
//int maxRetries = 3;
//
//for (int i = 1; i <= maxRetries; i++) {
//        System.out.println("Attempt: " + i);
//}

//59. Find mismatched fields in two maps
//import java.util.*;
//
//Map<String, String> expected = new HashMap<>();
//expected.put("name", "John");
//expected.put("status", "active");
//
//Map<String, String> actual = new HashMap<>();
//actual.put("name", "John");
//actual.put("status", "inactive");
//
//for (String key : expected.keySet()) {
//        if (!expected.get(key).equals(actual.get(key))) {
//        System.out.println("Mismatch in " + key);
//    }
//            }

//60. Count how many status codes are 5xx
//int[] statusCodes = {200, 500, 503, 404, 502};
//int count = 0;
//
//for (int code : statusCodes) {
//        if (code >= 500 && code < 600) {
//count++;
//        }
//        }
//
//        System.out.println(count);

//61–80: Intermediate interview-level problems
//
//61. Find first duplicate in array
//import java.util.*;
//
//int[] arr = {1, 2, 3, 4, 2, 5};
//Set<Integer> seen = new HashSet<>();
//
//for (int n : arr) {
//        if (!seen.add(n)) {
//        System.out.println(n);
//        break;
//                }
//                }

//62. Move all zeros to end of array
//int[] arr = {1, 0, 2, 0, 3, 4};
//int index = 0;
//
//for (int n : arr) {
//        if (n != 0) {
//arr[index++] = n;
//    }
//            }
//
//            while (index < arr.length) {
//arr[index++] = 0;
//        }
//
//        for (int n : arr) {
//        System.out.print(n + " ");
//}

//63. Find missing number in 1 to n
//int[] arr = {1, 2, 4, 5};
//int n = 5;
//int expected = n * (n + 1) / 2;
//int actual = 0;
//
//for (int num : arr) {
//actual += num;
//}
//
//        System.out.println(expected - actual);

//64. Check if two arrays are equal
//import java.util.*;
//
//int[] a = {1, 2, 3};
//int[] b = {1, 2, 3};
//
//System.out.println(Arrays.equals(a, b));

//65. Find all repeated words
//import java.util.*;
//
//String input = "api ui api db api ui";
//String[] words = input.split(" ");
//Map<String, Integer> map = new HashMap<>();
//
//for (String word : words) {
//        map.put(word, map.getOrDefault(word, 0) + 1);
//        }
//
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//        if (entry.getValue() > 1) {
//        System.out.println(entry.getKey());
//        }
//        }

//66. Validate password has digit and uppercase
//String password = "Test123";
//boolean hasDigit = false;
//boolean hasUpper = false;
//
//for (char c : password.toCharArray()) {
//        if (Character.isDigit(c)) hasDigit = true;
//        if (Character.isUpperCase(c)) hasUpper = true;
//        }
//
//        System.out.println(hasDigit && hasUpper);

//67. Find longest substring without spaces
//String input = "playwright selenium api";
//String[] parts = input.split(" ");
//String longest = "";
//
//for (String part : parts) {
//        if (part.length() > longest.length()) {
//longest = part;
//    }
//            }
//
//            System.out.println(longest);

//68. Group same characters together count-wise
//import java.util.*;
//
//String input = "aaabbc";
//Map<Character, Integer> map = new LinkedHashMap<>();
//
//for (char c : input.toCharArray()) {
//        map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        System.out.println(map);

//69. Compress string like a3b2c1
//String input = "aaabbc";
//StringBuilder result = new StringBuilder();
//int count = 1;
//
//for (int i = 0; i < input.length(); i++) {
//        if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
//count++;
//        } else {
//        result.append(input.charAt(i)).append(count);
//count = 1;
//        }
//        }
//
//        System.out.println(result);

//70. Validate response contains no null fields
//import java.util.*;
//
//Map<String, String> response = new HashMap<>();
//response.put("id", "101");
//response.put("name", null);
//
//boolean valid = true;
//for (String key : response.keySet()) {
//        if (response.get(key) == null) {
//valid = false;
//        System.out.println("Null field: " + key);
//    }
//            }
//
//            System.out.println(valid);

//71. Find intersection of two lists
//import java.util.*;
//
//List<Integer> a = Arrays.asList(1, 2, 3, 4);
//List<Integer> b = Arrays.asList(3, 4, 5);
//
//List<Integer> result = new ArrayList<>(a);
//result.retainAll(b);
//
//System.out.println(result);

//72. Find difference of two lists
//import java.util.*;
//
//List<Integer> a = Arrays.asList(1, 2, 3, 4);
//List<Integer> b = Arrays.asList(3, 4);
//
//List<Integer> result = new ArrayList<>(a);
//result.removeAll(b);
//
//System.out.println(result);

//73. Validate if date string matches yyyy-MM-dd
//String date = "2026-03-30";
//boolean valid = date.matches("\\d{4}-\\d{2}-\\d{2}");
//
//System.out.println(valid);

//74. Parse CSV and print columns
//String csv = "id,name,status";
//String[] columns = csv.split(",");
//
//for (String col : columns) {
//        System.out.println(col);
//}

//75. Count API calls per endpoint
//import java.util.*;
//
//String[] endpoints = {"/cart", "/cart", "/login", "/cart", "/login"};
//Map<String, Integer> map = new HashMap<>();
//
//for (String ep : endpoints) {
//        map.put(ep, map.getOrDefault(ep, 0) + 1);
//        }
//
//        System.out.println(map);

//76. Validate all quantities are greater than zero
//int[] quantities = {2, 1, 5, 0};
//boolean valid = true;
//
//for (int q : quantities) {
//        if (q <= 0) {
//valid = false;
//        break;
//        }
//        }
//
//        System.out.println(valid);

//77. Filter only failed tests from list
//import java.util.*;
//
//List<String> results = Arrays.asList("PASS", "FAIL", "SKIP", "FAIL");
//
//for (String r : results) {
//        if (r.equals("FAIL")) {
//        System.out.println(r);
//    }
//            }

//78. Count character types: letters, digits, special chars
//String input = "Test@123";
//        int letters = 0, digits = 0, special = 0;
//
//for (char c : input.toCharArray()) {
//        if (Character.isLetter(c)) letters++;
//        else if (Character.isDigit(c)) digits++;
//        else special++;
//        }
//
//        System.out.println("Letters=" + letters + ", Digits=" + digits + ", Special=" + special);

//79. Reverse each word in a sentence
//String input = "java api";
//String[] words = input.split(" ");
//
//for (String word : words) {
//String rev = "";
//    for (int i = word.length() - 1; i >= 0; i--) {
//rev += word.charAt(i);
//    }
//            System.out.print(rev + " ");
//}

//80. Validate a list has unique values only
//import java.util.*;
//
//List<String> values = Arrays.asList("A", "B", "C", "A");
//Set<String> set = new HashSet<>(values);
//
//System.out.println(values.size() == set.size());

//81–100: QA interview-level practical problems
//
//81. Calculate cart total with quantity and price objects
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
//        Item[] items = {
//                new Item(2, 15.99),
//                new Item(1, 49.99)
//        };
//
//        double total = 0.0;
//        for (Item item : items) {
//            total += item.quantity * item.price;
//        }
//
//        System.out.println(total);
//    }
//}

//82. Apply Buy One Get One Free
//int quantity = 5;
//double price = 10.0;
//
//int payableQuantity = (quantity / 2) + (quantity % 2);
//double total = payableQuantity * price;
//
//System.out.println(total);

//83. Retry operation with backoff-like delay
//int retries = 3;
//
//for (int i = 1; i <= retries; i++) {
//        System.out.println("Attempt " + i);
//    try {
//            Thread.sleep(i * 1000);
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    }
//            }

//84. Validate API response has expected key-value pairs
//import java.util.*;
//
//Map<String, String> expected = Map.of("status", "success", "code", "200");
//Map<String, String> actual = new HashMap<>();
//actual.put("status", "success");
//actual.put("code", "200");
//
//boolean allMatch = true;
//for (String key : expected.keySet()) {
//        if (!expected.get(key).equals(actual.get(key))) {
//allMatch = false;
//        break;
//        }
//        }
//
//        System.out.println(allMatch);

//85. Filter high response times and compute average
//int[] times = {100, 200, 500, 700, 150};
//int threshold = 300;
//        int sum = 0, count = 0;
//
//for (int t : times) {
//        if (t > threshold) {
//sum += t;
//count++;
//        }
//        }
//
//        System.out.println(count == 0 ? 0 : (sum / count));

//86. Find cart item with highest price
//class Item {
//    String name;
//    double price;
//
//    Item(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Item[] items = {
//                new Item("Mouse", 15.99),
//                new Item("Keyboard", 49.99),
//                new Item("Headset", 29.99)
//        };
//
//        Item max = items[0];
//        for (Item item : items) {
//            if (item.price > max.price) {
//                max = item;
//            }
//        }
//
//        System.out.println(max.name);
//    }
//}

//87. Validate all mandatory fields in a cart item
//class Item {
//    String productId;
//    String productName;
//    int quantity;
//    double price;
//
//    Item(String productId, String productName, int quantity, double price) {
//        this.productId = productId;
//        this.productName = productName;
//        this.quantity = quantity;
//        this.price = price;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Item item = new Item("SKU-1", "Mouse", 2, 15.99);
//
//        boolean valid = item.productId != null &&
//                item.productName != null &&
//                item.quantity > 0 &&
//                item.price > 0;
//
//        System.out.println(valid);
//    }
//}

//88. Find duplicate API payload IDs
//import java.util.*;
//
//String[] ids = {"101", "102", "101", "103"};
//Set<String> seen = new HashSet<>();
//Set<String> duplicates = new HashSet<>();
//
//for (String id : ids) {
//        if (!seen.add(id)) {
//        duplicates.add(id);
//    }
//            }
//
//            System.out.println(duplicates);

//89. Count occurrences of HTTP methods
//import java.util.*;
//
//String[] methods = {"GET", "POST", "GET", "DELETE", "POST", "GET"};
//Map<String, Integer> map = new HashMap<>();
//
//for (String method : methods) {
//        map.put(method, map.getOrDefault(method, 0) + 1);
//        }
//
//        System.out.println(map);

//90. Validate expected products exist in cart
//import java.util.*;
//
//List<String> expected = Arrays.asList("Mouse", "Keyboard");
//List<String> actual = Arrays.asList("Mouse", "Keyboard", "Headset");
//
//boolean allPresent = actual.containsAll(expected);
//System.out.println(allPresent);

//91. Remove failed status codes and keep success only
//import java.util.*;
//
//List<Integer> codes = Arrays.asList(200, 500, 201, 404, 204);
//List<Integer> success = new ArrayList<>();
//
//for (int code : codes) {
//        if (code >= 200 && code < 300) {
//        success.add(code);
//    }
//            }
//
//            System.out.println(success);

//92. Check if JSON-like string contains required key
//String json = "{\"id\":101,\"name\":\"John\"}";
//String key = "\"id\"";
//
//System.out.println(json.contains(key));

//93. Group test results by status
//import java.util.*;
//
//String[] results = {"PASS", "FAIL", "PASS", "SKIP", "FAIL"};
//Map<String, Integer> map = new HashMap<>();
//
//for (String result : results) {
//        map.put(result, map.getOrDefault(result, 0) + 1);
//        }
//
//        System.out.println(map);

//94. Find highest failing response time
//int[] times = {120, 500, 300, 800, 450};
//int max = 0;
//
//for (int time : times) {
//        if (time > max) {
//max = time;
//    }
//            }
//
//            System.out.println(max);

//95. Validate all item currencies are same
//String[] currencies = {"GBP", "GBP", "GBP"};
//boolean same = true;
//
//for (int i = 1; i < currencies.length; i++) {
//        if (!currencies[i].equals(currencies[0])) {
//same = false;
//        break;
//        }
//        }
//
//        System.out.println(same);

//96. Find total number of test cases by module
//        import java.util.*;
//
//String[] modules = {"API", "UI", "API", "DB", "UI"};
//Map<String, Integer> map = new HashMap<>();
//
//for (String module : modules) {
//        map.put(module, map.getOrDefault(module, 0) + 1);
//        }
//
//        System.out.println(map);

//97. Compare expected and actual cart totals
//double expected = 81.97;
//double actual = 81.97;
//
//System.out.println(Math.abs(expected - actual) < 0.001);

//98. Check if any item has invalid quantity or price
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
//        Item[] items = {new Item(2, 10), new Item(0, 20)};
//        boolean invalid = false;
//
//        for (Item item : items) {
//            if (item.quantity <= 0 || item.price <= 0) {
//                invalid = true;
//                break;
//            }
//        }
//
//        System.out.println(invalid);
//    }
//}

//99. Build a simple assertion method
//public class Main {
//    public static void assertEquals(String expected, String actual) {
//        if (!expected.equals(actual)) {
//            throw new RuntimeException("Assertion failed");
//        }
//        System.out.println("Assertion passed");
//    }
//
//    public static void main(String[] args) {
//        assertEquals("PASS", "PASS");
//    }
//}

//100. Validate cart total after BOGO + normal item
//double mousePrice = 15.99;
//int mouseQty = 2;
//
//double keyboardPrice = 49.99;
//int keyboardQty = 1;
//
//int payableMouseQty = (mouseQty / 2) + (mouseQty % 2);
//
//double total = (payableMouseQty * mousePrice) + (keyboardQty * keyboardPrice);
//
//System.out.println(String.format("%.2f", total)); // 65.98
//******************************************************************************
//***********************IMPORTANT INSTRUCTIONS*******************************************************
//******************************************************************************
//******************************************************************************
//How to use this properly
//
//Don’t try to master all 100 in one day.
//
//7-day practice plan
//
//Day 1
//
//Solve 1–20 by hand
//
//Day 2
//
//Solve 21–40
//
//Day 3
//
//Solve 41–60
//
//Day 4
//
//Solve 61–80
//
//Day 5
//
//Solve 81–100
//
//Day 6
//
//Repeat only the ones you got wrong
//
//Day 7
//
//Do 15 random ones without looking
//
//⸻
//
//The most important 20 to memorise first
//
//Start with:
//        1, 2, 5, 6, 21, 22, 24, 25, 29, 41, 43, 45, 49, 50, 54, 58, 61, 62, 82, 100
//
//Those are the highest-value interview patterns.
//
//⸻
//
//Best practice rule
//
//For every problem, say out loud:
//        1.	input
//	2.	output
//	3.	simple approach
//	4.	code
//
//That will help in interview.
//}
