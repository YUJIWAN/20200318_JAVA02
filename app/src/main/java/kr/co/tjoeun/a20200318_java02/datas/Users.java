package kr.co.tjoeun.a20200318_java02.datas;

public class Users {

    private String name;
    private  int birthYear;

//    ALT + Insert => Getter and Setter 선택
//    같은 방식으로 생성자(Constructor) 도 생성 가능.


    public Users(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
