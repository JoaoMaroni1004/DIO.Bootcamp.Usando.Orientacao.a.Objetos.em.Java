package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    // modificadores de acesso (private, protected, public)
     private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso = " + "Título: " + getTitulo() + ", Descrição: " + getDescricao() + ", Carga horária: " + cargaHoraria + " horas";
    }
}
