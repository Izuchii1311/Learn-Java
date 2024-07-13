public class AplikasiTodoList {

    /**
     * Model digunakan untuk menampung data
     */
    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    public static void main(String[] args) {
        viewShowTodoList();
    }

    /**
     * Menampilkan Todo List
     */
    public static void showTodoList() {
        System.out.println("Todo List Hari Ini");
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
    public static boolean removeTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else{
            // misal ada 5 data (1,2,3,4,5)
            // jika number adalah 3 merupakan index ke 2
            for (int i = (number - 1); i < model.length; i++) {
                // jika i merupakan index terakhir langsung hapus saja
                if (i == model.length - 1) {
                    model[i] = null;
                // i dimulai dari 2 maka nanti jika 3 akan dihapus akan ditimpa oleh bilangan selanjutnya 
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList() {
        createTodoList("Satu");
        createTodoList("Dua");
        createTodoList("Tiga");
        createTodoList("Empat");
        createTodoList("Lima");

        System.out.println("Sebelum Dihapus");
        showTodoList();
        
        var result = removeTodoList(4);
        System.out.println(result);
        
        System.out.println("Sesudah Dihapus");
        showTodoList();
    }

    /**
     * Menerima Iputan User
     */
    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var data = input("Nama");
        System.out.println(data);
    }

    /**
     * Menampilkan view Todo List
     */
    public static void viewShowTodoList() {
        while(true) {
            System.out.println("\n ============= \n");

            showTodoList();

            System.out.println("\n ============= \n");

            System.out.println("Menu");
            System.out.println("1. Tambah Todo");
            System.out.println("2. Hapus Todo");
            System.out.println("3. Keluar");
    
            var input = input("Pilih");
            
            // equals = merupakan pengecekan ke dalam string misalkan jika number kan pengecekannya menggunakan == 
            if (input.equals("1")) {
                System.out.println();
                viewAddTodoList();
            } else if (input.equals("2")) {
                System.out.println();
                viewRemoveTodoList();
            } else if (input.equals("3")) {
                break;
            } else {
                System.out.println();
                System.out.println("Menu yang anda pilih tidak tersedia");
                System.out.println();
            }
        }
    }

    public static void testViewShowTodoList() {
        createTodoList("Satu");
        createTodoList("Dua");
        createTodoList("Tiga");
        createTodoList("Empat");
        createTodoList("Lima");

        viewShowTodoList();
    }

    /**
     * Menampiilkan view create Todo List
     */
    public static void viewAddTodoList() {
        System.out.println("Menambah Todo List");

        var todo = input("Todo (x Jika Batal)");

        if (todo.equals("x")) {
            // batal
            // viewShowTodoList();
        } else {
            createTodoList(todo);
        }
    }

    public static void testViewAddTodoList() {
        viewAddTodoList();

        showTodoList();
    }

    /**
     * Menampilkan view delete Todo List
     */
    public static void viewRemoveTodoList() {
        System.out.println("Hapus Todo List");
        System.out.println("\n ============= \n");

        boolean isEmpty = true;
        for (String item : model) {
            if (item != null) {
                isEmpty = false;
                break;
            }
        }

        if (isEmpty) {
            System.err.println("Todo belum ada, pastikan buat Todo Terlebih Dahulu");
        } else {
            showTodoList();
        }
        
        System.out.println("\n ============= \n");
        
        var number = input("Todo (x Jika Batal)");

        if (number.equals("x")) {
            // batal
        } else {
            // konversi String to Integer
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success) {
                System.out.println("Gagal menghapus Todo List " + number);
            }
        }
    }

    public static void testViewRemoveTodoList() {
        createTodoList("satu");
        createTodoList("dua");
        createTodoList("tiga");
        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}
