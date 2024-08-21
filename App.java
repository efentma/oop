public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("=========Abstraction========");
        Animal lion = new Lion("Lion1", 10);
        Animal elephant = new Elephant("Elephan1", 20);
        Animal monkey = new Monkey("Monkey1", 7);
        lion.infoAnimal();
        lion.make_sound();
        System.out.println();
        elephant.infoAnimal();
        elephant.make_sound();
        System.out.println();
        monkey.infoAnimal();
        monkey.make_sound();
        System.out.println();
        System.out.println("========Polymorphism=========");

        /**
         *  Membuat array animals
         */
        Animal[] animals = {
            new Lion("Lion2", 30),
            new Elephant("Elephant2", 35),
            new Monkey("Monkey2", 40)
        };

        /**
         * Membuat looping untuk mengiterasi setiap object dalam array animals
         */

        for (Animal animal : animals){
            animal.infoAnimal();
            animal.make_sound();
        }

    }
}

/**
 * Membuat abstraction dari Animal
 */
abstract class Animal {
    protected String nama;
    protected String spesies;
    protected int umur;


    // konstruktor untuk menginisialisasi atribut
    public Animal(String nama, String spesies, int umur) {
        this.nama = nama;
        this.spesies = spesies;
        this.umur = umur;
    }

    // method abstract yang harus diimplementasikan setiap subclass
    abstract void make_sound();

    public void infoAnimal(){
        System.out.println("Nama : " + nama);
        System.out.println("Spesies : " + spesies);
        System.out.println("Umur : " + umur + " years old");
    }
    
}

class Lion extends Animal{
    
    Lion(String nama, int umur){
        super(nama, "A", umur);
    }
    @Override
    void make_sound(){
        System.out.println("Sound : Roarrr");
    }
    
}

class Elephant extends Animal{
    Elephant(String nama, int umur){
        super(nama, "A", umur);
    }
    @Override
    void make_sound(){
        System.out.println("Sound : Wuuiiiiizzzhhhh");
    }
}

class Monkey extends Animal{
    Monkey(String nama, int umur){
        super(nama , "A", umur);
    }
    void make_sound(){
        System.out.println("Sound : u-u-a-a-u-a-u-a");
    }
}



