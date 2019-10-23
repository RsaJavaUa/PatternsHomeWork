package products;

public abstract class TetrisFigure implements TetrisFigureInterface {

    private Integer size;
    private String form;

    public void  rotateRight(){
        System.out.println("Rotate right");
    }

    public void  rotateLeft(){
        System.out.println("Rotate left");
    }

    public TetrisFigure(Integer size, String form) {
        this.size = size;
        this.form = form;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return form+
                " size = " + size;

    }
}
