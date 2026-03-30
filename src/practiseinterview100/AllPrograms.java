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
//}
