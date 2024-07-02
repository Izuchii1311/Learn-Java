public class AplikasiTodoList {

    public static String[] model = new String[10];
    
    public static void main(String[] args) {
        testCreateTodoList();
    }

    /**
     * Menampilkan Todo List
     */
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            String todo = model[i];
            var number = i + 1;

            if (todo != null) {
                System.out.println(number + ". " + todo);
            }
        }  
    }

    public static void testShowTodoList() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Membuat Aplikasi Todo List";

        showTodoList();
    }

    /**
     * Menambahkan Todo List
     */
    public static void createTodoList(String todo) {
        // cek jika model sudah penuh
        var isFull = true;
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false;
                break;
            }
        }

        // jika penuh resize ukuran model
        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (var i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi data array baru
        for (var i = 0;  i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testCreateTodoList() {
        for (var i = 0; i < 25; i++) {
            createTodoList("Contoh ke " + i);
        }
        showTodoList();
    }

    /**
     * Menghapus Todo List
     */
    public static void deleteTodoList(Integer number) {

    }

    /**
     * Menampilkan view Todo List
     */
    public static void viewShowTodoList() {

    }

    /**
     * Menampiilkan view create Todo List
     */
    public static void viewAddTodoList() {

    }

    /**
     * Menampilkan view delete Todo List
     */
    public static void viewRemoveTodoList() {

    }
}
