package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_group")
public class Group {
	@Id
	@GeneratedValue
	private Long id;
	
	// 그룹명
	private String name;
	
	// 회원정보
	@OneToMany(mappedBy = "group")
	private List<Member> members = new ArrayList<>();
	
	/* 
	 * @OneToMany : 일대다 관계 매핑, 양방향 연관관계
	 * 	- mappedBy : 연관관계의 주인의 변수명(필수)
	 * 	- fetch : 글로벌 패치 전략 설정, 기본값은 LAZY(지연로딩)
	 * 	- cascade : 연속성 전이 기능을 사용
	 */
}
