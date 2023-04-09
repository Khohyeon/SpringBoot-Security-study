package com.side.serverusercatchproject.modules.notice;

import com.side.serverusercatchproject.common.jpa.BaseTime;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "NOTICES")
public class Notice extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("고유번호")
    private Integer id;

    @Comment("공지제목")
    private String title;

    @Comment("공지내용")
    private String content;

    @Enumerated(EnumType.STRING)
    @Comment("공지사항 상태")
    private NoticeStatus status;

    public NoticeDTO toDTO() {
        return new NoticeDTO(id, title, content, status.name());
    }

    public NoticeResponse toResponse() {
        return new NoticeResponse(id, title, content, status.name());
    }

}
