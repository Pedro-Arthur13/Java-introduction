package net.arthur;

public abstract class  Animal {

    protected String name;
    protected int age;
    protected char gender; // Se deixar privado vai dar ruim, porque n vai da pra ser acessado por uma subcalsse

    // Se voce especificar um constructor que nao seja o default tera que setar o default novamente manualmente
    public Animal(String name,  char gender,int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;

    }
    public int getAge() {
        return age;
    }

    public void bithday(){
        age++;
    }
//    public void MakeASound(){
//        System.out.println(this.name +" just make a sound!");
//    }
    //Isso faz com que deixe a subclass definir por se propria o que o animal vai fazr com esse metodo
    public abstract void MakeASound();

}
