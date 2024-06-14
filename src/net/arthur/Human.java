package net.arthur;

public class Human extends Animal { // Isso significa que a classe  human  é uma
    // subclasse de animal e animal é uma superclass de human


    // Adding some fields (Methods and Objects)
    // Access modifier --> public

    //Isso pode ser Comentado porque ja foi herdado da superclasse animal
//    protected String name;// Não adianta fazer isso porque ela ainda é altaravel dento do packge e em seus derivados
//    private int age;
//    private char gender; // only can be accessed in the same class
    public static final int HumanToDogYerMultiplier = 7; // Static pode ser chamado na classe  e nao necessita de um objeto especifico criar
//    // Algo static é basicamente que é comum a todos os objetos de uma classe
//    // Algo com o keyword final nunca pode ser mudado seu valor depois de ser assigned


    //Getters --> Retornam o valor de uma variavel
    //Setters --> permitem fazer associaçao de uma valor a variavel especifica

//    public int getAge() {
//        return age;
//    }
//
//    public void bithday(){
//        age++;
//    }

    public int getAgeInDogYears(){
        return age/HumanToDogYerMultiplier;
    }

    // public, protected, private
    // static, final

//    //Used default constructor
//    // Default constructor:
//    public Human(){
//
//    }

    //Custom constructor
    public Human(String name, char gender, int age){
        super(name,  gender,age);// Isso chama o constructor da superclass que ja define os parametros

//        this.name = name; // this. refer to object that we're creating
//        this.age = age; //  Esse this é como um indicador para indicar o que o parametro se refere
//        this.gender = gender;
    }

    // Hint: se nao quiser definir field by field within the constructor voce pode pressionar botao direito
    // do mouse and generate them automatically

    //Method
//    public void complainAboutTheGovernment(){
//        System.out.println(this.name +" está lhe pedindo para you do the L now!");
//    }


    @Override // Estamos escrevendo por cima de um method da superclass
    public void MakeASound() {
        System.out.println(this.name + " está lhe pedindo para you do the L now!");
    }



}
