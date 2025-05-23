// 4. Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.

package lista2;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public void calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        double somaDasNotas = nota1 + nota2 + nota3 + nota4;
        System.out.println("A media do aluno foi: " + somaDasNotas / 4);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Lana");
        aluno1.setNota1(8);
        aluno1.setNota2(3);
        aluno1.setNota3(6);
        aluno1.setNota4(5);
        aluno1.calcularMedia(aluno1.getNota1(), aluno1.getNota2(), aluno1.getNota3(), aluno1.getNota4());
    }
}
