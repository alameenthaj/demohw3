package com.example.demohw3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    @GetMapping("/movie")
    public String movie(Model model) {

        String movieTitle = "Interstellar";

        String firstLine = "A team of explorers travels beyond this galaxy.";

        String fullDescription = "A team of explorers travels beyond this galaxy. " +
                "They discover a mysterious planet and try to find a new home " +
                "for humanity.";

        boolean isLoggedIn = true;

        model.addAttribute("movieTitle", movieTitle);
        model.addAttribute("firstLine", firstLine);
        model.addAttribute("fullDescription", fullDescription);
        model.addAttribute("isLoggedIn", isLoggedIn);

        return "movie";
    }
}
