package com.miu.rsmanagementbackendapi.repo.logging;

import com.miu.rsmanagementbackendapi.domain.logging.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggerEntityRepo extends JpaRepository<LoggerEntity, Long> {
}
