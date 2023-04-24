package com.example.maxtesttask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalcDataController {
    private final CalcDataRepository repository;

    public CalcDataController(CalcDataRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/calc")
    public Integer calculate(@RequestParam Integer x,
                             @RequestParam Integer y,
                             @RequestParam String type) {
        CalcData calcData = new CalcData(x, y, type);
        int result = 0;
        switch (type) {
            case "sum" -> {
                result = x + y;
                calcData.setResult(result);
                repository.save(calcData);
            }
            case "mult" -> {
                result = x * y;
                calcData.setResult(result);
                repository.save(calcData);
            }
        }
        return result;
    }
}
