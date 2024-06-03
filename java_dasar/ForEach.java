package java_dasar;

public class ForEach {
    public static void main(String[] args) {
        // Tanpa menggunakan Foreach

        // String[] mahasiswa = {
        //     "Luthfi", "Izuchii", "Hutao", "Frieren", "Izuna"
        // };

        // for (int i = 0; i < mahasiswa.length; i++) {
        //     System.out.println(mahasiswa[i]);
        // }


        // Menggunakan Foreach
        String[] mahasiswa = {
            "Luthfi", "Izuchii", "Hutao", "Frieren", "Izuna"
        };

        for (String data : mahasiswa) {
            System.out.println(data);
        }
    }
}
