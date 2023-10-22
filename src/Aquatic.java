public non-sealed class Aquatic extends Animal{
    final String habitat;


    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                ", habitat=" + habitat +
                '}';
    }
    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }
}

