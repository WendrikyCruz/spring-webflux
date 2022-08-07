package com.wendriky.apireativa.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.wendriky.apireativa.document.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {

}
