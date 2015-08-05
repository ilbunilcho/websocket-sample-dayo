package sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(@RequestParam(value = "say", required = false, defaultValue = "ye!!") String say, Model model) {

        logger.debug("say={}", say);

        model.addAttribute("say", say);

        return "index";
    }
}
