//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for(int i = 0; i < 10; i++){
            int random = (int)(Math.random() * 100) + 1;
            arr1[i] = random;
        }
    }
}