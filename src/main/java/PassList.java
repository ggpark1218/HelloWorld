import java.io.BufferedReader;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassList {
    BufferedReader br;
    private List<Person> list;

    public PassList(){
        this.list = new ArrayList<>();
    }

    private Scanner sc = new Scanner(System.in);
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

    void printMenu(){
        System.out.println("----menu----");
        System.out.println("1. 조회 ");
        System.out.println("2. 추가 ");
        System.out.println("3. 수정 ");
        System.out.println("4. 삭제 ");
        System.out.println("0. 종료 ");
        System.out.println("-----------");
    }

    public boolean choice (String s){
        switch (s){
            case "1":
                readData();
                break;
            case "2":
                createData();
                break;
            case "3":
                updateDate();
                break;
            case "4":
                deleteData();
                break;
            case "0":
                System.out.println("Bye!");
                return false;
            default: System.out.println("잘못된 선택!");
        }
        return true;
    }

    private void readData(){
        if(this.list.size()==0) {
            System.out.println("데이터가 존재하지 않습니다.");
            return;
        }
        else{

        }

    }

    private void createData(){

    }

    private void updateDate(){

    }

    private void deleteData(){

    }

}
