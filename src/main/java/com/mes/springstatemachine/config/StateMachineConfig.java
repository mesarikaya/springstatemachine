package com.mes.springstatemachine.config;

import com.mes.springstatemachine.domain.PaymentEvent;
import com.mes.springstatemachine.domain.PaymentState;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachineFactory;
import org.springframework.statemachine.config.StateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineConfigurer;

/**
 * Created by mesar on 2/26/2020
 */
@Slf4j
@EnableStateMachineFactory
@Configuration
public class StateMachineConfig extends StateMachineConfigurerAdapter<PaymentState, PaymentEvent> {


    public void configure(StateMachineConfigurer<PaymentState, PaymentEvent> states) throws Exception {

    }
}
