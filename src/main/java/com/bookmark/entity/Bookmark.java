package com.bookmark.entity;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="bookmarks")
public class Bookmark {
	
	@Id
	@SequenceGenerator(name="bm_id_seq_gen", sequenceName = "bm_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bm_id_seq_gen")
	private Long id;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String url;
	
	private Instant createdAt;

}
