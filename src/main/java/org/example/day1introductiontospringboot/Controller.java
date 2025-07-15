package org.example.day1introductiontospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

    @GetMapping("hello")
    public String hello() {
        return """
                <style>
                body{
                margin: 0px 0px 0px 0px;
                }
                </style>
                
                <div style= "background-color: black; width: 90%; height: 400px; display: flex; justify-content: center; align-items: center; border: solid red 10px;">
                <h1 style= "color: white; font-size:5vw">Hello World!</h1>
                </div>
                """;
    }
    @GetMapping("/hussam")
    public String hussam(){
        return """
                <style>
                body{
                margin: 0px 0px 0px 0px;
                display: flex;
                justify: center;
                align-items: center;
                }
                </style>
                
                <div style= "background-color: black; width: 90%; height: 400px; display: flex; justify-content: center; align-items: center; border: solid red 10px;">
                <h1 style= "color: white; font-size:5vw">hussam</h1>
                </div>
        """;
    }
}
