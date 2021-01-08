package org.vcs.biennd3.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.vcs.biennd3.student.model.Student;

import java.io.IOException;

@Controller
@RequestMapping("/serialization")
public class SerializationController {
    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "serialization";
    }

    @PostMapping
    public String showBase64(Model model, @ModelAttribute Student student) throws IOException {
        model.addAttribute("value", student.serialize());
        return "base64";
    }
}
