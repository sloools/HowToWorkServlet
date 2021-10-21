package me.song;

import javax.servlet.*;
import java.io.IOException;

/*
    Filter는 chain 구조여서 우리가 직접 chain을 연결해줘야함
 */
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("이 요청은 filter를 통과했습니다");
        chain.doFilter(request, response); // 다음 필터에게 request와 response를 넘기고 다음 필터가 없다면 서블릿에게 가라
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Hello Filter's init");
    }

    @Override
    public void destroy() {
        System.out.println("Hello Filter's destroy");
    }
}
