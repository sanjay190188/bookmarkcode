package com.bookmark.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookmark.entity.Bookmark;
import com.bookmark.entity.BookmarksDto;
import com.bookmark.service.BookmarkService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {
	private final BookmarkService service;
	
	@GetMapping
	public BookmarksDto getBookmarks(@RequestParam(name = "page", defaultValue = "1") Integer page){
		return service.getBookmarks(page);
	}
	
}
