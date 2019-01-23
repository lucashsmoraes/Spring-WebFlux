package webflux.reactiveweb;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

interface ProfileRepository extends ReactiveMongoRepository<Profile, String> {
}
