package com.jam.cloud.jamcustomer.data;

import lombok.Data;

import java.io.Serializable;


@Data
public class ReContent  implements Serializable{
    private String uid;
    private boolean status;
    private int code;
    private Object content;
    private Object msg;
    private String debug;
    private String rediect;
}
