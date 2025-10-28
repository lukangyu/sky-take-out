package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployEidtPasswordDTO implements Serializable{
    private Long empId;
    private String oldPassword;
    private String newPassword;
}
