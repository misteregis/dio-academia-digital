package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {
    @NotNull(message = "O Id do aluno não pode ser nulo.")
    @Positive(message = "O Id do aluno precisa ser positivo.")
    private Long alunoId;
}
