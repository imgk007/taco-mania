package taco;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@GetMapping("/")
    public String home() {
    // the return value, 'home' is interpreted as logical name of a view,
    // i.e., it represents the name of HTML file which we are going to implement
    return "home";
    }
}
