public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

//        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
       System.out.println(myZoo.isZooFull());

        Dolphin D1= new Dolphin("lol","mery",34,true,"g",3);
        Penguin P1= new Penguin("hjj","hyt",66,true,"fgf",6);
        System.out.println(D1.toString());
        System.out.println(P1.toString());

        Aquatic dolphin = new Aquatic("Dolphinidae", "Dolphin", 10, true, "Ocean");
        Aquatic turtle = new Aquatic("Cheloniidae", "Turtle", 30, false, "Sea");
        Aquatic shark = new Aquatic("Carcharhinidae", "Shark", 15, false, "Ocean");
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(turtle);
        myZoo.addAquaticAnimal(shark);
        dolphin.swim();
        turtle.swim();
    }


}
