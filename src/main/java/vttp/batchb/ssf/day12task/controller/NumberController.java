package vttp.batchb.ssf.day12task.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class NumberController {

    @GetMapping("/number")
public String generateNumber(
        @RequestParam (defaultValue = "User")String name,
        @RequestParam (defaultValue = "4") String count ,
        Model model) {

    int numCount = 3; // default count
    try {
        if(Integer.parseInt(count) > 30)
        numCount = 30;

        else
        numCount = Integer.parseInt(count);

    } catch (NumberFormatException e) {
        System.out.println("Invalid count, using default value: 3");
    }

    // Generate a list of picture URLs based on the count
    List<String> pictures = new ArrayList<>();
    for (int i = 0; i < numCount; i++) {
        pictures.add(Constants.generatePic()); // Adjust this to get unique images if necessary
    }

    model.addAttribute("name", name.toUpperCase());
    model.addAttribute("pictures", pictures); // Add pictures to model for display in the view
    model.addAttribute("count", numCount);

    return "number"; // Ensure this corresponds to your Thymeleaf template name
}

}

