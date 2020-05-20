package com.peak.service.dbanalyze.service;

import com.peak.service.dbanalyze.bean.MailBean;

public interface MailService {

    void sendHtmlMail(MailBean mailBean);
}
