package lk.example.demo.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public String sample() {
        //localhost:8080/sample
        System.out.println("i'm here");
        return "main";
    }


    @GetMapping("/sampleOne")
    public String sampleOne(Model model) {
        model.addAttribute("sample", "Sample message");
        return "main";
    }
    @GetMapping("/sampleTwo")
    public String sampleTwo(Model model) {
        model.addAttribute("sample", "Sample message");
        return "sample/main";
    }

}
