package su.mobile.petrosoft.dmitrypetrov.parser.service;

import org.springframework.stereotype.Service;

@Service
public interface XmlToJsonService {
    String convert(String xml);
}
