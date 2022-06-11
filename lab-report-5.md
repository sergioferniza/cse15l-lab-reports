# Lab Report 5

I manually checked that the tests were different by comparing the outputs of both functions side by side until i found an error.

The files i used for my experiment are as follows:

[file 1](https://github.com/nidhidhamnani/markdown-parser/edit/main/test-files/602.md)

[file 2](https://github.com/nidhidhamnani/markdown-parser/edit/main/test-files/402.md)

# test case 1.

Mine:

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_1_1.png)

Reviewed:
![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_1_2.png)

File:

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_1_6.png)

Output:

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_1_7.png)
# test case 2

Mine:

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_1_4.png)

Review:

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_1_5.png)

File:

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_1_8.png)

Output:

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_1_9.png)

# Why did it fail.

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15_1_3.png)

The reason why the parser returned the wrong answer was because as seen in the screen shot the algorithm stops once it sees a closing bracket and will assume that this is the last brackets and therefore it should stop running the program. However in doing so it lacks the nuance to know that it may not be the last bracket.


