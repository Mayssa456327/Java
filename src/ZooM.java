public class ZooM {

    public static void main(String[] args) {
        Animal lion = new Animal("Cats", "Bagera", 5, true);
        Zoo myZoo = new Zoo("Mon Zoo", "Tunis", 10);

        myZoo.addAnimal(lion);

        myZoo.displayZoo();
        myZoo.displayAnimals();

        System.out.println("Recherche du lion dans le zoo : " + myZoo.searchAnimal(lion));

        Animal lion2 = new Animal("Cats", "lion", 4, true);
        System.out.println("Recherche du lion2 dans le zoo : " + myZoo.searchAnimal(lion2));

        System.out.println("Le zoo est plein : " + myZoo.isZooFull());

        Zoo zoo1 = new Zoo("Zoo1", "Ville1", 10);
        Zoo zoo2 = new Zoo("Zoo2", "Ville2", 20);

        Zoo zooPlusAnimaux = Zoo.comparerZoo(zoo1, zoo2);
        if (zooPlusAnimaux != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + zooPlusAnimaux.name);
        } else {
            System.out.println("Les zoos sont invalides ou ont le même nombre d'animaux.");
        }
    }
}