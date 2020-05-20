package com.peak.service.dbanalyze.service.impl;

import com.peak.service.dbanalyze.bean.Block;
import com.peak.service.dbanalyze.mapper.BlockMapper;
import com.peak.service.dbanalyze.service.AnalyzeService;
import com.peak.service.dbanalyze.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class AnalyzeServiceImpl implements AnalyzeService {

    @Autowired
    private MailService mailService;

    @Resource
    private BlockMapper blockMapper;

    @Override
    public void analyze() {
        List<Block> list = blockMapper.list();
        list.forEach(item -> {
            System.out.println(item);
        });

    }
}
