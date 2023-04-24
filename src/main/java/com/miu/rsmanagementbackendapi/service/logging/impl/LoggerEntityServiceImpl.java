package com.miu.rsmanagementbackendapi.service.logging.impl;

import com.miu.rsmanagementbackendapi.domain.logging.LoggerEntity;
import com.miu.rsmanagementbackendapi.repo.logging.LoggerEntityRepo;
import com.miu.rsmanagementbackendapi.service.logging.LoggerEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoggerEntityServiceImpl implements LoggerEntityService {


    private final LoggerEntityRepo loggerEntityRepo;

    @Override
    public void saveLoggerEntity(LoggerEntity loggerEntity) {
        loggerEntityRepo.save(loggerEntity);
    }
}
