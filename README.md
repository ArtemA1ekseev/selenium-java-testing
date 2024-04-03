# selenium-java-testing

<p align="center"><a href="https://selenium.dev"><img src="https://selenium.dev/images/selenium_logo_square_green.png" width="100" alt="Selenium"/></a></p>

<p align="center" class="hero__title"><b>All-in-one Browser Automation Framework:<br />Web Crawling / Scraping / Testing / Reporting</b></p>

<p align="center"><a href="https://github.com/ArtemA1ekseev/selenium-java-testing/releases" target="_blank"><img src="https://img.shields.io/github/v/release/seleniumbase/SeleniumBase.svg?color=22AAEE" alt="GitHub version" /></a> <a href="https://seleniumbase.io"><img src="https://img.shields.io/badge/docs-seleniumbase.io-11BBAA.svg" alt="SeleniumBase Docs" /></a></p>

[Selenium Server](https://www.selenium.dev/downloads/) supports two sets of commands simultaneously - for
new version [(WebDriver Google Chrome)](https://chromedriver.chromium.org/downloads) and old version [(Selenium RC)](https://www.selenium.dev/documentation/legacy/selenium_1/).

## 1. Installing JDK version 17
The `JDK` is a full-featured development kit. A set of software for `Java`, including `JRE`, compilers and tools (such as `JavaDoc` and `Java Debugger`), which exists for creating and compiling program. If you want, just run the `Java` program in your browser or computer, it will be enough for you installed `JRE`. But if you plan to program if you are using `Java`, you will also need the `JDK`.

* Download `Java Platform JDK 17` from the official website
    ```
    https://www.oracle.com/java/technologies/downloads/
    ```

* Install `java` with default settings
* Set the variable `“Java home”`
    * If the machine is `Windows`, press `Win+R` and type-those `sysdm.cpl` go to the advanced tab/Environment Variables.
    * Create a variable: `JAVA_HOME`.
    * Variable value: `<path where it is installed java>` for example `(C:\Program Files\Java\jdk*.*.*_**)`.
    * You also need to add the value: `<path whereupdated java>\bin`.
    * to the `PATH` variable: Click `Edit` and add: `C:\Program Files\Java\jdk*.*.*_**\bin`.
* After setting the variable you should restart `cmd console`. Let's check `java` in `cmd`:
    ```
    java –version
    ```
    ```
    javac –version
    ```
* If you see the `java` version in the `console`, then `java` is installed updated successfully.
## 2. Installing IntelliJ IDEA
* Download `IntelliJ IDEA` from the official website
    ```
    https://www.jetbrains.com/ru-ru/idea/
    ```

* Install `IntelliJ IDEA` with default settings
## 3. Loading the Selenium Java Client Driver
You can download `Selenium Java Client Driver` by going to link:
```
https://www.selenium.dev/downloads/
```
The page will contain a list of client `drivers` for other languages, but we select only the driver for `Java`.

This download comes as a `ZIP` file named
`"selenium-server-standalone-3.141.59.jar"`. For further simplicity, use
download, extract the contents of this `ZIP` file to a disk `C` so that you have a directory `"C:\selenium\"`.
## 4. Browser driver installation: Windows
Let's describe an example of installing a browser `driver
Chrome`. To install, open the website:

![Chrome](https://raw.githubusercontent.com/alrra/browser-logos/main/src/chrome/chrome_24x24.png) Chrome
```bash
https://googlechromelabs.github.io/chrome-for-testing/
```
and download that `ChromeDriver` version that matches your `version` your `browser`.

To find out your `browser version`, open a new window in `Chrome`, in the search bar type:
```bash
chrome://version/
```
and press `Enter`. In the top line you will see information information about the `browser version`.

Unzip the downloaded file. Create on disk `C:` `webdrivers` folder and put the unzipped folder place the file `chromedriver.exe` in the `C:\webdrivers` folder.

Add the `C:\` folder to the system `PATH` variable `webdrivers`.
## 5. Selenium Server Standalone
Launch server performed one chosen in the command line (calling the `windows` `command line` is is done by typing the `cmd` command in the search):
```bash
cd ..
```
```bash
cd ..
```
* `Selenium Grid` — is a tool that works tests on multiple physical or virtual machines buses so scripts can be executed in parallel But. Essentially, [Selenium Grid](https://www.selenium.dev/documentation/grid/) is a cluster consisting of several `Selenium servers`. It is intended for organization of a distributed network, allowing parallel run multiple browsers simultaneously on a large network number of cars.
* `Hub` —  is a server that acts as a price the starting point where the tests will be run. [Selenium Grid](https://www.selenium.dev/documentation/grid/) has only one hub and starts runs on one machine once.
* `Node` — are `Selenium` instances that are attached captives to the concentrator, and which perform tests. There may be one or more nodes in the mesh, which These can be any `OS` and can contain any from supported `browsers`.
    * First we have to start the central server (hub). This is done using the following command:
      ```bash
      java -jar C:\selenium-server-standalone-3.141.59.jar -role hub
      ```
    * Before starting, make sure you are in the directory with the file `selenium-server-standalone.jar`.
    * In the console you should see information about successful start of hub.
      ```bash
      11:54:52.596 INFO - Nodes should register to
      http://192.168.99.1:4444/grid/register/
      11:54:52.596 INFO - Selenium Grid hub is up and running
      ```
    * After running the command, you can go to the hub administration panel at:
      ```bash
      http://localhost:4444/grid/
      ```
    * Open a new console window in which we enter the following command:
      ```bash
      java -Dwebdriver.chrome.driver="C:\chromedriver\chromedriver.exe" -jar C:\selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.99.1:4444/grid/register/
      ```
    * Check the current state of our selenium hub, and also see which nodes are ready to work and which browsers are available in them, you can go to the browser line to the address where selenium hub is running. In our case it is `http://192.168.99.1:4444/` and from there we go to the selenium grid hub console. In the console we see that there is currently one node connected to the hub. When node starts, it can't determine which browsers are available and therefore use a standard configuration consisting of `5 chrome browsers`, `5 firefox` and `1 IE`.

#  1. Selenium + Java
## 1.1 Connect Selenium to IntelliJ project

Go to 

    https://www.selenium.dev/downloads/

Find `Java` among the available languages ​​and click on `Download`

![image](https://github.com/ArtemA1ekseev/selenium-java-testing/assets/113195869/efe013f2-f986-4f4b-9816-c0a448fe56fb)

Unpack the `archive`. The content will be something like this:

![image](https://github.com/ArtemA1ekseev/selenium-java-testing/assets/113195869/d7aa20b8-87cf-4fe1-bb61-0faa51f76d25)

Open your project in `IntelliJ` and click `File → Project Structure`
Select `Modules`, then click on the plus on the right and select `1. JARs or directories…`

![image](https://github.com/ArtemA1ekseev/selenium-java-testing/assets/113195869/d96b75ce-e6f3-41a3-a1f1-afd549d21a39)

Go to the folder where you just extracted the archive and select all the `.jar` files from the root and from the `libs` subfolder

Click `OK`

![image](https://github.com/ArtemA1ekseev/selenium-java-testing/assets/113195869/749ba53c-a49f-45ee-9510-29876a37c937)

## 1.2 Connect browser driver

No matter what `programming language` you write the `code` in, the operation of connecting the `browser driver` is approximately the same.

You can read about this in the article [Connecting the browser driver in Selenium](https://testsetup.ru/selenium/#driver)

## 1.3 Simple test

To make sure `Selenium` is connected successfully, paste the following code and compile it.

```java
package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); //setting the path for chrome driver

        WebDriver driver = new ChromeDriver(); //creating object for chrome driver

        driver.get("https://www.selenium.dev/selenium/web/web-form.html"); //opens the browser and navigates to the URL
        

    }
}
```
If you do not want or cannot edit the `PATH` variable, try registering the path to the driver - insert before the line `WebDriver driver = ...`

```java
driver.get("https://www.selenium.dev/selenium/web/web-form.html"); //opens the browser and navigates to the URL
```

#  2. Search for elements
## 2.1 Simple test

First of all, you need to connect `By` in `Java`, this is done as follows:

```java
import org.openqa.selenium.By;
```

Often it is not enough to simply find an element. To perform some actions on what you find, connect `WebElement`

```java
import org.openqa.selenium.WebElement;
```

## 2.2 Filling out a simple form

Let's use the most reliable method - by `id`. After examining the source code of the page you will see the following code

```html
<input type="text" id="name1" name="url1">
```

Therefore, the required id is `name1`

```java
package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); //setting the path for chrome driver

        WebDriver driver = new ChromeDriver(); //creating object for chrome driver


        driver.get("http://www.urn.su/ui/basic_test/"); //opens the browser and navigates to the URL

        WebElement searchField =
                driver.findElement(By.id("name1"));

        searchField.sendKeys("topbicycle.ru");
        searchField.submit();
    }
```
## 2.3 Click on the link - search by text

Using `linkText`, find all links with the text `Renovation`, select the first one and click on it.

```java
package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); //setting the path for chrome driver

        WebDriver driver = new ChromeDriver(); //creating object for chrome driver

        driver.get("http://www.urn.su/ui/basic_test/"); //opens the browser and navigates to the URL

        WebElement renovationLink =
                driver.findElements(By.linkText("Renovation")).get(0);
        renovationLink.click();
    }
}
```
## 2.4 Click on the link - search by CSS selector

All links in this example also have the same text - `Italy`. But we can't use the same technique, so let's study the page code and find out that the desired link has a `march8` class

We will look for a link, that is, cssSelector `a`, with the `march8` class

```java
package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo4 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); //setting the path for chrome driver

        WebDriver driver = new ChromeDriver(); //creating object for chrome driver

        driver.get("http://www.urn.su/ui/basic_test/"); //opens the browser and navigates to the URL

        WebElement march8Link =
                driver.findElements(By.cssSelector("a[class=march8]")).get(0);
        march8Link.click();
    }
}
```
