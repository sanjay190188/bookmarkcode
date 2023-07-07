package com.bookmark.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookmark.entity.Bookmark;
import com.bookmark.entity.BookmarkDto;
import com.bookmark.entity.BookmarksDto;
import com.bookmark.mapper.BookmarkMapper;
import com.bookmark.repository.BookmarkRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
	//private final BookmarkMapper mapper;
	private final BookmarkRepository repository;
	
	@Transactional(readOnly = true)
	public BookmarksDto getBookmarks(Integer page) {
		int pageNo = page < 1 ? 0 : page - 1;
		Pageable pageable = PageRequest.of(pageNo, 5, Direction.DESC, "createdAt");
		
		//Page<BookmarkDto> bookmarkPage = repository.findAll(pageable).map(mapper::toDto);
		
		Page<BookmarkDto> bookmarkPage = repository.findBookMarks(pageable);
		return new BookmarksDto(bookmarkPage);
	}
	
}
