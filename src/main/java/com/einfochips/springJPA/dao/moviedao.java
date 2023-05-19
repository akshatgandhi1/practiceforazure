package com.einfochips.springJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.einfochips.springJPA.model.movie;

@Repository
public interface moviedao extends JpaRepository<movie,Integer>{
 
	@Query("Select m from movie m where m.language= :language")
	List<movie> findBylanguage(@Param("language") String language);
}