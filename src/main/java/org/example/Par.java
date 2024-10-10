package org.example;

import com.google.gson.annotations.SerializedName;

public class Par {
    @SerializedName("conversion_result")
    private double valor;

    double getValor() {
        return valor;
    }
}
