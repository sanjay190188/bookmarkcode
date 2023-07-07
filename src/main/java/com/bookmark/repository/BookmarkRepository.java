package com.bookmark.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bookmark.entity.Bookmark;
import com.bookmark.entity.BookmarkDto;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long>{
	
	@Query("select new com.bookmark.entity.BookmarkDto(b.id, b.title, b.url, b.createdAt) from Bookmark b")
	Page<BookmarkDto> findBookMarks(Pageable pageable);
}
