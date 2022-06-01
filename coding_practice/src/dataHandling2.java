import java.util.ArrayList;
import java.util.Arrays;

/*Point 2*/
public class dataHandling2 {
    public static void main(String[] args) {

        /*Point 1*/
        ArrayList<String> dataArray = new ArrayList<>();
        dataArray.add("0001");
        dataArray.add("Roman Alamsyah");
        dataArray.add("Bandar Lampung");
        dataArray.add("21/05/1998");
        dataArray.add("Membaca");
        System.out.println("Ini adalah data input:");
        System.out.println(dataArray);

        /*Point 3*/
        System.out.println();
        System.out.println("Saya mengganti splice dengan .set() di Java.");
        System.out.println("Hasilnya seperti berikut:");
        dataArray.set(1, "Roman Alamsyah Elsharawy");
        dataArray.set(2, "Provinsi Bandar Lampung");
        dataArray.set(4, "Pria");
        dataArray.add("SMA Internasional Metro");
        System.out.println(dataArray);

        /*Point 4*/
        System.out.println();
        System.out.println("Menampilkan nama bulan:");
        String bulan1 = dataArray.get(3);
        char[] bulan2 = bulan1.toCharArray();
        char no1 = bulan2[3];
        String string1 = String.valueOf(no1);
        char no2 = bulan2[4];
        String string2 = String.valueOf(no2);
        var tambah = string1 + string2;

        switch (tambah) {
            case "01" -> System.out.println("Januari");
            case "02" -> System.out.println("Februari");
            case "03" -> System.out.println("Maret");
            case "04" -> System.out.println("April");
            case "05" -> System.out.println("Mei");
            case "06" -> System.out.println("Juni");
            case "07" -> System.out.println("Juli");
            case "08" -> System.out.println("Agustus");
            case "09" -> System.out.println("September");
            case "10" -> System.out.println("Oktober");
            case "11" -> System.out.println("November");
            case "12" -> System.out.println("Desember");
        }

//        System.out.println("Saya ingin mencoba menggunakan If...Else, untuk memecahkan masalah yang sama.");
//        System.out.println("Menampilkan nama bulan:");
//        if (string1.equals("0") && string2.equals("1")) {
//            System.out.println("Januari");
//        } else if (string1.equals("0") && string2.equals("2")) {
//            System.out.println("Februari");
//        } else if (string1.equals("0") && string2.equals("3")) {
//            System.out.println("Maret");
//        } else if (string1.equals("0") && string2.equals("4")) {
//            System.out.println("April");
//        } else if (string1.equals("0") && string2.equals("5")) {
//            System.out.println("Mei");
//        } else if (string1.equals("0") && string2.equals("6")) {
//            System.out.println("Juni");
//        } else if (string1.equals("0") && string2.equals("7")) {
//            System.out.println("Juli");
//        } else if (string1.equals("0") && string2.equals("8")) {
//            System.out.println("Agustus");
//        } else if (string1.equals("0") && string2.equals("9")) {
//            System.out.println("September");
//        } else if (string1.equals("1") && string2.equals("0")) {
//            System.out.println("Oktober");
//        } else if (string1.equals("1") && string2.equals("1")) {
//            System.out.println("November");
//        } else if (string1.equals("1") && string2.equals("2")) {
//            System.out.println("Desember");
//        } else {
//            System.out.println("Format bulan tidak sesuai!");
//        }

        /*Point 5*/
        System.out.println();
        ArrayList<String> arrayBaru = new ArrayList<>();
        System.out.println("Menghapus tanda '/':");
        arrayBaru.add(Arrays.toString(String.valueOf(bulan2).split("/")));
        String tanggal = String.join("-", arrayBaru);
        System.out.println(tanggal);

        /*Point 6*/
        System.out.println();
        System.out.println("Sort descending:");

        /*Point 7*/
        System.out.println();
        System.out.println("Mengganti dengan '-':");

        System.out.println();
        System.out.println("Membatasi char:");
        var batas = dataArray.get(1).length();
        if (batas >= 15) {
            String nama1 = dataArray.get(1);
            char[] nama2 = nama1.toCharArray();
            char a1 = nama2[0];
            String b1 = String.valueOf(a1);
            char a2 = nama2[1];
            String b2 = String.valueOf(a2);
            char a3 = nama2[2];
            String b3 = String.valueOf(a3);
            char a4 = nama2[3];
            String b4 = String.valueOf(a4);
            char a5 = nama2[4];
            String b5 = String.valueOf(a5);
            char a6 = nama2[5];
            String b6 = String.valueOf(a6);
            char a7 = nama2[6];
            String b7 = String.valueOf(a7);
            char a8 = nama2[7];
            String b8 = String.valueOf(a8);
            char a9 = nama2[8];
            String b9 = String.valueOf(a9);
            char a10 = nama2[9];
            String b10 = String.valueOf(a10);
            char a11 = nama2[10];
            String b11 = String.valueOf(a11);
            char a12 = nama2[11];
            String b12 = String.valueOf(a12);
            char a13 = nama2[12];
            String b13 = String.valueOf(a13);
            char a14 = nama2[13];
            String b14 = String.valueOf(a14);
            char a15 = nama2[14];
            String b15 = String.valueOf(a15);
            System.out.println(b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b10 + b11 + b12 + b13 + b14 + b15);
        }else {
            System.out.println(dataArray.get(1));
        }
    }
}
