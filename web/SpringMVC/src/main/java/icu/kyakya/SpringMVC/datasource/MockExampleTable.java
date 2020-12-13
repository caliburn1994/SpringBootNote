package icu.kyakya.SpringMVC.datasource;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.stream.IntStream;

@Component
@XSlf4j
public class MockExampleTable {

    public void selectAll() {

        ObjectMapper om = new ObjectMapper();
        JsonNode jsonNode = null;
        InputStream in = null;
        try {
            in = new ClassPathResource("/static/datatable/arrays.txt").getInputStream();
            jsonNode = om.readTree(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info(jsonNode.toString());


        var list = new ArrayList<>();
        IntStream.range(0, 30).forEach(i -> {
//            Example e = new Example();
//            e.setAge();
//            e.setOffice();
//            e.setName();
//            e.setPosition();
//            e.setSalary();
//            e.setStarDate();
//            list.add()
        });
    }


}
