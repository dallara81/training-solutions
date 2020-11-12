package classstructuremethods;

public class Note {

    // Felhasználó neve
    private String name;

    // A jegyzet témája
    private String topic;

    // A jegyzet szövege
    private String text;

    public void setName(String name) {
         this.name = name;
    }

    public void setTopic(String topic) {
         this.topic = topic;
    }

    public void setText(String text) {
         this.text = text;
    }

    public String getNoteText() {
         return name + ": (" + topic + ") " + text;
    }

}
