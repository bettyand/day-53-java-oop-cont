public class Animal {
    private String name;
    private boolean isDog;

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(boolean isDog) {
        this.isDog = isDog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsDog() {
        return isDog;
    }

    public void setIsDog(boolean isDog) {
        this.isDog = isDog;
    }

    private String dogSound() {
        String[] dogSounds = {"bark", "woof", "ruff", "grr"};
        int index = (int)Math.floor(Math.random() * dogSounds.length);
        return dogSounds[index];
    }

    @Override
    public String toString() {
        if (getIsDog()) {
            return getName() + " is a dog - " + dogSound() + "!";
        } else {
            return getName() + " is not a dog";
        }
    }
}