// // 2. Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato

package lista3.classe.animal;

public class Principal {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.emitirSom();

        Cachorro cachorro1 = new Cachorro();
        cachorro1.emitirSom();
        cachorro1.abanarRabo();

        Gato gato1 = new Gato();
        gato1.emitirSom();
        gato1.arranharMoveis();
    }
}
