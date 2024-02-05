 **Project: TestServlet**

**Description:**
This project demonstrates the creation of a simple servlet using the Jakarta EE API. The servlet prints "hello " to the console when it is initialized.

**Prerequisites:**

* Java Development Kit (JDK) 11 or later
* Jakarta EE 9 or later
* An IDE such as Eclipse or IntelliJ IDEA

**Instructions:**

1. Create a new Java project in your IDE.
2. Add the following dependencies to your project's pom.xml file:

```xml
<dependency>
    <groupId>jakarta.servlet</groupId>
    <artifactId>jakarta.servlet-api</artifactId>
    <version>5.0.0</version>
</dependency>
```

3. Create a new Java class in the `pac1` package called `TestServlet`. This class will extend the `HttpServlet` class and override the `init()` method.

```java
package pac1;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;

public class TestServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        // TODO Auto-generated method stub
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Your "GET" method logic here
        response.getWriter().write("Hello from GET method!");
    }
}

```

4. In the `web.xml` file, add the following servlet declaration:

```xml
<servlet>
    <servlet-name>TestServlet</servlet-name>
    <servlet-class>pac1.TestServlet</servlet-class>
</servlet>
```

5. Deploy the project to a servlet container such as Tomcat or Jetty.
6. Access the servlet by browsing to the following URL:

```
http://localhost:8080/TestServlet
```

You should see the message "hello " printed to the console.
**Output:**

When you run the project, you should see the following output in the console:

```
hello 
```

**Explanation:**

The `TestServlet` class is a simple servlet that extends the `HttpServlet` class. The `init()` method is called when the servlet is initialized. In the `init()` method, we print "hello " to the console. This demonstrates how to create a simple servlet using the Jakarta EE API.
