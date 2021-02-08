# xml-scraping
XML scraping using DOM API, XPath and XSLT.

Project done as a part of CSE-5335 Web Data Management Course at UTA.

Problem statement is as follows,

<p align="justify">You will evaluate DOM, XPath, and XSLT over XML data that represents courses from Reed College,
available at <a href="http://aiweb.cs.washington.edu/research/projects/xmltk/xmldata/data/courses/reed.xml">reed.xml</a> with DTD <a href="http://aiweb.cs.washington.edu/research/projects/xmltk/xmldata
/data/courses/reed.dtd">reed.dtd</a>.<p>

More specifically,

<ol>
<li><p align="justify">Write a plain Java program dom.java that uses the Java DOM API over the XML data in reed.xml to print the titles of all MATH courses that are taught in room LIB 204</p></li>
<li><p align="justify">Write a plain Java program xpath.java that evaluates the following XPath queries over the XML data in reed.xml:</p></li>
<ol>
<li>Print the titles of all MATH courses that are taught in room LIB 204</li>
<li>Print the instructor name who teaches MATH 412</li>
<li>Print the titles of all courses taught by Wieting</li>
</ol>
<li><p align="justify">Write an XSLT program math.xsl to display all MATH courses in Reed College by transforming the XML file <a href="http://aiweb.cs.washington.edu/research/projects/xmltk/xmldata/data/courses/reed.xml">reed.xml</a> to XHTML using XSLT. Your XHTML must contain a table, where each table row is a Math course. Modify the Java program <a href="https://github.com/c-deshpande/xml-scraping/blob/main/xslt.java">xslt.java</a> to test your XSLT and then load the
resulting html output file on your web browser.</p>
</ol>

The outputs for each tasks are,

1. dom.java
```
Titles of all MATH courses that are taught in room LIB 204 
<title>Calculus I</title>
<title>Calculus I</title>
<title>Calculus II</title>
<title>Calculus II</title>
<title>Calculus II</title>
<title>Introduction to Analysis I</title>
<title>Complex Analysis</title>
<title>Advanced Calculus</title>
<title>Geometry</title>
<title>Probability</title>
<title>Topics in Advanced AnalysisII</title>
<title>Algebraic Structures</title>
<title>Topics In Computer Theory</title>
```

2. xpath.java
```
xpath.java

1. Print the titles of all MATH courses that are taught in room LIB 204
XPath query: //course[subj='MATH' and place/building='LIB' and place/room='204']/title
<title>Calculus I</title>
<title>Calculus I</title>
<title>Calculus II</title>
<title>Calculus II</title>
<title>Calculus II</title>
<title>Introduction to Analysis I</title>   
<title>Complex Analysis</title>
<title>Advanced Calculus</title>
<title>Geometry</title>
<title>Probability</title>
<title>Topics in Advanced AnalysisII</title>
<title>Algebraic Structures</title>
<title>Topics In Computer Theory</title>



2. Print the instructor name who teaches MATH 412
XPath query: //course[subj='MATH' and crse='412']/instructor
<instructor>Mayer</instructor>



3. Print the titles of all courses taught by Wieting
XPath query: //course[instructor='Wieting']/title
<title>Calculus II</title>
<title>Introduction to Analysis I</title>
<title>Introduction to Analysis II</title>
<title>Geometry</title>
<title>Probability</title>
<title>Ornamental Art</title>
```

Output for the XSLT part is in the file <a href="https://github.com/c-deshpande/xml-scraping/blob/main/output.html">output.html</a> and <a href="https://github.com/c-deshpande/xml-scraping/blob/main/math.xsl">math.xsl</a> is the style sheet.
