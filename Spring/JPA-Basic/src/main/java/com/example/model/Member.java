package com.example.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity	// JPA에서 관리하는 클래스라고 정의해주는 어노테이션
@Table(name = "tb_member") // 생성하는 테이블의 이름을 지정
public class Member {
	
	@Id @GeneratedValue
	private Long id;
	private String username;
	private String password;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "group_id")
	private Group group;
	
	@Lob
	private String description;
	@Enumerated(value = EnumType.STRING)
	private GenderType gender;
//	@Temporal(value = TemporalType.DATE)
	private LocalDate birth;
//	@Column(name = "member_email", nullable = false, length = 500)
	private String email;
	
	/* @Id : PrimaryKey
	 * 
	 * @GeneratedValue : 자동증가 값을 넣는다.
	 * 
	 * @Column
	 * - name : 필드와 매핑할 테이블 컬럼의 이름
	 * - nullable : false로 설정하면 DDL 설정 시 not null 제약조건을 붙임
	 * - length : 문자 길이 제약조건, String 타입에만 설정
	 * - columnDefinition : 데이터베이스의 컬럼 정보를 직접 설정
	 *   ex) varchar2(100) default 'example@gmail.com'
	 * - unique : 유니크 제약조건 설정
	 * - precision(소수점 포함 전체 자리수), scale(소수점 자리수)
	 * - insertable, updateable : 등록, 수정 가능 여부 설정
	 * 
	 * @Temporal : 날짜타입을 (Date, Calendar) 매핑할 때 사용,
	 * 				LocalDate 혹은 LocalDateTime 타입은 생략 가능
	 * - value
	 * 		TemporalType.DATE : 데이터베이스의 date 타입과 매핑
	 * 		TemporalType.TIME : 데이터베이스의 time 타입과 매핑
	 * 		TemporalType.TIMESTAMP : 데이터베이스의 timestamp 타입과 매핑
	 * 
	 * @Enumerated : enum 타입을 매핑할 때 사용
	 * - value
	 * 		EnumType.ORDINAL : enum의 순서를 저장(기본값)
	 * 		EnumType.STRING : enum의 이름을 저장
	 * 
	 * @Lob : varchar2(4000)이상의 큰 데이터
	 * 
	 * @ManyToOne : 다대일 관계 매핑
	 * @JoinColumn : 외래키를 매핑할 때 사용
	 */
	
}
