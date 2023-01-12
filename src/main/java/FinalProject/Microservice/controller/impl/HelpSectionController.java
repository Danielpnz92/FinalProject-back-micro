package FinalProject.Microservice.controller.impl;

import FinalProject.Microservice.controller.interfaces.IHelpSectionController;
import FinalProject.Microservice.model.HelpSection;
import FinalProject.Microservice.repository.HelpSectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelpSectionController implements IHelpSectionController {
    @Autowired
    HelpSectionRepository helpSectionRepository;
    @GetMapping("/help/{id}")
    @ResponseStatus(HttpStatus.OK)
    public HelpSection getHelpInfo(@PathVariable(name = "id")Integer id) {
        return helpSectionRepository.findById(id).get();
    }
}
