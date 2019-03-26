package server.controller;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import server.util.OptMessage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping(value = "/register")
@CrossOrigin
public class Register {
    @RequestMapping(value = "/signUp",method = RequestMethod.GET)
    public void signUp(HttpServletRequest request, HttpServletResponse response){
        OptMessage optMessage = new OptMessage();
        optMessage.setResult(true);
        try (PrintWriter out = response.getWriter()){
            out.println(new JSONObject(optMessage));
            //response.sendRedirect("http://localhost:63342/twts_186_video/index.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
