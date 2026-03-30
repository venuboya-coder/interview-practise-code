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


//}
