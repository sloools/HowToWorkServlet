package me.song;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Hello Servlet's init");
    }

    @Override
    public void destroy() {
        System.out.println("Hello Servlet's destroy");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 1.
        String myName = (String) getServletContext().getAttribute("name");

        // 2.
        ApplicationContext applicationContext= (ApplicationContext) getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);

        SampleService sampleService = applicationContext.getBean(SampleService.class);


        System.out.println("Hello Servlet's doGet");
        resp.getWriter().println("<html>");
        resp.getWriter().println("<head>");
        resp.getWriter().println("</head>");
        resp.getWriter().println("<body>");
        resp.getWriter().println("<h2>hello " + myName + "</h2>");
        resp.getWriter().println("<h2>hello " + sampleService.getName() + "</h2>");
        resp.getWriter().println("</body>");
        resp.getWriter().println("</html>");
    }
}
