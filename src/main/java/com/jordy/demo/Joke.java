package com.jordy.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;



@Data
public class Joke {
    private String id;
    private String value;
    
    public Joke(){
        
    }
    
    public Joke(String id, String value){
        this.id = id;
        this.value = value;
    }
    

    @Override
    public String toString() {
        return value;
    }
}
