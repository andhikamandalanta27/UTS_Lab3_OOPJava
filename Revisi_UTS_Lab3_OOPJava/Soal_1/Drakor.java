package Soal_1;

//Contoh class
public class Drakor {
    private String title;
    private int episode;
    private String mainActor;

    // Contoh constructor (without parameters)
    public Drakor() {
        this.title = "Unknown";
        this.episode = 0;
        this.mainActor = "Unknown";
    }

    // Contoh constructor (with parameters)
    public Drakor(String title, int episode, String mainActor) {
        this.title = title;
        this.episode = episode;
        this.mainActor = mainActor;
    }

    // Contoh method overloading
    public void watch() {
        System.out.println("Let's watch " + this.title + "!");
    }

    public void watch(int episode) {
        System.out.println("Let's watch episode " + episode + " of " + this.title + "!");
    }

    // Contoh setter and getter
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            System.out.println("Invalid input for title. Title cannot be empty or null.");
        } else {
            this.title = title;
        }
    }

    public void setEpisode(int episode) {
        if (episode < 0) {
            System.out.println("Invalid input for episode. Episode cannot be less than 0.");
            this.episode = 0;
        } else {
            this.episode = episode;
        }
    }

    public void setMainActor(String mainActor) {
        if (mainActor == null || mainActor.isEmpty()) {
            System.out.println("Invalid input for main actor. Main actor cannot be empty or null.");
        } else {
            this.mainActor = mainActor;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public int getEpisode() {
        return this.episode;
    }

    public String getMainActor() {
        return this.mainActor;
    }
}