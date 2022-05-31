public class SecondPractice {
    public static void main(String[]args){
        var spasi = "";
        var panjang = 8;
        var lebar = 8;

        for (var i=1; i<=lebar; i++){
            if (i % 2 == 0){
                for (var j=1; j<=panjang; j++){
                    if (j % 2 == 0){
                        System.out.print(spasi + "#");
                    } else {
                        System.out.print(spasi + " ");
                    }
                }
            } else {
                for (var j=1; j<=panjang; j++){
                    if (j % 2 == 0) {
                        System.out.print(spasi + " ");
                    } else {
                        System.out.print(spasi + "#");
                    }
                }
            }
            System.out.println(spasi);
        }
    }
}
