public class App {
    public static void main(String[] args) throws Exception {

        Grasshopper person = new Grasshopper("ludmila@gmail.com", "123", 0);
        person.setName("Ludmila");
        Video film = new Video("As branquelas");
        Video film1 = new Video("O auto da compadecida");

        Viewing visualizacao = new Viewing(person, film);
        Viewing visualizacao1 = new Viewing(person, film1);
        System.out.println(visualizacao1.toString());







    }
} 