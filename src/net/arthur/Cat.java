package net.arthur;

public class Cat extends Animal implements  IPettable{ // voce pode impelementar diversos interfaces e apenas uma superclass

    public Cat(String name, int age, char gender) {
        super(name, gender,age);
    }
    @Override // Estamos escrevendo por cima de um method da superclass
    public void MakeASound() {
        System.out.println(this.name + " diz: Meow!");
    }

    @Override
    public void pet() {
        System.out.println(this.name + " was a Pet!");

    }
}
