import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        PassList passList = new PassList();
        System.out.println("숫자를 입력해주세요 (ex. 1)");
        boolean check = true;

        while (check){
            try {
                passList.printMenu();
                BufferedReader sbr = new BufferedReader(new InputStreamReader(System.in));
                String input = sbr.readLine();
                check = passList.choice(input);

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
