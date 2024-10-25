public abstract class Person {
    protected String name;
    protected int age;
    protected Gender gender;
    protected float experience;

    public Person() {
        this.name = "null";
        this.age = 0;
        this.gender = Gender.NULL;
        this.experience = 0;
    }

    public Person(int age, float experience, Gender gender, String name) {
        this.age = age;
        this.experience = experience;
        this.gender = gender;
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public enum Gender {
        FEMALE, MALE, NULL;

        public String getName() {
            return this.name().toLowerCase();
        }
    }
}
