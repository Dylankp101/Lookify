package com.codingdojo.lookify.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.codingdojo.lookify.models.Lookify;

@Repository
public interface LookifyRepository extends CrudRepository<Lookify, Long> {
//     this method retrieves all the books from the database
    List<Lookify> findAll();
//    // this method finds books with descriptions containing the search string
//    List<Lookify> findByCreatorContaining(String search);
//    // this method counts how many titles contain a certain string
//    Long countByNameContaining(String search);
//    // this method deletes a book that starts with a specific title
//    Long deleteByNameStartingWith(String search);
}
