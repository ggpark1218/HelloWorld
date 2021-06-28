import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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


    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

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
        System.out.println("ID  Name  Temp  Hour  Min  AbroadVisit  Regdate");
        System.out.println("==================================================");
        for(Person person: this.list){
            System.out.println(person.toString());
        }

    }

    private void createData(){
        Person person = new Person();
        try {
            System.out.println("이름 (ex. 박규경):");
            br = new BufferedReader(new InputStreamReader(System.in));
            person.setName(br.readLine());
            System.out.println("체온 (ex. 36.5):");
            person.setTemp(Double.parseDouble(br.readLine()));
            System.out.println("방문 시간(시 ex. 13):");
            person.setHour(Integer.parseInt(br.readLine()));
            System.out.println("방문 시간(분 ex. 00):");
            person.setMin(Integer.parseInt(br.readLine()));
            System.out.println("이주 내 해외 방문 여부(y/n):");
            if(br.readLine() == "y")
                person.setAbroad_visit(true);
            else if(br.readLine() == "n")
                person.setAbroad_visit(false);
            else
                System.out.println("잘못 입력하셨습니다.");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    private void updateDate(){
        readData();
        try {
            System.out.println("수정할 항목의 ID를 입력하세요");
            br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void deleteData(){

    }

}
