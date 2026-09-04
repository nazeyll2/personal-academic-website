package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    private void addLanguage(Model model, String lang) {
        model.addAttribute("lang", lang);
    }

    @GetMapping("/")
    public String home(
            @RequestParam(value = "lang", defaultValue = "en") String lang,
            Model model) {

        addLanguage(model, lang);
        return "index";
    }

    @GetMapping("/biography")
    public String biography(
            @RequestParam(value = "lang", defaultValue = "en") String lang,
            Model model) {

        model.addAttribute("lang", lang);
        return "biography";
    }

    @GetMapping("/essays")
    public String essays(
            @RequestParam(value = "lang", defaultValue = "en") String lang,
            Model model) {

        addLanguage(model, lang);
        return "essays";
    }

    @GetMapping({"/publications", "/publikationen"})
    public String publications(
            @RequestParam(value = "lang", defaultValue = "en") String lang,
            Model model) {

        addLanguage(model, lang);
        return "publications";
    }

    @GetMapping("/lecture-notes")
    public String lectureNotes(
            @RequestParam(value = "lang", defaultValue = "en") String lang,
            Model model) {

        addLanguage(model, lang);
        return "lecture-notes";
    }

    @GetMapping("/research-group")
    public String researchGroup(
            @RequestParam(value = "lang", defaultValue = "en") String lang,
            Model model) {

        addLanguage(model, lang);
        return "research-group";
    }

    @GetMapping("/contact")
    public String contact(
            @RequestParam(value = "lang", defaultValue = "en") String lang,
            Model model) {

        addLanguage(model, lang);
        return "contact";
    }

    @GetMapping("/lecture-notes/general-relativity")
    public String generalRelativity(
            @RequestParam(value = "lang", defaultValue = "en") String lang,
            Model model) {

        addLanguage(model, lang);
        return "general-relativity";
    }

    @GetMapping("/lecture-notes/quantum-mechanics-1")
    public String quantumMechanics1(
            @RequestParam(value = "lang", defaultValue = "en") String lang,
            Model model) {

        addLanguage(model, lang);
        return "quantum-mechanics-1";
    }

    @GetMapping("/lecture-notes/quantum-mechanics-2")
    public String quantumMechanics2(
            @RequestParam(value = "lang", defaultValue = "en") String lang,
            Model model) {

        addLanguage(model, lang);
        return "quantum-mechanics-2";
    }

    @GetMapping("/lecture-notes/quantum-information-theory")
    public String quantumInformationTheory(
            @RequestParam(value = "lang", defaultValue = "en") String lang,
            Model model) {

        addLanguage(model, lang);
        return "quantum-information-theory";
    }

    @GetMapping("/lecture-notes/quantum-field-theory")
    public String quantumFieldTheory(
            @RequestParam(value = "lang", defaultValue = "en") String lang,
            Model model) {

        addLanguage(model, lang);
        return "quantum-field-theory";
    }
}
