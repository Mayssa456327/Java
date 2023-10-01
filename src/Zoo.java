class Zoo {
    private static final int Max_nbrAnimals = 25;
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[ Max_nbrAnimals];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        for (int i = 0; i <  Max_nbrAnimals; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }
        return false;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i <  Max_nbrAnimals; i++) {
            if (animals[i] != null && animals[i].equals(animal)) {
                animals[i] = null;
                return true; // L'animal a été supprimé avec succès
            }
        }
        return false; // L'animal n'a pas été trouvé dans le zoo
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo:");
        for (int i = 0; i <  Max_nbrAnimals; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].name);
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i <  Max_nbrAnimals; i++) {
            if (animals[i] != null && animals[i].equals(animal)) {
                return i; // L'animal a été trouvé à l'indice i
            }
        }
        return -1; // L'animal n'a pas été trouvé dans le zoo
    }

    public boolean isZooFull() {
        for (int i = 0; i <  Max_nbrAnimals; i++) {
            if (animals[i] == null) {
                return false; // Il y a au moins une cage vide, le zoo n'est pas plein
            }
        }
        return true; // Toutes les cages sont occupées, le zoo est plein
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1 != null && z2 != null) {
            if (z1.animals.length > z2.animals.length) {
                return z1;
            } else {
                return z2;
            }
        }
        return null; // Au moins l'un des zoos n'est pas valide
    }
}