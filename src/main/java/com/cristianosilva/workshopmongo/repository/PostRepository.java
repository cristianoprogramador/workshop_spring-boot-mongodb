package com.cristianosilva.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cristianosilva.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
