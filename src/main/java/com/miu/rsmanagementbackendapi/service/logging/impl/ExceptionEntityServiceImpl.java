package com.miu.rsmanagementbackendapi.service.logging.impl;

import com.miu.rsmanagementbackendapi.domain.logging.ExceptionEntity;
import com.miu.rsmanagementbackendapi.repo.logging.ExceptionEntityRepo;
import com.miu.rsmanagementbackendapi.service.logging.ExceptionEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExceptionEntityServiceImpl implements ExceptionEntityService {

    private final ExceptionEntityRepo exceptionEntityRepo;

    @Override
    public void saveExceptionEntity(ExceptionEntity exception) {
        exceptionEntityRepo.save(exception);
    }
}
