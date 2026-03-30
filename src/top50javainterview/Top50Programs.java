//package top50javainterview;
//
//public class Top50Programs {
//    Absolutely — here is a Top 50 QA Java interview problem list.
//
//    This is not random coding practice.
//    These are the problems most likely to come up for:
//            •	QA Automation Engineer
//	•	SDET
//	•	API Automation
//	•	Java + Selenium / Playwright roles
//	•	Contract interviews
//
//    I’ll organise them by priority:
//            •	Tier 1 = very high probability
//	•	Tier 2 = common
//	•	Tier 3 = good to know
//
//    For each one, I’ll give:
//            •	What they ask
//	•	What pattern it tests
//	•	Why it matters in QA
//
//⸻
//
//    Tier 1 — Highest probability (1–20)
//
//1. Reverse a string
//
//    Pattern: loops / strings
//    Why QA asks it: basic coding confidence
//
//2. Check if a string is palindrome
//
//    Pattern: string comparison
//    Why QA asks it: simple logic under pressure
//
//3. Count frequency of characters in a string
//
//    Pattern: HashMap
//    Why QA asks it: data validation / duplicates
//
//4. Count frequency of words in a sentence
//
//    Pattern: HashMap + split
//    Why QA asks it: log analysis / text parsing
//
//5. Find duplicate elements in an array
//
//    Pattern: Set / HashMap
//    Why QA asks it: duplicate test data / repeated IDs
//
//6. Find first non-repeated character
//
//    Pattern: LinkedHashMap
//    Why QA asks it: common interview logic question
//
//7. Sum all values in an array
//
//    Pattern: loop / aggregation
//    Why QA asks it: totals, reporting, counts
//
//8. Find max and min in an array
//
//    Pattern: loop
//    Why QA asks it: response times / data checks
//
//9. Sort an array
//
//    Pattern: Arrays.sort
//    Why QA asks it: comparisons / ordering validation
//
//10. Check if array/list is sorted
//
//    Pattern: loop comparison
//    Why QA asks it: UI/API ordering validation
//
//11. Compare two strings or two arrays
//
//    Pattern: equals / Arrays.equals
//    Why QA asks it: expected vs actual validation
//
//12. Find missing number in a sequence
//
//    Pattern: arithmetic / loop
//    Why QA asks it: missing IDs / batch sequence validation
//
//13. Find common elements between two arrays/lists
//
//    Pattern: Set intersection
//    Why QA asks it: expected vs actual overlap
//
//14. Remove duplicates from a list
//
//    Pattern: Set / LinkedHashSet
//    Why QA asks it: clean test data
//
//15. Count vowels / digits / special characters
//
//    Pattern: Character helpers
//    Why QA asks it: input validation
//
//16. Validate if string contains only numbers
//
//    Pattern: regex / parsing
//    Why QA asks it: API/request payload checks
//
//17. Validate email / date / simple format
//
//    Pattern: regex / contains
//    Why QA asks it: field validation
//
//18. Calculate cart total
//
//    Pattern: loop + arithmetic
//    Why QA asks it: business logic / pricing
//
//19. Validate API status codes
//
//    Pattern: loop + conditions
//    Why QA asks it: API testing
//
//20. Filter failed status codes or failed tests
//
//    Pattern: loops / conditions
//    Why QA asks it: reporting / debugging
//
//⸻
//
//    Tier 2 — Very common QA/SDET problems (21–35)
//
//21. Count passed vs failed test results
//
//    Pattern: loop / counters
//    Why QA asks it: reporting metrics
//
//22. Find slow API responses above threshold
//
//    Pattern: filter / loop
//    Why QA asks it: performance checks
//
//23. Compare expected and actual maps
//
//    Pattern: Map comparison
//    Why QA asks it: JSON / payload validation
//
//24. Validate mandatory fields in payload
//
//    Pattern: null / blank checks
//    Why QA asks it: payload validation
//
//25. Count null / blank values in list
//
//    Pattern: defensive checks
//    Why QA asks it: test data quality
//
//26. Find duplicate IDs ignoring case
//
//    Pattern: lowercase normalization + Set
//    Why QA asks it: real-world data cleaning
//
//27. Retry operation N times
//
//    Pattern: loop / retry
//    Why QA asks it: flaky API / network logic
//
//28. Retry with simple backoff
//
//    Pattern: loop + delay
//    Why QA asks it: resilience / API automation
//
//29. Parse CSV line and validate columns
//
//    Pattern: split
//    Why QA asks it: file testing / ETL validation
//
//30. Extract digits from mixed string
//
//    Pattern: regex / character scan
//    Why QA asks it: ID extraction from logs
//
//31. Reverse words in a sentence
//
//    Pattern: split / loop
//    Why QA asks it: string handling confidence
//
//32. Find longest word / longest string
//
//    Pattern: iteration
//    Why QA asks it: basic collection handling
//
//33. Group items by key
//
//    Pattern: Map of lists
//    Why QA asks it: endpoint grouping / batch grouping
//
//34. Count API calls per endpoint
//
//    Pattern: HashMap
//    Why QA asks it: logs / monitoring / analytics
//
//35. Find endpoint with highest response time or failure count
//
//    Pattern: Map + max tracking
//    Why QA asks it: performance / reporting
//
//⸻
//
//    Tier 3 — Strong interview differentiators (36–50)
//
//36. Apply Buy One Get One Free
//
//    Pattern: business logic
//    Why QA asks it: product-rule testing / TDD example
//
//37. Apply buy 2 get 1 free
//
//    Pattern: business rule arithmetic
//    Why QA asks it: extended offer logic
//
//38. Validate grand total equals sum of line totals
//
//    Pattern: aggregation / comparison
//    Why QA asks it: core pricing validation
//
//39. Compare two lists regardless of order
//
//    Pattern: sort or Set
//    Why QA asks it: API response comparison
//
//40. Find newly failing tests across runs
//
//    Pattern: Set difference
//    Why QA asks it: regression analysis
//
//41. Find recovered tests across runs
//
//    Pattern: Set difference
//    Why QA asks it: test analytics
//
//42. Detect flaky tests (pass-fail-pass)
//
//    Pattern: state/history logic
//    Why QA asks it: real SDET problem
//
//43. Batch records into chunks
//
//    Pattern: subList / loops
//    Why QA asks it: large data processing / retry batches
//
//44. Find missing records between expected and actual datasets
//
//    Pattern: contains / Set
//    Why QA asks it: DB and API comparison
//
//45. Build a mismatch report
//
//    Pattern: loop through fields
//    Why QA asks it: assertion/reporting logic
//
//46. Validate unique composite keys
//
//    Pattern: combine fields + Set
//    Why QA asks it: duplicate data detection
//
//47. Calculate median / p95 from response times
//
//    Pattern: sort / percentile
//    Why QA asks it: performance discussions
//
//48. Build simple soft assertion collector
//
//    Pattern: error accumulation
//    Why QA asks it: framework design
//
//49. Return failed test names from results list
//
//    Pattern: filtering objects
//    Why QA asks it: reporting utility
//
//50. Update cart and recalculate total
//
//    Pattern: state update + calculation
//    Why QA asks it: CRUD + business logic
//
//⸻
//
//    The 15 you should master first
//
//    If you’re short on time, do these first:
//            1.	Reverse string
//	2.	Character frequency
//	3.	Duplicate elements in array
//	4.	First non-repeated character
//	5.	Sum array
//	6.	Max/min in array
//	7.	Check sorted array
//	8.	Compare expected vs actual
//	9.	Calculate cart total
//	10.	Validate API status codes
//	11.	Validate mandatory fields
//	12.	Retry logic
//	13.	BOGO logic
//	14.	Find newly failing tests
//	15.	Build mismatch report
//
//    If you can solve these confidently, you can clear a large percentage of QA coding rounds.
//
//⸻
//
//    How interviewers usually frame these
//
//    They may not ask them in textbook style. They may say things like:
//            •	“Given a response list, count failed status codes”
//            •	“Given cart items, calculate the grand total”
//            •	“Given test run results, identify flaky tests”
//            •	“Compare expected and actual response payloads”
//            •	“Implement retry for unstable API call”
//            •	“Validate a payload has mandatory fields”
//
//    So learn the pattern, not just the exact wording.
//
//            ⸻
//
//    What you should say before coding
//
//    Use this every time:
//
//            “I’ll start with a simple working approach first, then improve if needed.”
//
//    Then say:
//
//            “Input is this, output should be this, I’ll use a loop / map / set.”
//
//    That alone makes you sound structured and reduces panic.
//
//⸻
//
//    Best 7-day practice plan for these 50
//
//    Day 1
//
//            1–10
//
//    Day 2
//
//            11–20
//
//    Day 3
//
//            21–30
//
//    Day 4
//
//            31–40
//
//    Day 5
//
//            41–50
//
//    Day 6
//
//    Redo the ones you got wrong
//
//    Day 7
//
//    Do 10 random problems without looking
//
//⸻
//
//    The real goal
//
//    You do not need to become amazing at coding.
//    You need to become:
//            •	calm
//	•	structured
//	•	quick with loops/maps/sets
//	•	able to explain while coding
//
//    That is enough for most QA/SDET interviews.
//
//}
