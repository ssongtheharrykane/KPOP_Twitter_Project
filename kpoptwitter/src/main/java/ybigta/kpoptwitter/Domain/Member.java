package ybigta.kpoptwitter.Domain;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class Member {
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
}
