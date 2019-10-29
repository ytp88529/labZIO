package com.example.labZIO.labZIO;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewStudent {
    final String name, numer, grupa;

    @JsonCreator
    public NewStudent(@JsonProperty String name, @JsonProperty String numer, @JsonProperty String grupa) {
        this.name = name;
        this.numer = numer;
        this.grupa = grupa;
    }
}
