package lessonEnum;

public class Film {
    private String name;
    private Type_Film type;
    private String producer;

    public String getName() {
        return name;
    }

    public Type_Film getType() {
        return type;
    }

    public String getProducer() {
        return producer;
    }

    public Film(String name, Type_Film type, String producer) {
        this.name = name;
        this.type = type;
        this.producer = producer;


    }
}
