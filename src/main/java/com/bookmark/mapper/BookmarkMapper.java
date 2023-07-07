package com.bookmark.mapper;

import org.springframework.stereotype.Component;

import com.bookmark.entity.Bookmark;
import com.bookmark.entity.BookmarkDto;

@Component
public class BookmarkMapper {

	public BookmarkDto toDto(Bookmark bookmark) {
		BookmarkDto dto = new BookmarkDto();
		dto.setId(bookmark.getId());
		dto.setTitle(bookmark.getTitle());
		dto.setUrl(bookmark.getUrl());
		dto.setCreatedAt(bookmark.getCreatedAt());
		return dto;
	}
}
