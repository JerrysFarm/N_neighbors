package com.smhrd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class tb_user {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_seq")
	private Long user_seq;
	
	@NotBlank(message = "닉네임은 필수 입력값입니다.")
	@Pattern(regexp = "^[가-힣a-zA-Z0-9]{2,10}$" , message = "닉네임은 특수문자를 포함하지 않은 2~10자리여야 합니다.")
	@Column(name = "user_nick")
	private String userNick;
	
	@Column(insertable = false, columnDefinition = "datatime default now()" , updatable = false)
	private Date user_joindate;
	
	@NotBlank(message = "연령대는 필수 입력값입니다.")
	@Column(name = "user_ages")
	private String user_ages;
}
