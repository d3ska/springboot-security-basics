package pl.deska.springbootsecurity.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Counter {

    private Map<String, Integer> visitCounter = new HashMap<>();


    public int geVisitNumb(String name){
        updateVisitCount(name);
        return visitCounter.get(name);
    }

    private void updateVisitCount(String name) {
        if(visitCounter.containsKey(name)){
            Integer visitedNumb = visitCounter.get(name);
            visitCounter.put(name, (visitedNumb+1) );
        }else{
            visitCounter.put(name, 1);
        }
    }

}
