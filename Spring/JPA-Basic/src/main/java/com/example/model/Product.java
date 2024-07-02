package com.example.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Getter;
import lombok.Setter;

/*
 * @Inheritance: 상속관계에서 테이블 전략
 * - strategy
 *   . InheritanceType.JOINED: 조인 전략
 *   . InheritanceType.SINGLE_TABLE: 단일 테이블 전략(기본값)
 *   . InheritanceType.TABLE_PER_CLASS: 구현 클래스별 테이블 전략
 *   	-> 부모클래스를 추상클래스로 선언하면 테이블 생성하지 않음
 *   
 * @DiscriminatorColumn: 조인 전략과 함께 사용
 * 	. name: 기본값 "DTYPE", 다른 이름으로 설정 원할 경우 설정
 */

@Getter @Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public class Product extends BaseEntity {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private long price;

}
