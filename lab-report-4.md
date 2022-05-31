[My Markdown-Parse](https://github.com/sergioferniza/my_markdown_parse.git)

[Reviewed Markdown-Parse](https://github.com/sergioferniza/reviewed-markdown-parse.git)

Snippet 1:

expected output:

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_1.1.png)
![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_1.2.png)
![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_1.3.png)
![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_1.4.png)

test implementation:

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_2.png)

Result:

All tests for this snippet passed.

Snippet 2:

expected output:

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_2.1.png)
![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_2.2.png)
![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_2.3.png)

Result:

One of the tests failed:

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_0.png)

Test implementation:

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_3.png)

Snippet 3:

expected output:

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_3.1.png)
![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_3.2.png)
![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_3.3.png)
![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_3.4.png)

Result:

All tests passed same as in snippet 1.

Test implementation.
![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_4.png)

Review markdown parse test result:
![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_5.png)

Questions:

1) Considering that the snippet 1 tests worked. The implementations that led to these tests being succesfull was the adding of a filter that would only take into consideration the text inside the URL code parantheses. Therefore it would ignore anything outside it making the code work.

2) I believe that i could implement a method in which it could be able to read the URL despite the extra closing parantheses. Such would be by implementing a method that would errase any closing or opening bracket that was left unmatched.

3) Considering snippet 3 tests worked as well. The implementations that led to this were that the system could ignore blank space so it would work in test 1. If there was a missing parantheses it could be added and the system can read titles longer than a line. 
