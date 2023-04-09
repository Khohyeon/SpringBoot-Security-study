package com.side.serverusercatchproject.modules.enterprise.dto;

import com.side.serverusercatchproject.modules.enterprise.entity.EnterpriseStoreInfo;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

public record EnterpriseStoreCalendarDTO(

) {
}
