package com.wendriky.apireativa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wendriky.apireativa.document.Playlist;
import com.wendriky.apireativa.services.PlaylistService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {

	@Autowired
	private PlaylistService service;

	@GetMapping
	public Flux<Playlist> findAll() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Mono<Playlist> findByUuid(@PathVariable String id) {
		return service.findByUuid(id);
	}

	@PostMapping
	public Mono<Playlist> save(@RequestBody Playlist playlist) {
		return service.save(playlist);
	}

}
