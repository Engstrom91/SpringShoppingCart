package com.larsengstrom.cmsshoppingcart.models;

import com.larsengstrom.cmsshoppingcart.models.data.Page;

import org.springframework.data.jpa.repository.JpaRepository;

//By extending from CrudRepository we get access to many helpful methods.

public interface PageRepository extends JpaRepository<Page, Integer> {

}
