package com.cisco.bpmn.handler;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

@Data
@Slf4j
public class HolidayRejectionHandler implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) {
        log.info("Holiday has been rejected, sending an email ");
    }
}
