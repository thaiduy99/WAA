package edu.miu.controller;

import edu.miu.service.StarbuckService;
import edu.miu.database.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

@Controller
@SessionAttributes({ "User" })
public class AdviceController extends HttpServlet {

    @Autowired
    StarbuckService service;

    private static final long serialVersionUID = 1L;

	@GetMapping(value = {"/advice"})
    protected String loadAdvices(Model model) throws ServletException, IOException {
        Map<String, String> roastMap = new HashMap<String, String>();
        roastMap.put("1", "Light");
        roastMap.put("2", "Medium");
        roastMap.put("3", "Dark");
        model.addAttribute("roasts", roastMap);

        return "advice";
    }

    @PostMapping(value = {"/showadvice"})
    protected String showAdvices(Integer roastKey, Model model) throws Exception {
//        StarbuckService data = new ServiceFactory().getDataFacadeInstance("dev");
        String roast = Database.roasts.get(roastKey);
        List<String> advice = service.getAdvice(roast);
        model.addAttribute("roastList", advice);
        model.addAttribute("roast", roast);
        return "display";
    }
}
