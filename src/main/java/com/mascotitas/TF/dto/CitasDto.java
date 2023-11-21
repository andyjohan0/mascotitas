package com.mascotitas.TF.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CitasDto {

    private String Fecha;
    private String Hora;
    private String Consulta;

    private Long veterinariaId;

}
