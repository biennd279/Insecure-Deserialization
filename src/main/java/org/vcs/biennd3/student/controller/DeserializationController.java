package org.vcs.biennd3.student.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.vcs.biennd3.student.model.Base64Value;
import org.vcs.biennd3.student.model.Student;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;

@Slf4j

@Controller
@RequestMapping("/deserialization")
public class DeserializationController {
    @GetMapping
    public String showForm(Model model) {
        Base64Value base64Value = new Base64Value();
        model.addAttribute("base64Value", base64Value);
        return "deserialization";
    }

    @PostMapping
    public String showObject(Model model, @ModelAttribute Base64Value base64Value) throws IOException, ClassNotFoundException {
        model.addAttribute("student", base64Value.deserialize());
        return "object";
    }
}
