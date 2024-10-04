package com.survey.data_input;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SurveyController {

    @GetMapping("/")
    public String showSurveyForm() {
        return "survey.html";
    }

    @PostMapping("/submitSurvey")
    public ModelAndView submitSurvey(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("dob") String dob,
            @RequestParam("feedback") String feedback) {

        // Log or process the survey data here
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("DOB: " + dob);
        System.out.println("Feedback: " + feedback);

        // Redirecting to a thank you page after submission
        ModelAndView mav = new ModelAndView("thankyou.html");
        mav.addObject("name", name);
        return mav;
    }
}
