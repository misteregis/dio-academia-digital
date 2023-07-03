package me.dio.academia.digital.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;

public class AlunoUtil {
    private static final long ID = 1L;
    private static final String NOME = "José";
    private static final String CPF = "255.392.100-42";
    private static final String BAIRRO = "Jardim Cidade";
    public static final LocalDate DATA_NASCIMENTO = LocalDate.of(2010, 10, 1);

    public static Aluno createFakeAluno() {
        Aluno aluno = new Aluno();
        aluno.setId(ID);
        aluno.setNome(NOME);
        aluno.setCpf(CPF);
        aluno.setBairro(BAIRRO);
        aluno.setDataDeNascimento(DATA_NASCIMENTO);
        aluno.setAvaliacoes(Arrays.asList(
                new AvaliacaoFisica(1L, aluno, LocalDateTime.now(), 100.0, 1.80)));
        return aluno;
    }

    public static AlunoForm createFakeAlunoForm() {
        AlunoForm alunoForm = new AlunoForm();
        alunoForm.setNome(NOME);
        alunoForm.setCpf(CPF);
        alunoForm.setBairro(BAIRRO);
        alunoForm.setDataDeNascimento(DATA_NASCIMENTO);
        return alunoForm;
    }
}
