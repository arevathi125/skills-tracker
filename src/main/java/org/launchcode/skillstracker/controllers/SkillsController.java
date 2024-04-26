package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    //TODO create a route with some html to display a hello message and a list of skills

    @GetMapping("")
    public String skillsTracker(){
        return "<h1>Skills Tracker</h1>"+
                "<h2>We have a few skills we would like to learn.Here is the list!"+
                "<ol><li>Java</li>"+
                "<li>Javascript</li>"+
                "<li>Python</li></ol>";
    }

    //TODO create a route that hosts a form for me enter my name and to rank my skills

    @GetMapping("form")
    public String skillsForm(){
        return "<html>"+
                "<body>"+
                "<form method='post'>"+
                "<label> Name: </label><br>"+
                "<input type='text' name='name'><br>"+
                "<label>My favorite language: </label>"+
                "<br><select name='firstchoice'><br>"+
                "<option value='Java'>Java</option>"+
                "<option value='Javascript'>Javascript</option>"+
                "<option value='Python'>Python</option>"+
                "</select><br>"+
                "<label>My second favorite language: </label>"+
                "<br><select name='secondchoice'><br>"+
                "<option value='Java'>Java</option>"+
                "<option value='Javascript'>Javascript</option>"+
                "<option value='Python'>Python</option>"+
                "</select><br>"+
                "<label>My third favorite language: </label>"+
                "<br><select name='thirdchoice'><br>"+
                "<option value='Java'>Java</option>"+
                "<option value='Javascript'>Javascript</option>"+
                "<option value='Python'>Python</option>"+
                "</select>"+
                "<br><input type='submit' value='Submit'>"+
                "</form>"+
                "</body>" +
                "</html>";
    }

    //TODO create a route that will handle that request with my choices

    @PostMapping("form")
    public String skillsChoices(@RequestParam String name, String firstchoice, String secondchoice, String thirdchoice){
        return "<h1>"+name+"</h1>"+
                "<ol><li>"+firstchoice+"</li>"+
                "<li>"+secondchoice+"</li>"+
                "<li>"+thirdchoice+"</li></ol>";
    }
}
