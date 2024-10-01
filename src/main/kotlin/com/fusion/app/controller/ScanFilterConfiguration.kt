package com.fusion.app.controller

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.ComponentScan.Filter
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["com.fusion.app.controller"],
    includeFilters = [Filter(classes = [NoneScanComponent::class])])
open class ScanFilterConfiguration {
}