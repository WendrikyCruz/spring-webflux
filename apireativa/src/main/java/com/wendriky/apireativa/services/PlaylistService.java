package com.wendriky.apireativa.services;

import com.wendriky.apireativa.document.Playlist;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlaylistService {
	Flux<Playlist> findAll();

	Mono<Playlist> findByUuid(String uuid);

	Mono<Playlist> save(Playlist playlist);
}
