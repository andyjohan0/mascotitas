package com.mascotitas.TF.Repository;

import com.mascotitas.TF.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Long> {
}
