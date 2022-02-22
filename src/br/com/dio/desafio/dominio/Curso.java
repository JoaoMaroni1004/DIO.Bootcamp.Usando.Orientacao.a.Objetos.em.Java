package br.com.dio.desafio.dominio;

import java.sql.Struct;

public class Curso {
    // modificadores de acesso (private, protect, public)
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Curso() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso = " + "Título: " + titulo + ", Descrição: " + descricao + ", Carga horária: " + cargaHoraria + " horas";
    }
}
