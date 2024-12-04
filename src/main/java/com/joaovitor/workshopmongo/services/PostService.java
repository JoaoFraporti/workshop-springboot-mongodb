package com.joaovitor.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.joaovitor.workshopmongo.domain.Post;
import com.joaovitor.workshopmongo.repository.PostRepository;
import com.joaovitor.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	@GetMapping(value = "/{id}")
	public Post findById(@PathVariable String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
	}
}