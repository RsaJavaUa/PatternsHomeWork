package objects;

public class Bacteria {
    private BacteriaCore bacteriaCore;
    private String color;
    private Integer size;

    public Bacteria(BacteriaCore bacteriaCore, String color, Integer size) {
        this.bacteriaCore = bacteriaCore;
        this.color = color;
        this.size = size;
    }

    public void consume(){
        bacteriaCore.consume(size, color);
    }

    @Override
    public String toString() {
        return "Bacteria{" +
                "bacteriaCore=" + bacteriaCore +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
