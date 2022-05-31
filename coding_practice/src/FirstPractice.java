public class FirstPractice {
    public static void main(String[]args){
        int[] arrayInt = new int[20];
        var santai = "Santai";
        var berkualitas = "Berkualitas";
        var loveCoding = "I Love Coding";

        for (int i=1; i<=arrayInt.length; i++){
            if (i % 2 == 0){
                System.out.println(i + " " + "-" + " " + berkualitas);
            } if (i % 2 != 0 && i % 3 == 0){
                System.out.println(i + " " + "-" + " " + loveCoding);
            } else {
                System.out.println(i + " " + "-" + " " + santai);
            }
        }
    }
}
