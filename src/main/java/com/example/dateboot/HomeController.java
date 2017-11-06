package com.example.dateboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model,Model model2){
        LocalDateTime rightNow= LocalDateTime.now();
        DateTimeFormatter hr24 = DateTimeFormatter.ofPattern("kk:m");
        DateTimeFormatter longFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        model.addAttribute ( "mydate", "The current date is:"+rightNow.format(longFormat));
        model2.addAttribute ( "mytext", "This is the current date : "+LocalTime.now().format(hr24));
        return "home";
    }
}
