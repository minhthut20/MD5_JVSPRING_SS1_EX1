package rikkei.academy.controller;

import com.sun.org.apache.bcel.internal.generic.D2F;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangeMoney {
    @GetMapping("/change")
    public String change(@RequestParam double money, Model model){
        double VND = money * 23000;
        model.addAttribute("result", Double.valueOf(VND).longValue());
        return "change";
    }
}
