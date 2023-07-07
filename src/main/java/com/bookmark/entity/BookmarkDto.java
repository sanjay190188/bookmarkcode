package com.bookmark.entity;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookmarkDto {
	private Long id;
	
	private String title;
	
	private String url;
	
	private Instant createdAt;

}
