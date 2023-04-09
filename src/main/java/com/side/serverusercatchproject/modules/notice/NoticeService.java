package com.side.serverusercatchproject.modules.notice;

import com.side.serverusercatchproject.modules.notice.request.NoticeSaveRequest;
import com.side.serverusercatchproject.modules.notice.request.NoticeUpdateRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class NoticeService {

    private final NoticeRepository noticeRepository;

    public NoticeService(NoticeRepository noticeRepository) {
        this.noticeRepository = noticeRepository;
    }


    public Page<Notice> getPage(Pageable pageable) {
        return noticeRepository.findAll(pageable);
    }

    public Optional<Notice> getNotice(Integer id) {
        return noticeRepository.findById(id);
    }

    @Transactional
    public Notice save(NoticeSaveRequest request) {
        return noticeRepository.save(request.toEntity());
    }

//    public String isValidation(NoticeUpdateRequest request) {
//        try {
//            NoticeStatus.valueOf(request.status());
//        }catch (Exception e) {
//            return "공지사항 상태 값이 이상이 있습니다. 확인해주세요.";
//        }
//        return "OK";
//    }

    @Transactional
    public Notice update(NoticeUpdateRequest request, Notice notice) {
        notice.setTitle(request.title());
        notice.setContent(request.content());
        notice.setStatus(NoticeStatus.valueOf(request.status()));
        return noticeRepository.save(notice);
    }

    @Transactional
    public void delete(Notice notice) {
        noticeRepository.delete(notice);
    }
}
