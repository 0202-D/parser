package su.mobile.petrosoft.dmitrypetrov.parser.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import su.mobile.petrosoft.dmitrypetrov.parser.exception.IncorrectDataException;

@Service
public class XmlToJsonServiceImpl implements XmlToJsonService {
    @Override
    public String convert(String xml) {
        JSONObject json = new JSONObject();
        try{
        json.put("xml", XML.toJSONObject(xml));}
        catch (JSONException e){
            throw new IncorrectDataException("Wrong format");
        }
        // Send HTTP POST request to specified URL
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForEntity("http://localhost:8090/test", json.toString(), String.class);

        return json.toString();


    }
}
