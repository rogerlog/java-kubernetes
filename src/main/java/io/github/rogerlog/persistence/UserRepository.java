package io.github.rogerlog.persistence;

import org.springframework.data.repository.CrudRepository;

import io.github.rogerlog.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

