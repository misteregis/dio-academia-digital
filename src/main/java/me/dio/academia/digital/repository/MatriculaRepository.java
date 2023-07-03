package me.dio.academia.digital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import me.dio.academia.digital.entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    /**
     *
     * @param bairro bairro referência para o filtro
     * @return lista de alunos matriculados que residem no bairro passado como
     *         parâmetro
     */
    @Query(value = "SELECT * FROM matriculas m " +
            "INNER JOIN alunos a ON m.id_aluno = a.id " +
            "WHERE a.bairro = :bairro", nativeQuery = true)
    // @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
    List<Matricula> findAlunosMatriculadosBairro(String bairro);

    // List<Matricula> findByAlunoBairro(String bairro);
}
