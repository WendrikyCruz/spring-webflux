package com.wendriky.apireativa;

/*
 * @Component public class DummyData implements CommandLineRunner{
 * 
 * private final PlaylistRepository playlistRepository;
 * 
 * DummyData(PlaylistRepository playlistRepository){ this.playlistRepository =
 * playlistRepository; }
 * 
 * @Override public void run(String... args) throws Exception {
 * playlistRepository.deleteAll()
 * .thenMany(Flux.just("Registro 01","Registro 02", "Registro 03",
 * "Registro 04", "Regitro 05", "Registro 06") .map(nome -> new
 * Playlist(UUID.randomUUID().toString(), nome))
 * .flatMap(playlistRepository::save)) .subscribe(System.out::println); }
 * 
 * }
 */
