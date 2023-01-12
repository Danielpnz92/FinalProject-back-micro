package FinalProject.Microservice.controller.interfaces;

import FinalProject.Microservice.model.HelpSection;

public interface IHelpSectionController {
    //---------GET---------//
    HelpSection getHelpInfo(Integer id);
}
