package com.example.model;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

/*
 * @MappedSuperclass
 *	- 상속관계 매핑이 아님
 *	- 엔티티가 아니기 때문에 테이블 매핑이 없음
 *	- 상속받은 자식 클래스에 매핑 정보만 제공
 */


@MappedSuperclass
@Getter @Setter
public abstract class BaseEntity {
	private String createdBy;
	private LocalDateTime createTime;
	private String lastModifiedBy;
	private LocalDateTime lastModifiedTime;
}
