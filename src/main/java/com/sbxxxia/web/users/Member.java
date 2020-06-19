package com.sbxxxia.web.users;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "member")
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberNo;

    @Column(length = 10, nullable = false)
    private String userid;
    @Column(length = 10, nullable = false)
    private String passwd;
    @Column(length = 10, nullable = false)
    private String userName;
    @Builder
    public Member(String userid, String passwd, String userName) {
        this.userid = userid;
        this.passwd = passwd;
        this.userName = userName;
    }
}
