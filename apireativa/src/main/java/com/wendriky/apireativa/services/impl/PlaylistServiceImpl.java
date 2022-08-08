package com.wendriky.apireativa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendriky.apireativa.document.Playlist;
import com.wendriky.apireativa.repository.PlaylistRepository;
import com.wendriky.apireativa.services.PlaylistService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaylistServiceImpl implements PlaylistService {

	@Autowired
	private PlaylistRepository repository;

	@Override
	public Flux<Playlist> findAll() {
		return repository.findAll();
	}

	@Override
	public Mono<Playlist> findByUuid(String uuid) {
		return repository.findById(uuid);
	}

	@Override
	public Mono<Playlist> save(Playlist playlist) {
		return repository.save(playlist);
	}

}
