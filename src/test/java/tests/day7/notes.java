package tests.day7;

public class notes {
    /*
    Warm up task###########
Let's go cybertekschool.com
And find number of links and print this number
1. index.html
2. style.css
3. fucn.js
<!DOCTYPE html>
<html>
    <head>
        <title>My personal page</title>
    </head>
    <body>
        <h1>Welcome to my page!</h1>
        <h4>Please enter your info</h4>
        <form>
            <span>Enter your name:</span>
            <input type="text" name="name">
            <br>
            <span>Enter your phone number:</span>
            <input type="tel" name="phone">
        </form>
    </body>
</html>
css document
input {
    font-family: Helvetica
    background-color: blue;
    margin: 0;
}
body {
    height: 100vh;
    padding: 0;
}
#################
How basic CSS selector looks like:
tagName[attribute='value'] | no //, no @, xpath would look like: //tagName[@attribute='value']
IN CSS, WE CAN SPECIFY ID LIKE THIS: #id
for example: #disappearing_button
also, it work like this: [id='disappearing_button']
For class name, in css we use .
.class
example: .h3 - it means, find element with class name h3
also, it works like this: [class='h3']
If, class name has a space, that means you need to put . in between. Because, space, in the class, it's a delimiter for different classes.
<button class="btn btn-info">Click Me</button>
[class='btn btn-primary'][name='button2'] - to specify 2 attributes
How about contains?
sure, we just put * after attribute
[attribute*='value'] - value can be partial, same like contains(@attribute,'value') in xpath
[id*='d'] - example, means that some element contains d in the id value
to match beginning of the attribute value, we use caret symbol: ^
 java_boy        _____
                 (^_^)
                 /| |\
How about end of the attribute?
[id$='end_of_value'] | $ means attribute ends with value
* - contains
^ - starts with
$ - ends with
button[onclick="button4()"] or button[onclick='button4()']
in code: By.cssSelector
How we can move from parent to child element in css selector?
"space" or ">"
div input
What's the difference between space and > ? space in between means any child (can be grand, or grand grand child ) > means only direct child.
.container > h3 - means find element with h3 tag name, that has direct parent with class name container.
parent > child





    Datte: 11/12/2019
Agenda: TestNG
testing pyramid:
UAT
system
integration
unit
unit testing - it's a testing of the smallest functional part of the application.
smallest functional part = method
Why developers test their methods?
To make sure that method works as expected. It helps to prevent bugs on the UAT stage of testing.
public static String reverseAString(String arg){
    String reversed = "";
    for(int i=arg.length()-1;i>=0;i--){
        reversed+=arg.charAt(i)+"";
    }
    return reversed
}
How to make sure that it's working as expected?
String expected = "tac"
String word = "cat";
reverseAString(word).equals(expected)
if yes (true) - then test passed, if no (false) - then test failed.
What's the role of TestNG over here?
The thing is, TestNG is a unit, integration, e2e, etc.. testing framework.
Before testng, there was Junit, which is only unit testing framework. Still, Junit is more popular.
Why do we use testng with selenium?
We can create test scripts as methods. So in testng, test looks like this:
@Test
public void test(){

}
TestNG has a report, xml runners, it support Data Driven Testing, test priorities, test dependencies, parametrization of test, it a lot of annotations to configure test suite execution, etc...
How to add testng? It's just another library. We can add it manually, or add maven dependency.
IF assertion fails, it will stop the program. And you will see everything is red in the console.
If it's green, that means everything is good and test/tests passed
===============================================
Default Suite
Total tests run: 1, Failures: 0, Skips: 0
===============================================
For every feature or page of the application we can create a test class. Let's say LoginTests. Then for every test case we can create a separate test method.
java.lang.AssertionError: Element is not visible expected [true] but found [false]
Expected :true
Actual   :false
<Click to see difference>
assertEquals() - to check is 2 things are the same.
assertTrue() - to check if something true.
In both cases, if there is some miss match (should be true, but false; must be equals but not equals) test will step, and test will be marked as a failed. Also, in the console, you can see where it failed.
#######If test fails, why driver.quit() doesn't work?
Because program stops, and it doesn't reach driver.quit() line, because assertion stops program (in case of failure).
public class AnnotationsTest {
    //runs only ones before beforeMethod, and before all tests
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class!");
    }
    //runs only ones after afterMethod, and after all tests
    @AfterClass
    public void afterClass(){
        System.out.println("After class!");
    }
    // runs automatically before every test
    @BeforeMethod
    public void setup() {
        //some code that will be running before every test, like: test1, test2, test3...
        //we can use method with @BeforeMethod annotation
        System.out.println("Before method!");
    }
    // runs automatically after every test
    @AfterMethod
    public void teardown() {
        System.out.println("After Method!");
    }
    @Test
    public void test1() {
        System.out.println("Test 1!");
        Assert.assertTrue(5 == 5);
    }
    @Test
    public void test2() {
        System.out.println("Test 2!");
    }
    @Test
    public void test3() {
        System.out.println("Test 3!");
    }
}
     */
}
