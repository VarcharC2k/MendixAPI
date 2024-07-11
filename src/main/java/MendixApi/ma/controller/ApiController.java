package MendixApi.ma.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ApiController{

    @GetMapping("/api")
    @ResponseStatus(HttpStatus.OK)
    public String test() {
        System.out.println("test 확인");
        return "Test 성공";
    }

    @GetMapping("/apis")
    @ResponseStatus(HttpStatus.OK)
    public String tests(){
        System.out.println("test 확인");
        return "HTTPS Test 성공";
    }
}
