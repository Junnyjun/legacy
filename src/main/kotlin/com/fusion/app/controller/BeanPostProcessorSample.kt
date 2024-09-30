package com.fusion.app.controller

import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.context.annotation.Configuration
import java.util.logging.Logger

@Configuration
open class BeanPostProcessorSample : BeanPostProcessor {
    private val log =  Logger.getLogger("BeanPostProcessorSample")

    override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any? {
        log.info("BEFORE :  bean name: $beanName, bean: $bean")
        return super.postProcessBeforeInitialization(bean, beanName)
    }

    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any? {
        log.info("AFTER : bean name: $beanName, bean: $bean")
        return super.postProcessAfterInitialization(bean, beanName)
    }
}