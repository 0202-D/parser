package su.mobile.petrosoft.dmitrypetrov.parser.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import su.mobile.petrosoft.dmitrypetrov.parser.service.XmlToJsonService;

@RestController
public class XmlToJsonController {
    private final XmlToJsonService xmlToJsonService;

    public XmlToJsonController(XmlToJsonService xmlToJsonService) {
        this.xmlToJsonService = xmlToJsonService;
    }

    @PostMapping(value = "/convert")
    public String convertXmlToJson(@RequestBody String xml){
      return xmlToJsonService.convert(xml);
    }
}
