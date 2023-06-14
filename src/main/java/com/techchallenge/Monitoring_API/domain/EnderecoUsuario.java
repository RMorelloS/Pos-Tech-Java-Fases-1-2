package com.techchallenge.Monitoring_API.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Objects;
import java.util.UUID;

public class EnderecoUsuario {
    @Getter
    @Setter
    @NotBlank(message = "Campo 'rua' é obrigatório e não pode estar vazio")
    private String rua;
    @Getter
    @Setter
    @Min(value=0L, message = "Campo 'numero' deve ser um inteiro positivo")
    private int numero;
    @Getter
    @Setter
    @NotBlank(message = "Campo 'bairro' é obrigatório e não pode estar vazio")
    private String bairro;
    @Getter
    @Setter
    @NotBlank(message = "Campo 'cidade' é obrigatório e não pode estar vazio")
    private String cidade;
    @Getter
    @Setter
    @NotBlank(message = "Campo 'estado' é obrigatório e não pode estar vazio")
    private String estado;
    @Getter
    @Setter
    private UUID IdEndereco;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnderecoUsuario that = (EnderecoUsuario) o;
        return Objects.equals(IdEndereco, that.IdEndereco);
    }

    public EnderecoUsuario(String rua, int numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        IdEndereco = UUID.randomUUID();
    }
}
