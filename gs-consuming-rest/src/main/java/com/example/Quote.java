package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // indicar que cualquier propiedad que no esté vinculada a este tipo debe ignorarse
public record Quote(String type, Value value) { }
