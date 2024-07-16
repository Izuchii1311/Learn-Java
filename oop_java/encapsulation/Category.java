package oop_java.encapsulation;

public class Category {
    private String id;
    private Boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        } else {
            System.out.println("ID tidak boleh kosong");
        }
    }

    public boolean isExpensive() {
        return this.expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
