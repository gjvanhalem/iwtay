package com.app.service;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

import org.springframework.web.bind.annotation.*;

import com.app.model.Thought;

@RestController
@RequestMapping(value="/svc/person")
public class ThoughtService {

    Map<Long, Thought> thoughtMap;

    public ThoughtService() {
        super();
        thoughtMap = new HashMap< Long, Thought>();
         Date date = new Date();


        Thought t1 = new Thought();
        t1.setId(1l);
        t1.setThinker("Roeland Lengers");
        t1.setSubject("Undisclosed");
        t1.setTimestamp(new Timestamp(date.getTime()));

        Thought t2 = new Thought();
        t2.setId(2l);
        t2.setThinker("Roeland Lengers");
        t2.setSubject("Mistress");
        t2.setTimestamp(new Timestamp(date.getTime()));

        thoughtMap.put(t1.getId(), t1);
        thoughtMap.put(t2.getId(), t2);
    }


    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Thought getThought(@PathVariable Long id){
        return thoughtMap.get(id);
    }
}