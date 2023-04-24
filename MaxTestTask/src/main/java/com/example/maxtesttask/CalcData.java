package com.example.maxtesttask;

import javax.persistence.*;

@Entity
@Table
public class CalcData {
    @Id
    @GeneratedValue
    private Long id;

    private int x;
    private int y;
    private String type;
    private int result;

    public CalcData() {
    }

    public CalcData(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.result = result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
