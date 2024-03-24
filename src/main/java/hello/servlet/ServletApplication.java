package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // 자동 서블릿 스캔 <- 자동등록
@SpringBootApplication
public class ServletApplication {

    public static void main(String[] args) {

		SpringApplication.run(ServletApplication.class, args);
    }

}
