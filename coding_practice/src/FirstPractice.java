public class FirstPractice {
    public static void main(String[]args){
        var santai = "Santai";
        var berkualitas = "Berkualitas";
        var loveCoding = "I Love Coding";

        for (int i=1; i<=20; i++){
            if (i % 2 == 0){
                System.out.println(i + " " + "-" + " " + berkualitas);
            } else if (i % 2 != 0 && i % 3 == 0){
                System.out.println(i + " " + "-" + " " + loveCoding);
            } else {
                System.out.println(i + " " + "-" + " " + santai);
            }
        }
    }
}
