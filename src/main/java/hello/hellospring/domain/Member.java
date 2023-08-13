package hello.hellospring.domain;

import javax.persistence.*;

@Entity // jpa가 관리하는 객체다 선언
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement
    private Long id;

    @Column(name= "username") // DB내 필드 이름
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
