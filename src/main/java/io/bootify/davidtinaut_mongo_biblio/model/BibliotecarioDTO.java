package io.bootify.davidtinaut_mongo_biblio.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BibliotecarioDTO {

    private Long id;

    @NotNull
    @Size(max = 255)
    private String nombre;

    @NotNull
    @Size(max = 255)
    private String apellido;

    @NotNull
    @Size(max = 255)
    private String zona;

    @NotNull
    @Size(max = 255)
    private String numeroempleado;

}
