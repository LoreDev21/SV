package com.veterinaria.controllers.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentWithUserDTO {

    private Long id;
    private String reason;
    private String status;
    private String type;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;
    private Long userId;
    private String user;
    private Long petId;
    private String pet;
    private Long doctorId;
    private String doctor;
}
