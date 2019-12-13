package com.example.fun.dao.repository;

import com.example.fun.dao.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILanguageRepository extends JpaRepository <Language, Long> {
}
