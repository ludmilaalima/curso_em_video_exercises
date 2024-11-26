public class Grasshopper extends Person {
    private String email;
    private String pin;
    private int totalWatched;

    public Grasshopper(String email, String pin, int totalWatched) {
        this.email = email;
        this.pin = pin;
        this.totalWatched = totalWatched;
    }

    public Grasshopper(String email, String pin, int totalWatched, int age, float experience, Gender gender, String name) {
        super(age, experience, gender, name);
        this.email = email;
        this.pin = pin;
        this.totalWatched = totalWatched;
    }

    public void watchOneMore() {
        return;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getTotalWatched() {
        return totalWatched;
    }

    public void setTotalWatched(int totalWatched) {
        this.totalWatched = totalWatched;
    }

    @Override
    public String getName(){
            return super.getName();

    }


}
